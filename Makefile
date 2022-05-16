## COMMANDS

start-app:
	docker-compose up

stop-app:
	docker-compose down

start-elasticsearch:
	docker-compose up -d elasticsearch-server

stop-elasticsearch:
	docker-compose down