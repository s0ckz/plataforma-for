
package br.gov.planejamento.sof.siop.servicoweb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSExecucaoEstatais", targetNamespace = "http://servicoweb.siop.sof.planejamento.gov.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSExecucaoEstatais {


    /**
     * 
     * @param codigoOrgao
     * @param ano
     * @param credencial
     * @param codigoUnidadeOrcamentaria
     * @param mes
     * @return
     *     returns br.gov.planejamento.sof.siop.servicoweb.RetornoExecucaoEstataisDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarExecucao", targetNamespace = "http://servicoweb.siop.sof.planejamento.gov.br/", className = "br.gov.planejamento.sof.siop.servicoweb.ConsultarExecucao")
    @ResponseWrapper(localName = "consultarExecucaoResponse", targetNamespace = "http://servicoweb.siop.sof.planejamento.gov.br/", className = "br.gov.planejamento.sof.siop.servicoweb.ConsultarExecucaoResponse")
    public RetornoExecucaoEstataisDTO consultarExecucao(
        @WebParam(name = "credencial", targetNamespace = "")
        CredencialDTO credencial,
        @WebParam(name = "codigoOrgao", targetNamespace = "")
        String codigoOrgao,
        @WebParam(name = "codigoUnidadeOrcamentaria", targetNamespace = "")
        String codigoUnidadeOrcamentaria,
        @WebParam(name = "ano", targetNamespace = "")
        Integer ano,
        @WebParam(name = "mes", targetNamespace = "")
        Integer mes);

    /**
     * 
     * @param credencial
     * @param execucao
     * @return
     *     returns br.gov.planejamento.sof.siop.servicoweb.RetornoExecucaoEstataisDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarExecucoes", targetNamespace = "http://servicoweb.siop.sof.planejamento.gov.br/", className = "br.gov.planejamento.sof.siop.servicoweb.ConsultarExecucoes")
    @ResponseWrapper(localName = "consultarExecucoesResponse", targetNamespace = "http://servicoweb.siop.sof.planejamento.gov.br/", className = "br.gov.planejamento.sof.siop.servicoweb.ConsultarExecucoesResponse")
    public RetornoExecucaoEstataisDTO consultarExecucoes(
        @WebParam(name = "credencial", targetNamespace = "")
        CredencialDTO credencial,
        @WebParam(name = "execucao", targetNamespace = "")
        ExecucaoEstataisDTO execucao);

    /**
     * 
     * @param input
     * @param credencial
     * @return
     *     returns br.gov.planejamento.sof.siop.servicoweb.RetornoInputExecucaoEstataisDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "incluirExecucao", targetNamespace = "http://servicoweb.siop.sof.planejamento.gov.br/", className = "br.gov.planejamento.sof.siop.servicoweb.IncluirExecucao")
    @ResponseWrapper(localName = "incluirExecucaoResponse", targetNamespace = "http://servicoweb.siop.sof.planejamento.gov.br/", className = "br.gov.planejamento.sof.siop.servicoweb.IncluirExecucaoResponse")
    public RetornoInputExecucaoEstataisDTO incluirExecucao(
        @WebParam(name = "credencial", targetNamespace = "")
        CredencialDTO credencial,
        @WebParam(name = "input", targetNamespace = "")
        InputExecucaoEstataisDTO input);

}
