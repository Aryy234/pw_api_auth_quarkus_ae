docker pull postgres:15


------------------------------------------------------

docker run -d --name quarkus-pw-auth-db \
  -e POSTGRES_USER=admin \
  -e POSTGRES_PASSWORD=admin \
  -e POSTGRES_DB=quarkus-pw-auth-db- \
  -p 5435:5432 \
  -v quarkus_auth_data:/var/lib/postgresql/data \
  postgres:15
