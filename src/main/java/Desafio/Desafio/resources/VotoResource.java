package Desafio.Desafio.resources;

import Desafio.Desafio.dto.AssociadoDTO;
import Desafio.Desafio.dto.VotoDTO;
import Desafio.Desafio.entities.Associado;
import Desafio.Desafio.entities.Voto;
import Desafio.Desafio.services.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/itemPauta")
public class VotoResource {

    @Autowired
    VotoService votoService;

        @PostMapping
        public ResponseEntity<Voto> insert(@RequestBody Voto voto) {
            Voto response = votoService.insert(voto);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }


    }


