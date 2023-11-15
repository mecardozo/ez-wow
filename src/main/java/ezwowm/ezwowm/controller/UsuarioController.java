package ezwowm.ezwowm.controller;

import ezwowm.ezwowm.dto.UsuarioDTO;
import ezwowm.ezwowm.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("/usuarios")
    public List<UsuarioDTO> getUsuarios() {
        return usuarioService.devolverUsuarios();
    }


}
