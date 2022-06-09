/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Script;

/**
 *
 * @author andre
 */
/*
/**

/*
create database andrelpf;

use andrelpf;

CREATE TABLE `medico` (
  `idmedico` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `especialidade` varchar(100) NOT NULL,
  `crm` int NOT NULL,
  `cpf` char(14) NOT NULL,
  PRIMARY KEY (`idmedico`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `paciente` (
  `idpaciente` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `idade` int NOT NULL DEFAULT '10',
  PRIMARY KEY (`idpaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `consulta` (
  `idconsulta` int NOT NULL AUTO_INCREMENT,
  `convenio` varchar(100) NOT NULL,
  `fkmedico` int DEFAULT NULL,
  `fkpaciente` int DEFAULT NULL,
  PRIMARY KEY (`idconsulta`),
  KEY `fkmedico` (`fkmedico`),
  KEY `fkpaciente` (`fkpaciente`),
  CONSTRAINT `consulta_ibfk_1` FOREIGN KEY (`fkmedico`) REFERENCES `medico` (`idmedico`),
  CONSTRAINT `consulta_ibfk_2` FOREIGN KEY (`fkpaciente`) REFERENCES `paciente` (`idpaciente`)
)
*/