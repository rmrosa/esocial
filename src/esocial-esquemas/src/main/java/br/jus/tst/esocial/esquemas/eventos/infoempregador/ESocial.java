//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.24 at 06:39:53 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.infoempregador;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="evtInfoEmpregador">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_ideEvento_evtTab_inicial"/>
 *                   &lt;element name="ideEmpregador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_tpInsc_1_2"/>
 *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_nrInsc_8_11_14"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoEmpregador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="inclusao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
 *                                         &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="alteracao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
 *                                         &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="exclusao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_Id" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
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
    "evtInfoEmpregador",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtInfoEmpregador evtInfoEmpregador;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtInfoEmpregador property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtInfoEmpregador }
     *     
     */
    public ESocial.EvtInfoEmpregador getEvtInfoEmpregador() {
        return evtInfoEmpregador;
    }

    /**
     * Sets the value of the evtInfoEmpregador property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtInfoEmpregador }
     *     
     */
    public void setEvtInfoEmpregador(ESocial.EvtInfoEmpregador value) {
        this.evtInfoEmpregador = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_ideEvento_evtTab_inicial"/>
     *         &lt;element name="ideEmpregador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_tpInsc_1_2"/>
     *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_nrInsc_8_11_14"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoEmpregador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="inclusao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
     *                               &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="alteracao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
     *                               &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="exclusao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_Id" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoEmpregador"
    })
    public static class EvtInfoEmpregador {

        @XmlElement(required = true)
        protected TIdeEventoEvtTabInicial ideEvento;
        @XmlElement(required = true)
        protected ESocial.EvtInfoEmpregador.IdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtInfoEmpregador.InfoEmpregador infoEmpregador;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoEvtTabInicial }
         *     
         */
        public TIdeEventoEvtTabInicial getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoEvtTabInicial }
         *     
         */
        public void setIdeEvento(TIdeEventoEvtTabInicial value) {
            this.ideEvento = value;
        }

        /**
         * Gets the value of the ideEmpregador property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtInfoEmpregador.IdeEmpregador }
         *     
         */
        public ESocial.EvtInfoEmpregador.IdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Sets the value of the ideEmpregador property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtInfoEmpregador.IdeEmpregador }
         *     
         */
        public void setIdeEmpregador(ESocial.EvtInfoEmpregador.IdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Gets the value of the infoEmpregador property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador }
         *     
         */
        public ESocial.EvtInfoEmpregador.InfoEmpregador getInfoEmpregador() {
            return infoEmpregador;
        }

        /**
         * Sets the value of the infoEmpregador property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador }
         *     
         */
        public void setInfoEmpregador(ESocial.EvtInfoEmpregador.InfoEmpregador value) {
            this.infoEmpregador = value;
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
         *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_tpInsc_1_2"/>
         *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_nrInsc_8_11_14"/>
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
            "tpInsc",
            "nrInsc"
        })
        public static class IdeEmpregador {

            protected byte tpInsc;
            @XmlElement(required = true)
            protected String nrInsc;

            /**
             * Gets the value of the tpInsc property.
             * 
             */
            public byte getTpInsc() {
                return tpInsc;
            }

            /**
             * Sets the value of the tpInsc property.
             * 
             */
            public void setTpInsc(byte value) {
                this.tpInsc = value;
            }

            /**
             * Gets the value of the nrInsc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrInsc() {
                return nrInsc;
            }

            /**
             * Sets the value of the nrInsc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrInsc(String value) {
                this.nrInsc = value;
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
         *         &lt;choice>
         *           &lt;element name="inclusao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
         *                     &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="alteracao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
         *                     &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo" minOccurs="0"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="exclusao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
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
            "inclusao",
            "alteracao",
            "exclusao"
        })
        public static class InfoEmpregador {

            protected ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao inclusao;
            protected ESocial.EvtInfoEmpregador.InfoEmpregador.Alteracao alteracao;
            protected ESocial.EvtInfoEmpregador.InfoEmpregador.Exclusao exclusao;

            /**
             * Gets the value of the inclusao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao }
             *     
             */
            public ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Sets the value of the inclusao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Gets the value of the alteracao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador.Alteracao }
             *     
             */
            public ESocial.EvtInfoEmpregador.InfoEmpregador.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Sets the value of the alteracao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtInfoEmpregador.InfoEmpregador.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Gets the value of the exclusao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador.Exclusao }
             *     
             */
            public ESocial.EvtInfoEmpregador.InfoEmpregador.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Sets the value of the exclusao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtInfoEmpregador.InfoEmpregador.Exclusao value) {
                this.exclusao = value;
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
             *         &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
             *         &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo" minOccurs="0"/>
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
                "idePeriodo",
                "infoCadastro",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(required = true)
                protected TIdePeriodo idePeriodo;
                @XmlElement(required = true)
                protected TInfoCadastro infoCadastro;
                protected TIdePeriodo novaValidade;

                /**
                 * Gets the value of the idePeriodo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public TIdePeriodo getIdePeriodo() {
                    return idePeriodo;
                }

                /**
                 * Sets the value of the idePeriodo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public void setIdePeriodo(TIdePeriodo value) {
                    this.idePeriodo = value;
                }

                /**
                 * Gets the value of the infoCadastro property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TInfoCadastro }
                 *     
                 */
                public TInfoCadastro getInfoCadastro() {
                    return infoCadastro;
                }

                /**
                 * Sets the value of the infoCadastro property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TInfoCadastro }
                 *     
                 */
                public void setInfoCadastro(TInfoCadastro value) {
                    this.infoCadastro = value;
                }

                /**
                 * Gets the value of the novaValidade property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public TIdePeriodo getNovaValidade() {
                    return novaValidade;
                }

                /**
                 * Sets the value of the novaValidade property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public void setNovaValidade(TIdePeriodo value) {
                    this.novaValidade = value;
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
             *         &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
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
                "idePeriodo"
            })
            public static class Exclusao {

                @XmlElement(required = true)
                protected TIdePeriodo idePeriodo;

                /**
                 * Gets the value of the idePeriodo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public TIdePeriodo getIdePeriodo() {
                    return idePeriodo;
                }

                /**
                 * Sets the value of the idePeriodo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public void setIdePeriodo(TIdePeriodo value) {
                    this.idePeriodo = value;
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
             *         &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
             *         &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
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
                "idePeriodo",
                "infoCadastro"
            })
            public static class Inclusao {

                @XmlElement(required = true)
                protected TIdePeriodo idePeriodo;
                @XmlElement(required = true)
                protected TInfoCadastro infoCadastro;

                /**
                 * Gets the value of the idePeriodo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public TIdePeriodo getIdePeriodo() {
                    return idePeriodo;
                }

                /**
                 * Sets the value of the idePeriodo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public void setIdePeriodo(TIdePeriodo value) {
                    this.idePeriodo = value;
                }

                /**
                 * Gets the value of the infoCadastro property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TInfoCadastro }
                 *     
                 */
                public TInfoCadastro getInfoCadastro() {
                    return infoCadastro;
                }

                /**
                 * Sets the value of the infoCadastro property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TInfoCadastro }
                 *     
                 */
                public void setInfoCadastro(TInfoCadastro value) {
                    this.infoCadastro = value;
                }

            }

        }

    }

}
