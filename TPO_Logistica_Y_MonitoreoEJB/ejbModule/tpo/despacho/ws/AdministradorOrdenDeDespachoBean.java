package tpo.despacho.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.7.redhat-1
 * 2014-11-09T19:05:04.460-03:00
 * Generated source version: 2.7.7.redhat-1
 * 
 */
@WebService(targetNamespace = "http://ws.despacho.tpo/", name = "AdministradorOrdenDeDespachoBean")
@XmlSeeAlso({ObjectFactory.class})
public interface AdministradorOrdenDeDespachoBean {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "recepcionOrdenDeDespacho", targetNamespace = "http://ws.despacho.tpo/", className = "tpo.despacho.ws.RecepcionOrdenDeDespacho")
    @WebMethod
    @ResponseWrapper(localName = "recepcionOrdenDeDespachoResponse", targetNamespace = "http://ws.despacho.tpo/", className = "tpo.despacho.ws.RecepcionOrdenDeDespachoResponse")
    public boolean recepcionOrdenDeDespacho(
        @WebParam(name = "arg0", targetNamespace = "")
        tpo.despacho.ws.VoOrdenDeDespacho arg0
    );
}
