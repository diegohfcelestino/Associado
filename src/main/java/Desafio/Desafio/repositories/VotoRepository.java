package Desafio.Desafio.repositories;


import Desafio.Desafio.entities.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VotoRepository extends JpaRepository<Voto,Long> {
   @Query(value = "SELECT COUNT(*) FROM VOTO WHERE ASSOCIADO_ID_ASSOCIADO =  AND PAUTA_ID_PAUTA = ?"
           , nativeQuery = true)
    Voto contandoVoto();
}
