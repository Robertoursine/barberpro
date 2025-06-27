package br.com.barberpro.barberpro_api.controller;

import br.com.barberpro.barberpro_api.dto.UserRequestDTO;
import br.com.barberpro.barberpro_api.dto.UserResponseDTO;
import br.com.barberpro.barberpro_api.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> registrar(@Valid @RequestBody UserRequestDTO dto) {
        UserResponseDTO response = service.cadastrar(dto);
        return ResponseEntity.ok(response);
    }
}