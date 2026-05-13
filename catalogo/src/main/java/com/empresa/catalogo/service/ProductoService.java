package com.empresa.catalogo.service;

import com.empresa.catalogo.dto.ProductoRequestDTO;
import com.empresa.catalogo.dto.ProductoResponseDTO;

import java.util.List;

/**
 * Interfaz del servicio de productos.
 * Aplica DIP (Dependency Inversion Principle):
 * el controlador depende de esta abstracción, no de la implementación concreta.
 */
public interface ProductoService {

    /**
     * Crea y persiste un nuevo producto.
     * @param dto datos validados del producto a crear
     * @return DTO con los datos del producto creado (incluye id generado)
     */
    ProductoResponseDTO crear(ProductoRequestDTO dto);

    /**
     * Busca un producto por su id.
     * @param id identificador del producto
     * @return DTO con los datos del producto
     * @throws com.empresa.catalogo.exception.RecursoNoEncontradoException si no existe
     */
    ProductoResponseDTO buscarPorId(Long id);

    /**
     * Lista todos los productos activos.
     * @return lista de DTOs de productos con activo = true
     */
    List<ProductoResponseDTO> listarActivos();

    /**
     * Elimina un producto por su id.
     * @param id identificador del producto
     * @throws com.empresa.catalogo.exception.RecursoNoEncontradoException si no existe
     */
    void eliminar(Long id);
}
