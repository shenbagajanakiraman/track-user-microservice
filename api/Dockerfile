From openjdk:11-jdk-stretch

ADD target/api-0.0.1-SNAPSHOT.jar  /src/app/api/api-0.0.1-SNAPSHOT.jar

WORKDIR /src/app/api

ENTRYPOINT ["java","-jar", "api-0.0.1-SNAPSHOT.jar"]