package ecommerce.repository;

 import ecommerce.Model.ItensPedidoModel;
 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItensPedidoRepository extends JpaRepository<ItensPedidoModel, UUID> {
}
