# Kafka Example


## References

- [Parallelism Concept - Explain Partitions and Consumers Balance](https://stackoverflow.com/questions/25602359/kafka-how-to-consume-one-topic-parallel)
- [Kafka Topics - Change Partitions Quantity](https://stackoverflow.com/questions/49054946/kafka-topic-partitions)
- [Kafka CLI - Usefull Commands](https://jaceklaskowski.gitbooks.io/apache-kafka/content/kafka-docker.html)
  - Command Example (Increase Topic Partitions): ``docker-compose exec kafka bash -c "kafka-topics.sh --bootstrap-server :9092 --alter --topic MY-SPECIFIC-TOPIC --partitions 5"``