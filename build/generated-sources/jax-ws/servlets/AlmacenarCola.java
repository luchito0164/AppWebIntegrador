
package servlets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para almacenarCola complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="almacenarCola">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consumo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroSumi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "almacenarCola", propOrder = {
    "consumo",
    "numeroSumi",
    "fecha",
    "cliente"
})
public class AlmacenarCola {

    protected String consumo;
    protected String numeroSumi;
    protected String fecha;
    protected String cliente;

    /**
     * Obtiene el valor de la propiedad consumo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumo() {
        return consumo;
    }

    /**
     * Define el valor de la propiedad consumo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumo(String value) {
        this.consumo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroSumi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSumi() {
        return numeroSumi;
    }

    /**
     * Define el valor de la propiedad numeroSumi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSumi(String value) {
        this.numeroSumi = value;
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
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

}
