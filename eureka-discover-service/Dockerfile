FROM java:8-jre
MAINTAINER subrat khilar <subrat.khilar@gmail.com>

ADD ./target/eureka-discover-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/eureka-discover-service.jar"]

EXPOSE 8761