package br.gov.sp.fatec.springlab420252.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.gov.sp.fatec.springlab420252.entity.Configuracao;
import br.gov.sp.fatec.springlab420252.repository.ConfiguracaoRepository;

@Service
public class ConfiguracaoServiceImpl implements ConfiguracaoService {

    private final ConfiguracaoRepository configuracaoRepository;

    public ConfiguracaoServiceImpl(ConfiguracaoRepository configuracaoRepository) {
        this.configuracaoRepository = configuracaoRepository;
    }

    @Override
    public Configuracao novoConfiguracao(Configuracao configuracao) {
        if (!StringUtils.hasText(configuracao.getParametro())) {
            throw new IllegalArgumentException("O parâmetro deve estar preenchido!");
        }
        if (configuracao.getUsuario() == null) {
            throw new IllegalArgumentException("O usuário deve estar preenchido!");
        }

        // Se não tiver data/hora de entrega, usa a atual
        if (configuracao.getDataHoraFim() == null) {
            configuracao.setDataHoraFim(LocalDateTime.now());
        }

        return configuracaoRepository.save(configuracao);
    }

    @Override
    public List<Configuracao> buscarTodos() {
        return configuracaoRepository.findAll();
    }

    @Override
    public List<Configuracao> buscarPorParametroEDataHora(String parametro, LocalDateTime dataHora) {
        return configuracaoRepository.buscarPorParametroEDataHora(parametro, dataHora);
    }
}
