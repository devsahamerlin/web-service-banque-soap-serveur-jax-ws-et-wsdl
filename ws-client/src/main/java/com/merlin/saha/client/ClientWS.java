package com.merlin.saha.client;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {

        BanqueService stub = new BanqueWS().getBanqueServicePort();

        System.out.println("############ Convertir un montant de l’auro en DH #######");
        System.out.println(stub.conversion(100));
        System.out.println();

        System.out.println("############ Consulter un Compte #######");
        Compte compte = stub.getCompte(1);
        System.out.print("code: "+compte.getCode()+ ", Montant: "+compte.getMontant()+"\n");
        System.out.println();

        System.out.println("############ Consulter une Liste de comptes #######");
        List<Compte> comptes = stub.listComptes();

        for (Compte cp : comptes) {
            System.out.print("code: "+cp.getCode()+ ", Montant: "+cp.getMontant()+"\n");
        }
    }
}
