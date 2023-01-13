
FROM amazoncorretto:17-alpine-jdk

MAINTAINER celinaMjure

COPY target/SB13CELINA-0.0.1-SNAPSHOT.jar SB13CELINA-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/SB13CELINA-0.0.1-SNAPSHOT.jar"]