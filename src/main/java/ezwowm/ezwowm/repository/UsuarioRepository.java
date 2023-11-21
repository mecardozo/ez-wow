package ezwowm.ezwowm.repository;

import ezwowm.ezwowm.model.Usuario;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
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
}
