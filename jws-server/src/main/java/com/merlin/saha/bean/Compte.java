package com.merlin.saha.bean;

import jakarta.xml.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;

@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private BigDecimal montant;
    @XmlTransient
    private Date dateCreation;

    public Compte() {
    }

    public Compte(int code, BigDecimal montant, Date dateCreation) {
        this.code = code;
        this.montant = montant;
        this.dateCreation = dateCreation;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "code: " + code +", montant: " + montant+"\n";
    }
}
