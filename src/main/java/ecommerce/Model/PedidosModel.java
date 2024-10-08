package ecommerce.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="pedidos")
public class PedidosModel implements Serializable {
    private static final long serialVersionUId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID pedido_id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioModel usuario_id;

    @OneToMany(mappedBy = "pedido_id", cascade = CascadeType.ALL)
    private List<ItensPedidoModel> itensPedidos;

    @OneToMany(mappedBy = "pedido_id", cascade = CascadeType.ALL)
    private List<PagamentosModel> pagamentos;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private EnderecosModel endereco_id;

    private String data_pedido;
    private float valor_total;
    private String status;

    public UUID getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(UUID pedido_id) {
        this.pedido_id = pedido_id;
    }

    public UsuarioModel getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(UsuarioModel usuario_id) {
        this.usuario_id = usuario_id;
    }

    public EnderecosModel getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(EnderecosModel endereco_id) {
        this.endereco_id = endereco_id;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
