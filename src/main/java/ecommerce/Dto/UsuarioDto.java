package ecommerce.Dto;

import jakarta.validation.constraints.NotBlank;

public record UsuarioDto(@NotBlank String nome, @NotBlank String sobrenome, @NotBlank String email, @NotBlank String telefone, @NotBlank String senha, @NotBlank String role, @NotBlank String criado_em) {
}
