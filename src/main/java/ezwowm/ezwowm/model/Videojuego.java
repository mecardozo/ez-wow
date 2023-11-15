package ezwowm.ezwowm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Entity
public class Videojuego {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer UID;
    private String nombre;
    private Date fechaCreacion;
    private String descripcion;
    private double puntaje;

}
