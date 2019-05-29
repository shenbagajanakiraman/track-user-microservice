FROM openjdk:11-jdk-stretch

ADD /target/config-server-0.0.1-SNAPSHOT.jar /src/app/config-server-0.0.1-SNAPSHOT.jar

WORKDIR /src/app

ENTRYPOINT  ["java", "-jar","config-server-0.0.1-SNAPSHOT.jar"]