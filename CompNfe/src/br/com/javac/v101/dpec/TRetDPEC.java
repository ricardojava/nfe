
package br.com.javac.v101.dpec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Tipo Retorno da Declaração Prévia de Emissão em Contignência - DPEC
 * 
 * <p>Java class for TRetDPEC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRetDPEC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infDPECReg">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
 *                   &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/nfe}TVerAplic"/>
 *                   &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/nfe}TStat"/>
 *                   &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/nfe}TMotivo"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;sequence>
 *                       &lt;element name="dhRegDPEC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                       &lt;element name="nRegDPEC" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                       &lt;element name="envDPEC" type="{http://www.portalfiscal.inf.br/nfe}TDPEC"/>
 *                     &lt;/sequence>
 *                     &lt;sequence>
 *                       &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
 *                     &lt;/sequence>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *                       &lt;pattern value="RETDPEC[0-9]{14}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerDPEC" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRetDPEC", namespace = "http://www.portalfiscal.inf.br/nfe", propOrder = {
    "infDPECReg",
    "signature"
})
public class TRetDPEC {

    @XmlElement(required = true)
    protected TRetDPEC.InfDPECReg infDPECReg;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(required = true)
    protected String versao;

    /**
     * Gets the value of the infDPECReg property.
     * 
     * @return
     *     possible object is
     *     {@link TRetDPEC.InfDPECReg }
     *     
     */
    public TRetDPEC.InfDPECReg getInfDPECReg() {
        return infDPECReg;
    }

    /**
     * Sets the value of the infDPECReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetDPEC.InfDPECReg }
     *     
     */
    public void setInfDPECReg(TRetDPEC.InfDPECReg value) {
        this.infDPECReg = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the versao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
     *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/nfe}TVerAplic"/>
     *         &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/nfe}TStat"/>
     *         &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/nfe}TMotivo"/>
     *         &lt;choice minOccurs="0">
     *           &lt;sequence>
     *             &lt;element name="dhRegDPEC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *             &lt;element name="nRegDPEC" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *             &lt;element name="envDPEC" type="{http://www.portalfiscal.inf.br/nfe}TDPEC"/>
     *           &lt;/sequence>
     *           &lt;sequence>
     *             &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
     *           &lt;/sequence>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
     *             &lt;pattern value="RETDPEC[0-9]{14}"/>
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
        "tpAmb",
        "verAplic",
        "cStat",
        "xMotivo",
        "dhRegDPEC",
        "nRegDPEC",
        "envDPEC",
        "chNFe"
    })
    public static class InfDPECReg {

        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
        protected String tpAmb;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
        protected String verAplic;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
        protected String cStat;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
        protected String xMotivo;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dhRegDPEC;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        protected Object nRegDPEC;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        protected TDPEC envDPEC;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        protected String chNFe;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the tpAmb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpAmb() {
            return tpAmb;
        }

        /**
         * Sets the value of the tpAmb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpAmb(String value) {
            this.tpAmb = value;
        }

        /**
         * Gets the value of the verAplic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerAplic() {
            return verAplic;
        }

        /**
         * Sets the value of the verAplic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerAplic(String value) {
            this.verAplic = value;
        }

        /**
         * Gets the value of the cStat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCStat() {
            return cStat;
        }

        /**
         * Sets the value of the cStat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCStat(String value) {
            this.cStat = value;
        }

        /**
         * Gets the value of the xMotivo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXMotivo() {
            return xMotivo;
        }

        /**
         * Sets the value of the xMotivo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXMotivo(String value) {
            this.xMotivo = value;
        }

        /**
         * Gets the value of the dhRegDPEC property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDhRegDPEC() {
            return dhRegDPEC;
        }

        /**
         * Sets the value of the dhRegDPEC property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDhRegDPEC(XMLGregorianCalendar value) {
            this.dhRegDPEC = value;
        }

        /**
         * Gets the value of the nRegDPEC property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getNRegDPEC() {
            return nRegDPEC;
        }

        /**
         * Sets the value of the nRegDPEC property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setNRegDPEC(Object value) {
            this.nRegDPEC = value;
        }

        /**
         * Gets the value of the envDPEC property.
         * 
         * @return
         *     possible object is
         *     {@link TDPEC }
         *     
         */
        public TDPEC getEnvDPEC() {
            return envDPEC;
        }

        /**
         * Sets the value of the envDPEC property.
         * 
         * @param value
         *     allowed object is
         *     {@link TDPEC }
         *     
         */
        public void setEnvDPEC(TDPEC value) {
            this.envDPEC = value;
        }

        /**
         * Gets the value of the chNFe property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChNFe() {
            return chNFe;
        }

        /**
         * Sets the value of the chNFe property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChNFe(String value) {
            this.chNFe = value;
        }

        /**
         * Gets the value of the id property.
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
         * Sets the value of the id property.
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
