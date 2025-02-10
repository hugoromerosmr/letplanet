package org.example.letmalagaapp.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "alojamientos")
public class Alojamiento {

    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private double precio_minimo;
    private String moneda;
    private List<String> imagenes;
    private String tipo;
    private Direccion direccion;
    private int capacidadMaxima;
    private int habitaciones;
    private int banos;
    private double precioMinimo;
    private double precioMaximo;
    private double rating;
    private List<String> equipamiento;
    private List<String> servicios;
    private List<String> restricciones;
    private String latitud;
    private String longitud;

    // Clase interna para la dirección
    @Getter
    @Setter
    public static class Direccion {
        private String telefono;
        private String email;
    }

    // Clase interna para la ubicación geográfica
    @Getter
    @Setter
    public static class UbicacionGeografica {
        private double latitud;
        private double longitud;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
