FROM openjdk:17-jdk-slim
MAINTAINER caltinsoy
COPY target/transaction-consumer-0.0.1-SNAPSHOT.jar caltinsoy-transaction-consumer-1.0.0.jar
ENTRYPOINT ["java","-jar","/caltinsoy-transaction-consumer-1.0.0.jar"]