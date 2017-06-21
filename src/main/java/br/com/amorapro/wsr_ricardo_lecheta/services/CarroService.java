package br.com.amorapro.wsr_ricardo_lecheta.services;


import br.com.amorapro.wsr_ricardo_lecheta.model.Carro;
import br.com.amorapro.wsr_ricardo_lecheta.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> getAllCarros() {
        return carroRepository.findAll();
    }

    public void insert(Carro carro) {
        carroRepository.save(carro);
    }
}
