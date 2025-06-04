package com.tecdesoftware.market.persistence.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    @EmbeddedId
    private ComprasProdcutoPK id;

    private Double cantidad;
    private Double total;
    private Boolean estado;


    @ManyToOne
    @JoinColumn (name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn (name = "id_producto",  insertable = false, updatable = false)
    private Producto producto;

    public ComprasProdcutoPK getId() {
        return id;
    }

    public void setId(ComprasProdcutoPK id) {
        this.id = id;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
