# elasticsearch-poc
해당 프로젝트는 Elasticsearch 에 대한 Index/Query POC(Proof of concept) 입니다.

## Run
### Clone project
`$ https://github.com/currenjin/elasticsearch-poc`

### Run container
$ docker-compose up

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
