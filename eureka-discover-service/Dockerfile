FROM java:8
FROM maven:alpine
LABEL maintainer=“chathuranga.t@gmail.com”
RUN mkdir -p /app/

COPY target/eureka-discover-service-1.0-SNAPSHOT.jar /app/eureka-discover-service-1.0-SNAPSHOT.jar

WORKDIR /app
ENTRYPOINT ["java","-jar","eureka-discover-service-1.0-SNAPSHOT.jar"]


EXPOSE 8761