package ecommerce.Dto;

import ecommerce.Model.EnderecosModel;
import ecommerce.Model.ItensPedidoModel;
import ecommerce.Model.PagamentosModel;
import ecommerce.Model.UsuarioModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.aspectj.weaver.ast.Not;

import java.util.List;

public record PedidosDto(@NotBlank String data_pedido,
                         @NotNull float valor_total,
                         @NotBlank String status,
                          UsuarioDto usuario,
                          List<ItensPedidoDto> itensPedidos,
                          List<PagamentosDto> pagamentos,
                          EnderecosDto endereco_id
 ) {
}
