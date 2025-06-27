package br.com.barberpro.barberpro_api.dto;

import br.com.barberpro.barberpro_api.entity.User.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRequestDTO {

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @Email(message = "Email inválido")
    @NotBlank(message = "O email é obrigatório")
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    private String senha;

    private Role role;
}