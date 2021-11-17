package com.example.pfa2021.entities;

import javax.persistence.*;

@Entity
public class SousCriter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String name ;
    private double poids ;

    @ManyToOne
    private Criter criter ;

    public SousCriter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public Criter getCriter() {
        return criter;
    }

    public void setCriter(Criter criter) {
        this.criter = criter;
    }
}
