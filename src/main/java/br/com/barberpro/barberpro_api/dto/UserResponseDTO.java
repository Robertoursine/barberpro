package br.com.barberpro.barberpro_api.dto;

import br.com.barberpro.barberpro_api.entity.User.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private Role role;
}