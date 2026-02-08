package uce.edu.ec.api.auth.representation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioRepresentation {

    private Long id;
    private String username;
    private String password;
    private String rol;

    

}
