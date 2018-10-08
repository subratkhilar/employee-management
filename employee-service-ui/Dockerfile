FROM java:8
FROM maven:alpine
LABEL maintainer="subrat.khilar@gmail.com"
RUN mkdir /app





COPY target/employee-service-ui-0.0.1-SNAPSHOT.war /app/employee-service-ui-0.0.1-SNAPSHOT.war

WORKDIR /app

ENTRYPOINT ["java","-jar","employee-service-ui-0.0.1-SNAPSHOT.war"]

EXPOSE 8888
