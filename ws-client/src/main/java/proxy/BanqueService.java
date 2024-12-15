
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://service.saha.merlin.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversion", targetNamespace = "http://service.saha.merlin.com/", className = "proxy.Conversion")
    @ResponseWrapper(localName = "conversionResponse", targetNamespace = "http://service.saha.merlin.com/", className = "proxy.ConversionResponse")
    @Action(input = "http://service.saha.merlin.com/BanqueService/conversionRequest", output = "http://service.saha.merlin.com/BanqueService/conversionResponse")
    public double conversion(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://service.saha.merlin.com/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://service.saha.merlin.com/", className = "proxy.GetCompteResponse")
    @Action(input = "http://service.saha.merlin.com/BanqueService/getCompteRequest", output = "http://service.saha.merlin.com/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://service.saha.merlin.com/", className = "proxy.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://service.saha.merlin.com/", className = "proxy.ListComptesResponse")
    @Action(input = "http://service.saha.merlin.com/BanqueService/listComptesRequest", output = "http://service.saha.merlin.com/BanqueService/listComptesResponse")
    public List<Compte> listComptes();

}
