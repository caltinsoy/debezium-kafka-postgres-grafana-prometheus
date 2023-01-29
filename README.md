# debezium-kafka-postgres-grafana-prometheus

This is a simple repository that aims to  try to show metrics of  ***Postgres, Kafka and Spring Boot*** application by using some dockerized  jmx exporters. There are couple of JMX exporters that are available in **docker** file.

You can also setup your connectors by using Debezium UI (http://localhost:8088/). 

**_Also:_** 

* If you want to create your connector , **create-connector.json** file in debezium docker\directory , you just need to send a **POST** request to http://localhost:8083/connectors/.
* If you want to update your connector config(**update-connector.json**) : **PUT**  http://localhost:8083/connectors/{your_connector_name}/config
* When you want to learn update of your connector : **GET** http://localhost:8083/connectors/{your_connector_name}/status
* or want to get  your connector config : **GET** http://localhost:8083/connectors/{your_connector_name}/config

For More Detail  : https://debezium.io/documentation/reference/stable/operations/debezium-ui.html

## Kafka Manager
Another thing is Kafka-Manager.  This is an open-source managing tool for Apache Kafka clusters.
When you run your container , check it out from here : http://localhost:9000/

## Grafana & Prometheus
Grafana is the open source analytics & monitoring solution , Prometheus is an open-source systems monitoring and alerting toolkit.

You will be able to access to ***Grafana*** via localhost:3000 . Before you import dashboards, you need to create your data source  like Postgre, Prometheus and more ... But in this example, I imported ***Prometheus*** as a data source , cause as you guees it , we will be taking metrics by postgres-exporter from Postgres. When you run your docker compose file  you will be accessing to Prometheus http://localhost:9090  .

## Kafka Metrics
You also will be able to access Kafka metrics like  :

`kafka_topic_partitions` : Number of partitions for this Topic

`kafka_topic_partition_current_offset` : Current Offset of a Broker at Topic/Partition

`kafka_topic_partition_oldest_offset` : Oldest Offset of a Broker at Topic/Partition

`kafka_topic_partition_in_sync_replica`: Number of In-Sync Replicas for this Topic/Partition

`kafka_topic_partition_leader`: Leader Broker ID of this Topic/Partition

`kafka_topic_partition_leader_is_preferred` : 1 if Topic/Partition is using the Preferred Broker

`kafka_topic_partition_replicas` : Number of Replicas for this Topic/Partition

`kafka_topic_partition_under_replicated_partition` :1 if Topic/Partition is under Replicated

More Detail about Kafka Metrics : https://github.com/danielqsj/kafka_exporter#grafana-dashboard

## Kafka Connect Metrics

`kafka_connect_metrics_connection_count`:Current number of active connections

`kafka_connect_metrics_network_io_rate`:Average number of network operations (reads or writes) on all connections per second

## Debezium UI
![debezium-1.PNG](docker%2Fimages%2Fdebezium-1.PNG)

![debezium-2.PNG](docker%2Fimages%2Fdebezium-2.PNG)

## Kafka Manager
![kafka-manager.PNG](docker%2Fimages%2Fkafka-manager.PNG)

## Prometheus
![kconnect-1.PNG](docker%2Fimages%2Fkconnect-1.PNG)

![kconnect-2.PNG](docker%2Fimages%2Fkconnect-2.PNG)

# Dashboards

* For Kafka Exporter: ***Grafana Dashboard ID: 7589***
* For Postgresql:   https://grafana.com/grafana/dashboards/9628-postgresql-database/
* For SpringBoot : https://grafana.com/grafana/dashboards/12900-springboot-apm-dashboard/

You can also create your dashboards with json file in ***docker/dashboards*** directory.In Grafana, You need to go DashBoard tab and then click Import , you will see the Upload Json File Section.

There are many dashboards according to your need on https://grafana.com/grafana/dashboards/ . 

## Postgresql

![postgres-exporter-1.PNG](docker%2Fimages%2Fpostgres-exporter-1.PNG)

![postgres-exporter-2.PNG](docker%2Fimages%2Fpostgres-exporter-2.PNG)

## Kafka Exporter
![kafka-exporter-1.PNG](docker%2Fimages%2Fkafka-exporter-1.PNG)

![kafka-exporter-2.PNG](docker%2Fimages%2Fkafka-exporter-2.PNG)

## Spring Boot Application (Transaction Consumer)
![springboot-app-monitoring-1.PNG](docker%2Fimages%2Fspringboot-app-monitoring-1.PNG)

![springboot-app-monitoring-2.PNG](docker%2Fimages%2Fspringboot-app-monitoring-2.PNG)

![springboot-app-monitoring-3.PNG](docker%2Fimages%2Fspringboot-app-monitoring-3.PNG)

