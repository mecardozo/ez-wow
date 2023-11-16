package ezwowm.ezwowm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
public class UsuarioDTO {
    private Integer UID;
    private Integer dni;
    private String nombre;
    private String apellido;
    private String correo;
}
