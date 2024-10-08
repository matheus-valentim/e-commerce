package ecommerce.Controller;

import ecommerce.Dto.CategoriaDto;
import ecommerce.Dto.ProdutoDto;
import ecommerce.Model.CategoriasModel;
import ecommerce.Model.ProdutoModel;
import ecommerce.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping("/produto")
    public ResponseEntity<ProdutoModel> saveproduto(@RequestBody @Valid ProdutoDto produtoDto){
        var produtoModel = new ProdutoModel();
        BeanUtils.copyProperties(produtoDto,produtoModel );
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produtoModel));
    }
}
