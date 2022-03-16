FROM openjdk:14-alpine
EXPOSE 8761
ADD eureka_server/target/eureka_server-1.0-SNAPSHOT.jar eureka_server-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/eureka_server-1.0-SNAPSHOT.jar"]
