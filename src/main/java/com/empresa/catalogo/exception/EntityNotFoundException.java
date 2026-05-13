package com.empresa.catalogo.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String recurso, Long id) {
        super(recurso + " con id " + id + " no encontrado.");
    }
}
