/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastroHospitalar.dao;

import CadastroHospitalar.factory.Conexao;
import CadastroHospitalar.model.Consulta;

/**
 *
 * @author andre
 */
public class ConsultaDAO extends Conexao{
    public String cadastrarConsulta (Consulta consulta){
        try {
            String sentenca;
            sentenca = "INSERT INTO CONSULTA VALUES (NULL, '"
                    + consulta.getConvenio() + "')";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public String atualizarConsulta (Consulta consulta){
        try {
            String sentenca;
            sentenca = "UPDATE MCONSULTA SET NOME ='" + consulta.getConvenio() + "'WHEREIDCONSULTA";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
