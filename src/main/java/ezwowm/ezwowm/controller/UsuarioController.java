package ezwowm.ezwowm.controller;

import ezwowm.ezwowm.dto.UsuarioDTO;
import ezwowm.ezwowm.services.UsuarioService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("/usuario")
    public ResponseEntity<?> getUsuarioPorDNI(@RequestParam Integer dni) {
        UsuarioDTO usuarioDTO = usuarioService.devolverUsuarioPorDNI(dni);
        if (usuarioDTO == null){
            return ResponseEntity.badRequest().body("El usuario con dni");
        }
        return ResponseEntity.ok(usuarioDTO);
    }

    @GetMapping("/usuarios")
    public ResponseEntity<?> getUsuarios() {
        List<UsuarioDTO> usuariosDTOS = usuarioService.devolverUsuarios();
        if (usuariosDTOS == null) {
            return ResponseEntity.badRequest().body("No hay usuarios en la base de datos");
        }
        return ResponseEntity.ok(usuariosDTOS);
    }



    @PostMapping("/usuarios")
    public UsuarioDTO postUsuario(UsuarioDTO usuario){
        return null;
    }

}
