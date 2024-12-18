package com.example.ecomarket_servicio_eventos.entity;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "eventos")
@Builder
public class Evento {
    @Id
    private String eventoId;
    private String nombre;
    private String lugar;
    private String descripcion;
    private List<Integer> rangoPrecios;
    private Date fechaHora;
    private String sellerId;
    private List<String> userIds;
}
