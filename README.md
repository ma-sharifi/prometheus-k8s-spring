# Metric with Prometheus
This is an example of how to scrape metrics for a Spring boot application by Prometheus
* THERE IS NO NEED TO DEPLOY PROMETHEUS OPERATOR FOR THIS ROJECT. IT WILL BE DEPLOYED BY ArgoCD itself.
## How to work
By default, Prometheus will only pick up ServiceMonitors from the current namespace.
To select ServiceMonitors from other namespaces, you can update the spec.serviceMonitor.NamespaceSelector field of the Prometheus resource. https://prometheus-operator.dev/docs/user-guides/getting-started/

### run the following command
```shell
kubectl apply -f application-argocd-metrics.yaml
```
It will install CRD in kubernetes
Then go to your ArgoCD UI to see the result of your deployent.


## YOU MUST PROFT FORWARD:  CONTAINER-> prometheus    Ⓕ  quay.io/prometheus/prometheus:v2.45.0
* Metrics will be persis into Prometheus you just deployed with Manifwst apiVersion: monitoring.coreos.com/v1 kind: Prometheus.

* There is no need to install Prometheus Operator separately.
* Follow the the pictures in /documents folder. 

## Prometheus
https://prometheus-operator.dev/docs/prologue/quick-start/

## Link
http://localhost:8080/actuator/prometheus



## diagram
https://stackoverflow.com/questions/52991038/how-to-create-a-servicemonitor-for-prometheus-operator

![prometheus-operator](https://github.com/ma-sharifi/prometheus-k8s-spring/assets/8404721/eab637e2-1e57-4bb8-a230-f9196df29916)

