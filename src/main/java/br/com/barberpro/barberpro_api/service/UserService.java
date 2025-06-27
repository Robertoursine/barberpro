package br.com.barberpro.barberpro_api.service;

import br.com.barberpro.barberpro_api.dto.UserRequestDTO;
import br.com.barberpro.barberpro_api.dto.UserResponseDTO;
import br.com.barberpro.barberpro_api.entity.User;
import br.com.barberpro.barberpro_api.entity.User.Role;
import br.com.barberpro.barberpro_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserResponseDTO cadastrar(UserRequestDTO dto) {
        if (repository.existsByEmail(dto.getEmail())) {
            throw new IllegalArgumentException("Email já cadastrado.");
        }

        User user = new User();
        user.setNome(dto.getNome());
        user.setEmail(dto.getEmail());
        user.setSenha(passwordEncoder.encode(dto.getSenha()));
        user.setRole(dto.getRole() != null ? dto.getRole() : Role.CLIENTE);

        User salvo = repository.save(user);

        return new UserResponseDTO(
                salvo.getId(),
                salvo.getNome(),
                salvo.getEmail(),
                salvo.getRole()
        );
    }
}