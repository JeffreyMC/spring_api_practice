package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.usuario.DatosAutenticacionUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class AutenticacionController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario) {
        Authentication token = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.username(),
                datosAutenticacionUsuario.password());
        authenticationManager.authenticate(token);
        return ResponseEntity.ok().build();
    }
}
