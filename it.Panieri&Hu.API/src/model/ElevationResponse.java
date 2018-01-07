//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.12.12 alle 11:29:49 AM CET 
//


package model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="result">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="location">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="lng" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="elevation" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="resolution" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "result"
})
@XmlRootElement(name = "ElevationResponse")
public class ElevationResponse {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected ElevationResponse.Result result;

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà result.
     * 
     * @return
     *     possible object is
     *     {@link ElevationResponse.Result }
     *     
     */
    public ElevationResponse.Result getResult() {
        return result;
    }

    /**
     * Imposta il valore della proprietà result.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevationResponse.Result }
     *     
     */
    public void setResult(ElevationResponse.Result value) {
        this.result = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="location">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="lng" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="elevation" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="resolution" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "location",
        "elevation",
        "resolution"
    })
    public static class Result {

        @XmlElement(required = true)
        protected ElevationResponse.Result.Location location;
        @XmlElement(required = true)
        protected BigDecimal elevation;
        @XmlElement(required = true)
        protected BigDecimal resolution;

        /**
         * Recupera il valore della proprietà location.
         * 
         * @return
         *     possible object is
         *     {@link ElevationResponse.Result.Location }
         *     
         */
        public ElevationResponse.Result.Location getLocation() {
            return location;
        }

        /**
         * Imposta il valore della proprietà location.
         * 
         * @param value
         *     allowed object is
         *     {@link ElevationResponse.Result.Location }
         *     
         */
        public void setLocation(ElevationResponse.Result.Location value) {
            this.location = value;
        }

        /**
         * Recupera il valore della proprietà elevation.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getElevation() {
            return elevation;
        }

        /**
         * Imposta il valore della proprietà elevation.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setElevation(BigDecimal value) {
            this.elevation = value;
        }

        /**
         * Recupera il valore della proprietà resolution.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getResolution() {
            return resolution;
        }

        /**
         * Imposta il valore della proprietà resolution.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setResolution(BigDecimal value) {
            this.resolution = value;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="lng" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "lat",
            "lng"
        })
        public static class Location {

            @XmlElement(required = true)
            protected BigDecimal lat;
            @XmlElement(required = true)
            protected BigDecimal lng;

            /**
             * Recupera il valore della proprietà lat.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLat() {
                return lat;
            }

            /**
             * Imposta il valore della proprietà lat.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLat(BigDecimal value) {
                this.lat = value;
            }

            /**
             * Recupera il valore della proprietà lng.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLng() {
                return lng;
            }

            /**
             * Imposta il valore della proprietà lng.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLng(BigDecimal value) {
                this.lng = value;
            }

        }

    }

}
