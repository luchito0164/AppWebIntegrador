
package servlets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verificarSuministro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verificarSuministro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numSumi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificarSuministro", propOrder = {
    "numSumi"
})
public class VerificarSuministro {

    protected String numSumi;

    /**
     * Obtiene el valor de la propiedad numSumi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSumi() {
        return numSumi;
    }

    /**
     * Define el valor de la propiedad numSumi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSumi(String value) {
        this.numSumi = value;
    }

}
