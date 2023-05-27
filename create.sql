create table atendimentos (data date, valor numeric(38,2), id bigserial not null, id_pet bigint, descricao varchar(255), primary key (id));
create table clientes (data_cadastro date, id bigserial not null, cpf varchar(255), nome varchar(255), primary key (id));
create table contatos (id bigserial not null, id_cliente bigint, tag varchar(255), tipo varchar(255), valor varchar(255), primary key (id));
create table enderecos (id bigserial not null, id_cliente bigint, bairro varchar(255), cidade varchar(255), complemento varchar(255), logradouro varchar(255), tag varchar(255), primary key (id));
create table pets (data_nascimento date, id bigserial not null, id_cliente bigint, id_raca bigint, nome varchar(255), primary key (id));
create table racas (id bigserial not null, descricao varchar(255), primary key (id));
create table usuarios (cpf varchar(255) not null, nome varchar(255), perfil varchar(255), senha varchar(255), primary key (cpf));
