//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.7-b41 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2018.03.16 시간 01:23:28 PM KST 
//


package net.iab.videosuite.vast;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>TrackingEvents_type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TrackingEvents_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tracking" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *                 &lt;attribute name="event" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="creativeView"/>
 *                       &lt;enumeration value="start"/>
 *                       &lt;enumeration value="firstQuartile"/>
 *                       &lt;enumeration value="midpoint"/>
 *                       &lt;enumeration value="thirdQuartile"/>
 *                       &lt;enumeration value="complete"/>
 *                       &lt;enumeration value="mute"/>
 *                       &lt;enumeration value="unmute"/>
 *                       &lt;enumeration value="pause"/>
 *                       &lt;enumeration value="rewind"/>
 *                       &lt;enumeration value="resume"/>
 *                       &lt;enumeration value="fullscreen"/>
 *                       &lt;enumeration value="exitFullscreen"/>
 *                       &lt;enumeration value="expand"/>
 *                       &lt;enumeration value="collapse"/>
 *                       &lt;enumeration value="acceptInvitation"/>
 *                       &lt;enumeration value="close"/>
 *                       &lt;enumeration value="skip"/>
 *                       &lt;enumeration value="progress"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="offset">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "TrackingEvents_type", propOrder = {
    "tracking"
})
public class TrackingEventsType {

    @XmlElement(name = "Tracking")
    protected List<TrackingEventsType.Tracking> tracking;

    /**
     * Gets the value of the tracking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tracking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingEventsType.Tracking }
     * 
     * 
     */
    public List<TrackingEventsType.Tracking> getTracking() {
        if (tracking == null) {
            tracking = new ArrayList<TrackingEventsType.Tracking>();
        }
        return this.tracking;
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
     *       &lt;attribute name="event" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="creativeView"/>
     *             &lt;enumeration value="start"/>
     *             &lt;enumeration value="firstQuartile"/>
     *             &lt;enumeration value="midpoint"/>
     *             &lt;enumeration value="thirdQuartile"/>
     *             &lt;enumeration value="complete"/>
     *             &lt;enumeration value="mute"/>
     *             &lt;enumeration value="unmute"/>
     *             &lt;enumeration value="pause"/>
     *             &lt;enumeration value="rewind"/>
     *             &lt;enumeration value="resume"/>
     *             &lt;enumeration value="fullscreen"/>
     *             &lt;enumeration value="exitFullscreen"/>
     *             &lt;enumeration value="expand"/>
     *             &lt;enumeration value="collapse"/>
     *             &lt;enumeration value="acceptInvitation"/>
     *             &lt;enumeration value="close"/>
     *             &lt;enumeration value="skip"/>
     *             &lt;enumeration value="progress"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="offset">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="(\d{2}:[0-5]\d:[0-5]\d(\.\d\d\d)?|1?\d?\d(\.?\d)*%)"/>
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
    public static class Tracking {

        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected String value;
        @XmlAttribute(name = "event", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String event;
        @XmlAttribute(name = "offset")
        protected String offset;

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
         * event 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEvent() {
            return event;
        }

        /**
         * event 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEvent(String value) {
            this.event = value;
        }

        /**
         * offset 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffset() {
            return offset;
        }

        /**
         * offset 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffset(String value) {
            this.offset = value;
        }

    }

}
