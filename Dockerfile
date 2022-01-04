From openjdk:8
EXPOSE 8080
ADD target/AtelierGit-0.0.1-SNAPSHOT.war AtelierGit-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/AtelierGit-0.0.1-SNAPSHOT.war"]