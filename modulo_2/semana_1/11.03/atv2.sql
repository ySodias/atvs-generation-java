create database e_commerce;

use e_commerce;

Create table produto(
	id bigint(5) auto_increment,
    nome varchar(255) not null,
    categoria varchar(255) not null,
    validade date not null,
    codigo varchar (11) unique not null,
    preco decimal(10,2) not null,
    primary key(id)
);

insert into produto(nome, categoria, validade, codigo, preco, id)
	values	('Toddy', 'Leite achocolatado','2022-02-28', '89999999999', 7.99, 2),
			('Arroz', 'Grãos','2021-06-28', '79999999999', 9.99, 3),
			('Leite Condensado', 'Doce','2022-06-28', '69999999999', 15000000.00, 4),
			('Macarrão', 'Massa','2022-06-28', '59999999999', 3.99, 5),
			('Bolacha Nikito', 'Café da manhã','2023-06-28', '49999999999', 1.99, 6),
			('Pão Panco', 'Café da manhã','2021-04-28', '39999999999', 4.99, 7),
			('Bisteca', 'Carne bovina','2021-04-28', '29999999999', 21.99, 8);



    
select * from produto where preco > 500;

select * from produto where preco < 500;

update produto set preco=3.99 where id=4