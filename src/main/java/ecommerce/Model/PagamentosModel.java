package ecommerce.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "pagamentos")
public class PagamentosModel implements Serializable {
    private static final long serialVersionUId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID pagamento_id;
    private UUID pedido_id;
    private String data_pagamento;
    private float valor;
    private String metodo_pagamento;
    private String status;

    public UUID getPagamento_id() {
        return pagamento_id;
    }

    public void setPagamento_id(UUID pagamento_id) {
        this.pagamento_id = pagamento_id;
    }

    public UUID getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(UUID pedido_id) {
        this.pedido_id = pedido_id;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
