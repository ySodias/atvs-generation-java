package com.example.demo.controller;

import com.example.demo.model.UserLogin;
import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/logar")
    public ResponseEntity<UserLogin> Autentication(@RequestBody Optional<UserLogin> user){
        return usuarioService.Logar(user).map(resp ->  ResponseEntity.ok (resp))
                .orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Object> POST(@RequestBody Usuario usuario){
        Optional<Usuario> usuarioCadastrado = usuarioService.CadastrarUsuario(usuario);
        if (usuarioCadastrado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).body("Usuario Existente");
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCadastrado.get());
        }
    }
}
