package Desafio.Desafio.services;

import Desafio.Desafio.dto.AssociadoDTO;
import Desafio.Desafio.entities.Associado;
import Desafio.Desafio.repositories.AssociadoRepository;
import Desafio.Desafio.services.exceptions.NaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssociadoService {

    @Autowired
    private AssociadoRepository associadoRepository;


    public List<Associado> findAll(){
        return associadoRepository.findAll();
    }

    public Associado findById(Long id){
        Optional<Associado> obj = associadoRepository.findById(id);
        return obj.orElseThrow(() -> new NaoEncontradoException(
                "Associado não encontrado! Id: " + id + ", Tipo: " + Associado.class.getName()));
    }


    public Associado insert(Associado obj){
        obj.setidAssociado(null);
        return associadoRepository.save(obj);
    }

    public Associado fromDTO(AssociadoDTO associadoDTO){
        return new Associado(associadoDTO.getId(),associadoDTO.getNome(),associadoDTO.getCpf());
    }
}
