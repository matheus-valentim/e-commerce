package ecommerce.repository;

import ecommerce.Model.EnderecosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EnderecosRepository extends JpaRepository<EnderecosModel, UUID> {
}
