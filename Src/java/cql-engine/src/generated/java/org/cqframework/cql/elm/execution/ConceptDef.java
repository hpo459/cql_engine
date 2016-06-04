//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.04 at 03:03:05 PM MDT 
//


package org.cqframework.cql.elm.execution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * The ConceptDef type defines a concept identifier that can then be used to reference single concepts anywhere within an expression.
 * 
 * <p>Java class for ConceptDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{urn:hl7-org:elm:r1}CodeRef" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="display" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="accessLevel" type="{urn:hl7-org:elm:r1}AccessModifier" default="Public" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptDef", namespace = "urn:hl7-org:elm:r1", propOrder = {
    "code"
})
public class ConceptDef
    extends Element
    implements Equals, HashCode, ToString
{

    @XmlElement(namespace = "urn:hl7-org:elm:r1", required = true)
    protected List<CodeRef> code;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "display")
    protected String display;
    @XmlAttribute(name = "accessLevel")
    protected AccessModifier accessLevel;

    /**
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeRef }
     * 
     * 
     */
    public List<CodeRef> getCode() {
        if (code == null) {
            code = new ArrayList<CodeRef>();
        }
        return this.code;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplay(String value) {
        this.display = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AccessModifier }
     *     
     */
    public AccessModifier getAccessLevel() {
        if (accessLevel == null) {
            return AccessModifier.PUBLIC;
        } else {
            return accessLevel;
        }
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModifier }
     *     
     */
    public void setAccessLevel(AccessModifier value) {
        this.accessLevel = value;
    }

    public ConceptDef withCode(CodeRef... values) {
        if (values!= null) {
            for (CodeRef value: values) {
                getCode().add(value);
            }
        }
        return this;
    }

    public ConceptDef withCode(Collection<CodeRef> values) {
        if (values!= null) {
            getCode().addAll(values);
        }
        return this;
    }

    public ConceptDef withName(String value) {
        setName(value);
        return this;
    }

    public ConceptDef withDisplay(String value) {
        setDisplay(value);
        return this;
    }

    public ConceptDef withAccessLevel(AccessModifier value) {
        setAccessLevel(value);
        return this;
    }

    @Override
    public ConceptDef withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public ConceptDef withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public ConceptDef withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConceptDef)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConceptDef that = ((ConceptDef) object);
        {
            List<CodeRef> lhsCode;
            lhsCode = (((this.code!= null)&&(!this.code.isEmpty()))?this.getCode():null);
            List<CodeRef> rhsCode;
            rhsCode = (((that.code!= null)&&(!that.code.isEmpty()))?that.getCode():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsDisplay;
            lhsDisplay = this.getDisplay();
            String rhsDisplay;
            rhsDisplay = that.getDisplay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "display", lhsDisplay), LocatorUtils.property(thatLocator, "display", rhsDisplay), lhsDisplay, rhsDisplay)) {
                return false;
            }
        }
        {
            AccessModifier lhsAccessLevel;
            lhsAccessLevel = this.getAccessLevel();
            AccessModifier rhsAccessLevel;
            rhsAccessLevel = that.getAccessLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessLevel", lhsAccessLevel), LocatorUtils.property(thatLocator, "accessLevel", rhsAccessLevel), lhsAccessLevel, rhsAccessLevel)) {
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
            List<CodeRef> theCode;
            theCode = (((this.code!= null)&&(!this.code.isEmpty()))?this.getCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theDisplay;
            theDisplay = this.getDisplay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "display", theDisplay), currentHashCode, theDisplay);
        }
        {
            AccessModifier theAccessLevel;
            theAccessLevel = this.getAccessLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessLevel", theAccessLevel), currentHashCode, theAccessLevel);
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
            List<CodeRef> theCode;
            theCode = (((this.code!= null)&&(!this.code.isEmpty()))?this.getCode():null);
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theDisplay;
            theDisplay = this.getDisplay();
            strategy.appendField(locator, this, "display", buffer, theDisplay);
        }
        {
            AccessModifier theAccessLevel;
            theAccessLevel = this.getAccessLevel();
            strategy.appendField(locator, this, "accessLevel", buffer, theAccessLevel);
        }
        return buffer;
    }

}
