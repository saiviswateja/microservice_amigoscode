FROM openjdk:14-jdk-alpine
EXPOSE 8761
ADD target/eureka-server-1.0-SNAPSHOT.jar eureka-server-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/eureka-server-1.0-SNAPSHOT.jar"]
