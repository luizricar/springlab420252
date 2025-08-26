package br.gov.sp.fatec.springlab420252.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springlab420252.entity.Usuario;
import br.gov.sp.fatec.springlab420252.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    
    private UsuarioRepository usuarioRepo;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepo){
        this.usuarioRepo = usuarioRepo;
    }

    @Override
    public Usuario novo(Usuario usuario) {
        if(usuario == null || 
            usuario.getNome() == null ||
            usuario.getNome().isBlank() ||
            usuario.getSenha() == null ||
            usuario.getSenha().isBlank()){
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Dados de usuário invallidos!")
            }
        usuaio.setId(id:null);
        Set<Autorizacao> autorizacoes = new HashSet<autorizacao>();
        for(Autorizacao aut: usuario.getAutorizacoes()){

        }
        return autRepo.save(usuario);
        
    }

    @Override
    public List<Usuario> buscarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

    @Override
    public Usuario buscarPorId(Long id) {
        Optional<Usuario> usuarioRepo = usuarioRepo.findById(id);
        if(usuarioOp.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado!")
        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }
    
}
