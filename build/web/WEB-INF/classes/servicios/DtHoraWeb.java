
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtHoraWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtHoraWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="horaC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minuto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtHoraWeb", propOrder = {
    "hora",
    "horaC",
    "minuto"
})
public class DtHoraWeb {

    protected int hora;
    protected String horaC;
    protected int minuto;

    /**
     * Obtiene el valor de la propiedad hora.
     * 
     */
    public int getHora() {
        return hora;
    }

    /**
     * Define el valor de la propiedad hora.
     * 
     */
    public void setHora(int value) {
        this.hora = value;
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
     * Obtiene el valor de la propiedad minuto.
     * 
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Define el valor de la propiedad minuto.
     * 
     */
    public void setMinuto(int value) {
        this.minuto = value;
    }

}
