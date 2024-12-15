package com.merlin.saha;

import com.merlin.saha.bean.Compte;
import com.merlin.saha.service.BanqueService;
import jakarta.xml.ws.Endpoint;

import java.math.BigDecimal;
import java.util.List;

public class ServerJWS {
    private static final String SERVER_URL = "http://0.0.0.0:4455/";

    public static void main(String[] args) {
        Endpoint.publish(SERVER_URL, new BanqueService());
        System.out.println("Web service deployé sur: "+SERVER_URL);

        Compte compte = new BanqueService().getCompte(1);
        System.out.println(compte);

        BigDecimal montantConverti = new BanqueService().conversion(BigDecimal.valueOf(10.00));
        System.out.println(montantConverti);

        List<Compte> comptes = new BanqueService().listComptes();
        System.out.println(comptes);
    }

}
