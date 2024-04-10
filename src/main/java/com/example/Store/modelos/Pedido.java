package com.example.Store.modelos;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "FechaYHora", nullable = false)
    private String FechaYHora;// no vacio y formato internacional

    public Pedido() {
    }

    public Pedido(Integer id, String fechaYHora) {
        this.id = id;
        FechaYHora = fechaYHora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaYHora() {
        return FechaYHora;
    }

    public void setFechaYHora(String fechaYHora) {
        FechaYHora = fechaYHora;
    }
}
