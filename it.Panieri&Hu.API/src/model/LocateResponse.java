//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.01.09 alle 01:00:42 AM CET 
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
 *         &lt;element name="query_status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="query_status_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="query_status_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ip_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="geolocation_data">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="continent_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="continent_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="country_code_iso3166alpha2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="country_code_iso3166alpha3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="country_code_iso3166numeric" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="country_code_fips10-4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="country_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="region_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="region_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="postal_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="metro_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="area_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="isp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "queryStatus",
    "ipAddress",
    "geolocationData"
})
@XmlRootElement(name = "response")
public class LocateResponse {

    @XmlElement(name = "query_status", required = true)
    protected LocateResponse.QueryStatus queryStatus;
    @XmlElement(name = "ip_address", required = true)
    protected String ipAddress;
    @XmlElement(name = "geolocation_data", required = true)
    protected LocateResponse.GeolocationData geolocationData;

    /**
     * Recupera il valore della proprietà queryStatus.
     * 
     * @return
     *     possible object is
     *     {@link LocateResponse.QueryStatus }
     *     
     */
    public LocateResponse.QueryStatus getQueryStatus() {
        return queryStatus;
    }

    /**
     * Imposta il valore della proprietà queryStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link LocateResponse.QueryStatus }
     *     
     */
    public void setQueryStatus(LocateResponse.QueryStatus value) {
        this.queryStatus = value;
    }

    /**
     * Recupera il valore della proprietà ipAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Imposta il valore della proprietà ipAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Recupera il valore della proprietà geolocationData.
     * 
     * @return
     *     possible object is
     *     {@link LocateResponse.GeolocationData }
     *     
     */
    public LocateResponse.GeolocationData getGeolocationData() {
        return geolocationData;
    }

