-- Exercício 3 - DB para um Farmácia

CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categoria(
	cl_id_categoria INT AUTO_INCREMENT,
	cl_type_categoria VARCHAR(255) UNIQUE NOT NULL,
    cl_promocao_categoria BOOLEAN NOT NULL,
    cl_is_carne_vermelha_categoria BOOLEAN NOT NULL,
    PRIMARY KEY(cl_id_categoria)
);
CREATE TABLE tb_produto(
	cl_id_produto INT AUTO_INCREMENT,
	cl_nome_produto VARCHAR(255) UNIQUE NOT NULL,
    cl_preco_produto DECIMAL(10,2) NOT NULL,
    cl_validade_produto DATE NOT NULL,
    fk_cl_id_categoria INT,
    PRIMARY KEY(cl_id_produto),
    CONSTRAINT cl_id_categoria FOREIGN KEY(fk_cl_id_categoria)
    REFERENCES tb_categoria(cl_id_categoria)
);

INSERT INTO tb_categoria(cl_type_categoria, cl_promocao_categoria, cl_is_carne_vermelha_categoria)
	VALUES  ("Carne Bovina",TRUE, TRUE),
			("Carne de Peixe",FALSE, FALSE),
            ("Carne de Frango",TRUE, FALSE);


INSERT INTO tb_produto(cl_nome_produto, cl_preco_produto, cl_validade_produto, fk_cl_id_categoria)
	VALUES  ("Bisteca", 55, "2022-07-15", 1),
			("Patinho", 40, "2026-05-14", 1),
            ("Costela", 25, "2021-08-19", 1),
            ("Tilapia", 25, "2021-08-19", 2),
            ("Peito", 20, "2022-12-23", 3);

 

SELECT * FROM tb_produto;
SELECT * FROM tb_categoria;
	
SELECT * FROM tb_produto WHERE cl_preco_produto > 50;

SELECT * FROM tb_produto WHERE cl_preco_produto >= 3 AND cl_preco_produto <= 60;

SELECT * FROM tb_produto WHERE cl_nome_produto LIKE "%b%";

SELECT tb_produto.cl_nome_produto, tb_produto.cl_preco_produto, tb_categoria.cl_type_categoria
	FROM tb_produto
INNER JOIN tb_categoria ON tb_categoria.cl_id_categoria = tb_produto.fk_cl_id_categoria
WHERE tb_categoria.cl_type_categoria LIKE "%Carne Bovina%";

SELECT  tb_produto.cl_nome_produto, tb_produto.cl_preco_produto, tb_categoria.cl_promocao_categoria
	FROM tb_produto
INNER JOIN tb_categoria ON tb_categoria.cl_id_categoria = tb_produto.fk_cl_id_categoria
WHERE tb_categoria.cl_promocao_categoria LIKE FALSE



