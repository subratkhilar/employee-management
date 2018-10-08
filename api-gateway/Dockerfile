FROM java:8
FROM maven:alpine
RUN mkdir /app



LABEL maintainer="subrat.khilar@gmail.com"
COPY target/api-gateway-0.0.1-SNAPSHOT.jar /app/api-gateway-0.0.1-SNAPSHOT.jar
WORKDIR /app

ENTRYPOINT ["java","-jar","api-gateway-0.0.1-SNAPSHOT.jar"]


EXPOSE 8082