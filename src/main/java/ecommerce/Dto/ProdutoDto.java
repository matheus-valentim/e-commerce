package ecommerce.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoDto(@NotBlank String nome, @NotBlank String descricao, @NotNull float preco, @NotNull int estoque, @NotBlank String material, @NotBlank String genero, @NotBlank String criado_em, @NotBlank String atualizado_em) {
}
