package ecommerce.Model;

import ecommerce.Dto.ProdutoDto;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "avaliacoes")
public class AvaliacoesModel implements Serializable {
    private static final long serialVersionUId = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID avaliacao_id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioModel usuario_id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private ProdutoModel produto_id;

    private int nota;
    private String comentario;
    private String criado_em;

    public UUID getAvaliacao_id() {
        return avaliacao_id;
    }

    public void setAvaliacao_id(UUID avaliacao_id) {
        this.avaliacao_id = avaliacao_id;
    }

    public ProdutoModel getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(ProdutoModel produto_id) {
        this.produto_id = produto_id;
    }

    public UsuarioModel getCliente_id() {
        return usuario_id;
    }

    public void setCliente_id(UsuarioModel usuario_id ) {
        this.usuario_id = usuario_id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCriado_em() {
        return criado_em;
    }

    public void setCriado_em(String criado_em) {
        this.criado_em = criado_em;
    }
}
