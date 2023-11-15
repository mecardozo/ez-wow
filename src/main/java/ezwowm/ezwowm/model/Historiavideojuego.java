package ezwowm.ezwowm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Historiavideojuego {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer UID;
    private String descripcion;
    private String autor;
    private Date fechaCreacion;
}
