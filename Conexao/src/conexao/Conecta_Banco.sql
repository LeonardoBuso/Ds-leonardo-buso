create database if not exists ConectaBanco;
use ConectaBanco;
drop table if exists alunos;

create table alunos (
	Codigo_Aluno varchar(45),
    Nome_Aluno varchar(45)
);