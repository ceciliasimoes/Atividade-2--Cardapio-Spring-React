docker-compose down
docker build -t backend-cardapio:latest .
docker-compose up --build --force-recreate --remove-orphans
