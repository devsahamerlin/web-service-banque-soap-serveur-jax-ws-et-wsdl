package com.merlin.saha.service;

import com.merlin.saha.bean.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod
    public BigDecimal conversion(@WebParam(name = "montant") BigDecimal montant) {
        BigDecimal taux = new BigDecimal("11");
        return roundMontant(montant.multiply(taux));
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, roundMontant(BigDecimal.valueOf(Math.random() * 8000)), new Date());
    }

    @WebMethod
    public List<Compte> listComptes() {
        return List.of(
                new Compte(1, roundMontant(BigDecimal.valueOf(Math.random() * 8000)), new Date()),
                new Compte(2, roundMontant(BigDecimal.valueOf(Math.random() * 8000)), new Date()),
                new Compte(3, roundMontant(BigDecimal.valueOf(Math.random() * 8000)), new Date())
        );
    }

    private BigDecimal roundMontant(BigDecimal montant) {
        return montant.setScale(2, RoundingMode.HALF_UP);
    }
}
