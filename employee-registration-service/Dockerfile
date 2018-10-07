FROM java:8
FROM maven:alpine
LABEL maintainer="subrat.khilar@gmail.com"
RUN mkdir /app





COPY target/employee-registration-service-1.0-SNAPSHOT.jar /app/employee-registration-service-1.0-SNAPSHOT.jar

WORKDIR /app

ENTRYPOINT ["java","-jar","employee-registration-service-1.0-SNAPSHOT.jar"]

EXPOSE 2222
