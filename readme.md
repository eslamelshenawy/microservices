
### Clone repository
```bash
git clone git@github.com:AndriyKalashnykov/spring-microservices-k8s.git
```
## minikube start 
```bash
minikube start
```
## minikube dashboard
```bash
minikube stop
```
### Start Kubernetes cluster

```bash
docker build -t eslamelshenawy/user:1.1 .
```

### Configure Kubernetes cluster

```bash

docker push eslamelshenawy/user:1.1 
```

### Deploy application to Kubernetes cluster

```bash

docker build -t eslamelshenawy/products:1.1 .
```

### Polulate test data

```bash

docker push eslamelshenawy/products:1.1
```
## minikube dashboard
```bash
minikube dashboard
```
### Observe Employee service logs

```bash
kubectl get pods --all-namespaces
```

### Open Swagger UI web interface

```bash
kubectl apply -f user-service.yaml 
```

### Undeploy application from Kubernetes cluster

```bash
kubectl apply -f product-service.yaml
```
```bash
kubectl logs product-service-6947dfffbb-47pd4 
```




