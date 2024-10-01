package ecommerce.Dto;

import jakarta.validation.constraints.NotBlank;

public record EnderecosDto(@NotBlank String logradouro, @NotBlank String numero, @NotBlank String complemento, @NotBlank String bairro, @NotBlank String cidade, @NotBlank String estado, @NotBlank String pais, @NotBlank String codigo_postal, @NotBlank String criado_em) {
}
