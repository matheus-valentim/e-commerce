package ecommerce.repository;

import ecommerce.Model.CategoriasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriasModel, UUID> {
}