    /**
     * Imposta il valore della proprietà geolocationData.
     * 
     * @param value
     *     allowed object is
     *     {@link LocateResponse.GeolocationData }
     *     
     */
    public void setGeolocationData(LocateResponse.GeolocationData value) {
        this.geolocationData = value;
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
     *         &lt;element name="continent_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="continent_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="country_code_iso3166alpha2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="country_code_iso3166alpha3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="country_code_iso3166numeric" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="country_code_fips10-4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="country_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="region_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="region_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="postal_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="metro_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="area_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="isp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "continentCode",
        "continentName",
        "countryCodeIso3166Alpha2",
        "countryCodeIso3166Alpha3",
        "countryCodeIso3166Numeric",
        "countryCodeFips104",
        "countryName",
        "regionCode",
        "regionName",
        "city",
        "postalCode",
        "metroCode",
        "areaCode",
        "latitude",
        "longitude",
        "isp",
        "organization"
    })
    public static class GeolocationData {

        @XmlElement(name = "continent_code", required = true)
        protected String continentCode;
        @XmlElement(name = "continent_name", required = true)
        protected String continentName;
        @XmlElement(name = "country_code_iso3166alpha2", required = true)
        protected String countryCodeIso3166Alpha2;
        @XmlElement(name = "country_code_iso3166alpha3", required = true)
        protected String countryCodeIso3166Alpha3;
        @XmlElement(name = "country_code_iso3166numeric")
        protected int countryCodeIso3166Numeric;
        @XmlElement(name = "country_code_fips10-4", required = true)
        protected String countryCodeFips104;
        @XmlElement(name = "country_name", required = true)
        protected String countryName;
        @XmlElement(name = "region_code", required = true)
        protected String regionCode;
        @XmlElement(name = "region_name", required = true)
        protected String regionName;
        @XmlElement(required = true)
        protected String city;
        @XmlElement(name = "postal_code")
        protected int postalCode;
        @XmlElement(name = "metro_code", required = true)
        protected String metroCode;
        @XmlElement(name = "area_code", required = true)
        protected String areaCode;
        @XmlElement(required = true)
        protected BigDecimal latitude;
        @XmlElement(required = true)
        protected BigDecimal longitude;
        @XmlElement(required = true)
        protected String isp;
        @XmlElement(required = true)
        protected String organization;

        /**
         * Recupera il valore della proprietà continentCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContinentCode() {
            return continentCode;
        }

        /**
         * Imposta il valore della proprietà continentCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContinentCode(String value) {
            this.continentCode = value;
        }

        /**
         * Recupera il valore della proprietà continentName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContinentName() {
            return continentName;
        }

        /**
         * Imposta il valore della proprietà continentName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContinentName(String value) {
            this.continentName = value;
        }

        /**
         * Recupera il valore della proprietà countryCodeIso3166Alpha2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCodeIso3166Alpha2() {
            return countryCodeIso3166Alpha2;
        }

        /**
         * Imposta il valore della proprietà countryCodeIso3166Alpha2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCodeIso3166Alpha2(String value) {
            this.countryCodeIso3166Alpha2 = value;
        }

        /**
         * Recupera il valore della proprietà countryCodeIso3166Alpha3.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCodeIso3166Alpha3() {
            return countryCodeIso3166Alpha3;
        }

        /**
         * Imposta il valore della proprietà countryCodeIso3166Alpha3.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCodeIso3166Alpha3(String value) {
            this.countryCodeIso3166Alpha3 = value;
        }

        /**
         * Recupera il valore della proprietà countryCodeIso3166Numeric.
         * 
         */
        public int getCountryCodeIso3166Numeric() {
            return countryCodeIso3166Numeric;
        }

        /**
         * Imposta il valore della proprietà countryCodeIso3166Numeric.
         * 
         */
        public void setCountryCodeIso3166Numeric(int value) {
            this.countryCodeIso3166Numeric = value;
        }

        /**
         * Recupera il valore della proprietà countryCodeFips104.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCodeFips104() {
            return countryCodeFips104;
        }

        /**
         * Imposta il valore della proprietà countryCodeFips104.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCodeFips104(String value) {
            this.countryCodeFips104 = value;
        }

        /**
         * Recupera il valore della proprietà countryName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryName() {
            return countryName;
        }

        /**
         * Imposta il valore della proprietà countryName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryName(String value) {
            this.countryName = value;
        }

        /**
         * Recupera il valore della proprietà regionCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegionCode() {
            return regionCode;
        }

        /**
         * Imposta il valore della proprietà regionCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegionCode(String value) {
            this.regionCode = value;
        }

        /**
         * Recupera il valore della proprietà regionName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegionName() {
            return regionName;
        }

        /**
         * Imposta il valore della proprietà regionName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegionName(String value) {
            this.regionName = value;
        }

        /**
         * Recupera il valore della proprietà city.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Imposta il valore della proprietà city.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Recupera il valore della proprietà postalCode.
         * 
         */
        public int getPostalCode() {
            return postalCode;
        }

        /**
         * Imposta il valore della proprietà postalCode.
         * 
         */
        public void setPostalCode(int value) {
            this.postalCode = value;
        }

        /**
         * Recupera il valore della proprietà metroCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetroCode() {
            return metroCode;
        }

        /**
         * Imposta il valore della proprietà metroCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetroCode(String value) {
            this.metroCode = value;
        }

        /**
         * Recupera il valore della proprietà areaCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaCode() {
            return areaCode;
        }

        /**
         * Imposta il valore della proprietà areaCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaCode(String value) {
            this.areaCode = value;
        }

        /**
         * Recupera il valore della proprietà latitude.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLatitude() {
            return latitude;
        }

        /**
         * Imposta il valore della proprietà latitude.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLatitude(BigDecimal value) {
            this.latitude = value;
        }

        /**
         * Recupera il valore della proprietà longitude.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLongitude() {
            return longitude;
        }

        /**
         * Imposta il valore della proprietà longitude.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLongitude(BigDecimal value) {
            this.longitude = value;
        }

        /**
         * Recupera il valore della proprietà isp.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsp() {
            return isp;
        }

        /**
         * Imposta il valore della proprietà isp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsp(String value) {
            this.isp = value;
        }

        /**
         * Recupera il valore della proprietà organization.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganization() {
            return organization;
        }

        /**
         * Imposta il valore della proprietà organization.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganization(String value) {
            this.organization = value;
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
     *         &lt;element name="query_status_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="query_status_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "queryStatusCode",
        "queryStatusDescription"
    })
    public static class QueryStatus {

        @XmlElement(name = "query_status_code", required = true)
        protected String queryStatusCode;
        @XmlElement(name = "query_status_description", required = true)
        protected String queryStatusDescription;

        /**
         * Recupera il valore della proprietà queryStatusCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueryStatusCode() {
            return queryStatusCode;
        }

        /**
         * Imposta il valore della proprietà queryStatusCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueryStatusCode(String value) {
            this.queryStatusCode = value;
        }

        /**
         * Recupera il valore della proprietà queryStatusDescription.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueryStatusDescription() {
            return queryStatusDescription;
        }

        /**
         * Imposta il valore della proprietà queryStatusDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueryStatusDescription(String value) {
            this.queryStatusDescription = value;
        }

    }

}
