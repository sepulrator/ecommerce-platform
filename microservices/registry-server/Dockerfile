FROM java:8-jre
MAINTAINER Osman Samil AKCELIK <osman.samil327@gmail.com>

ADD ./build/libs/registry-server.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry-server.jar"]

EXPOSE 8761