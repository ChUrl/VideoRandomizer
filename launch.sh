#!/bin/sh

git -C VideoRandomizer pull

docker-compose pull
docker-compose up -d --remove-orphans
docker image prune -f

