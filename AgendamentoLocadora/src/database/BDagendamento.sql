-- -----------------------------------------------------
-- Schema DBagendamento
-- -----------------------------------------------------
DROP TABLE IF EXISTS AGENDAMENTO;
DROP TABLE IF EXISTS VEICULO;
DROP TABLE IF EXISTS FUNCIONARIO;
DROP TABLE IF EXISTS PROFISSAO;
DROP TABLE IF EXISTS FILIAL;
DROP TABLE IF EXISTS STATUS;
DROP TABLE IF EXISTS CLIENTE;
-- -----------------------------------------------------
-- Table `DBagendamento`.`CLIENTE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS CLIENTE (
  `codigo` INT INTEGER,
  `nome` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(11) NOT NULL unique,
  `datanascimento` DATE NOT NULL,
  `sexo` VARCHAR(1) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `numero` INT NOT NULL,
  `complemento` VARCHAR(45) NOT NULL,
  `bairro` VARCHAR(45) NOT NULL,
  `cidade` VARCHAR(45) NOT NULL,
  `uf` VARCHAR(2) NOT NULL,
  PRIMARY KEY (`codigo`)
  );
  -- -----------------------------------------------------
-- Table `DBagendamento`.`STATUS`
-- -----------------------------------------------------
  CREATE TABLE IF NOT EXISTS `STATUS` (
  `codigo` INT NOT NULL ,
  `descricao` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`codigo`)
  );
-- -----------------------------------------------------
-- Table `DBagendamento`.`FILIAL`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FILIAL (
  `codigo` INT INTEGER ,
  `cnpj` VARCHAR(45) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `bairro` VARCHAR(45) NOT NULL,
  `cidade` VARCHAR(45) NOT NULL,
  `uf` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo`)
  );
  -- -----------------------------------------------------
-- Table `DBagendamento`.`PROFISSAO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS PROFISSAO (
  `codigo` INT NOT NULL ,
  `descricao` VARCHAR(30) NULL,
  PRIMARY KEY (`codigo`)
  );
-- -----------------------------------------------------
-- Table `DBagendamento`.`FUNCIONARIO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS FUNCIONARIO (
  `codigo` INT INTEGER ,
  `profissao_codigo` INT NOT NULL,
  `nome` VARCHAR(30) NULL,
  `endereco` VARCHAR(25) NULL,
  `filial_codigo` INT NOT NULL,
  PRIMARY KEY (`codigo`),
    FOREIGN KEY (`profissao_codigo`) REFERENCES `PROFISSAO` (`codigo`),
	FOREIGN KEY (`filial_codigo`) REFERENCES `FILIAL` (`codigo`)
	);
-- -----------------------------------------------------
-- Table `DBagendamento`.`VEICULO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `VEICULO` (
  `codigo` INT INTEGER,
  `placa` VARCHAR(7) NOT NULL,
  `marca` VARCHAR(20) NOT NULL,
  `modelo` VARCHAR(20) NOT NULL,
  `status_codigo` INT NOT NULL,
  `filial_codigo` INT NOT NULL,
  PRIMARY KEY (`codigo`), 
  FOREIGN KEY (`status_codigo`) REFERENCES `STATUS` (`codigo`),
  FOREIGN KEY (`filial_codigo`) REFERENCES `FILIAL` (`codigo`)   
  );
-- -----------------------------------------------------
-- Table `DBagendamento`.`AGENDAMENTO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AGENDAMENTO` (
  `codigo` INT INTEGER,
   `pais` VARCHAR(20) NOT NULL,
   `cidade` VARCHAR(40) NOT NULL,
   `localveiculo` VARCHAR(40) NOT NULL,
  `horariosaida` DATETIME NOT NULL,
  `horarioretorno` DATETIME NOT NULL,
  `veiculo_codigo` INT NOT NULL,
  `funcionario_codigo` INT NOT NULL,
  `filial_codigo` INT NOT NULL,
  `cliente_codigo` INT NOT NULL,
    PRIMARY KEY (`codigo`),
    FOREIGN KEY (`veiculo_codigo`) REFERENCES `VEICULO` (`codigo`),
    FOREIGN KEY (`funcionario_codigo`) REFERENCES `FUNCIONARIO` (`codigo`),
    FOREIGN KEY (`filial_codigo`) REFERENCES `FILIAL` (`codigo`),
    FOREIGN KEY (`cliente_codigo`) REFERENCES `CLIENTE` (`codigo`)
);

