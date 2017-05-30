FROM java:8-jre
MAINTAINER Osman Samil AKCELIK <osman.samil327@gmail.com>

ADD ./build/libs/product-microservice.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/product-microservice.jar"]

EXPOSE 6000

