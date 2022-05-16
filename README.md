# Spring-Data-Elasticsearch-POC
해당 프로젝트는 Spring Data Elasticsearch 에 대한 Index/Query POC(Proof of concept) 입니다.

## Diagram

<img width="1041" alt="image" src="https://user-images.githubusercontent.com/60500649/168565073-2391a3db-925a-450f-b2bf-7c1f9c261f2e.png">

## Run
### Clone project
`$ https://github.com/currenjin/elasticsearch-poc`

### Run container
`$ make start-app` * jar is required.

### Invoke api
#### In(Index)
```shell
$ curl -d '{"id":"test","name":"currenjin","phoneNumber":"01012341234"}' \
-H "Content-Type: application/json" \
-X POST http://localhost:8080/
```

#### Out(Query)
```shell
$ curl -X GET "http://localhost:8080/test"
$ curl -X GET "http://localhost:8080?name=currenjin"
$ curl -X GET "http://localhost:8080?phoneNumber=01012341234"
```
