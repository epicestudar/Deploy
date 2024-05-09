FROM  ubuntu:latest as build

run apt-get update
run apt-get install openjdk-17-jdk -y
run apt-get install maven -y

copy . . 

run mvn clean install

from openjdk:17-jdk-slim

EXPOSE 8080

copy --from=build /target/Deploy.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]