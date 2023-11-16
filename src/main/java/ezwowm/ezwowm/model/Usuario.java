package ezwowm.ezwowm.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer UID;

    private Integer dni;
    private String nombre;
    private String apellido;
    private String correo;


}
