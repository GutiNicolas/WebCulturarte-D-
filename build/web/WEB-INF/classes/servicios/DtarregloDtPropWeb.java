
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtarregloDtPropWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtarregloDtPropWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arregloPropuestas" type="{http://WebServices/}dtPropuestaWeb" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtarregloDtPropWeb", propOrder = {
    "arregloPropuestas"
})
public class DtarregloDtPropWeb {

    @XmlElement(nillable = true)
    protected List<DtPropuestaWeb> arregloPropuestas;

    /**
     * Gets the value of the arregloPropuestas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arregloPropuestas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArregloPropuestas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtPropuestaWeb }
     * 
     * 
     */
    public List<DtPropuestaWeb> getArregloPropuestas() {
        if (arregloPropuestas == null) {
            arregloPropuestas = new ArrayList<DtPropuestaWeb>();
        }
        return this.arregloPropuestas;
    }

}
