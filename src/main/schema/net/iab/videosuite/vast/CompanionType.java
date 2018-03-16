//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.7-b41 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2018.03.16 시간 01:23:28 PM KST 
//


package net.iab.videosuite.vast;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Companion_type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Companion_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="StaticResource" minOccurs="0">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *                   &lt;attribute name="creativeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="IFrameResource" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *           &lt;element name="HTMLResource" type="{http://www.iab.net/videosuite/vast}HTMLResource_type" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="CreativeExtensions" type="{http://www.iab.net/videosuite/vast}CreativeExtensions_type" minOccurs="0"/>
 *         &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
 *         &lt;element name="CompanionClickThrough" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="AltText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdParameters" type="{http://www.iab.net/videosuite/vast}AdParameters_type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="assetWidth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="assetHeight" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="expandedWidth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="expandedHeight" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="adSlotId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Companion_type", propOrder = {
    "staticResource",
    "iFrameResource",
    "htmlResource",
    "creativeExtensions",
    "trackingEvents",
    "companionClickThrough",
    "altText",
    "adParameters"
})
public class CompanionType {

    @XmlElement(name = "StaticResource")
    protected CompanionType.StaticResource staticResource;
    @XmlElement(name = "IFrameResource")
    @XmlSchemaType(name = "anyURI")
    protected String iFrameResource;
    @XmlElement(name = "HTMLResource")
    protected HTMLResourceType htmlResource;
    @XmlElement(name = "CreativeExtensions")
    protected CreativeExtensionsType creativeExtensions;
    @XmlElement(name = "TrackingEvents")
    protected TrackingEventsType trackingEvents;
    @XmlElement(name = "CompanionClickThrough")
    @XmlSchemaType(name = "anyURI")
    protected String companionClickThrough;
    @XmlElement(name = "AltText")
    protected String altText;
    @XmlElement(name = "AdParameters")
    protected AdParametersType adParameters;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "width", required = true)
    protected BigInteger width;
    @XmlAttribute(name = "height", required = true)
    protected BigInteger height;
    @XmlAttribute(name = "assetWidth")
    protected BigInteger assetWidth;
    @XmlAttribute(name = "assetHeight")
    protected BigInteger assetHeight;
    @XmlAttribute(name = "expandedWidth")
    protected BigInteger expandedWidth;
    @XmlAttribute(name = "expandedHeight")
    protected BigInteger expandedHeight;
    @XmlAttribute(name = "apiFramework")
    protected String apiFramework;
    @XmlAttribute(name = "adSlotId")
    protected String adSlotId;

    /**
     * staticResource 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CompanionType.StaticResource }
     *     
     */
    public CompanionType.StaticResource getStaticResource() {
        return staticResource;
    }

    /**
     * staticResource 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanionType.StaticResource }
     *     
     */
    public void setStaticResource(CompanionType.StaticResource value) {
        this.staticResource = value;
    }

    /**
     * iFrameResource 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFrameResource() {
        return iFrameResource;
    }

    /**
     * iFrameResource 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFrameResource(String value) {
        this.iFrameResource = value;
    }

    /**
     * htmlResource 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link HTMLResourceType }
     *     
     */
    public HTMLResourceType getHTMLResource() {
        return htmlResource;
    }

    /**
     * htmlResource 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link HTMLResourceType }
     *     
     */
    public void setHTMLResource(HTMLResourceType value) {
        this.htmlResource = value;
    }

    /**
     * creativeExtensions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CreativeExtensionsType }
     *     
     */
    public CreativeExtensionsType getCreativeExtensions() {
        return creativeExtensions;
    }

    /**
     * creativeExtensions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeExtensionsType }
     *     
     */
    public void setCreativeExtensions(CreativeExtensionsType value) {
        this.creativeExtensions = value;
    }

    /**
     * trackingEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TrackingEventsType }
     *     
     */
    public TrackingEventsType getTrackingEvents() {
        return trackingEvents;
    }

    /**
     * trackingEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingEventsType }
     *     
     */
    public void setTrackingEvents(TrackingEventsType value) {
        this.trackingEvents = value;
    }

    /**
     * companionClickThrough 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanionClickThrough() {
        return companionClickThrough;
    }

    /**
     * companionClickThrough 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanionClickThrough(String value) {
        this.companionClickThrough = value;
    }

    /**
     * altText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltText() {
        return altText;
    }

    /**
     * altText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltText(String value) {
        this.altText = value;
    }

    /**
     * adParameters 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AdParametersType }
     *     
     */
    public AdParametersType getAdParameters() {
        return adParameters;
    }

    /**
     * adParameters 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AdParametersType }
     *     
     */
    public void setAdParameters(AdParametersType value) {
        this.adParameters = value;
    }

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * width 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * width 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * height 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * height 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

    /**
     * assetWidth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssetWidth() {
        return assetWidth;
    }

    /**
     * assetWidth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssetWidth(BigInteger value) {
        this.assetWidth = value;
    }

    /**
     * assetHeight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssetHeight() {
        return assetHeight;
    }

    /**
     * assetHeight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssetHeight(BigInteger value) {
        this.assetHeight = value;
    }

    /**
     * expandedWidth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpandedWidth() {
        return expandedWidth;
    }

    /**
     * expandedWidth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpandedWidth(BigInteger value) {
        this.expandedWidth = value;
    }

    /**
     * expandedHeight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpandedHeight() {
        return expandedHeight;
    }

    /**
     * expandedHeight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpandedHeight(BigInteger value) {
        this.expandedHeight = value;
    }

    /**
     * apiFramework 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiFramework() {
        return apiFramework;
    }

    /**
     * apiFramework 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiFramework(String value) {
        this.apiFramework = value;
    }

    /**
     * adSlotId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdSlotId() {
        return adSlotId;
    }

    /**
     * adSlotId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdSlotId(String value) {
        this.adSlotId = value;
    }


    /**
     * <p>anonymous complex type에 대한 Java 클래스입니다.
     * 
     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
     *       &lt;attribute name="creativeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class StaticResource {

        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected String value;
        @XmlAttribute(name = "creativeType", required = true)
        protected String creativeType;

        /**
         * value 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * value 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * creativeType 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreativeType() {
            return creativeType;
        }

        /**
         * creativeType 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreativeType(String value) {
            this.creativeType = value;
        }

    }

}
