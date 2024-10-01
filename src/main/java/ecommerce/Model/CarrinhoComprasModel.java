package ecommerce.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "carrinho_compras")
public class CarrinhoComprasModel implements Serializable {
    private static final long serialVersionUId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID carrinho_id;
    private UUID usuario_id;
    private UUID produto_id;
    private int quantidade;
    private String cor;
    private String adicionado_em;

    public UUID getCarrinho_id() {
        return carrinho_id;
    }

    public void setCarrinho_id(UUID carrinho_id) {
        this.carrinho_id = carrinho_id;
    }

    public UUID getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(UUID usuario_id) {
        this.usuario_id = usuario_id;
    }

    public UUID getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(UUID produto_id) {
        this.produto_id = produto_id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAdicionado_em() {
        return adicionado_em;
    }

    public void setAdicionado_em(String adicionado_em) {
        this.adicionado_em = adicionado_em;
    }
}
