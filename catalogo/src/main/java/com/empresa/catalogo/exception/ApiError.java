package com.empresa.catalogo.exception;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa la estructura estándar de error de la API.
 * Aplica SRP: solo define el formato de respuesta de error.
 */
public class ApiError {

    private int status;
    private String error;
    private String mensaje;
    private String timestamp;
    private String path;

    public ApiError(int status, String error, String mensaje, String path) {
        this.status = status;
        this.error = error;
        this.mensaje = mensaje;
        this.path = path;
        this.timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    // ---- Getters ----

    public int getStatus() { return status; }
    public String getError() { return error; }
    public String getMensaje() { return mensaje; }
    public String getTimestamp() { return timestamp; }
    public String getPath() { return path; }
}
