package ezwowm.ezwowm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoriavideojuegoController {

    @GetMapping("/historiavideojuegos")
    public String getHisoriavideojuegos() {
        return "Devuelvo Hisoria de videojuegos";
    }


}
