package ecommerce.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CoresProdutoDto(@NotBlank String cor, @NotNull int estoque) {
}
