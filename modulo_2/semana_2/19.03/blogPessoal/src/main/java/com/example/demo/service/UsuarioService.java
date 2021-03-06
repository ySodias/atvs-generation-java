package com.example.demo.service;

import com.example.demo.model.UserLogin;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public  Optional<Usuario>  CadastrarUsuario(Usuario usuario){

        Optional<Usuario> usuarioExistente = usuarioRepository.findByUsuario(usuario.getUsuario());
        if(usuarioExistente.isPresent()){
            return Optional.empty();
        }

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String senhaEncoder = encoder.encode(usuario.getSenha());
        usuario.setSenha(senhaEncoder);

        return Optional.ofNullable(usuarioRepository.save(usuario));
    }

    public Optional<UserLogin> Logar (Optional<UserLogin> user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        Optional<Usuario> usuario = usuarioRepository.findByUsuario(user.get().getUsuario());

        if(usuario.isPresent()){
            if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())){

                String auth = user.get().getSenha() + ":" + user.get().getSenha();
                byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
                String authHeader = "Basic "+ new String(encodedAuth);

                user.get().setToken(authHeader);
                user.get().setNome(usuario.get().getNome());

                return user;
            }
        }
        return null;
    }
}
