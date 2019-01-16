
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtarregloDtSigoAWEB complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtarregloDtSigoAWEB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arregloSigoAusu" type="{http://WebServices/}dtSigoAWeb" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtarregloDtSigoAWEB", propOrder = {
    "arregloSigoAusu"
})
public class DtarregloDtSigoAWEB {

    @XmlElement(nillable = true)
    protected List<DtSigoAWeb> arregloSigoAusu;

    /**
     * Gets the value of the arregloSigoAusu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arregloSigoAusu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArregloSigoAusu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtSigoAWeb }
     * 
     * 
     */
    public List<DtSigoAWeb> getArregloSigoAusu() {
        if (arregloSigoAusu == null) {
            arregloSigoAusu = new ArrayList<DtSigoAWeb>();
        }
        return this.arregloSigoAusu;
    }

}
