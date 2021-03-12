-- Exercício 3 - DB para um Farmácia

CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
	cl_id_categoria INT AUTO_INCREMENT,
	cl_type_categoria VARCHAR(255) UNIQUE NOT NULL,
    cl_is_promocao BOOLEAN NOT NULL,
    cl_is_analgesico_categoria BOOLEAN NOT NULL,
    PRIMARY KEY(cl_id_categoria)
);
CREATE TABLE tb_produto(
	cl_id_produto INT AUTO_INCREMENT,
	cl_marca_produto VARCHAR(255) UNIQUE NOT NULL,
    cl_preco_produto DECIMAL(10,2) NOT NULL,
    cl_validade_produto DATE NOT NULL,
    fk_cl_id_categoria INT,
    PRIMARY KEY(cl_id_produto),
    CONSTRAINT cl_id_categoria FOREIGN KEY(fk_cl_id_categoria)
    REFERENCES tb_categoria(cl_id_categoria)
);

INSERT INTO tb_categoria(cl_type_categoria, cl_is_promocao, cl_is_analgesico_categoria)
	VALUES  ("Remédio", TRUE, TRUE),
			("Creme", FALSE, TRUE),
            ("Remédio-Controlado", TRUE, FALSE),
            ("Preservativo", FALSE, FALSE),
            ("Desodorante", FALSE, FALSE);

INSERT INTO tb_produto(cl_marca_produto, cl_preco_produto, cl_validade_produto, fk_cl_id_categoria)
	VALUES  ("Sundown", 55, "2022-06-15", 2),
			("Johnson&Johnson", 20, "2026-05-14", 2),
            ("Dipirona", 5, "2021-08-19", 1),
            ("Jontex", 8, "2022-12-23", 4);

 

SELECT * FROM tb_produto;
SELECT * FROM tb_categoria;
	
SELECT * FROM tb_produto WHERE cl_preco_produto > 50;

SELECT * FROM tb_produto WHERE cl_preco_produto >= 3 AND cl_preco_produto <= 60;

SELECT * FROM tb_produto WHERE cl_marca_produto LIKE "%b%";

SELECT tb_produto.cl_marca_produto, tb_produto.cl_preco_produto, tb_categoria.cl_type_categoria
	FROM tb_produto
INNER JOIN tb_categoria ON tb_categoria.cl_id_categoria = tb_produto.fk_cl_id_categoria
WHERE tb_categoria.cl_type_categoria LIKE "%Creme%";

SELECT  tb_produto.cl_marca_produto, tb_produto.cl_preco_produto, tb_categoria.cl_is_analgesico_categoria
	FROM tb_produto
INNER JOIN tb_categoria ON tb_categoria.cl_id_categoria = tb_produto.fk_cl_id_categoria
WHERE tb_categoria.cl_is_analgesico_categoria LIKE FALSE



