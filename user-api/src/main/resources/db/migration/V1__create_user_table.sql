create schema if not exists users;

create table users.user (
    id bigserial primary key,
    nome varchar(100) not null,
    cpf varchar(11) not null unique,
    endereco varchar(255) not null,
    telefone varchar(15) not null,
    email varchar(100) not null unique,
    data_cadastro timestamp not null
)