package ecommerce.repository;

import ecommerce.Model.CarrinhoComprasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarrinhoComprasRepository extends JpaRepository<CarrinhoComprasModel, UUID> {
}
