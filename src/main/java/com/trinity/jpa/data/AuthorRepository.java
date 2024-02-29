package com.trinity.jpa.data;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trinity.jpa.models.Author;
// JPARepository tiene 2 parametros, el objeto y el ID de la tabla, en ambos casos se pasa el tipo de dato
public interface AuthorRepository extends JpaRepository <Author,Integer>{
    
}
