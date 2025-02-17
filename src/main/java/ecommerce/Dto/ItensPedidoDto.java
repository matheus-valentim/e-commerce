package ecommerce.Dto;

import ecommerce.Model.PedidosModel;
import ecommerce.Model.ProdutoModel;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ItensPedidoDto(@NotNull int quantidade,
                             @NotNull float preco,
                             @NotBlank String tamanho,
                             @NotBlank String cor,
                             @NotNull PedidosModel pedido,
                             @NotNull ProdutoModel produto
                             ) {
}