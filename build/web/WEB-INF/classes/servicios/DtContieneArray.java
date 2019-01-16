
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtContieneArray complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtContieneArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="myarreglo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nombreArray" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtContieneArray", propOrder = {
    "myarreglo",
    "nombreArray"
})
public class DtContieneArray {

    protected List<String> myarreglo;
    protected String nombreArray;

    /**
     * Gets the value of the myarreglo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the myarreglo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMyarreglo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMyarreglo() {
        if (myarreglo == null) {
            myarreglo = new ArrayList<String>();
        }
        return this.myarreglo;
    }

    /**
     * Obtiene el valor de la propiedad nombreArray.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArray() {
        return nombreArray;
    }

    /**
     * Define el valor de la propiedad nombreArray.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArray(String value) {
        this.nombreArray = value;
    }

}
