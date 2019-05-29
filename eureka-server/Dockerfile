FROM openjdk:11-jdk-stretch

ADD /target/eureka-server-0.0.1-SNAPSHOT.jar /src/main/eureka-server-0.0.1-SNAPSHOT.jar


WORKDIR src/main

ENTRYPOINT ["java","-jar","eureka-server-0.0.1-SNAPSHOT.jar"]