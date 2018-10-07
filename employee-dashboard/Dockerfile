FROM java:8
FROM maven:alpine
RUN mkdir /app



LABEL maintainer="subrat.khilar@gmail.com"
COPY target/employee-dashboard-1.0-SNAPSHOT.jar /app/employee-dashboard-1.0-SNAPSHOT.jar
WORKDIR /app

ENTRYPOINT ["java","-jar","employee-dashboard-1.0-SNAPSHOT.jar"]


EXPOSE 3333