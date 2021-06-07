# API-Rest-de-Consulta-de-Cidades-do-Zero-Ate-a-Producao
Desafio Digital Innovation One - bootcamp everis Quality Assurance Beginner

Livecoding consistia em desenvolver uma API para mostrar a distância em milhas ou metros entre 2 cidades do Brasil. Foi desenvolvida uma configuração para acesso local e outra via heroku usando o banco de dados no heroku.

## Ferramentas e Skills utilizadas

* Linux
* Git
* Java 8
* Docker
* IntelliJ Community
* Heroku CLI
* Spring Boot
* Gradle Project
* Jar
* Spring Web
* Spring Data JPA
* PostgreSQL Driver
* Insomnia
* Postgres


## Endereços de pesquisa;
 
 Listar paises: https://api-cidades-dio.herokuapp.com/countries
 
 Listar estados: https://api-cidades-dio.herokuapp.com/states
 
 Listar cidades: https://api-cidades-dio.herokuapp.com/cities 
 
 *Nesse endereços a seguir é necessario saber o id da cidade para pesquisar:
 
 Calcular distancia entre cidades em milhas: https://api-cidades-dio.herokuapp.com/by-points?from={IDCIDADE}&to={IDCIDADE
 
 Calcular distancia entre cidades em metros: https://api-cidades-dio.herokuapp.com/by-cube?from={IDCIDADE&to={IDCIDADE}
 
 os valores podem ser encontrados nesses link: https://github.com/chinnonsantos/sql-paises-estados-cidades
 
# Configuração para configuração do banco local 
## Postgres no Docker
Para acessar um banco via docker;

docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres

pegar os arquivos para popular o banco;

Clonar o repositorio com as informações das cidades: https://github.com/chinnonsantos/sql-paises-estados-cidades

## Popular

```shell script
cd ~/workspace/sql-paises-estados-cidades/PostgreSQL - Diretório onde o arquivo das cidades está

docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

Depois de popular o banco é necessário esses 2 comandos para fazer os calculos de distância;
CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;

Dependencias: implementation 'com.vladmihalcea:hibernate-types-52:2.9.8'
```

## Endereços de pesquisa para acesso local;
 
 Listar paises: http://localhost:8080/countries
 
 Listar estados: http://localhost:8080/states
 
 Listar cidades: http://localhost:8080/cities 
 
 *Nesse endereços a seguir é necessario saber o id da cidade para pesquisar:
 
 Calcular distancia entre cidades em milhas: http://localhost:8080/by-points?from={IDCIDADE}&to={IDCIDADE
 
 Calcular distancia entre cidades em metros: http://localhost:8080/by-cube?from={IDCIDADE&to={IDCIDADE}
 

