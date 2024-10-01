package ecommerce.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "cores_produtos")
public class CoresProdutosModel implements Serializable {
    private static final long serialVersionUId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID cor_produto_id;
    private UUID produto_id;
    private String cor;
    private int estoque;

    public UUID getCor_produto_id() {
        return cor_produto_id;
    }

    public void setCor_produto_id(UUID cor_produto_id) {
        this.cor_produto_id = cor_produto_id;
    }

    public UUID getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(UUID produto_id) {
        this.produto_id = produto_id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
