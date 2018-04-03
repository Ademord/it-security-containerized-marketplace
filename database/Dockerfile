# Image: marketplace_db
# Author: ademord
# Description: Containerized Application for the IT_Security lectures.
# Copyright © 2017-2019 Zuercher Hochschule fuer Angewandte Wissenschaften.

FROM mysql
ENV MYSQL_ROOT_PASSWORD=root
RUN rm -v "$(which mysql_ssl_rsa_setup)"
ADD Marketplace.sql /docker-entrypoint-initdb.d
ADD Marketplace_UpdateEncryptedCreditCards.sql /docker-entrypoint-initdb.d
EXPOSE 3306