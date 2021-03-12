-- Exercício 1 - DB para um game Online

CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_class(
	cl_id_class INT AUTO_INCREMENT,
	cl_name_classe VARCHAR(12) UNIQUE NOT NULL,
    cl_range_ataque_classe BIGINT NOT NULL,
    PRIMARY KEY(cl_id_class)
);
CREATE TABLE tb_personagem(
	cl_id_personagem INT AUTO_INCREMENT,
	cl_name_personagem VARCHAR(12) UNIQUE NOT NULL,
    cl_lv_personagem INT NOT NULL,
    cl_power_ataque_personagem DECIMAL(10,2) NOT NULL,
    cl_power_defesa_personagem DECIMAL(10,2) NOT NULL,
    cl_guild_personagem VARCHAR(15) DEFAULT 'Sem Guild',
    fk_cl_id_class INT,
    PRIMARY KEY(cl_id_personagem),
    CONSTRAINT cl_id_class FOREIGN KEY(fk_cl_id_class)
    REFERENCES tb_class(cl_id_class)
);

INSERT INTO tb_class(cl_name_classe, cl_range_ataque_classe)
	VALUES  ("Arqueiro", 1000),
			("Guerreiro", 10),
            ("Mago", 500),
            ("Berserker", 50),
            ("Sacerdote", 750);

INSERT INTO tb_personagem(cl_name_personagem, cl_lv_personagem, cl_power_ataque_personagem, cl_power_defesa_personagem, cl_guild_personagem, fk_cl_id_class)
	VALUES  ("Law", 100, 70000, 35000, "New Ordem", 1),
			("Thanatos", 75, 35000, 25000, "Darkness", 2),
            ("Feitan", 15, 1000, 2000, "Ryodan", 3),
            ("Ayacos", 100, 100000, 60000, "New Ordem", 3),
            ("Ayato", 100, 150000, 90000, "New Ordem", 2),
			("Athena", 75, 80000, 60000, "Darkness", 2),
            ("Erza", 100, 130000, 90000, "Darkness", 2),
            ("Nobunaga", 99, 90000, 60000, "Ryodan", 4);
	
SELECT * FROM tb_personagem WHERE cl_power_ataque_personagem > 2000;

SELECT * FROM tb_personagem WHERE cl_power_defesa_personagem >= 1000 AND cl_power_defesa_personagem <= 2000;

SELECT * FROM tb_personagem WHERE cl_name_personagem LIKE "%c%";

SELECT tb_personagem.cl_name_personagem, tb_personagem.cl_guild_personagem, tb_class.cl_id_class
	FROM tb_personagem
INNER JOIN tb_class ON tb_class.cl_id_class = tb_personagem.fk_cl_id_class
WHERE tb_class.cl_id_class LIKE 3;

SELECT tb_personagem.cl_name_personagem, tb_personagem.cl_guild_personagem, tb_class.cl_id_class
	FROM tb_personagem
INNER JOIN tb_class ON tb_class.cl_id_class = tb_personagem.fk_cl_id_class
WHERE tb_class.cl_name_classe LIKE "%Guerreiro%"



