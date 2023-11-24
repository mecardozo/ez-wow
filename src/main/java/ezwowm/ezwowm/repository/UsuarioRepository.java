package ezwowm.ezwowm.repository;

import ezwowm.ezwowm.model.Usuario;
import jakarta.transaction.Transactional;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //List<Usuario> getUsuarios();
    @Query("SELECT u FROM Usuario u WHERE u.dni = :dni")
    Usuario findByDNI(@Param("dni") Integer dni);
    @NonNull
    List<Usuario> findAll();
    @Modifying
    @Transactional
    @Query("DELETE FROM Usuario u WHERE u.dni = :dni")
    Integer deleteByDni(Integer dni);

    @Modifying
    @Transactional
    @Query("INSERT INTO Usuario u (u.dni, u.nombre, u.apellido, u.correo) VALUES (:dni, :nombre, :apellido, :correo)")
    void insertUsuario(@Param("dni") Integer dni, @Param("nombre") String nombre,@Param("apellido") String apellido, @Param("correo") String correo);

}
