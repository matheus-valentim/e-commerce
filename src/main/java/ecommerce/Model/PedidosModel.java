package ecommerce.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="pedidos")
public class PedidosModel implements Serializable {
    private static final long serialVersionUId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID pedido_id;
    private UUID usuario_id;
    private UUID endereco_id;
    private String data_pedido;
    private float valor_total;
    private String status;

    public UUID getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(UUID pedido_id) {
        this.pedido_id = pedido_id;
    }

    public UUID getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(UUID usuario_id) {
        this.usuario_id = usuario_id;
    }

    public UUID getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(UUID endereco_id) {
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
