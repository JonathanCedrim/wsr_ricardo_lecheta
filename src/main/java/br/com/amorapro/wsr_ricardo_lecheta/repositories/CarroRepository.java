package br.com.amorapro.wsr_ricardo_lecheta.repositories;


import br.com.amorapro.wsr_ricardo_lecheta.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}