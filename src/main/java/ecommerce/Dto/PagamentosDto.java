package ecommerce.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PagamentosDto(@NotBlank String data_pagamento, @NotNull float valor, @NotBlank String metodo_pagamento, @NotBlank String status) {
}
