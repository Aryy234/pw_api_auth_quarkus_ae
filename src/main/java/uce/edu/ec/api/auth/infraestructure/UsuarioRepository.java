package uce.edu.ec.api.auth.infraestructure;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.ec.api.auth.domain.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<Usuario> {

    public Usuario findByUsername(String username) {
        return find("username", username).firstResult();
    }

}
