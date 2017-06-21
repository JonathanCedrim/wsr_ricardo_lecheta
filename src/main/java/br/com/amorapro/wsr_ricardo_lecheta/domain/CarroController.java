package br.com.amorapro.wsr_ricardo_lecheta.domain;

import br.com.amorapro.wsr_ricardo_lecheta.model.Carro;
import br.com.amorapro.wsr_ricardo_lecheta.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping(value ="/")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/carros")
    public List<Carro> getCarros() {
        return carroService.getAllCarros();
    }

    @PostMapping(value = "/carro")
    public void salvaCarro(@RequestBody Carro carro) {
        carroService.insert(carro);
    }
}
