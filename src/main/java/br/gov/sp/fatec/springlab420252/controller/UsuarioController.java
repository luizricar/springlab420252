package br.gov.sp.fatec.springlab420252.controller;

import br.gov.sp.fatec.springlab420252.service.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuario")
public class UsuarioController {
    
    @Autowired  //notação para construtor
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<Usuario>> buscarTodos(){
        return new ResponseEntiry<List<Usuario>>(service.buscarTodos(), HttpStatus.OK);
    } 

    @PostMapping
    public ResponseEntity<Usuario> novoUsuario(@RequestBody Usuario usuario){
        Usuario novo = service.novo(usuario);
        return ResponseEntity.created(URI.create("/usuario/" + novo.getId())).body(novo);
    }

    @GetMapping(value = "/{idUsuario}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable("idUsuario") Long id){
        return ResponseEntity.ok().body(service.buscarPorId(id));
    }

}
