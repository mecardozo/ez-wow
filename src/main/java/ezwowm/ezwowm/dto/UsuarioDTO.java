package ezwowm.ezwowm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
public class UsuarioDTO implements Serializable {
    private Integer UID;
    private Integer dni;
    private String nombre;
    private String apellido;
    private String correo;

    public UsuarioDTO(Integer dni, String nombre, String apellido, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
    public UsuarioDTO(){

    }
}
