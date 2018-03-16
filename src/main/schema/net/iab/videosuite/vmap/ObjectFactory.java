//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.7-b41 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2018.03.16 시간 01:23:28 PM KST 
//


package net.iab.videosuite.vmap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.iab.videosuite.vmap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.iab.videosuite.vmap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VMAP }
     * 
     */
    public VMAP createVMAP() {
        return new VMAP();
    }

    /**
     * Create an instance of {@link ExtensionsType }
     * 
     */
    public ExtensionsType createExtensionsType() {
        return new ExtensionsType();
    }

    /**
     * Create an instance of {@link TrackingEventsType }
     * 
     */
    public TrackingEventsType createTrackingEventsType() {
        return new TrackingEventsType();
    }

    /**
     * Create an instance of {@link VMAP.AdBreak }
     * 
     */
    public VMAP.AdBreak createVMAPAdBreak() {
        return new VMAP.AdBreak();
    }

    /**
     * Create an instance of {@link AdTagURIType }
     * 
     */
    public AdTagURIType createAdTagURIType() {
        return new AdTagURIType();
    }

    /**
     * Create an instance of {@link CustomAdDataType }
     * 
     */
    public CustomAdDataType createCustomAdDataType() {
        return new CustomAdDataType();
    }

    /**
     * Create an instance of {@link VASTAdDataType }
     * 
     */
    public VASTAdDataType createVASTAdDataType() {
        return new VASTAdDataType();
    }

    /**
     * Create an instance of {@link ExtensionsType.Extension }
     * 
     */
    public ExtensionsType.Extension createExtensionsTypeExtension() {
        return new ExtensionsType.Extension();
    }

    /**
     * Create an instance of {@link TrackingEventsType.Tracking }
     * 
     */
    public TrackingEventsType.Tracking createTrackingEventsTypeTracking() {
        return new TrackingEventsType.Tracking();
    }

    /**
     * Create an instance of {@link VMAP.AdBreak.AdSource }
     * 
     */
    public VMAP.AdBreak.AdSource createVMAPAdBreakAdSource() {
        return new VMAP.AdBreak.AdSource();
    }

}
