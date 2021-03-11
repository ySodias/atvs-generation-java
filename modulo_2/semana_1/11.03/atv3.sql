create database escola;

use escola;

Create table aluno(
	id bigint(5) auto_increment,
    nome varchar(255) not null,
    data_nascimento date not null,
    ra varchar (11) unique not null,
    nota integer not null,
    matricula varchar (11) unique not null,

    primary key(id)
);

insert into aluno(nome, data_nascimento, ra, nota, matricula, id)
	values	('Yuri', '2000-06-27','999999999', 10, '99999999999', 1),
			('Jéssica', '2000-02-18','899999999', 10, '89999999999', 2),
            ('Rafael', '2000-10-16','799999999', 10, '79999999999', 3),
			('Beatriz', '1995-08-01','699999999', 10, '69999999999', 4),
            ('Vinicius', '2002-06-27','599999999', 7, '59999999999', 5),
			('Michel', '2000-10-18','499999999', 5, '49999999999', 6),
            ('Elias', '2000-10-16','399999999', 6, '39999999999', 7),
			('Wesley', '2000-01-1','299999999', 8, '29999999999', 8);


    
select * from aluno where nota > 7;

select * from aluno where nota < 7;

update aluno set nota=8 where id=5