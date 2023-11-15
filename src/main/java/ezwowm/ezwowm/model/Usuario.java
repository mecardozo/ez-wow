package ezwowm.ezwowm.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
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
