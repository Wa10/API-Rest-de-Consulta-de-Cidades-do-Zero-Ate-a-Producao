# API-Rest-de-Consulta-de-Cidades-do-Zero-Ate-a-Producao
Desafio Digital Innovation One - bootcamp everis Quality Assurance Beginner

# Banco Postgres no Docker
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres

Clonar o repositorio com as informações das cidades: https://github.com/chinnonsantos/sql-paises-estados-cidades

### Popular

```shell script
cd ~/workspace/sql-paises-estados-cidades/PostgreSQL - Diretório onde o arquivo das cidades está

docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

