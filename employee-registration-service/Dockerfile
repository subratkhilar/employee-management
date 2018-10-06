FROM java:8-jre
MAINTAINER subrat khilar <subrat.khilar@gmail.com>

ADD ./target/employee-registration-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/employee-registration-service.jar"]

EXPOSE 2222