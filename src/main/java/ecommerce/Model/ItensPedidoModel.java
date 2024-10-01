package ecommerce.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "itens_pedido")
public class ItensPedidoModel implements Serializable {
    private static final long serialVersionUId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID item_pedido_id;
    private  UUID pedido_id;
    private  UUID produto_id;
    private int quantidade;
    private float preco;
    private String tamanho;
    private String cor;

    public UUID getItem_pedido_id() {
        return item_pedido_id;
    }

    public void setItem_pedido_id(UUID item_pedido_id) {
        this.item_pedido_id = item_pedido_id;
    }

    public UUID getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(UUID pedido_id) {
        this.pedido_id = pedido_id;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
