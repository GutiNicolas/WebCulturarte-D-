
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtPropuestaWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtPropuestaWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colaboradores" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaRealizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechapublicada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoactual" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="montorequerido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precioentrada" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="proponente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtPropuestaWeb", propOrder = {
    "categoria",
    "colaboradores",
    "descripcion",
    "estado",
    "fechaRealizacion",
    "fechapublicada",
    "imagen",
    "lugar",
    "montoactual",
    "montorequerido",
    "precioentrada",
    "proponente",
    "retorno",
    "titulo"
})
public class DtPropuestaWeb {

    protected String categoria;
    @XmlElement(nillable = true)
    protected List<String> colaboradores;
    protected String descripcion;
    protected String estado;
    protected String fechaRealizacion;
    protected String fechapublicada;
    protected String imagen;
    protected String lugar;
    protected int montoactual;
    protected int montorequerido;
    protected int precioentrada;
    protected String proponente;
    protected String retorno;
    protected String titulo;

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the colaboradores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colaboradores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColaboradores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColaboradores() {
        if (colaboradores == null) {
            colaboradores = new ArrayList<String>();
        }
        return this.colaboradores;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRealizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    /**
     * Define el valor de la propiedad fechaRealizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRealizacion(String value) {
        this.fechaRealizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechapublicada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechapublicada() {
        return fechapublicada;
    }

    /**
     * Define el valor de la propiedad fechapublicada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechapublicada(String value) {
        this.fechapublicada = value;
    }

    /**
     * Obtiene el valor de la propiedad imagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
    }

    /**
     * Obtiene el valor de la propiedad lugar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Define el valor de la propiedad lugar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugar(String value) {
        this.lugar = value;
    }

    /**
     * Obtiene el valor de la propiedad montoactual.
     * 
     */
    public int getMontoactual() {
        return montoactual;
    }

    /**
     * Define el valor de la propiedad montoactual.
     * 
     */
    public void setMontoactual(int value) {
        this.montoactual = value;
    }

    /**
     * Obtiene el valor de la propiedad montorequerido.
     * 
     */
    public int getMontorequerido() {
        return montorequerido;
    }

    /**
     * Define el valor de la propiedad montorequerido.
     * 
     */
    public void setMontorequerido(int value) {
        this.montorequerido = value;
    }

    /**
     * Obtiene el valor de la propiedad precioentrada.
     * 
     */
    public int getPrecioentrada() {
        return precioentrada;
    }

    /**
     * Define el valor de la propiedad precioentrada.
     * 
     */
    public void setPrecioentrada(int value) {
        this.precioentrada = value;
    }

    /**
     * Obtiene el valor de la propiedad proponente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProponente() {
        return proponente;
    }

    /**
     * Define el valor de la propiedad proponente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProponente(String value) {
        this.proponente = value;
    }

    /**
     * Obtiene el valor de la propiedad retorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetorno() {
        return retorno;
    }

    /**
     * Define el valor de la propiedad retorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetorno(String value) {
        this.retorno = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

}
