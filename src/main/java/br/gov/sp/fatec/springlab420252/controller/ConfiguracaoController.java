package br.gov.sp.fatec.springlab420252.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springlab420252.entity.Usuario;
import br.gov.sp.fatec.springlab420252.service.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping(value = "/configuracao")
public class ConfiguracaoController {
    
    @Autowired
    private ConfiguracaoService service;

    @GetMapping
    public ResponseEntity<List<Configuracao>> buscarTodos() {
        return new ResponseEntity<List<Configuracao>>(service.buscarTodos(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Configuracao> novoConfiguracao(@RequestBody Configuracao configuracao) {
        Configuracao novo = service.novo(configuracao);
        return ResponseEntity.created(URI.create("/configuracao/" + novo.getId())).body(novo);
    }

    @GetMapping(value = "/parametroEDataHora")
    public ResponseEntity<Configuracao> buscarPorParametroEDataHora(@PathVariable("Parametro") Long id) {
        return ResponseEntity.ok().body(service.buscarPorParametroEDataHora(Parametro, DataHora));
    }

}