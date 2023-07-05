
### Clone repository
```bash
git clone git@github.com:eslamelshenawy/microservices.git
```
## minikube start 
```bash
minikube start
```
## minikube stop
```bash
minikube stop
```
### build Image

```bash
docker build -t eslamelshenawy/user:1.1 .
```

### push Image

```bash

docker push eslamelshenawy/user:1.1 
```

### build Image

```bash

docker build -t eslamelshenawy/products:1.1 .
```

```push Image

docker push eslamelshenawy/products:1.1
```
## minikube dashboard
```bash
minikube dashboard
```
### get pods --all-namespaces

```bash
kubectl get pods --all-namespaces
```

### 

```bash
kubectl apply -f user-service.yaml 
```

### deploy cluster

```bash
kubectl apply -f product-service.yaml
```
```bash
kubectl logs product-service-6947dfffbb-47pd4 
```




