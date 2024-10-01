package ecommerce.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AvaliacoesDto(@NotNull int nota, @NotBlank String comentario, @NotBlank String criado_em) {
}
