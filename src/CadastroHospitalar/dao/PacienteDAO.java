/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastroHospitalar.dao;


import CadastroHospitalar.factory.Conexao;
import CadastroHospitalar.model.Paciente;


/**
 *
 * @author andre
 */
public class PacienteDAO  extends Conexao{
    public String cadastrarPaciente (Paciente paciente){
        try {
            String sentenca;
            sentenca = "INSERT INTO PACIENTE VALUES (NULL, '"
                    + paciente.getNome() + "','" + paciente.getCpf() + "','"
                    + paciente.getIdade() + "')";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public String atualizarPaciente (Paciente paciente){
        try {
            String sentenca;
            sentenca = "UPDATE MEDICO SET NOME ='" + paciente.getNome()
                    + "', CPF = '" + paciente.getCpf() + "', IDADE ='"
                    + paciente.getIdade() + "'WHEREIDPACIENTE";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
}
