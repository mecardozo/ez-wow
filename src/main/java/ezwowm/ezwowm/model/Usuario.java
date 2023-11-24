package ezwowm.ezwowm.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer UID;

    private Integer dni;
    private String nombre;
    private String apellido;
    private String correo;

}
