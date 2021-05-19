package Desafio.Desafio.services;


import Desafio.Desafio.entities.Voto;
import Desafio.Desafio.repositories.VotoRepository;
import Desafio.Desafio.services.exceptions.VotoRepetidoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotoService {


    @Autowired
    private AssociadoService associadoService;

    @Autowired
    private PautaService pautaService;

    @Autowired
    private VotoRepository votoRepository;



    public Voto insert(Voto obj) {


           obj.setAssociado(associadoService.findById(obj.getAssociado().getidAssociado()));
           obj.setPauta(pautaService.findById(obj.getPauta().getidPauta()));
           return  votoRepository.save(obj);
       }

}
