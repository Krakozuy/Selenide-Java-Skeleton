FROM eclipse-temurin:17-jdk-jammy
RUN apt-get update && apt-get install -y gnupg
RUN \
  wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - && \
  echo "deb http://dl.google.com/linux/chrome/deb/ stable main" > /etc/apt/sources.list.d/google.list && \
  apt-get update && \
  apt-get install -y google-chrome-stable && \
  rm -rf /var/lib/apt/lists/* \
WORKDIR app/
COPY . .
RUN chmod +x gradlew
ENTRYPOINT ./gradlew test
RUN ./gradlew allureReport
RUN java "-DconfigFile=notifications/config.json" -jar notifications/allure-notifications-4.6.1.jar
