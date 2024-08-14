package com.example.apiecommerce.produto;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="products")
@Data
public class Produto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;
    Double price;
    String image;
    String tag;



}
