//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.04 at 03:03:05 PM MDT 
//


package org.cqframework.cql.elm.execution;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * The InCodeSystem operator returns true if the given code is in the given code system.
 * 			
 * Note that this operator explicitly requires a CodeSystemRef as its codesystem argument. This allows for both static analysis of the code system references within an artifact, as well as the implementation of code system membership by the target environment as a service call to a terminology server, if desired.
 * 
 * <p>Java class for InCodeSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InCodeSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}Expression"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{urn:hl7-org:elm:r1}Expression"/&gt;
 *         &lt;element name="codesystem" type="{urn:hl7-org:elm:r1}CodeSystemRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InCodeSystem", namespace = "urn:hl7-org:elm:r1", propOrder = {
    "code",
    "codesystem"
})
public class InCodeSystem
    extends Expression
    implements Equals, HashCode, ToString
{

    @XmlElement(namespace = "urn:hl7-org:elm:r1", required = true)
    protected Expression code;
    @XmlElement(namespace = "urn:hl7-org:elm:r1", required = true)
    protected CodeSystemRef codesystem;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setCode(Expression value) {
        this.code = value;
    }

    /**
     * Gets the value of the codesystem property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSystemRef }
     *     
     */
    public CodeSystemRef getCodesystem() {
        return codesystem;
    }

    /**
     * Sets the value of the codesystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSystemRef }
     *     
     */
    public void setCodesystem(CodeSystemRef value) {
        this.codesystem = value;
    }

    public InCodeSystem withCode(Expression value) {
        setCode(value);
        return this;
    }

    public InCodeSystem withCodesystem(CodeSystemRef value) {
        setCodesystem(value);
        return this;
    }

    @Override
    public InCodeSystem withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public InCodeSystem withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public InCodeSystem withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InCodeSystem)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final InCodeSystem that = ((InCodeSystem) object);
        {
            Expression lhsCode;
            lhsCode = this.getCode();
            Expression rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            CodeSystemRef lhsCodesystem;
            lhsCodesystem = this.getCodesystem();
            CodeSystemRef rhsCodesystem;
            rhsCodesystem = that.getCodesystem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "codesystem", lhsCodesystem), LocatorUtils.property(thatLocator, "codesystem", rhsCodesystem), lhsCodesystem, rhsCodesystem)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Expression theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            CodeSystemRef theCodesystem;
            theCodesystem = this.getCodesystem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "codesystem", theCodesystem), currentHashCode, theCodesystem);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            Expression theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            CodeSystemRef theCodesystem;
            theCodesystem = this.getCodesystem();
            strategy.appendField(locator, this, "codesystem", buffer, theCodesystem);
        }
        return buffer;
    }

}
