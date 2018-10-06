FROM java:8-jre
MAINTAINER subrat khilar <subrat.khilar@gmail.com>

ADD ./target/employee-dashboard.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/employee-dashboard.jar"]

EXPOSE 6000