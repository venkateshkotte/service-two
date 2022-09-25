FROM adoptopenjdk/openjdk8

EXPOSE 8081

RUN mkdir -p /tmp/logs/service-two.log

ADD target/service-two.jar service-two.jar

ENTRYPOINT ["java", "-jar", "service-two.jar"]