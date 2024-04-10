package com.example.Store.modelos;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id_pedido;
    @Column(name = "FechaYHora", nullable = false)
    private String FechaYHora;// no vacio y formato internacional

    @ManyToOne
    @JoinColumn(name="id_usuario" , referencedColumnName = "id_usuario")

    Usuario usuario;

    public Pedido() {
    }

    public Pedido(Integer id, String fechaYHora) {
        this.id_pedido = id;
        FechaYHora = fechaYHora;
    }

    public Integer getId() {
        return id_pedido;
    }

    public void setId(Integer id) {
        this.id_pedido = id;
    }

    public String getFechaYHora() {
        return FechaYHora;
    }

    public void setFechaYHora(String fechaYHora) {
        FechaYHora = fechaYHora;
    }
}
