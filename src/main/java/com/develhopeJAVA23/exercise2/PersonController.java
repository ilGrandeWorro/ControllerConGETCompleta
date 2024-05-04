package com.develhopeJAVA23.exercise2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")

public class PersonController {
    @GetMapping("/ciao/{provincia}")
    public Person personAndGreet(
            @PathVariable String provincia,
            @RequestParam(defaultValue = "Utente") String nome) {

        return new Person(nome, provincia);
    }
}
