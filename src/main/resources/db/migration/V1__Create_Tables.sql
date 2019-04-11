-- Criando tabelas do Sistema.

CREATE TABLE configuracao (
	filial int not null,
	ip varchar(15) not null,
	data_hora timestamp not null
);

CREATE TABLE avaliacao (
	id serial PRIMARY KEY,
	filial varchar(5) not null,
	ip varchar(15) not null,
	opt varchar(3) not null,
	data_hora timestamp not null
);

CREATE TABLE consolidado_filial_data (
	filial int not null,
	data int not null,
	data_hora timestamp not null,
	pessimo int not null,
	regular int not null,
	bom int not null,
	excelente int not null,
	desconhecido int not null
);

ALTER TABLE configuracao ADD PRIMARY KEY (filial, ip);
ALTER TABLE consolidado_filial_data ADD PRIMARY KEY (filial, data);