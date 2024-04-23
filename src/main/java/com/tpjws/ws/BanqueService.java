package com.tpjws.ws;


import com.tpjws.metier.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "conversion")
    public double conversion(@WebParam(name = "montant") double montant) {
        return montant * 11;
    }
    @WebMethod(operationName = "conversionInverse")
    public double conversionInverse(double montant) {
        return montant / 11;
    }
    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte( Math.random() * 97000, new Date(), code);
    }
    @WebMethod
    public List<Compte> listComptes(){
        return List.of (
            new Compte(1.0, new Date(), (int) (Math.random() * 97000)),
                new Compte(1.0, new Date(), (int) (Math.random() * 97000)),
                new Compte(1.0, new Date(), (int) (Math.random() * 97000))
        );
    }
}