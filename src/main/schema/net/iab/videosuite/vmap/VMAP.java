//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.7-b41 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2018.03.16 시간 01:23:28 PM KST 
//


package net.iab.videosuite.vmap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="AdBreak" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdSource" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="VASTAdData" type="{http://www.iab.net/videosuite/vmap}VASTAdData_type" minOccurs="0"/>
 *                             &lt;element name="CustomAdData" type="{http://www.iab.net/videosuite/vmap}CustomAdData_type" minOccurs="0"/>
 *                             &lt;element name="AdTagURI" type="{http://www.iab.net/videosuite/vmap}AdTagURI_type" minOccurs="0"/>
 *                           &lt;/choice>
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="allowMultipleAds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="followRedirects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vmap}TrackingEvents_type" minOccurs="0"/>
 *                   &lt;element name="Extensions" type="{http://www.iab.net/videosuite/vmap}Extensions_type" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="timeOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="breakType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="breakId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="repeatAfter" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "adBreak"
})
@XmlRootElement(name = "VMAP")
public class VMAP {

    @XmlElement(name = "AdBreak")
    protected List<VMAP.AdBreak> adBreak;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the adBreak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adBreak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdBreak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VMAP.AdBreak }
     * 
     * 
     */
    public List<VMAP.AdBreak> getAdBreak() {
        if (adBreak == null) {
            adBreak = new ArrayList<VMAP.AdBreak>();
        }
        return this.adBreak;
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
     *       &lt;sequence>
     *         &lt;element name="AdSource" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="VASTAdData" type="{http://www.iab.net/videosuite/vmap}VASTAdData_type" minOccurs="0"/>
     *                   &lt;element name="CustomAdData" type="{http://www.iab.net/videosuite/vmap}CustomAdData_type" minOccurs="0"/>
     *                   &lt;element name="AdTagURI" type="{http://www.iab.net/videosuite/vmap}AdTagURI_type" minOccurs="0"/>
     *                 &lt;/choice>
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="allowMultipleAds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="followRedirects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TrackingEvents" type="{http://www.iab.net/videosuite/vmap}TrackingEvents_type" minOccurs="0"/>
     *         &lt;element name="Extensions" type="{http://www.iab.net/videosuite/vmap}Extensions_type" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="timeOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="breakType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="breakId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="repeatAfter" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "adSource",
        "trackingEvents",
        "extensions"
    })
    public static class AdBreak {

        @XmlElement(name = "AdSource")
        protected VMAP.AdBreak.AdSource adSource;
        @XmlElement(name = "TrackingEvents")
        protected TrackingEventsType trackingEvents;
        @XmlElement(name = "Extensions")
        protected ExtensionsType extensions;
        @XmlAttribute(name = "timeOffset", required = true)
        protected String timeOffset;
        @XmlAttribute(name = "breakType", required = true)
        protected String breakType;
        @XmlAttribute(name = "breakId")
        protected String breakId;
        @XmlAttribute(name = "repeatAfter")
        protected String repeatAfter;

        /**
         * adSource 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link VMAP.AdBreak.AdSource }
         *     
         */
        public VMAP.AdBreak.AdSource getAdSource() {
            return adSource;
        }

        /**
         * adSource 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link VMAP.AdBreak.AdSource }
         *     
         */
        public void setAdSource(VMAP.AdBreak.AdSource value) {
            this.adSource = value;
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
         * timeOffset 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeOffset() {
            return timeOffset;
        }

        /**
         * timeOffset 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeOffset(String value) {
            this.timeOffset = value;
        }

        /**
         * breakType 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBreakType() {
            return breakType;
        }

        /**
         * breakType 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBreakType(String value) {
            this.breakType = value;
        }

        /**
         * breakId 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBreakId() {
            return breakId;
        }

        /**
         * breakId 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBreakId(String value) {
            this.breakId = value;
        }

        /**
         * repeatAfter 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRepeatAfter() {
            return repeatAfter;
        }

        /**
         * repeatAfter 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRepeatAfter(String value) {
            this.repeatAfter = value;
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
         *         &lt;element name="VASTAdData" type="{http://www.iab.net/videosuite/vmap}VASTAdData_type" minOccurs="0"/>
         *         &lt;element name="CustomAdData" type="{http://www.iab.net/videosuite/vmap}CustomAdData_type" minOccurs="0"/>
         *         &lt;element name="AdTagURI" type="{http://www.iab.net/videosuite/vmap}AdTagURI_type" minOccurs="0"/>
         *       &lt;/choice>
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="allowMultipleAds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="followRedirects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vastAdData",
            "customAdData",
            "adTagURI"
        })
        public static class AdSource {

            @XmlElement(name = "VASTAdData")
            protected VASTAdDataType vastAdData;
            @XmlElement(name = "CustomAdData")
            protected CustomAdDataType customAdData;
            @XmlElement(name = "AdTagURI")
            protected AdTagURIType adTagURI;
            @XmlAttribute(name = "id")
            protected BigInteger id;
            @XmlAttribute(name = "allowMultipleAds")
            protected Boolean allowMultipleAds;
            @XmlAttribute(name = "followRedirects")
            protected Boolean followRedirects;

            /**
             * vastAdData 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link VASTAdDataType }
             *     
             */
            public VASTAdDataType getVASTAdData() {
                return vastAdData;
            }

            /**
             * vastAdData 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link VASTAdDataType }
             *     
             */
            public void setVASTAdData(VASTAdDataType value) {
                this.vastAdData = value;
            }

            /**
             * customAdData 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link CustomAdDataType }
             *     
             */
            public CustomAdDataType getCustomAdData() {
                return customAdData;
            }

            /**
             * customAdData 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link CustomAdDataType }
             *     
             */
            public void setCustomAdData(CustomAdDataType value) {
                this.customAdData = value;
            }

            /**
             * adTagURI 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link AdTagURIType }
             *     
             */
            public AdTagURIType getAdTagURI() {
                return adTagURI;
            }

            /**
             * adTagURI 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link AdTagURIType }
             *     
             */
            public void setAdTagURI(AdTagURIType value) {
                this.adTagURI = value;
            }

            /**
             * id 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getId() {
                return id;
            }

            /**
             * id 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setId(BigInteger value) {
                this.id = value;
            }

            /**
             * allowMultipleAds 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAllowMultipleAds() {
                return allowMultipleAds;
            }

            /**
             * allowMultipleAds 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAllowMultipleAds(Boolean value) {
                this.allowMultipleAds = value;
            }

            /**
             * followRedirects 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFollowRedirects() {
                return followRedirects;
            }

            /**
             * followRedirects 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFollowRedirects(Boolean value) {
                this.followRedirects = value;
            }

        }

    }

}
