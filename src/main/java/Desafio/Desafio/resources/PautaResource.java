package Desafio.Desafio.resources;

import Desafio.Desafio.dto.PautaDTO;
import Desafio.Desafio.entities.Pauta;
import Desafio.Desafio.services.PautaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/pautas")
public class PautaResource {

    @Autowired
    PautaService pautaService;


    @GetMapping
    public ResponseEntity<List<PautaDTO>> findAll() {
        List<Pauta> list = pautaService.findAll();
        List<PautaDTO> listDto = list.stream().map(obj -> new PautaDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value="{id}")
    public ResponseEntity<Pauta> findById(@PathVariable Long id){
        Pauta obj = pautaService.findById(id);
        return ResponseEntity.ok().body(obj);
    }



    @PostMapping
    public ResponseEntity<Pauta> insert(@RequestBody Pauta pauta) {
        Pauta response = pautaService.insert(pauta);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
