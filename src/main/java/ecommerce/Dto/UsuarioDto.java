package ecommerce.Dto;

import ecommerce.Model.EnderecosModel;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record UsuarioDto(@NotBlank String nome, @NotBlank String sobrenome, @NotBlank String email, @NotBlank String telefone, @NotBlank String senha, @NotBlank String role, @NotBlank String criado_em, List<EnderecosModel> enderecos) {
}
