package ezwowm.ezwowm.controller;

import ezwowm.ezwowm.dto.UsuarioDTO;
import ezwowm.ezwowm.services.UsuarioService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    //C(create)
    @PostMapping("/usuarios")
    public ResponseEntity<?> postUser(@RequestParam Integer dni, @RequestParam String nombre,@RequestParam String apellido, @RequestParam String correo){
        return ResponseEntity.ok(usuarioService.insertUsuario(dni, nombre, apellido, correo));
    }

    @PostMapping("/usuarios/object")
    public ResponseEntity<?> postUserObject(@RequestBody UsuarioDTO usuarioDTO){
        return ResponseEntity.ok(usuarioService.insertUsuario(usuarioDTO.getDni(),usuarioDTO.getNombre(),usuarioDTO.getApellido(),usuarioDTO.getCorreo()));
    }
    //Create sin parametros, el objeto crudo

    //R(read)
    @GetMapping("/usuarios")
    public ResponseEntity<?> getUsers() {
        List<UsuarioDTO> usuariosDTOS = usuarioService.devolverUsuarios();
        if (usuariosDTOS == null) {
            return ResponseEntity.ok().body("No hay usuarios en la base de datos");
        }
        return ResponseEntity.ok(usuariosDTOS);
    }


    @GetMapping("/usuario")
    public ResponseEntity<?> getUserByDNI(@RequestParam Integer dni) {
        UsuarioDTO usuarioDTO = usuarioService.devolverUsuarioPorDNI(dni);
        if (usuarioDTO == null){
            return ResponseEntity.badRequest().body("El usuario con dni " + dni + " no existe");
        }
        return ResponseEntity.ok(usuarioDTO);
    }



    //D(delete)
    @DeleteMapping("/usuario")
    public ResponseEntity<?> deleteUserByDni(@RequestParam Integer dni){
        return ResponseEntity.ok(usuarioService.eliminarUsuarioPorDni(dni));
    }

}
