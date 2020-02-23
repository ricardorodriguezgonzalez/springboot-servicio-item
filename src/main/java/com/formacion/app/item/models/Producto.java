package com.formacion.app.item.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Producto {
    private Long id;
    private String nombre;
    private Double precio;
    private Date createAt;

}
