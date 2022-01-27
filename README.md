# scala-web-sbt-spring-forked-graphql-mongo-repo-JAdventure

## Description
A POC for REST web service using mongodb.
Creates a user with credentials.

Uses spring's mongorepository and graphql.
There are 2 queries and a single mutation
defined.

## Tech stack
- scala
- sbt
  - springframework
  - graphql
  - mongo connector
- mongo

## Docker stack
- mongodb:latest
- hseeberger/scala-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

## To run
`sudo ./install.sh -u`
- Endpoints
  - curl -X POST -d '{ "query": "{findAllWeapons}"}' http://localhost:80/apis/graphql
  - curl -X POST -d '{ "query": "{countAll}"}' http://localhost:80/apis/graphql
  - curl -X POST -d '{"query": "mutation { createWeapon(name: \"long pole\", description: \"pointy\") }" }' http://localhost/apis/graphql

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Data from JAdventure text game](https://github.com/Progether/JAdventure.git)
- [Code concept](https://www.bezkoder.com/spring-boot-graphql-mongodb-example-graphql-java/)
- [Curl examples](https://www.maxivanov.io/make-graphql-requests-with-curl/)
