FROM java:8-jre
MAINTAINER Osman Samil AKCELIK <osman.samil327@gmail.com>

ADD ./build/libs/gateway-server.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/gateway-server.jar"]

EXPOSE 4000