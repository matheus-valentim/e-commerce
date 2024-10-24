package ecommerce.Dto;

import jakarta.validation.constraints.NotBlank;

public class EnderecoResponse {

    @NotBlank
    private String endereco_id;

    public EnderecoResponse() {
    }

    public EnderecoResponse(String endereco_id) {
        this.endereco_id = endereco_id;
    }

    public String getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(String endereco_id) {
        this.endereco_id = endereco_id;
    }
}