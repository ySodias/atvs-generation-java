create database servico_rh;

use servico_rh;

Create table funcionario(
	id bigint(5) auto_increment,
    nome varchar(255) not null,
    data_nascimento date not null,
    rg varchar (9) unique not null,
    cpf varchar (11) unique not null,
    salario decimal(10,2) not null,
    primary key(id)
);

insert into funcionario(nome, data_nascimento, rg, cpf, salario, id)
	values('Yuri', '2000-06-27','999999999', '99999999999', 3000.50, 1);

insert into funcionario(nome, data_nascimento, rg, cpf, salario, id)
	values('Danilo', '1996-05-04','899999999', '89999999999', 2700.50, 2);

insert into funcionario(nome, data_nascimento, rg, cpf, salario, id)
	values('Valter', '1967-07-11','799999999', '79999999999', 3000.50, 3);

insert into funcionario(nome, data_nascimento, rg, cpf, salario, id)
	values('Dulcelei', '1970-08-29','699999999', '69999999999', 1500.50, 4);

insert into funcionario(nome, data_nascimento, rg, cpf, salario, id)
	values('Vinicius', '2002-06-27','599999999', '59999999999', 3000.50, 5);
    
select * from funcionario where salario > 2000;

select * from funcionario where salario < 2000