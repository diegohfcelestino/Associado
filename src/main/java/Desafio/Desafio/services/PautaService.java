package Desafio.Desafio.services;

import Desafio.Desafio.dto.PautaDTO;
import Desafio.Desafio.entities.Pauta;
import Desafio.Desafio.repositories.PautaRepository;
import Desafio.Desafio.services.exceptions.NaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PautaService {

    @Autowired
    private PautaRepository pautaRepository;


    public List<Pauta> findAll(){
        return pautaRepository.findAll();
    }

    public Pauta findById(Long id){
        Optional<Pauta> obj = pautaRepository.findById(id);
        return obj.orElseThrow(() -> new NaoEncontradoException(
                "Pauta não encontrado! Id: " + id + ", Tipo: " + Pauta.class.getName()));
    }


    public Pauta insert(Pauta obj){
        obj.setidPauta(null);
        return pautaRepository.save(obj);
    }


    public Pauta fromDTO(PautaDTO pautDto){
        return new Pauta(pautDto.getId(),pautDto.getNome());
    }
}
