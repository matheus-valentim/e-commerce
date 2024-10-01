package ecommerce.repository;

import ecommerce.Model.CoresProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CoresProdutoRepository extends JpaRepository<CoresProdutosModel, UUID> {
}
