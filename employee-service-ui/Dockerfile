FROM java:8
FROM maven:alpine
LABEL maintainer="subrat.khilar@gmail.com"
RUN mkdir /app





COPY target/employee-service-ui-0.0.1-SNAPSHOT.jar /app/employee-service-ui-0.0.1-SNAPSHOT.jar

WORKDIR /app

ENTRYPOINT ["java","-jar","employee-service-ui-0.0.1-SNAPSHOT.jar"]

EXPOSE 8888
