package br.gov.sp.fatec.springlab420252.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.gov.sp.fatec.springlab420252.entity.Configuracao;

public interface ConfiguracaoRepository extends JpaRepository<Configuracao, Long> {

    @Query("SELECT c FROM Configuracao c " +
           "WHERE LOWER(c.parametro) LIKE LOWER(CONCAT('%', :palavra, '%')) " +
           "AND c.dataHora > :dataHora")
    List<Configuracao> buscarPorParametroEDataHora(@Param("palavra") String palavra,
                                                   @Param("dataHora") LocalDateTime dataHora);

}
