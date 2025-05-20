package me.matheusmoraes.market_manager.repository;

import me.matheusmoraes.market_manager.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
