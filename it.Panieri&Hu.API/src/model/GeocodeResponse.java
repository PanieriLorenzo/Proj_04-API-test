//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.12.12 alle 11:29:17 AM CET 
//


package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="formatted_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="address_component" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="long_name" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="short_name" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="geometry">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="location">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="lng" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="location_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="viewport">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="southwest">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                 &lt;element name="lng" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="northeast">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                 &lt;element name="lng" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="partial_match" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="place_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "GeocodeResponse")
public class GeocodeResponse {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected GeocodeResponse.Result result;

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
     *     {@link GeocodeResponse.Result }
     *     
     */
    public GeocodeResponse.Result getResult() {
        return result;
    }

    /**
     * Imposta il valore della proprietà result.
     * 
     * @param value
     *     allowed object is
     *     {@link GeocodeResponse.Result }
     *     
     */
    public void setResult(GeocodeResponse.Result value) {
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
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="formatted_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="address_component" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="long_name" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="short_name" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="geometry">
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
     *                   &lt;element name="location_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="viewport">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="southwest">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                       &lt;element name="lng" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="northeast">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                       &lt;element name="lng" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="partial_match" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="place_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "type",
        "formattedAddress",
        "addressComponent",
        "geometry",
        "partialMatch",
        "placeId"
    })
    public static class Result {

        @XmlElement(required = true)
        protected String type;
        @XmlElement(name = "formatted_address", required = true)
        protected String formattedAddress;
        @XmlElement(name = "address_component", required = true)
        protected List<GeocodeResponse.Result.AddressComponent> addressComponent;
        @XmlElement(required = true)
        protected GeocodeResponse.Result.Geometry geometry;
        @XmlElement(name = "partial_match")
        protected boolean partialMatch;
        @XmlElement(name = "place_id", required = true)
        protected String placeId;

        /**
         * Recupera il valore della proprietà type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Imposta il valore della proprietà type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Recupera il valore della proprietà formattedAddress.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormattedAddress() {
            return formattedAddress;
        }

        /**
         * Imposta il valore della proprietà formattedAddress.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormattedAddress(String value) {
            this.formattedAddress = value;
        }

        /**
         * Gets the value of the addressComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addressComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddressComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeocodeResponse.Result.AddressComponent }
         * 
         * 
         */
        public List<GeocodeResponse.Result.AddressComponent> getAddressComponent() {
            if (addressComponent == null) {
                addressComponent = new ArrayList<GeocodeResponse.Result.AddressComponent>();
            }
            return this.addressComponent;
        }

        /**
         * Recupera il valore della proprietà geometry.
         * 
         * @return
         *     possible object is
         *     {@link GeocodeResponse.Result.Geometry }
         *     
         */
        public GeocodeResponse.Result.Geometry getGeometry() {
            return geometry;
        }

        /**
         * Imposta il valore della proprietà geometry.
         * 
         * @param value
         *     allowed object is
         *     {@link GeocodeResponse.Result.Geometry }
         *     
         */
        public void setGeometry(GeocodeResponse.Result.Geometry value) {
            this.geometry = value;
        }

        /**
         * Recupera il valore della proprietà partialMatch.
         * 
         */
        public boolean isPartialMatch() {
            return partialMatch;
        }

        /**
         * Imposta il valore della proprietà partialMatch.
         * 
         */
        public void setPartialMatch(boolean value) {
            this.partialMatch = value;
        }

        /**
         * Recupera il valore della proprietà placeId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaceId() {
            return placeId;
        }

        /**
         * Imposta il valore della proprietà placeId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaceId(String value) {
            this.placeId = value;
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
         *         &lt;element name="long_name" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="short_name" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "longName",
            "shortName",
            "type"
        })
        public static class AddressComponent {

            @XmlElement(name = "long_name")
            protected int longName;
            @XmlElement(name = "short_name")
            protected int shortName;
            @XmlElement(required = true)
            protected String type;

            /**
             * Recupera il valore della proprietà longName.
             * 
             */
            public int getLongName() {
                return longName;
            }

            /**
             * Imposta il valore della proprietà longName.
             * 
             */
            public void setLongName(int value) {
                this.longName = value;
            }

            /**
             * Recupera il valore della proprietà shortName.
             * 
             */
            public int getShortName() {
                return shortName;
            }

            /**
             * Imposta il valore della proprietà shortName.
             * 
             */
            public void setShortName(int value) {
                this.shortName = value;
            }

            /**
             * Recupera il valore della proprietà type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Imposta il valore della proprietà type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

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
         *         &lt;element name="location_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="viewport">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="southwest">
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
         *                   &lt;element name="northeast">
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
            "location",
            "locationType",
            "viewport"
        })
        public static class Geometry {

            @XmlElement(required = true)
            protected GeocodeResponse.Result.Geometry.Location location;
            @XmlElement(name = "location_type", required = true)
            protected String locationType;
            @XmlElement(required = true)
            protected GeocodeResponse.Result.Geometry.Viewport viewport;

            /**
             * Recupera il valore della proprietà location.
             * 
             * @return
             *     possible object is
             *     {@link GeocodeResponse.Result.Geometry.Location }
             *     
             */
            public GeocodeResponse.Result.Geometry.Location getLocation() {
                return location;
            }

            /**
             * Imposta il valore della proprietà location.
             * 
             * @param value
             *     allowed object is
             *     {@link GeocodeResponse.Result.Geometry.Location }
             *     
             */
            public void setLocation(GeocodeResponse.Result.Geometry.Location value) {
                this.location = value;
            }

            /**
             * Recupera il valore della proprietà locationType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationType() {
                return locationType;
            }

            /**
             * Imposta il valore della proprietà locationType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationType(String value) {
                this.locationType = value;
            }

            /**
             * Recupera il valore della proprietà viewport.
             * 
             * @return
             *     possible object is
             *     {@link GeocodeResponse.Result.Geometry.Viewport }
             *     
             */
            public GeocodeResponse.Result.Geometry.Viewport getViewport() {
                return viewport;
            }

            /**
             * Imposta il valore della proprietà viewport.
             * 
             * @param value
             *     allowed object is
             *     {@link GeocodeResponse.Result.Geometry.Viewport }
             *     
             */
            public void setViewport(GeocodeResponse.Result.Geometry.Viewport value) {
                this.viewport = value;
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
             *         &lt;element name="southwest">
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
             *         &lt;element name="northeast">
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
                "southwest",
                "northeast"
            })
            public static class Viewport {

                @XmlElement(required = true)
                protected GeocodeResponse.Result.Geometry.Viewport.Southwest southwest;
                @XmlElement(required = true)
                protected GeocodeResponse.Result.Geometry.Viewport.Northeast northeast;

                /**
                 * Recupera il valore della proprietà southwest.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GeocodeResponse.Result.Geometry.Viewport.Southwest }
                 *     
                 */
                public GeocodeResponse.Result.Geometry.Viewport.Southwest getSouthwest() {
                    return southwest;
                }

                /**
                 * Imposta il valore della proprietà southwest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GeocodeResponse.Result.Geometry.Viewport.Southwest }
                 *     
                 */
                public void setSouthwest(GeocodeResponse.Result.Geometry.Viewport.Southwest value) {
                    this.southwest = value;
                }

                /**
                 * Recupera il valore della proprietà northeast.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GeocodeResponse.Result.Geometry.Viewport.Northeast }
                 *     
                 */
                public GeocodeResponse.Result.Geometry.Viewport.Northeast getNortheast() {
                    return northeast;
                }

                /**
                 * Imposta il valore della proprietà northeast.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GeocodeResponse.Result.Geometry.Viewport.Northeast }
                 *     
                 */
                public void setNortheast(GeocodeResponse.Result.Geometry.Viewport.Northeast value) {
                    this.northeast = value;
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
                public static class Northeast {

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
                public static class Southwest {

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

    }

}
