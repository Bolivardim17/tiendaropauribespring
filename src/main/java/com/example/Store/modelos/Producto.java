package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id_producto;
    @Column(name = "nombreProducto", nullable = false,length = 30)
    private String nombreProducto;// no vacio solo letras y espacios long 60
    @Column(name = "referencia", nullable = false,length = 30)
    private String referencia;// no vacio long 14
    @Column(name = "talla", nullable = false,length = 2)
    private String talla;//maximo 3 caracteres
    @Column(name = "cantidadBodega", nullable = false)
    private String cantidadBodega;// solo numeros positivos
    @Column(name = "precioUnitario", nullable = false)
    private String precioUnitario;//solo numeros positivos
    @Column(name = "descripcion", nullable = true,length = 255)
    private String descripcion;//long maximo 100 caracteres
    @Column(name = "fotografia", nullable = true,length = 255)
    private String fotografia;// no vacio maximo 255 caracteres

    @ManyToOne
    @JoinColumn(name="id_detalle", referencedColumnName ="id_detalle")
    Detalle detalle;

    @ManyToOne
            @JoinColumn(name="id_marca",referencedColumnName ="id_marca")
    Marca marca;

    @ManyToOne
            @JoinColumn(name ="id_tipoPrenda", referencedColumnName ="id_tipoPrenda")
    TipoPrenda tipoPrenda;

    public Producto() {
    }

    public Producto(Integer id, String nombreProducto, String referencia, String talla, String cantidadBodega, String precioUnitario, String descripcion, String fotografia) {
        this.id_producto = id;
        this.nombreProducto = nombreProducto;
        this.referencia = referencia;
        this.talla = talla;
        this.cantidadBodega = cantidadBodega;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }

    public Integer getId() {
        return id_producto;
    }

    public void setId(Integer id) {
        this.id_producto = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(String cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }
}
