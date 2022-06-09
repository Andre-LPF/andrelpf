/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastroHospitalar.dao;


import CadastroHospitalar.factory.Conexao;
import CadastroHospitalar.model.Paciente;
import java.sql.ResultSet;
import java.util.ArrayList;


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
            sentenca = "UPDATE PACIENTE SET NOME ='" + paciente.getNome()
                    + "', CPF = '" + paciente.getCpf() + "', IDADE ='"
                    + paciente.getIdade() + "'WHEREIDPACIENTE";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public String excluirPaciente (String paciente){
        try {
            String sentenca;
            sentenca = "DELETE FROM PACIENTE WHERE IDPACIENTE =" + paciente;
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public ArrayList listarPaciente() {
        try {
            ArrayList pacientes = new ArrayList();
            String sentenca = "SELECT * FROM PACIENTE ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdpaciente(rs.getInt("IDPACIENTE"));
                paciente.setNome(rs.getString("NOME"));
                paciente.setCpf(rs.getString("CPF"));
                paciente.setIdade(rs.getInt("IDADE"));
                pacientes.add(paciente);

            }
            return pacientes;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
