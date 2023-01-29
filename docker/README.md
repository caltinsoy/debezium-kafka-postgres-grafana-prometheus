# Kafka Dockerlab
The main objective of creating this lab was to provide Simple hands-on lab for the people who are willing to learn about Kafka and its monitoring aspect. So we can say this is a Dockerized Example of **[Apache Kafka](https://kafka.apache.org/)**, **[Prometheus](https://prometheus.io/)** and **[Grafana](https://grafana.com/)**.

For monitoring Kafka we are using:-
- [**Prometheus JMX Exporter**](https://github.com/prometheus/jmx_exporter)
- [**Kafka Exporter**](https://github.com/danielqsj/kafka_exporter)

## Requirments
We don't have a long list of requirments but yes we do have some of them. The need for running this setup is:-
- [X] Docker
- [X] Docker Compose

## Pre-Requisites
The only pre-requisite is:-
- set `KAFKA_ADVERTISED_HOST_NAME` in `docker-compose.yml` to match your docker host IP. (Note: Do not use localhost or 127.0.0.1 as the host ip if you want to run multiple brokers).

## Usage
For using this setup, you just need to type these magical words on your terminal :wink:.

```shell
docker-compose up -d
```

After this you can access below services.

- [X] [**Prometheus UI**]() - *http://<docker_host_ip>:9090*
- [X] [**Grafana UI**]() - *http://<docker_host_ip>:3000*

#### Sending Kafka Messages
In order for the Kafka broker to expose JMX topic metrics you must send some messages to the topics.

```shell
cat kafka-messages | docker run -i -a stdin wurstmeister/kafka /opt/kafka/bin/kafka-console-producer.sh --broker-list <docker_host_ip>:9092 --topic customer
cat kafka-messages | docker run -i -a stdin wurstmeister/kafka /opt/kafka/bin/kafka-console-producer.sh --broker-list <docker_host_ip>:9092 --topic audit
```

#### Prometheus UI
![](./images/prometheus.png)

#### Grafana UI
![](./images/grafana.png)