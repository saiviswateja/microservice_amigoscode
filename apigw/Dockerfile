FROM openjdk:14-jdk-alpine
EXPOSE 8085
ADD target/apigw-1.0-SNAPSHOT.jar apigw-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/apigw-1.0-SNAPSHOT.jar"]