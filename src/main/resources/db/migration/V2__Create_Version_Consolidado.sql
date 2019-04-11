-- Criando controle de versão na tabela de ConsolidadoFilialData.
ALTER TABLE consolidado_filial_data ADD COLUMN version int not null;