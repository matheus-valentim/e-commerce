package ecommerce.Controller;

import ecommerce.Dto.PedidosDto;
import ecommerce.Dto.UsuarioDto;
import ecommerce.Mapper.PedidosMapper;
import ecommerce.Mapper.UsuarioMapper;
import ecommerce.Model.PedidosModel;
import ecommerce.Model.UsuarioModel;
import ecommerce.repository.PedidosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidosController {
    @Autowired
    PedidosRepository pedidosRepository;

    @PostMapping("/pedidos")
    public ResponseEntity<PedidosModel> savePedido(@RequestBody @Valid PedidosDto pedidosDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidosRepository.save(PedidosMapper.toModelPedidos(pedidosDto)));
    }
}
