docker pull postgres:15


------------------------------------------------------

docker run -d --name quarkus-pw-db \
  -e POSTGRES_USER=admin \
  -e POSTGRES_PASSWORD=admin \
  -e POSTGRES_DB=quarkus-pw-db \
  -p 5435:5432 \
  -v quarkus_auth_data:/var/lib/postgresql/data \
  postgres:15

  ------------------------------------------------------

  Script para prueba web programation

docker run -d --name quarkus-pw-examen-db
-e POSTGRES_USER=admin
-e POSTGRES_PASSWORD=admin
-e POSTGRES_DB=quarkus-pw-examen-db
-p 5436:5432
-v quarkus_examen_data:/var/lib/postgresql/data
postgres:15