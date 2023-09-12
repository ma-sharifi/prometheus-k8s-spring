# Metric with Prometheus
This is an example of how to scrape metrics for a Spring boot application by Prometheus
## Prometheus
https://prometheus-operator.dev/docs/prologue/quick-start/

## Link
http://localhost:8080/actuator/prometheus

## How to work
1- run the following command 
```shell
kubectl apply -f application.yaml
```

## diagram
https://stackoverflow.com/questions/52991038/how-to-create-a-servicemonitor-for-prometheus-operator

![prometheus-operator](https://github.com/ma-sharifi/prometheus-k8s-spring/assets/8404721/eab637e2-1e57-4bb8-a230-f9196df29916)

