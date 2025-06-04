package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table (name = "compras")
public class Compra {
    @Id
    @Column(name = "id_compra")
    private int idCompra;

    private String nombre;
    @Column(name = "id_cliente")
    private Integer idCliente;


    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;


    private String comentario;

    private boolean estado;

    //relacion con la entidad cliente: muchas compras
    @ManyToOne
    //no quiero que se modifique la entidad cliente, solo relacionarla
    @JoinColumn (name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;


    //relacion con la entidad compraproducto
    @OneToMany(mappedBy = "producto")
    private List<Compra> compras;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
