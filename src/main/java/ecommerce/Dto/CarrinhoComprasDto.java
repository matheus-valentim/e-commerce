package ecommerce.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CarrinhoComprasDto(@NotNull int quantidade, @NotBlank String tamanho, @NotBlank String cor, @NotBlank String adicionado_em) {
}
