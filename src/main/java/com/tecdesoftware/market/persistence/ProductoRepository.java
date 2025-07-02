package com.tecdesoftware.market.persistence;
import java.util.List;
import java.util.Optional;

import com.tecdesoftware.market.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

//le dice  a spring que esta repositorio se conecta con la DB(data base)
@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();

    }
    
    //obtiene los prodcutos de la categria
    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
    
    public Optional<List<Producto>> getEscasos(int Cantiddad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(Cantiddad, true);
    }
    
    public Optional<Producto> getProductoById(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }
    
    public Producto Save(Producto producto) {
        return productoCrudRepository.save(producto);
    }
    
    public void delete(Producto producto) {
        productoCrudRepository.delete(producto);
    }
    
    
}
