package ezwowm.ezwowm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideojuegoController {

    @GetMapping("/videojuegos")
    public String getVideojuegos() {
        return "Devuelvo videojuegos";
    }


}
