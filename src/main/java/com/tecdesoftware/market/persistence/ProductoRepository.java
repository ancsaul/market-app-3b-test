package com.tecdesoftware.market.persistence;
import java.util.List;
import com.tecdesoftware.market.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market.persistence.entity.Producto;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();

    }
}
