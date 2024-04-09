#!/bin/bash
set -e

# This script is used to drop and recreate the meta-data tables

docker exec postgres psql -f /mnt/exercises/sql/schema-drop-postgresql.sql -U postgres

docker exec postgres psql -f /mnt/exercises/sql/schema-water-service.sql -U postgres
docker exec postgres psql -f /mnt/exercises/sql/insert-water-service.sql -U postgres