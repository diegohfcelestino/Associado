package Desafio.Desafio.config;

import Desafio.Desafio.entities.Associado;

import Desafio.Desafio.entities.Pauta;
import Desafio.Desafio.entities.Voto;
import Desafio.Desafio.repositories.AssociadoRepository;
import Desafio.Desafio.repositories.PautaRepository;
import Desafio.Desafio.repositories.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private AssociadoRepository associadoRepository;

    @Autowired
    private PautaRepository pautaRepository;

    @Autowired
    private VotoRepository votoRepository;

    @Override
    public void run(String... args) throws Exception {


        Associado a1 = new Associado(null,"Jose","41057240887");
        Associado a2 = new Associado(null,"Jose","41057240887");

        associadoRepository.saveAll(Arrays.asList(a1,a2));

        Pauta p1 = new Pauta(null,"Votacao");
        Pauta p2 = new Pauta(null,"Votacao");

        pautaRepository.saveAll(Arrays.asList(p1,p2));

        Voto ip1 = new Voto(null,a1,p1,"NAO");
        Voto ip2 = new Voto(null,a1,p1,"SIM");

        votoRepository.saveAll(Arrays.asList(ip1,ip2));

    }



}
