package com.eugened.aim.ws.soap.service;

import com.eugened.aim.ws.core.bean.Artifact;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService(serviceName = "Artifact",
        portName="ArtifactPort",
        targetNamespace = "http://eugened.aim/jaxws/artifact")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,
        use= SOAPBinding.Use.LITERAL,
        parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public interface ArtifactWebService {

    @WebMethod
    Artifact getArtifact(long id);

    @WebMethod
    void deleteArtifact(long id);

    @WebMethod
    void saveArtifact(Artifact Artifact);

    @WebMethod
    List<Artifact> getArtifacts();
}
