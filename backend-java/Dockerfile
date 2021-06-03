FROM maven:3.6.0-jdk-8 as build

ARG FOR_BRANCH=master
RUN mkdir /usr/app
RUN git clone https://github.com/s0ckz/plataforma-for.git /usr/app/repo

WORKDIR /usr/app/repo/backend-java
RUN git checkout ${FOR_BRANCH}

COPY ./conf/docker.dev.properties /usr/app/repo/backend-java/prd.properties
RUN mvn clean package -P prd


FROM jboss/wildfly:9.0.2.Final AS runtime

USER root
RUN cp /usr/share/zoneinfo/America/Sao_Paulo /etc/localtime
RUN mkdir -p /var/forpdi/pdf /var/forpdi/files
RUN chmod 0777 /var/forpdi/pdf /var/forpdi/files
USER jboss
COPY --from=build /usr/app/repo/backend-java/target/forpdi.war /opt/jboss/wildfly/standalone/deployments/
COPY ./conf/standalone.conf /opt/jboss/wildfly/bin/standalone.conf
COPY ./conf/standalone.xml /opt/jboss/wildfly/standalone/configuration/

ENV crypt.key=Dn9\$dO-?2Xl3L~5@
ENV smtp.from.name ForPDI
ENV smtp.from.email noreply@forpdi.org
ENV smtp.host localhost
ENV smtp.port 25
ENV smtp.user noreply@forpdi.org
ENV smtp.password 12345
ENV smtp.ssl false
ENV smtp.tls false
ENV store.pdfs /var/forpdi/pdfs/
ENV store.files /var/forpdi/files/

EXPOSE 8009
