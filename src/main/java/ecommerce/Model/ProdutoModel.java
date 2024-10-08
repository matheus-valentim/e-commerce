package ecommerce.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "produtos")
public class ProdutoModel implements Serializable {
    private static final long serialVersionUId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID produto_id;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriasModel categoria_id;

    @OneToMany(mappedBy = "produto_id", cascade = CascadeType.ALL)
    private List<TamanhosProdutosModel> tamanhos_id;

    @OneToMany(mappedBy = "produto_id", cascade = CascadeType.ALL)
    private List<CoresProdutosModel> cores_id;

    @OneToMany(mappedBy = "produto_id", cascade = CascadeType.ALL)
    private List<ItensPedidoModel> itensPedidos_id;

    @OneToMany(mappedBy = "produto_id", cascade = CascadeType.ALL)
    private List<AvaliacoesModel> avaliacoes_id;

    @ManyToMany(mappedBy = "carrinho_id")
    private List<UsuarioModel> usuariosNoCarrinho_id;

    private String nome;
    private String descricao;
    private float preco;
    private int estoque;
    private String material;
    private String genero;
    //transformar genero em um enum
    private String criado_em;
    private String atualizado_em;

    public UUID getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(UUID produto_id) {
        this.produto_id = produto_id;
    }

    public CategoriasModel getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(CategoriasModel categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCriado_em() {
        return criado_em;
    }

    public void setCriado_em(String criado_em) {
        this.criado_em = criado_em;
    }

    public String getArualizado_em() {
        return atualizado_em;
    }

    public void setArualizado_em(String arualizado_em) {
        this.atualizado_em = arualizado_em;
    }

    public List<TamanhosProdutosModel> getTamanhos_id() {
        return tamanhos_id;
    }

    public void setTamanhos_id(List<TamanhosProdutosModel> tamanhos_id) {
        this.tamanhos_id = tamanhos_id;
    }

    public List<CoresProdutosModel> getCores_id() {
        return cores_id;
    }

    public void setCores_id(List<CoresProdutosModel> cores_id) {
        this.cores_id = cores_id;
    }

    public List<ItensPedidoModel> getItensPedidos_id() {
        return itensPedidos_id;
    }

    public void setItensPedidos_id(List<ItensPedidoModel> itensPedidos_id) {
        this.itensPedidos_id = itensPedidos_id;
    }

    public List<AvaliacoesModel> getAvaliacoes_id() {
        return avaliacoes_id;
    }

    public void setAvaliacoes_id(List<AvaliacoesModel> avaliacoes_id) {
        this.avaliacoes_id = avaliacoes_id;
    }

    public List<UsuarioModel> getUsuariosNoCarrinho_id() {
        return usuariosNoCarrinho_id;
    }

    public void setUsuariosNoCarrinho_id(List<UsuarioModel> usuariosNoCarrinho_id) {
        this.usuariosNoCarrinho_id = usuariosNoCarrinho_id;
    }
}
