select * from FUNCIONARIO

insert into FILIAL(cnpj,endereco,bairro,cidade,uf) values('1234560000101','Av. dos Ingleses, 41','Jd. das Acacias','São Paulo','SP');
insert into FILIAL(cnpj,endereco,bairro,cidade,uf) values('1568780000260','Travessa dos Lagos, 16','Jd. Itaguagype','São Paulo','SP');

insert into PROFISSAO(descricao) values
('Gerente'),
('Supervisor'),
('Manobrista'),
('Secretaria');

insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('4','Ana Maria Santos','Rua Castro Alves, 30','1');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('4','Paula de Sousa Ramalho','Rua Henrique Sousa, 45','1');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('4','Renata Almeida Macedo','Av. dos Trabalhadores, 125','2');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('3','Marcos Feliciano','Av. Nações Unidas,54 ','1');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('3','Felipe de Albuquerque','Rua Augusto Ferreira, 130','1');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('3','Jose Henrique Alves','Rua Nestor Ceveró, 171','2');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('3','Augusto dos Santos','Rua das Orquideas, 65','1');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('3','João Alcides Cunha','Av. 7 de Setembro, 48', '2');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('3','Anastacio Silveira','Rua das Acacias, 30','1');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('3','Amanda Ferreira','Rua dos Ouvidores, 910','2');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('3','Geraldo José de Paula','Rua dos Goytacazes, 321','1');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('3','Sebastião Pereira da Siva','Rua das Amendoas, 8','2');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('3','Ferdinando Jose da Paixão','Av. Imbiribira, s/n','1');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('2','Andrade Ferreira Gusmão','Praça Edmundo Pereira, 30','1');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('2','Erisvaldo Siqueira','Rua Edmundo Vidigal, 55','1');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('1','Batistela Simanteli','Rua Erisvaldo Franco, 78','2');
insert into FUNCIONARIO(profissao_codigo,nome,endereco,FILIAL_codigo) values('1','Sigmund reud','Rua nem Froyd Explica, 30','2');

insert into STATUS(descricao) value('Disponível');
insert into STATUS(descricao) value('Reservado');

insert into MOTIVO(descricao) VALUES
('Agendamento Realizado'),
('Agendamento Cancelado');

insert into VEICULO(placa,marca,modelo, STATUS_codigo,FILIAL_codigo) values
('GLA0234','VW','GOL','1','1'),
('GLB0145','VW','GOL','1','1'),
('GLB0123','VW','GOL','1','1'),
('GLB0113','VW','GOL','1','1'),
('GLB0114','VW','GOL','1','1'),
('GLB0115','VW','GOL','1','1'),
('GLB0116','VW','GOL','1','1'),
('GLB0117','VW','GOL','1','1'),
('FOB0111','VW','FOX','1','1'),
('FOB0121','VW','FOX','1','1'),
('GLB0222','VW','GOL','1','2'),
('GLB0311','VW','GOL','1','2'),
('GLB0419','VW','GOL','1','2'),
('GLB0516','VW','GOL','1','2'),
('GLB0616','VW','GOL','1','2'),
('GLB0715','VW','GOL','1','2'),
('GLB0814','VW','GOL','1','2'),
('GLB0912','VW','GOL','1','2'),
('GLB0111','VW','GOL','1','2'),
('GLB0121','VW','GOL','1','2'),
('FUN0111','FIAT','UNO','1','1'),
('FUN0222','FIAT','UNO','1','1'),
('FUN0333','FIAT','UNO','1','1'),
('FUN0444','FIAT','UNO','1','1'),
('FUN0555','FIAT','UNO','1','1'),
('FUN0666','FIAT','UNO','1','1'),
('FUN0777','FIAT','UNO','1','1'),
('FUN0888','FIAT','UNO','1','1'),
('FUN0999','FIAT','UNO','1','1'),
('FUN0421','FIAT','UNO','1','2'),
('FUN0422','FIAT','UNO','1','2'),
('FUN0423','FIAT','UNO','1','2'),
('FUN0424','FIAT','UNO','1','2'),
('FUN0425','FIAT','UNO','1','2'),
('FUN0426','FIAT','UNO','1','2'),
('FUN0427','FIAT','UNO','1','2'),
('FUN0428','FIAT','UNO','1','2'),
('FUN0429','FIAT','UNO','1','2');