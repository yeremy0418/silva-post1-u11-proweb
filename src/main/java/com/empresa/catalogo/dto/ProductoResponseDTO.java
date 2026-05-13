package com.empresa.catalogo.dto;

/**
 * DTO de salida — datos de la API hacia el cliente.
 * Aplica SRP: solo expone los campos que el cliente necesita ver.
 * No expone campos sensibles ni internos (ej: activo).
 */
public class ProductoResponseDTO {

    private Long id;
    private String nombre;
    private Double precio;
    private String categoria;

    // ---- Constructores ----

    public ProductoResponseDTO() {}

    public ProductoResponseDTO(Long id, String nombre, Double precio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    // ---- Getters y Setters ----

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
}
