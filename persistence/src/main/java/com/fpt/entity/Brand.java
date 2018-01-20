package com.fpt.entity;/*
  By Chi Can Em  19-01-2018
 */

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "brand")
public class Brand {
    private Integer id;
    private String name;
    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "_description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Set<Product> product;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }
}
