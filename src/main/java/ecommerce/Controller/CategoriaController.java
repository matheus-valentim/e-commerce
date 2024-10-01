package ecommerce.Controller;


import ecommerce.Dto.CategoriaDto;
import ecommerce.Model.CategoriasModel;
import ecommerce.repository.CategoriaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class CategoriaController {

    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping("/categoria")
    public ResponseEntity<Object> getcategorias(){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.findAll());
    }
    @GetMapping("/categoria/{id}")
    public  ResponseEntity<Object> getUmaCategoria(@PathVariable(value = "id") UUID id){
        Optional<CategoriasModel> categoria = categoriaRepository.findById(id);
        if (categoria.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Essa categoria não existe.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.findById(id));
    }
    @PostMapping("/categoria")
    public ResponseEntity<CategoriasModel> saveCategoria(@RequestBody @Valid CategoriaDto categoriaDto){
        var categoriasModel = new CategoriasModel();
        BeanUtils.copyProperties(categoriaDto,categoriasModel );
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoriasModel));
    }
    @PutMapping("categoria/{id}")
    public ResponseEntity<Object> PutCategoria(@PathVariable(value = "id")UUID id,@RequestBody @Valid CategoriaDto categoriaDto){
        Optional<CategoriasModel> categoria = categoriaRepository.findById(id);
        if (categoria.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não existe.");
        }
        BeanUtils.copyProperties(categoriaDto, categoria.get());
        return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.save(categoria.get()));
    }
    @DeleteMapping("/categoria/{id}")
    public ResponseEntity<Object> deleteCategoria(@PathVariable( value = "id") UUID id){
        categoriaRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Objeto deletado");
    }
}
