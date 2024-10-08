package ecommerce.Controller;

import ecommerce.Dto.ProdutoDto;
import ecommerce.Dto.UsuarioDto;
import ecommerce.Model.CategoriasModel;
import ecommerce.Model.ProdutoModel;
import ecommerce.Model.UsuarioModel;
import ecommerce.repository.ProdutoRepository;
import ecommerce.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/usuario")
    public ResponseEntity<Object> getUsuarios(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.findAll());
    }

    @PostMapping("/usuario")
    public ResponseEntity<UsuarioModel> saveproduto(@RequestBody @Valid UsuarioDto usuarioDto){
        var usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioDto,usuarioModel );
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuarioModel));
    }
}
