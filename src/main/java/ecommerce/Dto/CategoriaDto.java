package ecommerce.Dto;

import jakarta.validation.constraints.NotBlank;

public record CategoriaDto(@NotBlank String nome) {

}
