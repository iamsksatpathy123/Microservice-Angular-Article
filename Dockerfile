FROM java:8
EXPOSE 8080
ADD angularmicroservicezuul.jar angularmicroservicezuul.jar
ENTRYPOINT ["java","-jar","angularmicroservicezuul.jar"]