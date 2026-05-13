package com.empresa.catalogo.factory;

import com.empresa.catalogo.dto.ProductoRequestDTO;
import com.empresa.catalogo.dto.ProductoResponseDTO;
import com.empresa.catalogo.entity.Producto;
import org.springframework.stereotype.Component;

/**
 * Factory que centraliza la conversión entre la entidad Producto y sus DTOs.
 * Aplica SRP: única responsabilidad es construir/convertir objetos Producto.
 * Al estar como @Component, Spring lo inyecta donde se necesite (DIP).
 */
@Component
public class ProductoFactory {

    /**
     * Convierte un ProductoRequestDTO (datos de entrada) en una entidad Producto.
     */
    public Producto toEntity(ProductoRequestDTO dto) {
        Producto p = new Producto();
        p.setNombre(dto.getNombre());
        p.setPrecio(dto.getPrecio());
        p.setCategoria(dto.getCategoria());
        return p;
    }

    /**
     * Convierte una entidad Producto en un ProductoResponseDTO (datos de salida).
     */
    public ProductoResponseDTO toResponseDTO(Producto p) {
        ProductoResponseDTO dto = new ProductoResponseDTO();
        dto.setId(p.getId());
        dto.setNombre(p.getNombre());
        dto.setPrecio(p.getPrecio());
        dto.setCategoria(p.getCategoria());
        return dto;
    }
}
