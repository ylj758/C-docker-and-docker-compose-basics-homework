FROM java:8

COPY build/libs/alice-0.0.1-SNAPSHOT.jar alice.jar
COPY wait-for-it.sh wait-for-it.sh

ENTRYPOINT ["./wait-for-it.sh", "bob:8081", "-t", "60", "--", "java", "-jar", "/alice.jar"]

EXPOSE 8080
