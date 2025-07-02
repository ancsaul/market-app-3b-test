package com.tecdesoftware.market.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "categorias")
public class Categoria {
    @Id//llave primaria
    //Hace el id autoincremental
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_categoria")
    private int idCategoria;

    private Boolean estado;


    @OneToMany (mappedBy = "categoria")
    private List<Producto> productos;

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
