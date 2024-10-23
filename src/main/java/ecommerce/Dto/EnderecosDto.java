package ecommerce.Dto;

import ecommerce.Model.UsuarioModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record EnderecosDto(@NotBlank String logradouro,
                           @NotBlank String numero,
                           @NotBlank String complemento,
                           @NotBlank String bairro,
                           @NotBlank String cidade,
                           @NotBlank String estado,
                           @NotBlank String pais,
                           @NotBlank String codigo_postal,
                           @NotBlank String criado_em,
                           @NotNull UUID usuario_id)
{
}
