package ecommerce.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PedidosDto(@NotBlank String data_pedido, @NotNull float valor_total, @NotBlank String status) {
}
