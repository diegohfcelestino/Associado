package Desafio.Desafio.repositories;

import Desafio.Desafio.entities.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface PautaRepository extends JpaRepository<Pauta,Long> {

}
