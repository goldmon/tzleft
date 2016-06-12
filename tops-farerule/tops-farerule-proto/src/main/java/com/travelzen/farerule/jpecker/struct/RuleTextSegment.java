/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.travelzen.farerule.jpecker.struct;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuleTextSegment implements org.apache.thrift.TBase<RuleTextSegment, RuleTextSegment._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RuleTextSegment");

  private static final org.apache.thrift.protocol.TField ORIGIN_FIELD_DESC = new org.apache.thrift.protocol.TField("origin", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SALES_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("salesDate", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TRAVEL_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("travelDate", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RuleTextSegmentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RuleTextSegmentTupleSchemeFactory());
  }

  public String origin; // optional
  public String salesDate; // optional
  public String travelDate; // optional
  public String text; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORIGIN((short)1, "origin"),
    SALES_DATE((short)2, "salesDate"),
    TRAVEL_DATE((short)3, "travelDate"),
    TEXT((short)4, "text");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ORIGIN
          return ORIGIN;
        case 2: // SALES_DATE
          return SALES_DATE;
        case 3: // TRAVEL_DATE
          return TRAVEL_DATE;
        case 4: // TEXT
          return TEXT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.ORIGIN,_Fields.SALES_DATE,_Fields.TRAVEL_DATE,_Fields.TEXT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ORIGIN, new org.apache.thrift.meta_data.FieldMetaData("origin", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SALES_DATE, new org.apache.thrift.meta_data.FieldMetaData("salesDate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRAVEL_DATE, new org.apache.thrift.meta_data.FieldMetaData("travelDate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RuleTextSegment.class, metaDataMap);
  }

  public RuleTextSegment() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RuleTextSegment(RuleTextSegment other) {
    if (other.isSetOrigin()) {
      this.origin = other.origin;
    }
    if (other.isSetSalesDate()) {
      this.salesDate = other.salesDate;
    }
    if (other.isSetTravelDate()) {
      this.travelDate = other.travelDate;
    }
    if (other.isSetText()) {
      this.text = other.text;
    }
  }

  public RuleTextSegment deepCopy() {
    return new RuleTextSegment(this);
  }

  @Override
  public void clear() {
    this.origin = null;
    this.salesDate = null;
    this.travelDate = null;
    this.text = null;
  }

  public String getOrigin() {
    return this.origin;
  }

  public RuleTextSegment setOrigin(String origin) {
    this.origin = origin;
    return this;
  }

  public void unsetOrigin() {
    this.origin = null;
  }

  /** Returns true if field origin is set (has been assigned a value) and false otherwise */
  public boolean isSetOrigin() {
    return this.origin != null;
  }

  public void setOriginIsSet(boolean value) {
    if (!value) {
      this.origin = null;
    }
  }

  public String getSalesDate() {
    return this.salesDate;
  }

  public RuleTextSegment setSalesDate(String salesDate) {
    this.salesDate = salesDate;
    return this;
  }

  public void unsetSalesDate() {
    this.salesDate = null;
  }

  /** Returns true if field salesDate is set (has been assigned a value) and false otherwise */
  public boolean isSetSalesDate() {
    return this.salesDate != null;
  }

  public void setSalesDateIsSet(boolean value) {
    if (!value) {
      this.salesDate = null;
    }
  }

  public String getTravelDate() {
    return this.travelDate;
  }

  public RuleTextSegment setTravelDate(String travelDate) {
    this.travelDate = travelDate;
    return this;
  }

  public void unsetTravelDate() {
    this.travelDate = null;
  }

  /** Returns true if field travelDate is set (has been assigned a value) and false otherwise */
  public boolean isSetTravelDate() {
    return this.travelDate != null;
  }

  public void setTravelDateIsSet(boolean value) {
    if (!value) {
      this.travelDate = null;
    }
  }

  public String getText() {
    return this.text;
  }

  public RuleTextSegment setText(String text) {
    this.text = text;
    return this;
  }

  public void unsetText() {
    this.text = null;
  }

  /** Returns true if field text is set (has been assigned a value) and false otherwise */
  public boolean isSetText() {
    return this.text != null;
  }

  public void setTextIsSet(boolean value) {
    if (!value) {
      this.text = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ORIGIN:
      if (value == null) {
        unsetOrigin();
      } else {
        setOrigin((String)value);
      }
      break;

    case SALES_DATE:
      if (value == null) {
        unsetSalesDate();
      } else {
        setSalesDate((String)value);
      }
      break;

    case TRAVEL_DATE:
      if (value == null) {
        unsetTravelDate();
      } else {
        setTravelDate((String)value);
      }
      break;

    case TEXT:
      if (value == null) {
        unsetText();
      } else {
        setText((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ORIGIN:
      return getOrigin();

    case SALES_DATE:
      return getSalesDate();

    case TRAVEL_DATE:
      return getTravelDate();

    case TEXT:
      return getText();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ORIGIN:
      return isSetOrigin();
    case SALES_DATE:
      return isSetSalesDate();
    case TRAVEL_DATE:
      return isSetTravelDate();
    case TEXT:
      return isSetText();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RuleTextSegment)
      return this.equals((RuleTextSegment)that);
    return false;
  }

  public boolean equals(RuleTextSegment that) {
    if (that == null)
      return false;

    boolean this_present_origin = true && this.isSetOrigin();
    boolean that_present_origin = true && that.isSetOrigin();
    if (this_present_origin || that_present_origin) {
      if (!(this_present_origin && that_present_origin))
        return false;
      if (!this.origin.equals(that.origin))
        return false;
    }

    boolean this_present_salesDate = true && this.isSetSalesDate();
    boolean that_present_salesDate = true && that.isSetSalesDate();
    if (this_present_salesDate || that_present_salesDate) {
      if (!(this_present_salesDate && that_present_salesDate))
        return false;
      if (!this.salesDate.equals(that.salesDate))
        return false;
    }

    boolean this_present_travelDate = true && this.isSetTravelDate();
    boolean that_present_travelDate = true && that.isSetTravelDate();
    if (this_present_travelDate || that_present_travelDate) {
      if (!(this_present_travelDate && that_present_travelDate))
        return false;
      if (!this.travelDate.equals(that.travelDate))
        return false;
    }

    boolean this_present_text = true && this.isSetText();
    boolean that_present_text = true && that.isSetText();
    if (this_present_text || that_present_text) {
      if (!(this_present_text && that_present_text))
        return false;
      if (!this.text.equals(that.text))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(RuleTextSegment other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RuleTextSegment typedOther = (RuleTextSegment)other;

    lastComparison = Boolean.valueOf(isSetOrigin()).compareTo(typedOther.isSetOrigin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrigin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.origin, typedOther.origin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSalesDate()).compareTo(typedOther.isSetSalesDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSalesDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.salesDate, typedOther.salesDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTravelDate()).compareTo(typedOther.isSetTravelDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTravelDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.travelDate, typedOther.travelDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetText()).compareTo(typedOther.isSetText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.text, typedOther.text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RuleTextSegment(");
    boolean first = true;

    if (isSetOrigin()) {
      sb.append("origin:");
      if (this.origin == null) {
        sb.append("null");
      } else {
        sb.append(this.origin);
      }
      first = false;
    }
    if (isSetSalesDate()) {
      if (!first) sb.append(", ");
      sb.append("salesDate:");
      if (this.salesDate == null) {
        sb.append("null");
      } else {
        sb.append(this.salesDate);
      }
      first = false;
    }
    if (isSetTravelDate()) {
      if (!first) sb.append(", ");
      sb.append("travelDate:");
      if (this.travelDate == null) {
        sb.append("null");
      } else {
        sb.append(this.travelDate);
      }
      first = false;
    }
    if (isSetText()) {
      if (!first) sb.append(", ");
      sb.append("text:");
      if (this.text == null) {
        sb.append("null");
      } else {
        sb.append(this.text);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RuleTextSegmentStandardSchemeFactory implements SchemeFactory {
    public RuleTextSegmentStandardScheme getScheme() {
      return new RuleTextSegmentStandardScheme();
    }
  }

  private static class RuleTextSegmentStandardScheme extends StandardScheme<RuleTextSegment> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RuleTextSegment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORIGIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.origin = iprot.readString();
              struct.setOriginIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SALES_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.salesDate = iprot.readString();
              struct.setSalesDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TRAVEL_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.travelDate = iprot.readString();
              struct.setTravelDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.text = iprot.readString();
              struct.setTextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RuleTextSegment struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.origin != null) {
        if (struct.isSetOrigin()) {
          oprot.writeFieldBegin(ORIGIN_FIELD_DESC);
          oprot.writeString(struct.origin);
          oprot.writeFieldEnd();
        }
      }
      if (struct.salesDate != null) {
        if (struct.isSetSalesDate()) {
          oprot.writeFieldBegin(SALES_DATE_FIELD_DESC);
          oprot.writeString(struct.salesDate);
          oprot.writeFieldEnd();
        }
      }
      if (struct.travelDate != null) {
        if (struct.isSetTravelDate()) {
          oprot.writeFieldBegin(TRAVEL_DATE_FIELD_DESC);
          oprot.writeString(struct.travelDate);
          oprot.writeFieldEnd();
        }
      }
      if (struct.text != null) {
        if (struct.isSetText()) {
          oprot.writeFieldBegin(TEXT_FIELD_DESC);
          oprot.writeString(struct.text);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RuleTextSegmentTupleSchemeFactory implements SchemeFactory {
    public RuleTextSegmentTupleScheme getScheme() {
      return new RuleTextSegmentTupleScheme();
    }
  }

  private static class RuleTextSegmentTupleScheme extends TupleScheme<RuleTextSegment> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RuleTextSegment struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOrigin()) {
        optionals.set(0);
      }
      if (struct.isSetSalesDate()) {
        optionals.set(1);
      }
      if (struct.isSetTravelDate()) {
        optionals.set(2);
      }
      if (struct.isSetText()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetOrigin()) {
        oprot.writeString(struct.origin);
      }
      if (struct.isSetSalesDate()) {
        oprot.writeString(struct.salesDate);
      }
      if (struct.isSetTravelDate()) {
        oprot.writeString(struct.travelDate);
      }
      if (struct.isSetText()) {
        oprot.writeString(struct.text);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RuleTextSegment struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.origin = iprot.readString();
        struct.setOriginIsSet(true);
      }
      if (incoming.get(1)) {
        struct.salesDate = iprot.readString();
        struct.setSalesDateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.travelDate = iprot.readString();
        struct.setTravelDateIsSet(true);
      }
      if (incoming.get(3)) {
        struct.text = iprot.readString();
        struct.setTextIsSet(true);
      }
    }
  }

}

