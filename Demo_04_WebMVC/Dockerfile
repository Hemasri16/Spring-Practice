FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/Demo_04_WebMVC-0.0.1-SNAPSHOT.jar spring.jar
ENTRYPOINT ["java","-jar","/spring.jar"]