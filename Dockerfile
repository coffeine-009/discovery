#- Base image -#
FROM java:8

ADD build/libs/discovery-1.0.0.SNAPSHOT.jar /opt/discovery.jar

CMD ["java", "-jar", "/opt/discovery.jar"]
#, "-Dspring.profiles.active=production"
