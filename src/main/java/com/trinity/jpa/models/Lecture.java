package com.trinity.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true) 
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity

public class Lecture extends BaseEntity{

    private String name;
    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;
    // Aqui un ejemplo de relacion Unidireccional, solo haremos la relacion de
    // Lectura a recurso pero no la de recurso a lectura
    @OneToOne //Será relacion uno a uno
    @JoinColumn(name = "resource_id")
    private Resource resource;

}
