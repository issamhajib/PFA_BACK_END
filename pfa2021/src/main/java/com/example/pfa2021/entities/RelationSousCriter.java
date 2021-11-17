package com.example.pfa2021.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class RelationSousCriter implements Serializable {
    @EmbeddedId
    private SousCriterPk id ;
    private int facteur ;

    @ManyToOne
   @JoinColumn(name="sousCriter1", referencedColumnName = "id", insertable = false , updatable = false)
    private SousCriter sousCriter1 ;
    @ManyToOne
   @JoinColumn(name="sousCriter2", referencedColumnName = "id", insertable = false , updatable = false)
    private SousCriter sousCriter2 ;

    public RelationSousCriter() {
    }

    public SousCriterPk getId() {
        return id;
    }

    public void setId(SousCriterPk id) {
        this.id = id;
    }

    public int getFacteur() {
        return facteur;
    }

    public void setFacteur(int facteur) {
        this.facteur = facteur;
    }

    public SousCriter getSousCriter1() {
        return sousCriter1;
    }

    public void setSousCriter1(SousCriter sousCriter1) {
        this.sousCriter1 = sousCriter1;
    }

    public SousCriter getSousCriter2() {
        return sousCriter2;
    }

    public void setSousCriter2(SousCriter sousCriter2) {
        this.sousCriter2 = sousCriter2;
    }
}
