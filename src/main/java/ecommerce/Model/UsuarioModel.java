package ecommerce.Model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
public class UsuarioModel implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID user_id;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<EnderecosModel> enderecos;

    @OneToMany(mappedBy = "usuario_id", cascade = CascadeType.ALL)
    private List<PedidosModel> pedidos;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "carrinho_id",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<ProdutoModel> carrinho;

    private String nome;
    private String sobrenome;
    private String email;
    private String senha;

    @Column(name = "criado_em")
    private String criadoEm;

    private String telefone;
    private String role;

    // Getters e Setters
    public UUID getUserId() {

         return user_id;
    }

    public void setUser_Id(UUID user_id) {
        this.user_id = user_id;
    }

    public List<EnderecosModel> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecosModel> enderecos) {
        this.enderecos = enderecos;
    }

    public List<PedidosModel> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidosModel> pedidos) {
        this.pedidos = pedidos;
    }

    public List<ProdutoModel> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<ProdutoModel> carrinho) {
        this.carrinho = carrinho;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(String criadoEm) {
        this.criadoEm = criadoEm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
