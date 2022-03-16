FROM openjdk:16-alpine
EXPOSE 8083
ADD target/customer-1.0-SNAPSHOT.jar customer-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/customer-1.0-SNAPSHOT.jar"]
