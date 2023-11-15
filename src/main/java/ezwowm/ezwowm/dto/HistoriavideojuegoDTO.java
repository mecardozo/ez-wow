package ezwowm.ezwowm.dto;

import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Data
public class HistoriavideojuegoDTO {
    @NonNull
    private Integer UID;
    private String descripcion;
    private String autor;
    private Date fechaCreacion;
}
