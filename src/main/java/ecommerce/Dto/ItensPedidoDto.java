package ecommerce.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ItensPedidoDto(@NotNull int quantidade,@NotNull float preco, @NotBlank String tamanho, @NotBlank String cor) {
}
