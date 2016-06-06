insert into FILIAL(codigo,cnpj,endereco,bairro,cidade,uf) values(1,'1234560000101','Av. dos Ingleses, 41','Jd. das Acacias','São Paulo','SP');
insert into FILIAL(codigo,cnpj,endereco,bairro,cidade,uf) values(2,'1568780000260','Travessa dos Lagos, 16','Jd. Itaguagype','São Paulo','SP');

insert into PROFISSAO(codigo,descricao) values
(1,'Gerente'),
(2,'Supervisor'),
(3,'Manobrista'),
(4,'Secretaria');

insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(4,'Ana Maria Santos','Rua Castro Alves, 30',1);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(4,'Paula de Sousa Ramalho','Rua Henrique Sousa, 45',1);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(4,'Renata Almeida Macedo','Av. dos Trabalhadores, 125 Bloco B',2);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(3,'Felipe de Albuquerque','Rua Augusto Ferreira, 130',1);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(3,'Jose Henrique Alves','Rua Nestor Ceveró, 171',2);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(3,'Augusto dos Santos','Rua das Orquideas, 65',1);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(3,'João Alcides Cunha','Av. 7 de Setembro, 48',2);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(3,'Anastacio Silveira','Rua das Acacias, 30',1);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(3,'Amanda Ferreira','Rua dos Ouvidores, 910',2);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(3,'Geraldo José de Paula','Rua dos Goytacazes, 321',1);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(3,'Sebastião Pereira da Siva','Rua das Amendoas, 8 Casa 3',2);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(3,'Ferdinando Jose da Paixão','Av. Imbiribira, s/n Lote 01',1);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(2,'Andrade Ferreira Gusmão','Praça Edmundo Pereira, 30',1);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(2,'Erisvaldo Siqueira','Rua Edmundo Vidigal, 55',1);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(1,'Batistela Simanteli','Rua Erisvaldo Franco, 78',2);
insert into FUNCIONARIO(profissao_codigo,nome,endereco,filial_codigo) values(1,'Sigmund reud','Rua nem Froyd Explica, 30',2);

insert into STATUS(codigo,descricao) values(1,'Disponível');
insert into STATUS(codigo,descricao) values(2,'Reservado');

insert into VEICULO(placa,marca,modelo, status_codigo,filial_codigo) values
('GLB0145','VW','GOL',1,1),
('GLB0123','VW','GOL',1,1),
('FOB0111','VW','FOX',1,1),
('FOB0121','VW','FOX',1,1),
('GLB0222','VW','GOL',1,2),
('GLB0311','VW','GOL',1,2),
('GLB0419','VW','GOL',1,2),
('FUN0111','FIAT','UNO',1,1),
('FUN0222','FIAT','UNO',1,1),
('FUN0333','FIAT','UNO',1,1),
('FUN0444','FIAT','UNO',1,1),
('FUN0555','FIAT','UNO',1,1),
('FUN0421','FIAT','UNO',1,2),
('FUN0422','FIAT','UNO',1,2),
('FUN0423','FIAT','UNO',1,2),
('FUN0424','FIAT','UNO',1,2),
('FUN0425','FIAT','UNO',1,2),
('FUN0426','FIAT','UNO',1,2),
('FUN0427','FIAT','UNO',1,2);

--INSERT INTO CLIENTE (nome,cpf,datanascimento,sexo,endereco,numero,complemento,bairro,cidade,uf) values ('Roberta dos Santos','21215678901',date('1999-10-12'),'F','Rua Clotildes',12,'Casa','Jardin Cocaia','Curitiba','SP');

--INSERT INTO AGENDAMENTO(pais,cidade,localveiculo,horariosaida,horarioretorno,veiculo_codigo,funcionario_codigo,filial_codigo,cliente_codigo) values ('Brasil','Santos','Rua Drumont 123',datetime('2016-05-06 11:00'),datetime('2016-08-06 12:00'),3,5,2,1);
