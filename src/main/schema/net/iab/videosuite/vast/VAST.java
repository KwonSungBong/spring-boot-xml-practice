//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.7-b41 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2018.03.16 시간 01:23:28 PM KST 
//


package net.iab.videosuite.vast;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ad" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="InLine" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AdSystem" type="{http://www.iab.net/videosuite/vast}AdSystem_type"/>
 *                             &lt;element name="AdTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Advertiser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Pricing" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                     &lt;attribute name="model" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                           &lt;enumeration value="cpc"/>
 *                                           &lt;enumeration value="cpm"/>
 *                                           &lt;enumeration value="cpe"/>
 *                                           &lt;enumeration value="cpv"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="currency" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;pattern value="[a-zA-Z]{3}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Survey" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                             &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                             &lt;element name="Impression" type="{http://www.iab.net/videosuite/vast}Impression_type" maxOccurs="unbounded"/>
 *                             &lt;element name="Creatives">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Creative" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="Linear" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Icons" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="CreativeExtensions" type="{http://www.iab.net/videosuite/vast}CreativeExtensions_type" minOccurs="0"/>
 *                                                           &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                                                           &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
 *                                                           &lt;element name="AdParameters" type="{http://www.iab.net/videosuite/vast}AdParameters_type" minOccurs="0"/>
 *                                                           &lt;element name="VideoClicks" type="{http://www.iab.net/videosuite/vast}VideoClicks_type" minOccurs="0"/>
 *                                                           &lt;element name="MediaFiles" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="MediaFile" maxOccurs="unbounded">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *                                                                             &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="delivery" use="required">
 *                                                                               &lt;simpleType>
 *                                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                                                                   &lt;enumeration value="streaming"/>
 *                                                                                   &lt;enumeration value="progressive"/>
 *                                                                                 &lt;/restriction>
 *                                                                               &lt;/simpleType>
 *                                                                             &lt;/attribute>
 *                                                                             &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                                                             &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                                                             &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                                                             &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                                                             &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                                                             &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                             &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                             &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="skipoffset">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="CompanionAds" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Companion" type="{http://www.iab.net/videosuite/vast}Companion_type" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                                               &lt;enumeration value="all"/>
 *                                                               &lt;enumeration value="any"/>
 *                                                               &lt;enumeration value="none"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NonLinearAds" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
 *                                                           &lt;element name="NonLinear" type="{http://www.iab.net/videosuite/vast}NonLinear_type" maxOccurs="unbounded"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/choice>
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Extensions" type="{http://www.iab.net/videosuite/vast}Extensions_type" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Wrapper" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AdSystem" type="{http://www.iab.net/videosuite/vast}AdSystem_type"/>
 *                             &lt;element name="VASTAdTagURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                             &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                             &lt;element name="Impression" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *                             &lt;element name="Creatives">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Creative" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="Linear" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="CreativeExtensions" type="{http://www.iab.net/videosuite/vast}CreativeExtensions_type" minOccurs="0"/>
 *                                                           &lt;element name="Icons" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
 *                                                           &lt;element name="VideoClicks" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *                                                                             &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *                                                                             &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="CompanionAds" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Companion" type="{http://www.iab.net/videosuite/vast}CompanionWrapper_type" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="NonLinearAds" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
 *                                                           &lt;element name="NonLinear" type="{http://www.iab.net/videosuite/vast}NonLinearWrapper_type" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/choice>
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Extensions" type="{http://www.iab.net/videosuite/vast}Extensions_type" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ad"
})
@XmlRootElement(name = "VAST")
public class VAST {

    @XmlElement(name = "Ad")
    protected List<VAST.Ad> ad;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the ad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VAST.Ad }
     * 
     * 
     */
    public List<VAST.Ad> getAd() {
        if (ad == null) {
            ad = new ArrayList<VAST.Ad>();
        }
        return this.ad;
    }

    /**
     * version 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * version 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>anonymous complex type에 대한 Java 클래스입니다.
     * 
     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="InLine" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AdSystem" type="{http://www.iab.net/videosuite/vast}AdSystem_type"/>
     *                   &lt;element name="AdTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Advertiser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Pricing" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                           &lt;attribute name="model" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                                 &lt;enumeration value="cpc"/>
     *                                 &lt;enumeration value="cpm"/>
     *                                 &lt;enumeration value="cpe"/>
     *                                 &lt;enumeration value="cpv"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="currency" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;pattern value="[a-zA-Z]{3}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Survey" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *                   &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *                   &lt;element name="Impression" type="{http://www.iab.net/videosuite/vast}Impression_type" maxOccurs="unbounded"/>
     *                   &lt;element name="Creatives">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Creative" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="Linear" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Icons" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="CreativeExtensions" type="{http://www.iab.net/videosuite/vast}CreativeExtensions_type" minOccurs="0"/>
     *                                                 &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *                                                 &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
     *                                                 &lt;element name="AdParameters" type="{http://www.iab.net/videosuite/vast}AdParameters_type" minOccurs="0"/>
     *                                                 &lt;element name="VideoClicks" type="{http://www.iab.net/videosuite/vast}VideoClicks_type" minOccurs="0"/>
     *                                                 &lt;element name="MediaFiles" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="MediaFile" maxOccurs="unbounded">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
     *                                                                   &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="delivery" use="required">
     *                                                                     &lt;simpleType>
     *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                                                                         &lt;enumeration value="streaming"/>
     *                                                                         &lt;enumeration value="progressive"/>
     *                                                                       &lt;/restriction>
     *                                                                     &lt;/simpleType>
     *                                                                   &lt;/attribute>
     *                                                                   &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                                                   &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                                                   &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                                                   &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                                                   &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                                                   &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                                   &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                                   &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="skipoffset">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="CompanionAds" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Companion" type="{http://www.iab.net/videosuite/vast}Companion_type" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                                                     &lt;enumeration value="all"/>
     *                                                     &lt;enumeration value="any"/>
     *                                                     &lt;enumeration value="none"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="NonLinearAds" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
     *                                                 &lt;element name="NonLinear" type="{http://www.iab.net/videosuite/vast}NonLinear_type" maxOccurs="unbounded"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/choice>
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Extensions" type="{http://www.iab.net/videosuite/vast}Extensions_type" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Wrapper" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AdSystem" type="{http://www.iab.net/videosuite/vast}AdSystem_type"/>
     *                   &lt;element name="VASTAdTagURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                   &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *                   &lt;element name="Impression" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
     *                   &lt;element name="Creatives">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Creative" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="Linear" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="CreativeExtensions" type="{http://www.iab.net/videosuite/vast}CreativeExtensions_type" minOccurs="0"/>
     *                                                 &lt;element name="Icons" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
     *                                                 &lt;element name="VideoClicks" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
     *                                                                   &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
     *                                                                   &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="CompanionAds" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Companion" type="{http://www.iab.net/videosuite/vast}CompanionWrapper_type" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="NonLinearAds" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
     *                                                 &lt;element name="NonLinear" type="{http://www.iab.net/videosuite/vast}NonLinearWrapper_type" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/choice>
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Extensions" type="{http://www.iab.net/videosuite/vast}Extensions_type" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inLine",
        "wrapper"
    })
    public static class Ad {

        @XmlElement(name = "InLine")
        protected VAST.Ad.InLine inLine;
        @XmlElement(name = "Wrapper")
        protected VAST.Ad.Wrapper wrapper;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "sequence")
        protected BigInteger sequence;

        /**
         * inLine 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link VAST.Ad.InLine }
         *     
         */
        public VAST.Ad.InLine getInLine() {
            return inLine;
        }

        /**
         * inLine 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link VAST.Ad.InLine }
         *     
         */
        public void setInLine(VAST.Ad.InLine value) {
            this.inLine = value;
        }

        /**
         * wrapper 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link VAST.Ad.Wrapper }
         *     
         */
        public VAST.Ad.Wrapper getWrapper() {
            return wrapper;
        }

        /**
         * wrapper 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link VAST.Ad.Wrapper }
         *     
         */
        public void setWrapper(VAST.Ad.Wrapper value) {
            this.wrapper = value;
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
         * sequence 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequence() {
            return sequence;
        }

        /**
         * sequence 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequence(BigInteger value) {
            this.sequence = value;
        }


        /**
         * <p>anonymous complex type에 대한 Java 클래스입니다.
         * 
         * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AdSystem" type="{http://www.iab.net/videosuite/vast}AdSystem_type"/>
         *         &lt;element name="AdTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Advertiser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Pricing" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                 &lt;attribute name="model" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *                       &lt;enumeration value="cpc"/>
         *                       &lt;enumeration value="cpm"/>
         *                       &lt;enumeration value="cpe"/>
         *                       &lt;enumeration value="cpv"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="currency" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;pattern value="[a-zA-Z]{3}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Survey" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
         *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
         *         &lt;element name="Impression" type="{http://www.iab.net/videosuite/vast}Impression_type" maxOccurs="unbounded"/>
         *         &lt;element name="Creatives">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Creative" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="Linear" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Icons" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="CreativeExtensions" type="{http://www.iab.net/videosuite/vast}CreativeExtensions_type" minOccurs="0"/>
         *                                       &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}time"/>
         *                                       &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
         *                                       &lt;element name="AdParameters" type="{http://www.iab.net/videosuite/vast}AdParameters_type" minOccurs="0"/>
         *                                       &lt;element name="VideoClicks" type="{http://www.iab.net/videosuite/vast}VideoClicks_type" minOccurs="0"/>
         *                                       &lt;element name="MediaFiles" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="MediaFile" maxOccurs="unbounded">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
         *                                                         &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="delivery" use="required">
         *                                                           &lt;simpleType>
         *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *                                                               &lt;enumeration value="streaming"/>
         *                                                               &lt;enumeration value="progressive"/>
         *                                                             &lt;/restriction>
         *                                                           &lt;/simpleType>
         *                                                         &lt;/attribute>
         *                                                         &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                                         &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                                         &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                                         &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                                         &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                                         &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                                         &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                                         &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="skipoffset">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="CompanionAds" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Companion" type="{http://www.iab.net/videosuite/vast}Companion_type" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *                                           &lt;enumeration value="all"/>
         *                                           &lt;enumeration value="any"/>
         *                                           &lt;enumeration value="none"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="NonLinearAds" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
         *                                       &lt;element name="NonLinear" type="{http://www.iab.net/videosuite/vast}NonLinear_type" maxOccurs="unbounded"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/choice>
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Extensions" type="{http://www.iab.net/videosuite/vast}Extensions_type" minOccurs="0"/>
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
            "adSystem",
            "adTitle",
            "description",
            "advertiser",
            "pricing",
            "survey",
            "error",
            "impression",
            "creatives",
            "extensions"
        })
        public static class InLine {

            @XmlElement(name = "AdSystem", required = true)
            protected AdSystemType adSystem;
            @XmlElement(name = "AdTitle", required = true)
            protected String adTitle;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "Advertiser")
            protected String advertiser;
            @XmlElement(name = "Pricing")
            protected VAST.Ad.InLine.Pricing pricing;
            @XmlElement(name = "Survey")
            @XmlSchemaType(name = "anyURI")
            protected String survey;
            @XmlElement(name = "Error")
            @XmlSchemaType(name = "anyURI")
            protected String error;
            @XmlElement(name = "Impression", required = true)
            protected List<ImpressionType> impression;
            @XmlElement(name = "Creatives", required = true)
            protected VAST.Ad.InLine.Creatives creatives;
            @XmlElement(name = "Extensions")
            protected ExtensionsType extensions;

            /**
             * adSystem 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link AdSystemType }
             *     
             */
            public AdSystemType getAdSystem() {
                return adSystem;
            }

            /**
             * adSystem 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link AdSystemType }
             *     
             */
            public void setAdSystem(AdSystemType value) {
                this.adSystem = value;
            }

            /**
             * adTitle 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdTitle() {
                return adTitle;
            }

            /**
             * adTitle 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdTitle(String value) {
                this.adTitle = value;
            }

            /**
             * description 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * description 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * advertiser 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdvertiser() {
                return advertiser;
            }

            /**
             * advertiser 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdvertiser(String value) {
                this.advertiser = value;
            }

            /**
             * pricing 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link VAST.Ad.InLine.Pricing }
             *     
             */
            public VAST.Ad.InLine.Pricing getPricing() {
                return pricing;
            }

            /**
             * pricing 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link VAST.Ad.InLine.Pricing }
             *     
             */
            public void setPricing(VAST.Ad.InLine.Pricing value) {
                this.pricing = value;
            }

            /**
             * survey 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSurvey() {
                return survey;
            }

            /**
             * survey 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSurvey(String value) {
                this.survey = value;
            }

            /**
             * error 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getError() {
                return error;
            }

            /**
             * error 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setError(String value) {
                this.error = value;
            }

            /**
             * Gets the value of the impression property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the impression property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImpression().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImpressionType }
             * 
             * 
             */
            public List<ImpressionType> getImpression() {
                if (impression == null) {
                    impression = new ArrayList<ImpressionType>();
                }
                return this.impression;
            }

            /**
             * creatives 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link VAST.Ad.InLine.Creatives }
             *     
             */
            public VAST.Ad.InLine.Creatives getCreatives() {
                return creatives;
            }

            /**
             * creatives 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link VAST.Ad.InLine.Creatives }
             *     
             */
            public void setCreatives(VAST.Ad.InLine.Creatives value) {
                this.creatives = value;
            }

            /**
             * extensions 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link ExtensionsType }
             *     
             */
            public ExtensionsType getExtensions() {
                return extensions;
            }

            /**
             * extensions 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link ExtensionsType }
             *     
             */
            public void setExtensions(ExtensionsType value) {
                this.extensions = value;
            }


            /**
             * <p>anonymous complex type에 대한 Java 클래스입니다.
             * 
             * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Creative" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="Linear" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Icons" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="CreativeExtensions" type="{http://www.iab.net/videosuite/vast}CreativeExtensions_type" minOccurs="0"/>
             *                             &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}time"/>
             *                             &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
             *                             &lt;element name="AdParameters" type="{http://www.iab.net/videosuite/vast}AdParameters_type" minOccurs="0"/>
             *                             &lt;element name="VideoClicks" type="{http://www.iab.net/videosuite/vast}VideoClicks_type" minOccurs="0"/>
             *                             &lt;element name="MediaFiles" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="MediaFile" maxOccurs="unbounded">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
             *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="delivery" use="required">
             *                                                 &lt;simpleType>
             *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
             *                                                     &lt;enumeration value="streaming"/>
             *                                                     &lt;enumeration value="progressive"/>
             *                                                   &lt;/restriction>
             *                                                 &lt;/simpleType>
             *                                               &lt;/attribute>
             *                                               &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                                               &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                                               &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                                               &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                                               &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                                               &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                               &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                               &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="skipoffset">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="CompanionAds" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Companion" type="{http://www.iab.net/videosuite/vast}Companion_type" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
             *                                 &lt;enumeration value="all"/>
             *                                 &lt;enumeration value="any"/>
             *                                 &lt;enumeration value="none"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="NonLinearAds" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
             *                             &lt;element name="NonLinear" type="{http://www.iab.net/videosuite/vast}NonLinear_type" maxOccurs="unbounded"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/choice>
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "creative"
            })
            public static class Creatives {

                @XmlElement(name = "Creative", required = true)
                protected List<VAST.Ad.InLine.Creatives.Creative> creative;

                /**
                 * Gets the value of the creative property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the creative property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCreative().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VAST.Ad.InLine.Creatives.Creative }
                 * 
                 * 
                 */
                public List<VAST.Ad.InLine.Creatives.Creative> getCreative() {
                    if (creative == null) {
                        creative = new ArrayList<VAST.Ad.InLine.Creatives.Creative>();
                    }
                    return this.creative;
                }


                /**
                 * <p>anonymous complex type에 대한 Java 클래스입니다.
                 * 
                 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="Linear" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Icons" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="CreativeExtensions" type="{http://www.iab.net/videosuite/vast}CreativeExtensions_type" minOccurs="0"/>
                 *                   &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}time"/>
                 *                   &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
                 *                   &lt;element name="AdParameters" type="{http://www.iab.net/videosuite/vast}AdParameters_type" minOccurs="0"/>
                 *                   &lt;element name="VideoClicks" type="{http://www.iab.net/videosuite/vast}VideoClicks_type" minOccurs="0"/>
                 *                   &lt;element name="MediaFiles" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="MediaFile" maxOccurs="unbounded">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
                 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="delivery" use="required">
                 *                                       &lt;simpleType>
                 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
                 *                                           &lt;enumeration value="streaming"/>
                 *                                           &lt;enumeration value="progressive"/>
                 *                                         &lt;/restriction>
                 *                                       &lt;/simpleType>
                 *                                     &lt;/attribute>
                 *                                     &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *                                     &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *                                     &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *                                     &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *                                     &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *                                     &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                                     &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                                     &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="skipoffset">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="CompanionAds" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Companion" type="{http://www.iab.net/videosuite/vast}Companion_type" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
                 *                       &lt;enumeration value="all"/>
                 *                       &lt;enumeration value="any"/>
                 *                       &lt;enumeration value="none"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="NonLinearAds" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
                 *                   &lt;element name="NonLinear" type="{http://www.iab.net/videosuite/vast}NonLinear_type" maxOccurs="unbounded"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/choice>
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "linear",
                    "companionAds",
                    "nonLinearAds"
                })
                public static class Creative {

                    @XmlElement(name = "Linear")
                    protected VAST.Ad.InLine.Creatives.Creative.Linear linear;
                    @XmlElement(name = "CompanionAds")
                    protected VAST.Ad.InLine.Creatives.Creative.CompanionAds companionAds;
                    @XmlElement(name = "NonLinearAds")
                    protected VAST.Ad.InLine.Creatives.Creative.NonLinearAds nonLinearAds;
                    @XmlAttribute(name = "id")
                    protected String id;
                    @XmlAttribute(name = "sequence")
                    protected BigInteger sequence;
                    @XmlAttribute(name = "AdID")
                    protected String adID;

                    /**
                     * linear 속성의 값을 가져옵니다.
                     * 
                     * @return
                     *     possible object is
                     *     {@link VAST.Ad.InLine.Creatives.Creative.Linear }
                     *     
                     */
                    public VAST.Ad.InLine.Creatives.Creative.Linear getLinear() {
                        return linear;
                    }

                    /**
                     * linear 속성의 값을 설정합니다.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VAST.Ad.InLine.Creatives.Creative.Linear }
                     *     
                     */
                    public void setLinear(VAST.Ad.InLine.Creatives.Creative.Linear value) {
                        this.linear = value;
                    }

                    /**
                     * companionAds 속성의 값을 가져옵니다.
                     * 
                     * @return
                     *     possible object is
                     *     {@link VAST.Ad.InLine.Creatives.Creative.CompanionAds }
                     *     
                     */
                    public VAST.Ad.InLine.Creatives.Creative.CompanionAds getCompanionAds() {
                        return companionAds;
                    }

                    /**
                     * companionAds 속성의 값을 설정합니다.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VAST.Ad.InLine.Creatives.Creative.CompanionAds }
                     *     
                     */
                    public void setCompanionAds(VAST.Ad.InLine.Creatives.Creative.CompanionAds value) {
                        this.companionAds = value;
                    }

                    /**
                     * nonLinearAds 속성의 값을 가져옵니다.
                     * 
                     * @return
                     *     possible object is
                     *     {@link VAST.Ad.InLine.Creatives.Creative.NonLinearAds }
                     *     
                     */
                    public VAST.Ad.InLine.Creatives.Creative.NonLinearAds getNonLinearAds() {
                        return nonLinearAds;
                    }

                    /**
                     * nonLinearAds 속성의 값을 설정합니다.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VAST.Ad.InLine.Creatives.Creative.NonLinearAds }
                     *     
                     */
                    public void setNonLinearAds(VAST.Ad.InLine.Creatives.Creative.NonLinearAds value) {
                        this.nonLinearAds = value;
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
                     * sequence 속성의 값을 가져옵니다.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getSequence() {
                        return sequence;
                    }

                    /**
                     * sequence 속성의 값을 설정합니다.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setSequence(BigInteger value) {
                        this.sequence = value;
                    }

                    /**
                     * adID 속성의 값을 가져옵니다.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAdID() {
                        return adID;
                    }

                    /**
                     * adID 속성의 값을 설정합니다.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAdID(String value) {
                        this.adID = value;
                    }


                    /**
                     * <p>anonymous complex type에 대한 Java 클래스입니다.
                     * 
                     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Companion" type="{http://www.iab.net/videosuite/vast}Companion_type" maxOccurs="unbounded" minOccurs="0"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
                     *             &lt;enumeration value="all"/>
                     *             &lt;enumeration value="any"/>
                     *             &lt;enumeration value="none"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "companion"
                    })
                    public static class CompanionAds {

                        @XmlElement(name = "Companion")
                        protected List<CompanionType> companion;
                        @XmlAttribute(name = "required")
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        protected String required;

                        /**
                         * Gets the value of the companion property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the companion property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getCompanion().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link CompanionType }
                         * 
                         * 
                         */
                        public List<CompanionType> getCompanion() {
                            if (companion == null) {
                                companion = new ArrayList<CompanionType>();
                            }
                            return this.companion;
                        }

                        /**
                         * required 속성의 값을 가져옵니다.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRequired() {
                            return required;
                        }

                        /**
                         * required 속성의 값을 설정합니다.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRequired(String value) {
                            this.required = value;
                        }

                    }


                    /**
                     * <p>anonymous complex type에 대한 Java 클래스입니다.
                     * 
                     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Icons" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="CreativeExtensions" type="{http://www.iab.net/videosuite/vast}CreativeExtensions_type" minOccurs="0"/>
                     *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}time"/>
                     *         &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
                     *         &lt;element name="AdParameters" type="{http://www.iab.net/videosuite/vast}AdParameters_type" minOccurs="0"/>
                     *         &lt;element name="VideoClicks" type="{http://www.iab.net/videosuite/vast}VideoClicks_type" minOccurs="0"/>
                     *         &lt;element name="MediaFiles" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="MediaFile" maxOccurs="unbounded">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
                     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="delivery" use="required">
                     *                             &lt;simpleType>
                     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
                     *                                 &lt;enumeration value="streaming"/>
                     *                                 &lt;enumeration value="progressive"/>
                     *                               &lt;/restriction>
                     *                             &lt;/simpleType>
                     *                           &lt;/attribute>
                     *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *                           &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *                           &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *                           &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *                           &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *                           &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                           &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                           &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="skipoffset">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "icons",
                        "creativeExtensions",
                        "duration",
                        "trackingEvents",
                        "adParameters",
                        "videoClicks",
                        "mediaFiles"
                    })
                    public static class Linear {

                        @XmlElement(name = "Icons")
                        protected VAST.Ad.InLine.Creatives.Creative.Linear.Icons icons;
                        @XmlElement(name = "CreativeExtensions")
                        protected CreativeExtensionsType creativeExtensions;
                        @XmlElement(name = "Duration", required = true)
                        @XmlSchemaType(name = "time")
                        protected XMLGregorianCalendar duration;
                        @XmlElement(name = "TrackingEvents")
                        protected TrackingEventsType trackingEvents;
                        @XmlElement(name = "AdParameters")
                        protected AdParametersType adParameters;
                        @XmlElement(name = "VideoClicks")
                        protected VideoClicksType videoClicks;
                        @XmlElement(name = "MediaFiles")
                        protected VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles mediaFiles;
                        @XmlAttribute(name = "skipoffset")
                        protected String skipoffset;

                        /**
                         * icons 속성의 값을 가져옵니다.
                         * 
                         * @return
                         *     possible object is
                         *     {@link VAST.Ad.InLine.Creatives.Creative.Linear.Icons }
                         *     
                         */
                        public VAST.Ad.InLine.Creatives.Creative.Linear.Icons getIcons() {
                            return icons;
                        }

                        /**
                         * icons 속성의 값을 설정합니다.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link VAST.Ad.InLine.Creatives.Creative.Linear.Icons }
                         *     
                         */
                        public void setIcons(VAST.Ad.InLine.Creatives.Creative.Linear.Icons value) {
                            this.icons = value;
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
                         * duration 속성의 값을 가져옵니다.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getDuration() {
                            return duration;
                        }

                        /**
                         * duration 속성의 값을 설정합니다.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setDuration(XMLGregorianCalendar value) {
                            this.duration = value;
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
                         * videoClicks 속성의 값을 가져옵니다.
                         * 
                         * @return
                         *     possible object is
                         *     {@link VideoClicksType }
                         *     
                         */
                        public VideoClicksType getVideoClicks() {
                            return videoClicks;
                        }

                        /**
                         * videoClicks 속성의 값을 설정합니다.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link VideoClicksType }
                         *     
                         */
                        public void setVideoClicks(VideoClicksType value) {
                            this.videoClicks = value;
                        }

                        /**
                         * mediaFiles 속성의 값을 가져옵니다.
                         * 
                         * @return
                         *     possible object is
                         *     {@link VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles }
                         *     
                         */
                        public VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles getMediaFiles() {
                            return mediaFiles;
                        }

                        /**
                         * mediaFiles 속성의 값을 설정합니다.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles }
                         *     
                         */
                        public void setMediaFiles(VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles value) {
                            this.mediaFiles = value;
                        }

                        /**
                         * skipoffset 속성의 값을 가져옵니다.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSkipoffset() {
                            return skipoffset;
                        }

                        /**
                         * skipoffset 속성의 값을 설정합니다.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSkipoffset(String value) {
                            this.skipoffset = value;
                        }


                        /**
                         * <p>anonymous complex type에 대한 Java 클래스입니다.
                         * 
                         * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
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
                            "icon"
                        })
                        public static class Icons {

                            @XmlElement(name = "Icon", required = true)
                            protected List<IconType> icon;

                            /**
                             * Gets the value of the icon property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the icon property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getIcon().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link IconType }
                             * 
                             * 
                             */
                            public List<IconType> getIcon() {
                                if (icon == null) {
                                    icon = new ArrayList<IconType>();
                                }
                                return this.icon;
                            }

                        }


                        /**
                         * <p>anonymous complex type에 대한 Java 클래스입니다.
                         * 
                         * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="MediaFile" maxOccurs="unbounded">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
                         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="delivery" use="required">
                         *                   &lt;simpleType>
                         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
                         *                       &lt;enumeration value="streaming"/>
                         *                       &lt;enumeration value="progressive"/>
                         *                     &lt;/restriction>
                         *                   &lt;/simpleType>
                         *                 &lt;/attribute>
                         *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                         *                 &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                         *                 &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                         *                 &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                         *                 &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                         *                 &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *                 &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *                 &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
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
                            "mediaFile"
                        })
                        public static class MediaFiles {

                            @XmlElement(name = "MediaFile", required = true)
                            protected List<VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles.MediaFile> mediaFile;

                            /**
                             * Gets the value of the mediaFile property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the mediaFile property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getMediaFile().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles.MediaFile }
                             * 
                             * 
                             */
                            public List<VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles.MediaFile> getMediaFile() {
                                if (mediaFile == null) {
                                    mediaFile = new ArrayList<VAST.Ad.InLine.Creatives.Creative.Linear.MediaFiles.MediaFile>();
                                }
                                return this.mediaFile;
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
                             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="delivery" use="required">
                             *         &lt;simpleType>
                             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
                             *             &lt;enumeration value="streaming"/>
                             *             &lt;enumeration value="progressive"/>
                             *           &lt;/restriction>
                             *         &lt;/simpleType>
                             *       &lt;/attribute>
                             *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="bitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                             *       &lt;attribute name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                             *       &lt;attribute name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                             *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                             *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                             *       &lt;attribute name="scalable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                             *       &lt;attribute name="maintainAspectRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                             *       &lt;attribute name="apiFramework" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="codec" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            public static class MediaFile {

                                @XmlValue
                                @XmlSchemaType(name = "anyURI")
                                protected String value;
                                @XmlAttribute(name = "id")
                                protected String id;
                                @XmlAttribute(name = "delivery", required = true)
                                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                                protected String delivery;
                                @XmlAttribute(name = "type", required = true)
                                protected String type;
                                @XmlAttribute(name = "bitrate")
                                protected BigInteger bitrate;
                                @XmlAttribute(name = "minBitrate")
                                protected BigInteger minBitrate;
                                @XmlAttribute(name = "maxBitrate")
                                protected BigInteger maxBitrate;
                                @XmlAttribute(name = "width", required = true)
                                protected BigInteger width;
                                @XmlAttribute(name = "height", required = true)
                                protected BigInteger height;
                                @XmlAttribute(name = "scalable")
                                protected Boolean scalable;
                                @XmlAttribute(name = "maintainAspectRatio")
                                protected Boolean maintainAspectRatio;
                                @XmlAttribute(name = "apiFramework")
                                protected String apiFramework;
                                @XmlAttribute(name = "codec")
                                protected String codec;

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
                                 * delivery 속성의 값을 가져옵니다.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getDelivery() {
                                    return delivery;
                                }

                                /**
                                 * delivery 속성의 값을 설정합니다.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setDelivery(String value) {
                                    this.delivery = value;
                                }

                                /**
                                 * type 속성의 값을 가져옵니다.
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
                                 * type 속성의 값을 설정합니다.
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
                                 * bitrate 속성의 값을 가져옵니다.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public BigInteger getBitrate() {
                                    return bitrate;
                                }

                                /**
                                 * bitrate 속성의 값을 설정합니다.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public void setBitrate(BigInteger value) {
                                    this.bitrate = value;
                                }

                                /**
                                 * minBitrate 속성의 값을 가져옵니다.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public BigInteger getMinBitrate() {
                                    return minBitrate;
                                }

                                /**
                                 * minBitrate 속성의 값을 설정합니다.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public void setMinBitrate(BigInteger value) {
                                    this.minBitrate = value;
                                }

                                /**
                                 * maxBitrate 속성의 값을 가져옵니다.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public BigInteger getMaxBitrate() {
                                    return maxBitrate;
                                }

                                /**
                                 * maxBitrate 속성의 값을 설정합니다.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public void setMaxBitrate(BigInteger value) {
                                    this.maxBitrate = value;
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
                                 * scalable 속성의 값을 가져옵니다.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public Boolean isScalable() {
                                    return scalable;
                                }

                                /**
                                 * scalable 속성의 값을 설정합니다.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public void setScalable(Boolean value) {
                                    this.scalable = value;
                                }

                                /**
                                 * maintainAspectRatio 속성의 값을 가져옵니다.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public Boolean isMaintainAspectRatio() {
                                    return maintainAspectRatio;
                                }

                                /**
                                 * maintainAspectRatio 속성의 값을 설정합니다.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public void setMaintainAspectRatio(Boolean value) {
                                    this.maintainAspectRatio = value;
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
                                 * codec 속성의 값을 가져옵니다.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCodec() {
                                    return codec;
                                }

                                /**
                                 * codec 속성의 값을 설정합니다.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCodec(String value) {
                                    this.codec = value;
                                }

                            }

                        }

                    }


                    /**
                     * <p>anonymous complex type에 대한 Java 클래스입니다.
                     * 
                     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
                     *         &lt;element name="NonLinear" type="{http://www.iab.net/videosuite/vast}NonLinear_type" maxOccurs="unbounded"/>
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
                        "trackingEvents",
                        "nonLinear"
                    })
                    public static class NonLinearAds {

                        @XmlElement(name = "TrackingEvents")
                        protected TrackingEventsType trackingEvents;
                        @XmlElement(name = "NonLinear", required = true)
                        protected List<NonLinearType> nonLinear;

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
                         * Gets the value of the nonLinear property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the nonLinear property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getNonLinear().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link NonLinearType }
                         * 
                         * 
                         */
                        public List<NonLinearType> getNonLinear() {
                            if (nonLinear == null) {
                                nonLinear = new ArrayList<NonLinearType>();
                            }
                            return this.nonLinear;
                        }

                    }

                }

            }


            /**
             * <p>anonymous complex type에 대한 Java 클래스입니다.
             * 
             * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *       &lt;attribute name="model" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
             *             &lt;enumeration value="cpc"/>
             *             &lt;enumeration value="cpm"/>
             *             &lt;enumeration value="cpe"/>
             *             &lt;enumeration value="cpv"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="currency" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;pattern value="[a-zA-Z]{3}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
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
            public static class Pricing {

                @XmlValue
                protected BigDecimal value;
                @XmlAttribute(name = "model", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String model;
                @XmlAttribute(name = "currency", required = true)
                protected String currency;

                /**
                 * value 속성의 값을 가져옵니다.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValue() {
                    return value;
                }

                /**
                 * value 속성의 값을 설정합니다.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValue(BigDecimal value) {
                    this.value = value;
                }

                /**
                 * model 속성의 값을 가져옵니다.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getModel() {
                    return model;
                }

                /**
                 * model 속성의 값을 설정합니다.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setModel(String value) {
                    this.model = value;
                }

                /**
                 * currency 속성의 값을 가져옵니다.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrency() {
                    return currency;
                }

                /**
                 * currency 속성의 값을 설정합니다.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrency(String value) {
                    this.currency = value;
                }

            }

        }


        /**
         * <p>anonymous complex type에 대한 Java 클래스입니다.
         * 
         * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AdSystem" type="{http://www.iab.net/videosuite/vast}AdSystem_type"/>
         *         &lt;element name="VASTAdTagURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
         *         &lt;element name="Impression" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
         *         &lt;element name="Creatives">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Creative" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="Linear" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="CreativeExtensions" type="{http://www.iab.net/videosuite/vast}CreativeExtensions_type" minOccurs="0"/>
         *                                       &lt;element name="Icons" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
         *                                       &lt;element name="VideoClicks" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
         *                                                         &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
         *                                                         &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
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
         *                             &lt;element name="CompanionAds" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Companion" type="{http://www.iab.net/videosuite/vast}CompanionWrapper_type" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="NonLinearAds" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
         *                                       &lt;element name="NonLinear" type="{http://www.iab.net/videosuite/vast}NonLinearWrapper_type" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/choice>
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Extensions" type="{http://www.iab.net/videosuite/vast}Extensions_type" minOccurs="0"/>
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
            "adSystem",
            "vastAdTagURI",
            "error",
            "impression",
            "creatives",
            "extensions"
        })
        public static class Wrapper {

            @XmlElement(name = "AdSystem", required = true)
            protected AdSystemType adSystem;
            @XmlElement(name = "VASTAdTagURI", required = true)
            @XmlSchemaType(name = "anyURI")
            protected String vastAdTagURI;
            @XmlElement(name = "Error")
            @XmlSchemaType(name = "anyURI")
            protected String error;
            @XmlElement(name = "Impression", required = true)
            @XmlSchemaType(name = "anyURI")
            protected List<String> impression;
            @XmlElement(name = "Creatives", required = true)
            protected VAST.Ad.Wrapper.Creatives creatives;
            @XmlElement(name = "Extensions")
            protected ExtensionsType extensions;

            /**
             * adSystem 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link AdSystemType }
             *     
             */
            public AdSystemType getAdSystem() {
                return adSystem;
            }

            /**
             * adSystem 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link AdSystemType }
             *     
             */
            public void setAdSystem(AdSystemType value) {
                this.adSystem = value;
            }

            /**
             * vastAdTagURI 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVASTAdTagURI() {
                return vastAdTagURI;
            }

            /**
             * vastAdTagURI 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVASTAdTagURI(String value) {
                this.vastAdTagURI = value;
            }

            /**
             * error 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getError() {
                return error;
            }

            /**
             * error 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setError(String value) {
                this.error = value;
            }

            /**
             * Gets the value of the impression property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the impression property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImpression().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getImpression() {
                if (impression == null) {
                    impression = new ArrayList<String>();
                }
                return this.impression;
            }

            /**
             * creatives 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link VAST.Ad.Wrapper.Creatives }
             *     
             */
            public VAST.Ad.Wrapper.Creatives getCreatives() {
                return creatives;
            }

            /**
             * creatives 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link VAST.Ad.Wrapper.Creatives }
             *     
             */
            public void setCreatives(VAST.Ad.Wrapper.Creatives value) {
                this.creatives = value;
            }

            /**
             * extensions 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link ExtensionsType }
             *     
             */
            public ExtensionsType getExtensions() {
                return extensions;
            }

            /**
             * extensions 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link ExtensionsType }
             *     
             */
            public void setExtensions(ExtensionsType value) {
                this.extensions = value;
            }


            /**
             * <p>anonymous complex type에 대한 Java 클래스입니다.
             * 
             * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Creative" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="Linear" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="CreativeExtensions" type="{http://www.iab.net/videosuite/vast}CreativeExtensions_type" minOccurs="0"/>
             *                             &lt;element name="Icons" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
             *                             &lt;element name="VideoClicks" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
             *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
             *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
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
             *                   &lt;element name="CompanionAds" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Companion" type="{http://www.iab.net/videosuite/vast}CompanionWrapper_type" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="NonLinearAds" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
             *                             &lt;element name="NonLinear" type="{http://www.iab.net/videosuite/vast}NonLinearWrapper_type" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/choice>
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "creative"
            })
            public static class Creatives {

                @XmlElement(name = "Creative")
                protected List<VAST.Ad.Wrapper.Creatives.Creative> creative;

                /**
                 * Gets the value of the creative property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the creative property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCreative().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VAST.Ad.Wrapper.Creatives.Creative }
                 * 
                 * 
                 */
                public List<VAST.Ad.Wrapper.Creatives.Creative> getCreative() {
                    if (creative == null) {
                        creative = new ArrayList<VAST.Ad.Wrapper.Creatives.Creative>();
                    }
                    return this.creative;
                }


                /**
                 * <p>anonymous complex type에 대한 Java 클래스입니다.
                 * 
                 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="Linear" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="CreativeExtensions" type="{http://www.iab.net/videosuite/vast}CreativeExtensions_type" minOccurs="0"/>
                 *                   &lt;element name="Icons" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
                 *                   &lt;element name="VideoClicks" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
                 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
                 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
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
                 *         &lt;element name="CompanionAds" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Companion" type="{http://www.iab.net/videosuite/vast}CompanionWrapper_type" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="NonLinearAds" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
                 *                   &lt;element name="NonLinear" type="{http://www.iab.net/videosuite/vast}NonLinearWrapper_type" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/choice>
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="AdID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "linear",
                    "companionAds",
                    "nonLinearAds"
                })
                public static class Creative {

                    @XmlElement(name = "Linear")
                    protected VAST.Ad.Wrapper.Creatives.Creative.Linear linear;
                    @XmlElement(name = "CompanionAds")
                    protected VAST.Ad.Wrapper.Creatives.Creative.CompanionAds companionAds;
                    @XmlElement(name = "NonLinearAds")
                    protected VAST.Ad.Wrapper.Creatives.Creative.NonLinearAds nonLinearAds;
                    @XmlAttribute(name = "id")
                    protected String id;
                    @XmlAttribute(name = "sequence")
                    protected BigInteger sequence;
                    @XmlAttribute(name = "AdID")
                    protected String adID;

                    /**
                     * linear 속성의 값을 가져옵니다.
                     * 
                     * @return
                     *     possible object is
                     *     {@link VAST.Ad.Wrapper.Creatives.Creative.Linear }
                     *     
                     */
                    public VAST.Ad.Wrapper.Creatives.Creative.Linear getLinear() {
                        return linear;
                    }

                    /**
                     * linear 속성의 값을 설정합니다.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VAST.Ad.Wrapper.Creatives.Creative.Linear }
                     *     
                     */
                    public void setLinear(VAST.Ad.Wrapper.Creatives.Creative.Linear value) {
                        this.linear = value;
                    }

                    /**
                     * companionAds 속성의 값을 가져옵니다.
                     * 
                     * @return
                     *     possible object is
                     *     {@link VAST.Ad.Wrapper.Creatives.Creative.CompanionAds }
                     *     
                     */
                    public VAST.Ad.Wrapper.Creatives.Creative.CompanionAds getCompanionAds() {
                        return companionAds;
                    }

                    /**
                     * companionAds 속성의 값을 설정합니다.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VAST.Ad.Wrapper.Creatives.Creative.CompanionAds }
                     *     
                     */
                    public void setCompanionAds(VAST.Ad.Wrapper.Creatives.Creative.CompanionAds value) {
                        this.companionAds = value;
                    }

                    /**
                     * nonLinearAds 속성의 값을 가져옵니다.
                     * 
                     * @return
                     *     possible object is
                     *     {@link VAST.Ad.Wrapper.Creatives.Creative.NonLinearAds }
                     *     
                     */
                    public VAST.Ad.Wrapper.Creatives.Creative.NonLinearAds getNonLinearAds() {
                        return nonLinearAds;
                    }

                    /**
                     * nonLinearAds 속성의 값을 설정합니다.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VAST.Ad.Wrapper.Creatives.Creative.NonLinearAds }
                     *     
                     */
                    public void setNonLinearAds(VAST.Ad.Wrapper.Creatives.Creative.NonLinearAds value) {
                        this.nonLinearAds = value;
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
                     * sequence 속성의 값을 가져옵니다.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getSequence() {
                        return sequence;
                    }

                    /**
                     * sequence 속성의 값을 설정합니다.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setSequence(BigInteger value) {
                        this.sequence = value;
                    }

                    /**
                     * adID 속성의 값을 가져옵니다.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAdID() {
                        return adID;
                    }

                    /**
                     * adID 속성의 값을 설정합니다.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAdID(String value) {
                        this.adID = value;
                    }


                    /**
                     * <p>anonymous complex type에 대한 Java 클래스입니다.
                     * 
                     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Companion" type="{http://www.iab.net/videosuite/vast}CompanionWrapper_type" maxOccurs="unbounded" minOccurs="0"/>
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
                        "companion"
                    })
                    public static class CompanionAds {

                        @XmlElement(name = "Companion")
                        protected List<CompanionWrapperType> companion;

                        /**
                         * Gets the value of the companion property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the companion property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getCompanion().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link CompanionWrapperType }
                         * 
                         * 
                         */
                        public List<CompanionWrapperType> getCompanion() {
                            if (companion == null) {
                                companion = new ArrayList<CompanionWrapperType>();
                            }
                            return this.companion;
                        }

                    }


                    /**
                     * <p>anonymous complex type에 대한 Java 클래스입니다.
                     * 
                     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="CreativeExtensions" type="{http://www.iab.net/videosuite/vast}CreativeExtensions_type" minOccurs="0"/>
                     *         &lt;element name="Icons" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
                     *         &lt;element name="VideoClicks" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
                     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
                     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
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
                        "creativeExtensions",
                        "icons",
                        "trackingEvents",
                        "videoClicks"
                    })
                    public static class Linear {

                        @XmlElement(name = "CreativeExtensions")
                        protected CreativeExtensionsType creativeExtensions;
                        @XmlElement(name = "Icons")
                        protected VAST.Ad.Wrapper.Creatives.Creative.Linear.Icons icons;
                        @XmlElement(name = "TrackingEvents")
                        protected TrackingEventsType trackingEvents;
                        @XmlElement(name = "VideoClicks")
                        protected VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks videoClicks;

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
                         * icons 속성의 값을 가져옵니다.
                         * 
                         * @return
                         *     possible object is
                         *     {@link VAST.Ad.Wrapper.Creatives.Creative.Linear.Icons }
                         *     
                         */
                        public VAST.Ad.Wrapper.Creatives.Creative.Linear.Icons getIcons() {
                            return icons;
                        }

                        /**
                         * icons 속성의 값을 설정합니다.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link VAST.Ad.Wrapper.Creatives.Creative.Linear.Icons }
                         *     
                         */
                        public void setIcons(VAST.Ad.Wrapper.Creatives.Creative.Linear.Icons value) {
                            this.icons = value;
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
                         * videoClicks 속성의 값을 가져옵니다.
                         * 
                         * @return
                         *     possible object is
                         *     {@link VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks }
                         *     
                         */
                        public VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks getVideoClicks() {
                            return videoClicks;
                        }

                        /**
                         * videoClicks 속성의 값을 설정합니다.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks }
                         *     
                         */
                        public void setVideoClicks(VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks value) {
                            this.videoClicks = value;
                        }


                        /**
                         * <p>anonymous complex type에 대한 Java 클래스입니다.
                         * 
                         * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Icon" type="{http://www.iab.net/videosuite/vast}Icon_type" maxOccurs="unbounded"/>
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
                            "icon"
                        })
                        public static class Icons {

                            @XmlElement(name = "Icon", required = true)
                            protected List<IconType> icon;

                            /**
                             * Gets the value of the icon property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the icon property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getIcon().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link IconType }
                             * 
                             * 
                             */
                            public List<IconType> getIcon() {
                                if (icon == null) {
                                    icon = new ArrayList<IconType>();
                                }
                                return this.icon;
                            }

                        }


                        /**
                         * <p>anonymous complex type에 대한 Java 클래스입니다.
                         * 
                         * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="ClickTracking" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
                         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="CustomClick" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
                         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
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
                            "clickTracking",
                            "customClick"
                        })
                        public static class VideoClicks {

                            @XmlElement(name = "ClickTracking")
                            protected List<VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.ClickTracking> clickTracking;
                            @XmlElement(name = "CustomClick")
                            protected List<VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.CustomClick> customClick;

                            /**
                             * Gets the value of the clickTracking property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the clickTracking property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getClickTracking().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.ClickTracking }
                             * 
                             * 
                             */
                            public List<VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.ClickTracking> getClickTracking() {
                                if (clickTracking == null) {
                                    clickTracking = new ArrayList<VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.ClickTracking>();
                                }
                                return this.clickTracking;
                            }

                            /**
                             * Gets the value of the customClick property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the customClick property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getCustomClick().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.CustomClick }
                             * 
                             * 
                             */
                            public List<VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.CustomClick> getCustomClick() {
                                if (customClick == null) {
                                    customClick = new ArrayList<VAST.Ad.Wrapper.Creatives.Creative.Linear.VideoClicks.CustomClick>();
                                }
                                return this.customClick;
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
                             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            public static class ClickTracking {

                                @XmlValue
                                @XmlSchemaType(name = "anyURI")
                                protected String value;
                                @XmlAttribute(name = "id")
                                protected String id;

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
                             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            public static class CustomClick {

                                @XmlValue
                                @XmlSchemaType(name = "anyURI")
                                protected String value;
                                @XmlAttribute(name = "id")
                                protected String id;

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

                            }

                        }

                    }


                    /**
                     * <p>anonymous complex type에 대한 Java 클래스입니다.
                     * 
                     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vast}TrackingEvents_type" minOccurs="0"/>
                     *         &lt;element name="NonLinear" type="{http://www.iab.net/videosuite/vast}NonLinearWrapper_type" maxOccurs="unbounded" minOccurs="0"/>
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
                        "trackingEvents",
                        "nonLinear"
                    })
                    public static class NonLinearAds {

                        @XmlElement(name = "TrackingEvents")
                        protected TrackingEventsType trackingEvents;
                        @XmlElement(name = "NonLinear")
                        protected List<NonLinearWrapperType> nonLinear;

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
                         * Gets the value of the nonLinear property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the nonLinear property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getNonLinear().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link NonLinearWrapperType }
                         * 
                         * 
                         */
                        public List<NonLinearWrapperType> getNonLinear() {
                            if (nonLinear == null) {
                                nonLinear = new ArrayList<NonLinearWrapperType>();
                            }
                            return this.nonLinear;
                        }

                    }

                }

            }

        }

    }

}
