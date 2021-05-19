package Desafio.Desafio.resources;

import Desafio.Desafio.dto.AssociadoDTO;
import Desafio.Desafio.dto.PautaDTO;
import Desafio.Desafio.entities.Associado;
import Desafio.Desafio.entities.Pauta;
import Desafio.Desafio.services.AssociadoService;
import Desafio.Desafio.services.PautaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/associados")
public class AssociadoResource {

    @Autowired
    AssociadoService associadoService;


    @GetMapping
    public ResponseEntity<List<AssociadoDTO>> findAll() {
        List<Associado> list = associadoService.findAll();
        List<AssociadoDTO> listDto = list.stream().map(obj -> new AssociadoDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value="{id}")
    public ResponseEntity<Associado> findById(@PathVariable Long id){
        Associado obj = associadoService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Associado> insert(@RequestBody AssociadoDTO objDto){
        Associado obj = associadoService.fromDTO(objDto);
        obj =  associadoService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                .buildAndExpand(obj.getidAssociado()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }
}
