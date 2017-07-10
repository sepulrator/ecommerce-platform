FROM java:8-jre
MAINTAINER Osman Samil AKCELIK <osman.samil327@gmail.com>

ADD ./build/libs/monitoring-server-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/monitoring-server-0.0.1-SNAPSHOT.jar"]

EXPOSE 8989 8080