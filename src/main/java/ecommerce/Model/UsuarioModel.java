package ecommerce.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
public class UsuarioModel implements Serializable {
    private static final long serialVersionUId = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID usuario_id;

    @OneToMany(mappedBy = "usuario_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
     private List<EnderecosModel> enderecos;

    @OneToMany(mappedBy = "usuario_id", cascade = CascadeType.ALL)
    private List<PedidosModel> pedidos_id;

    @ManyToMany
    @JoinTable(
            name = "carrinho_compras",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<ProdutoModel> carrinho_id;

    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private String criado_em;
    private String telefone;
    private String role;

    public UUID getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(UUID usuario_id) {
        this.usuario_id = usuario_id;
    }

    public List<EnderecosModel> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecosModel> enderecos) {
        this.enderecos = enderecos;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCriado_em() {
        return criado_em;
    }

    public void setCriado_em(String criado_em) {
        this.criado_em = criado_em;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<ProdutoModel> getCarrinho_id() {
        return carrinho_id;
    }

    public void setCarrinho_id(List<ProdutoModel> carrinho_id) {
        this.carrinho_id = carrinho_id;
    }

    public List<PedidosModel> getPedidos_id() {
        return pedidos_id;
    }

    public void setPedidos_id(List<PedidosModel> pedidos_id) {
        this.pedidos_id = pedidos_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
