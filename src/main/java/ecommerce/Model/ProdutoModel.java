package ecommerce.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
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
    @JoinColumn(name = "categoria")
    private CategoriasModel categoria;

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private List<TamanhosProdutosModel> tamanhos;

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private List<CoresProdutosModel> cores;

    @OneToMany(mappedBy = "produto",orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<ItensPedidoModel> itensPedidos = new ArrayList<>();

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private List<AvaliacoesModel> avaliacoes;

    @ManyToMany(mappedBy = "carrinho", cascade = CascadeType.ALL)
    private List<UsuarioModel> usuariosNoCarrinho;

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

    public List<ItensPedidoModel> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(List<ItensPedidoModel> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }

    public List<UsuarioModel> getUsuariosNoCarrinho() {
        return usuariosNoCarrinho;
    }

    public void setUsuariosNoCarrinho(List<UsuarioModel> usuariosNoCarrinho) {
        this.usuariosNoCarrinho = usuariosNoCarrinho;
    }

    public List<AvaliacoesModel> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<AvaliacoesModel> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public List<CoresProdutosModel> getCores() {
        return cores;
    }

    public void setCores(List<CoresProdutosModel> cores) {
        this.cores = cores;
    }

    public List<TamanhosProdutosModel> getTamanhos() {
        return tamanhos;
    }

    public void setTamanhos(List<TamanhosProdutosModel> tamanhos) {
        this.tamanhos = tamanhos;
    }

    public CategoriasModel getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriasModel categoria) {
        this.categoria = categoria;
    }
}
