package ecommerce.repository;

import ecommerce.Model.TamanhosProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TamanhoProdutosRepository extends JpaRepository<TamanhosProdutosModel, UUID> {
}
