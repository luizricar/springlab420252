package br.gov.sp.fatec.springlab420252.service;

import java.time.LocalDateTime;
import java.util.List;

import br.gov.sp.fatec.springlab420252.entity.Configuracao;

public interface ConfiguracaoService {

    public List<Configuracao> buscarTodos();

    public Configuracao novoConfiguracao(Configuracao configuracao);

    public List<Configuracao> buscarPorParametroEDataHora(String parametro, LocalDateTime dataHora);
    
}
