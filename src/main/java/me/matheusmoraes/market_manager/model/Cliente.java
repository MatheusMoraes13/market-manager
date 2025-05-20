package me.matheusmoraes.market_manager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tab_clientes")
@Getter
@Setter
public class Cliente {

    @Id
    @Column(length = 11, nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String usuario;

    @Column(nullable = false)
    private String senha;

    @ManyToOne
    @Column(nullable = false)
    private Endereco endereco;

}
