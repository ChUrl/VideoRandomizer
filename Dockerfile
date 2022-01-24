FROM gradle:7.3.3-jdk17-alpine AS cache
RUN mkdir -p /home/gradle/cache
ENV GRADLE_USER_HOME /home/gradle/cache
WORKDIR /home/gradle/src
COPY --chown=gradle:gradle build.gradle.kts .
RUN gradle clean build --no-daemon -i --stacktrace

FROM gradle:7.3.3-jdk17-alpine AS build
COPY --from=cache /home/gradle/cache /home/gradle/.gradle
WORKDIR /home/gradle/src
COPY --chown=gradle:gradle . .
RUN gradle bootJar --no-daemon -i --stacktrace

FROM openjdk:17.0.2-slim-buster AS deploy
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/videorandomizer.jar
COPY --from=build /home/gradle/src/wait-for-it.sh /app/wait-for-it.sh
RUN chmod +x /app/wait-for-it.sh
