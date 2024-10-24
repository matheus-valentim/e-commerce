package ecommerce.Dto;

import java.util.List;

public class UsuarioResponse {
    private static String nome;
    private static String sobrenome;
    private static List<EnderecoResponse> enderecos;


    public UsuarioResponse(String nome, String sobrenome, List<EnderecoResponse> enderecos) {

    }

    public UsuarioResponse() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public List<EnderecoResponse> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoResponse> enderecos) {
        this.enderecos = enderecos;
    }}
