package uce.edu.ec.api.auth.aplication;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.ec.api.auth.domain.Usuario;
import uce.edu.ec.api.auth.infraestructure.UsuarioRepository;
import uce.edu.ec.api.auth.representation.UsuarioRepresentation;

@ApplicationScoped
public class UsuarioService {

       @Inject
   UsuarioRepository usuarioRepository;

   public UsuarioRepresentation validarCredenciales(String username, String password) {
      Usuario usuario = usuarioRepository.findByUsername(username);

      if (usuario != null && usuario.getPassword().equals(password)) {
         return mapToRepresentation(usuario);
      }
      return null;
   }

   public UsuarioRepresentation mapToRepresentation(Usuario u) {
      UsuarioRepresentation dto = new UsuarioRepresentation();
      dto.setUsername(u.getUsername());
      dto.setRol(u.getRol());
      return dto;
   }

    

}
