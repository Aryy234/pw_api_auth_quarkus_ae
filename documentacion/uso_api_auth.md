# API de Autenticación - Proyecto Quarkus

Esta API permite autenticar usuarios y obtener un token JWT para su uso en otros servicios.

## Endpoints

### 1. Obtener Token de Autenticación

- **Método:** GET
- **URL:** `/auth/token`
- **Parámetros de consulta:**
  - `user`: Nombre de usuario
  - `password`: Contraseña

#### Ejemplo de solicitud

```
GET http://localhost:8082/auth/token?user=ariel&password=ariel
```

> Cambia el puerto y host según tu configuración.

#### Respuesta exitosa (200 OK)

```json
{
  "accessToken": "<jwt_token>",
  "expiresAt": 1700000000,
  "role": "admin"
}
```

- `accessToken`: Token JWT generado.
- `expiresAt`: Timestamp de expiración (segundos desde epoch).
- `role`: Rol del usuario autenticado.

#### Respuesta de error (401 Unauthorized)

Si las credenciales son incorrectas:

```
HTTP/1.1 401 Unauthorized
```

### 2. Notas adicionales

- El endpoint espera los parámetros como query params, no en el cuerpo.
- El token JWT puede ser usado en otros servicios que requieran autenticación.
- Si recibes un error 404, asegúrate de que la aplicación esté corriendo y el endpoint esté correctamente desplegado.

## Ejemplo de uso con curl

```
curl -X GET "http://localhost:8082/auth/token?user=ariel&password=ariel"
```

## Ejemplo de uso con Postman

1. Selecciona método GET.
2. URL: `http://localhost:8082/auth/token`
3. En Params, agrega:
   - Key: `user`, Value: tu usuario
   - Key: `password`, Value: tu contraseña
4. Haz clic en Send.

---

**Autor:** Tu equipo de desarrollo
