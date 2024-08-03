#uygulama için jdk gerekli
# FROM amazoncorretto:17
FROM openjdk:21

#bizim projemizdeki jar dosyamızın docker içinde çalışacağı konum
ARG JAR_FILE=target/*.jar

#jar dosyasını bu isimle docker ın içine kopyala
COPY ${JAR_FILE} application.jar

#terminal komutları için cmd kullanılır
CMD apt-get update -y

#projenin çalışacağı iç port
EXPOSE 8080

#uygulamanın çalışmasını sağlar
#jarı bul çalıştır
ENTRYPOINT ["java","-jar","application.jar"]