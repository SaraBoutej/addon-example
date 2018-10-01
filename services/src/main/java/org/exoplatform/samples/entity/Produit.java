package org.exoplatform.samples.entity;

import org.exoplatform.commons.api.persistence.ExoEntity;

import javax.persistence.*;

@Entity
@ExoEntity
@Table(name="PROD_TABLE")

public class Produit {

    @Id
    @Column(name="ID_PROD")
    @GeneratedValue
    private Long idProd;

    @Column(name="NAME_PROD")
    private String name;

    public Produit() {
    }

    public Produit(String name) {
        this.name = name;
    }

    public Long getIdProd() {
        return idProd;
    }

    public String getName() {
        return name;
    }

    public void setIdProd(Long idProd) {
        this.idProd = idProd;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "idProd=" + idProd +
                ", name='" + name + '\'' +
                '}';
    }
}
