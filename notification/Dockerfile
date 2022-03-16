FROM openjdk:14-jdk-alpine
EXPOSE 8084
ADD target/notification-1.0-SNAPSHOT.jar notification-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/notification-1.0-SNAPSHOT.jar"]