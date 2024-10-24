package ecommerce.Controller;

import ecommerce.Dto.ProdutoDto;
import ecommerce.Dto.UsuarioDto;
import ecommerce.Dto.UsuarioResponse;
import ecommerce.Mapper.UsuarioMapper;
import ecommerce.Model.CategoriasModel;
import ecommerce.Model.ProdutoModel;
import ecommerce.Model.UsuarioModel;
import ecommerce.repository.ProdutoRepository;
import ecommerce.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;

import java.util.*;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/usuario")
    public ResponseEntity<List<UsuarioResponse>> getUsuarios(){
        List<UsuarioResponse> response = new ArrayList<>();
        List<UsuarioModel> userEntities = usuarioRepository.findAll();
        userEntities.forEach(userEntity -> response.add(modelMapper.map(userEntity, UsuarioResponse.class)));
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/usuario")
    public ResponseEntity<UsuarioModel> saveUsuario(@RequestBody @Valid UsuarioDto usuarioDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(UsuarioMapper.toModel(usuarioDto)));
    }

    @DeleteMapping("/usuario/{id}")
    public ResponseEntity<Object> deleteUsuarios(@PathVariable(value = "id") UUID id){
        usuarioRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Objeto deletado");
    }
}
