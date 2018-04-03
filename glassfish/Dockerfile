# Image: glassfish
# Author: ademord
# Description: Containerized Application for the IT_Security lectures.
# Copyright © 2017-2019 Zuercher Hochschule fuer Angewandte Wissenschaften.

FROM        openjdk:8-jdk

MAINTAINER  Almir Dzinovic <almirdzin@gmail.com>

ENV         JAVA_HOME         /usr/lib/jvm/java-8-openjdk-amd64
ENV         GLASSFISH_HOME    /usr/glassfish
ENV         PATH              $PATH:$JAVA_HOME/bin:$GLASSFISH_HOME/bin

RUN         apt-get update && \
            apt-get install -y curl unzip zip inotify-tools && \
            rm -rf /var/lib/apt/lists/*

RUN         curl -L -o /tmp/glassfish5.zip http://download.oracle.com/glassfish/5.0/release/glassfish-5.0.zip && \
            unzip /tmp/glassfish5.zip -d /usr && \
            mv -f /usr/glassfish5 /usr/glassfish && \
            rm -f /tmp/glassfish5.zip && \
            find /usr/glassfish/glassfish/ -name "*.bat" -exec rm -f {} \;

EXPOSE      8080 4848 8181

WORKDIR     /usr/glassfish


ENV ADMIN_USER admin
ENV ADMIN_PASSWORD admin

# set credentials to admin/admin 

RUN echo 'AS_ADMIN_PASSWORD=\n\
AS_ADMIN_NEWPASSWORD='$ADMIN_PASSWORD'\n\
EOF\n'\
>> /opt/tmpfile

RUN echo 'AS_ADMIN_PASSWORD='$ADMIN_PASSWORD'\n\
EOF\n'\
>> /opt/pwdfile
ADD resources.xml /opt/
RUN \
 asadmin start-domain && \
 asadmin --user $ADMIN_USER --passwordfile=/opt/tmpfile change-admin-password && \
 asadmin --user $ADMIN_USER --passwordfile=/opt/pwdfile enable-secure-admin && \
 asadmin --user $ADMIN_USER --passwordfile=/opt/pwdfile add-resources /opt/resources.xml && \
 asadmin stop-domain
CMD asadmin start-domain --verbose