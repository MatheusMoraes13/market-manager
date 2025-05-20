package me.matheusmoraes.market_manager.repository;

import me.matheusmoraes.market_manager.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {
}
