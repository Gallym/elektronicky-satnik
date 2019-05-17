FROM maven:3.6.1

ADD . /server
WORKDIR /server

# start app
CMD mvn -Ddb.host=$DB_HOST -Ddb.port=$DB_PORT -Ddb.user=$DB_USER -Ddb.password=$DB_PASSWORD spring-boot:run