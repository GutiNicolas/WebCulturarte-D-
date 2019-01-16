
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtFechaWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtFechaWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtFechaWeb", propOrder = {
    "anio",
    "dia",
    "fecha",
    "mes"
})
public class DtFechaWeb {

    protected String anio;
    protected String dia;
    protected String fecha;
    protected String mes;

    /**
     * Obtiene el valor de la propiedad anio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnio() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnio(String value) {
        this.anio = value;
    }

    /**
     * Obtiene el valor de la propiedad dia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDia() {
        return dia;
    }

    /**
     * Define el valor de la propiedad dia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDia(String value) {
        this.dia = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad mes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMes() {
        return mes;
    }

    /**
     * Define el valor de la propiedad mes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMes(String value) {
        this.mes = value;
    }

}
