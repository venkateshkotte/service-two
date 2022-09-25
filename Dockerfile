FROM adoptopenjdk/openjdk8

EXPOSE 8081

ADD target/service-two.jar service-two.jar

ENTRYPOINT ["java", "-jar", "service-two.jar"]