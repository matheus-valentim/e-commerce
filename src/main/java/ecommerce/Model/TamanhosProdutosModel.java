package ecommerce.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tamanhos_produtos")
public class TamanhosProdutosModel implements Serializable {
    private static final long serialVersionUId = 1L;
@Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID tamanho_produto_id;
    private UUID produto_id;
    private String tamanho;
    private int estoque;

    public UUID getTamanho_produto_id() {
        return tamanho_produto_id;
    }

    public void setTamanho_produto_id(UUID tamanho_produto_id) {
        this.tamanho_produto_id = tamanho_produto_id;
    }

    public UUID getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(UUID produto_id) {
        this.produto_id = produto_id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
