# Elektronický šatník – server app

This is the backend application for Elektronický šatník.

## Prerequisites

### Standalone:
* JDK 1.8
* Maven
* MariaDB / MySQL

### Docker:
* Docker
* docker-compose

## Setup

### Standalone:
* Run the script `db/create_database.sql` on the DB server to create database
* Run the script `db/data.sql` on the DB server to seed the database

## Running the server

### Standalone:
* make sure the DB server is running
* run `mvn -Ddb.host=<your_host> -Ddb.port=<your_port> -Ddb.user=<your_user> -Ddb.password=<your_password> spring-boot:run`

  the default values for the DB properties are the following:
  * `db.host` = localhost
  * `db.port` = 3306
  * `db.user` = root
  * `db.password` = root
  
  you only need to override the ones that are different from your configuration

### Docker:
* run `docker-compose up`