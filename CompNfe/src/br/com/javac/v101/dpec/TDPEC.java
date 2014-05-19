
package br.com.javac.v101.dpec;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Tipo Declaração Prévia de Emissão em Contingência - DPEC
 * 
 * <p>Java class for TDPEC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDPEC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infDPEC">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideDec">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
 *                             &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
 *                             &lt;element name="verProc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
 *                             &lt;element name="IE" type="{http://www.portalfiscal.inf.br/nfe}TIe"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="resNFe" maxOccurs="50">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
 *                             &lt;choice>
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/>
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
 *                             &lt;/choice>
 *                             &lt;element name="UF" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
 *                             &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                             &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                             &lt;element name="vST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *                       &lt;pattern value="DPEC[0-9]{14}"/>
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
@XmlType(name = "TDPEC", namespace = "http://www.portalfiscal.inf.br/nfe", propOrder = {
    "infDPEC",
    "signature"
})
public class TDPEC {

    @XmlElement(required = true)
    protected TDPEC.InfDPEC infDPEC;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(required = true)
    protected String versao;

    /**
     * Gets the value of the infDPEC property.
     * 
     * @return
     *     possible object is
     *     {@link TDPEC.InfDPEC }
     *     
     */
    public TDPEC.InfDPEC getInfDPEC() {
        return infDPEC;
    }

    /**
     * Sets the value of the infDPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDPEC.InfDPEC }
     *     
     */
    public void setInfDPEC(TDPEC.InfDPEC value) {
        this.infDPEC = value;
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
     *         &lt;element name="ideDec">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
     *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
     *                   &lt;element name="verProc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
     *                   &lt;element name="IE" type="{http://www.portalfiscal.inf.br/nfe}TIe"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="resNFe" maxOccurs="50">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
     *                   &lt;choice>
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/>
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
     *                   &lt;/choice>
     *                   &lt;element name="UF" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
     *                   &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
     *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
     *                   &lt;element name="vST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
     *             &lt;pattern value="DPEC[0-9]{14}"/>
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
        "ideDec",
        "resNFe"
    })
    public static class InfDPEC {

        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
        protected TDPEC.InfDPEC.IdeDec ideDec;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
        protected List<TDPEC.InfDPEC.ResNFe> resNFe;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ideDec property.
         * 
         * @return
         *     possible object is
         *     {@link TDPEC.InfDPEC.IdeDec }
         *     
         */
        public TDPEC.InfDPEC.IdeDec getIdeDec() {
            return ideDec;
        }

        /**
         * Sets the value of the ideDec property.
         * 
         * @param value
         *     allowed object is
         *     {@link TDPEC.InfDPEC.IdeDec }
         *     
         */
        public void setIdeDec(TDPEC.InfDPEC.IdeDec value) {
            this.ideDec = value;
        }

        /**
         * Gets the value of the resNFe property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resNFe property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResNFe().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TDPEC.InfDPEC.ResNFe }
         * 
         * 
         */
        public List<TDPEC.InfDPEC.ResNFe> getResNFe() {
            if (resNFe == null) {
                resNFe = new ArrayList<TDPEC.InfDPEC.ResNFe>();
            }
            return this.resNFe;
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
         *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
         *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
         *         &lt;element name="verProc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
         *         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/nfe}TIe"/>
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
            "cuf",
            "tpAmb",
            "verProc",
            "cnpj",
            "ie"
        })
        public static class IdeDec {

            @XmlElement(name = "cUF", namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
            protected String cuf;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
            protected String tpAmb;
            @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String verProc;
            @XmlElement(name = "CNPJ", namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
            protected String cnpj;
            @XmlElement(name = "IE", namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
            protected String ie;

            /**
             * Gets the value of the cuf property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUF() {
                return cuf;
            }

            /**
             * Sets the value of the cuf property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUF(String value) {
                this.cuf = value;
            }

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
             * Gets the value of the verProc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVerProc() {
                return verProc;
            }

            /**
             * Sets the value of the verProc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVerProc(String value) {
                this.verProc = value;
            }

            /**
             * Gets the value of the cnpj property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Sets the value of the cnpj property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Gets the value of the ie property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIE() {
                return ie;
            }

            /**
             * Sets the value of the ie property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIE(String value) {
                this.ie = value;
            }

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
         *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
         *         &lt;choice>
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/>
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
         *         &lt;/choice>
         *         &lt;element name="UF" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
         *         &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *         &lt;element name="vST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
            "chNFe",
            "cnpj",
            "cpf",
            "uf",
            "vnf",
            "vicms",
            "vst"
        })
        public static class ResNFe {

            @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
            protected String chNFe;
            @XmlElement(name = "CNPJ", namespace = "http://www.portalfiscal.inf.br/nfe")
            protected String cnpj;
            @XmlElement(name = "CPF", namespace = "http://www.portalfiscal.inf.br/nfe")
            protected String cpf;
            @XmlElement(name = "UF", namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
            protected TUf uf;
            @XmlElement(name = "vNF", namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
            protected String vnf;
            @XmlElement(name = "vICMS", namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
            protected String vicms;
            @XmlElement(name = "vST", namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
            protected String vst;

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
             * Gets the value of the cnpj property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Sets the value of the cnpj property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Gets the value of the cpf property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCPF() {
                return cpf;
            }

            /**
             * Sets the value of the cpf property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCPF(String value) {
                this.cpf = value;
            }

            /**
             * Gets the value of the uf property.
             * 
             * @return
             *     possible object is
             *     {@link TUf }
             *     
             */
            public TUf getUF() {
                return uf;
            }

            /**
             * Sets the value of the uf property.
             * 
             * @param value
             *     allowed object is
             *     {@link TUf }
             *     
             */
            public void setUF(TUf value) {
                this.uf = value;
            }

            /**
             * Gets the value of the vnf property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVNF() {
                return vnf;
            }

            /**
             * Sets the value of the vnf property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVNF(String value) {
                this.vnf = value;
            }

            /**
             * Gets the value of the vicms property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVICMS() {
                return vicms;
            }

            /**
             * Sets the value of the vicms property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVICMS(String value) {
                this.vicms = value;
            }

            /**
             * Gets the value of the vst property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVST() {
                return vst;
            }

            /**
             * Sets the value of the vst property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVST(String value) {
                this.vst = value;
            }

        }

    }

}
