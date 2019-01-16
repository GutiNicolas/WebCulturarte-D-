
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtColaboracionCompWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtColaboracionCompWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comentarioC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nick" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proponenteP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retornoP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtColaboracionCompWeb", propOrder = {
    "comentarioC",
    "estadoP",
    "fechaC",
    "horaC",
    "montoC",
    "nick",
    "proponenteP",
    "retornoP",
    "tituloP"
})
public class DtColaboracionCompWeb {

    protected String comentarioC;
    protected String estadoP;
    protected String fechaC;
    protected String horaC;
    protected int montoC;
    protected String nick;
    protected String proponenteP;
    protected String retornoP;
    protected String tituloP;

    /**
     * Obtiene el valor de la propiedad comentarioC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarioC() {
        return comentarioC;
    }

    /**
     * Define el valor de la propiedad comentarioC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarioC(String value) {
        this.comentarioC = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoP() {
        return estadoP;
    }

    /**
     * Define el valor de la propiedad estadoP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoP(String value) {
        this.estadoP = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaC() {
        return fechaC;
    }

    /**
     * Define el valor de la propiedad fechaC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaC(String value) {
        this.fechaC = value;
    }

    /**
     * Obtiene el valor de la propiedad horaC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraC() {
        return horaC;
    }

    /**
     * Define el valor de la propiedad horaC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraC(String value) {
        this.horaC = value;
    }

    /**
     * Obtiene el valor de la propiedad montoC.
     * 
     */
    public int getMontoC() {
        return montoC;
    }

    /**
     * Define el valor de la propiedad montoC.
     * 
     */
    public void setMontoC(int value) {
        this.montoC = value;
    }

    /**
     * Obtiene el valor de la propiedad nick.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNick() {
        return nick;
    }

    /**
     * Define el valor de la propiedad nick.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNick(String value) {
        this.nick = value;
    }

    /**
     * Obtiene el valor de la propiedad proponenteP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProponenteP() {
        return proponenteP;
    }

    /**
     * Define el valor de la propiedad proponenteP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProponenteP(String value) {
        this.proponenteP = value;
    }

    /**
     * Obtiene el valor de la propiedad retornoP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetornoP() {
        return retornoP;
    }

    /**
     * Define el valor de la propiedad retornoP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetornoP(String value) {
        this.retornoP = value;
    }

    /**
     * Obtiene el valor de la propiedad tituloP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloP() {
        return tituloP;
    }

    /**
     * Define el valor de la propiedad tituloP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloP(String value) {
        this.tituloP = value;
    }

}
