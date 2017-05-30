FROM java:8-jre
MAINTAINER Osman Samil AKCELIK <osman.samil327@gmail.com>

ADD ./build/libs/monitoring-server.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/monitoring-server.jar"]

EXPOSE 8989 8080