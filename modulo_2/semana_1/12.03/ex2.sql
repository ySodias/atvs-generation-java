-- Exercício 2 - DB para um Pizzaria

CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
	cl_id_categoria INT AUTO_INCREMENT,
	cl_name_categoria VARCHAR(12) UNIQUE NOT NULL,
    cl_is_salgado BOOLEAN NOT NULL,
    PRIMARY KEY(cl_id_categoria)
);
CREATE TABLE tb_pizza(
	cl_id_pizza INT AUTO_INCREMENT,
	cl_name_pizza VARCHAR(255) UNIQUE NOT NULL,
    cl_preco_pizza DECIMAL(10,2) NOT NULL,
    cl_tamanho_pizza VARCHAR(255) DEFAULT 'Media',
    fk_cl_id_categoria INT,
    PRIMARY KEY(cl_id_pizza),
    CONSTRAINT cl_id_categoria FOREIGN KEY(fk_cl_id_categoria)
    REFERENCES tb_categoria(cl_id_categoria)
);

INSERT INTO tb_categoria(cl_name_categoria, cl_is_salgado)
	VALUES  ("Tradicional", TRUE),
			("Moda da casa", TRUE),
            ("Vegetariana", TRUE),
            ("Com Sorvete", FALSE),
            ("Doce", FALSE);

INSERT INTO tb_pizza(cl_name_pizza, cl_preco_pizza, cl_tamanho_pizza, fk_cl_id_categoria)
	VALUES  ("Mussarela", 40, "Grande", 3),
			("Calabresa", 30, "Media", 1),
            ("Nutella", 20, "Media", 5),
            ("Peperoni", 33, "Grande", 2),
            ("Frango com Catupiry", 45, "Tamanho Família", 2),
			("Napolitano", 20, "Pequena", 4),
            ("Portuguesa", 65, "Tamanho Família", 1),
            ("Prestigio", 25, "Pequena", 5);
SELECT * FROM tb_pizza;
SELECT * FROM tb_categoria;
	
SELECT * FROM tb_pizza WHERE cl_preco_pizza > 45;

SELECT * FROM tb_pizza WHERE cl_preco_pizza >= 29 AND cl_preco_pizza <= 60;

SELECT * FROM tb_pizza WHERE cl_name_pizza LIKE "%c%";

SELECT tb_pizza.cl_name_pizza, tb_pizza.cl_preco_pizza, tb_categoria.cl_name_categoria
	FROM tb_pizza
INNER JOIN tb_categoria ON tb_categoria.cl_id_categoria = tb_pizza.fk_cl_id_categoria
WHERE tb_categoria.cl_name_categoria LIKE "%Tradicional%";

SELECT tb_pizza.cl_name_pizza, tb_pizza.cl_preco_pizza, tb_categoria.cl_is_salgado
	FROM tb_pizza
INNER JOIN tb_categoria ON tb_categoria.cl_id_categoria = tb_pizza.fk_cl_id_categoria
WHERE tb_categoria.cl_is_salgado LIKE FALSE



