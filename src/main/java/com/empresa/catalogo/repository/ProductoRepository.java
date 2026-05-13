package com.empresa.catalogo.repository;

import com.empresa.catalogo.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio (DAO) para la entidad Producto.
 * Extiende JpaRepository para obtener operaciones CRUD automáticamente.
 * Aplica DIP: las capas superiores dependen de esta interfaz, no de una implementación concreta.
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    /**
     * Retorna solo los productos con activo = true.
     * Spring Data JPA genera la consulta automáticamente a partir del nombre del método.
     */
    List<Producto> findByActivoTrue();
}
