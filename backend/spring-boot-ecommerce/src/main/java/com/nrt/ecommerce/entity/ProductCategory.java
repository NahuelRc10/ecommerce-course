package com.nrt.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/* Cuando se agregan relaciones manyToOne oneToMany hay un bug en el @Data de lombok por lo tanto
se usa @Getter @Setter
 */
@Entity
@Table(name = "product_category")
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "category_name")
    private String categoryName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;
}
