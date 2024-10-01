package ecommerce.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TamanhoProdutosDto(@NotBlank String tamanho, @NotNull int estoque) {
}
