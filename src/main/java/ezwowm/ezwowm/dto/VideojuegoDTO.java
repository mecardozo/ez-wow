package ezwowm.ezwowm.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Data
public class VideojuegoDTO {
    @NonNull
    private Integer UID;
    private String nombre;
    private Date fechaCreacion;
    private String descripcion;
    private double puntaje;
}
