
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtPagoWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtPagoWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroPaypal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloPropuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtPagoWeb", propOrder = {
    "banco",
    "cvc",
    "numeroCuenta",
    "numeroPaypal",
    "numeroTarjeta",
    "tipoPago",
    "tipoTarjeta",
    "titular",
    "tituloPropuesta",
    "fVencimiento"
})
public class DtPagoWeb {

    protected String banco;
    protected String cvc;
    protected String numeroCuenta;
    protected String numeroPaypal;
    protected String numeroTarjeta;
    protected String tipoPago;
    protected String tipoTarjeta;
    protected String titular;
    protected String tituloPropuesta;
    protected String fVencimiento;

    /**
     * Obtiene el valor de la propiedad banco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Define el valor de la propiedad banco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanco(String value) {
        this.banco = value;
    }

    /**
     * Obtiene el valor de la propiedad cvc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvc() {
        return cvc;
    }

    /**
     * Define el valor de la propiedad cvc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvc(String value) {
        this.cvc = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPaypal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPaypal() {
        return numeroPaypal;
    }

    /**
     * Define el valor de la propiedad numeroPaypal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPaypal(String value) {
        this.numeroPaypal = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Define el valor de la propiedad numeroTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTarjeta(String value) {
        this.numeroTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPago() {
        return tipoPago;
    }

    /**
     * Define el valor de la propiedad tipoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPago(String value) {
        this.tipoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * Define el valor de la propiedad tipoTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTarjeta(String value) {
        this.tipoTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad titular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Define el valor de la propiedad titular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitular(String value) {
        this.titular = value;
    }

    /**
     * Obtiene el valor de la propiedad tituloPropuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloPropuesta() {
        return tituloPropuesta;
    }

    /**
     * Define el valor de la propiedad tituloPropuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloPropuesta(String value) {
        this.tituloPropuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad fVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFVencimiento() {
        return fVencimiento;
    }

    /**
     * Define el valor de la propiedad fVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFVencimiento(String value) {
        this.fVencimiento = value;
    }

}
