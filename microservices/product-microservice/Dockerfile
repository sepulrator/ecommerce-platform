FROM java:8-jre
MAINTAINER Osman Samil AKCELIK <osman.samil327@gmail.com>

ADD ./build/libs/product-microservice-0.0.2-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/product-microservice-0.0.2-SNAPSHOT.jar"]

EXPOSE 8000

