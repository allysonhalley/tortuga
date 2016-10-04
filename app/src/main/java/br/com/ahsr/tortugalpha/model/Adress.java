package br.com.ahsr.tortugalpha.model;

/**
 * Created by Allyson on 20/09/2016.
 */

public class Adress extends TemplateAtributes{


    // nos comentários estarão a referência para ser capturado na fonte
    private String cep; /*inserido pelo usuário ou pelo googlemaps?*/
    private String logradouro; /*logradouro*/
    private String numero; /*complemento*/
    private String complemento; /*inserido pelo usuário*/
    private String bairro; /*bairro*/
    private String cidade; /*cidade*/
    private String estado; /*estado_info.nome*/
    private String uf; /*estado*/
    private String pais; /*não sei como será inserido ainda ver com o GoogleMaps*/
    private String latitude; /*não sei como será inserido ainda ver com o GoogleMaps*/
    private String longitude; /*não sei como será inserido ainda ver com o GoogleMaps*/

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /*{
    "complemento":"de 520/521 ao fim",
        "bairro":"Jardim Atl\u00e2ntico",
        "cidade":"Olinda",
        "logradouro":"Rua Professor Ol\u00edmpio Magalh\u00e3es",
        "estado_info":{
            "area_km2":"98.076,109",
            "codigo_ibge":"26",
            "nome":"Pernambuco"},
        "cep":"53050440",
            "cidade_info":{
            "area_km2":"41,681",
            "codigo_ibge":"2609600"},
        "estado":"PE"
    }*/
}
