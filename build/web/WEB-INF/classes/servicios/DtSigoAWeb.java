
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtSigoAWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtSigoAWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nickusuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrecompleto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtSigoAWeb", propOrder = {
    "nickusuario",
    "nombrecompleto",
    "rol"
})
public class DtSigoAWeb {

    protected String nickusuario;
    protected String nombrecompleto;
    protected String rol;

    /**
     * Obtiene el valor de la propiedad nickusuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickusuario() {
        return nickusuario;
    }

    /**
     * Define el valor de la propiedad nickusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickusuario(String value) {
        this.nickusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrecompleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrecompleto() {
        return nombrecompleto;
    }

    /**
     * Define el valor de la propiedad nombrecompleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrecompleto(String value) {
        this.nombrecompleto = value;
    }

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRol(String value) {
        this.rol = value;
    }

}
