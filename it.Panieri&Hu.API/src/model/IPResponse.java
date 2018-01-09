//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.01.09 alle 01:21:03 AM CET 
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
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="as" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "country",
    "countryCode",
    "region",
    "regionName",
    "city",
    "zip",
    "lat",
    "lon",
    "timezone",
    "isp",
    "org",
    "as",
    "query"
})
@XmlRootElement(name = "query")
public class IPResponse {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    protected String countryCode;
    protected int region;
    @XmlElement(required = true)
    protected String regionName;
    @XmlElement(required = true)
    protected String city;
    protected int zip;
    @XmlElement(required = true)
    protected BigDecimal lat;
    @XmlElement(required = true)
    protected BigDecimal lon;
    @XmlElement(required = true)
    protected String timezone;
    @XmlElement(required = true)
    protected String isp;
    @XmlElement(required = true)
    protected String org;
    @XmlElement(required = true)
    protected String as;
    @XmlElement(required = true)
    protected String query;

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
     * Recupera il valore della proprietà country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Imposta il valore della proprietà country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Recupera il valore della proprietà countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Imposta il valore della proprietà countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Recupera il valore della proprietà region.
     * 
     */
    public int getRegion() {
        return region;
    }

    /**
     * Imposta il valore della proprietà region.
     * 
     */
    public void setRegion(int value) {
        this.region = value;
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
     * Recupera il valore della proprietà zip.
     * 
     */
    public int getZip() {
        return zip;
    }

    /**
     * Imposta il valore della proprietà zip.
     * 
     */
    public void setZip(int value) {
        this.zip = value;
    }

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
     * Recupera il valore della proprietà lon.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLon() {
        return lon;
    }

    /**
     * Imposta il valore della proprietà lon.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLon(BigDecimal value) {
        this.lon = value;
    }

    /**
     * Recupera il valore della proprietà timezone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Imposta il valore della proprietà timezone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
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
     * Recupera il valore della proprietà org.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrg() {
        return org;
    }

    /**
     * Imposta il valore della proprietà org.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrg(String value) {
        this.org = value;
    }

    /**
     * Recupera il valore della proprietà as.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAs() {
        return as;
    }

    /**
     * Imposta il valore della proprietà as.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAs(String value) {
        this.as = value;
    }

    /**
     * Recupera il valore della proprietà query.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Imposta il valore della proprietà query.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

}
