/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.travelzen.farerule.condition;

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

public class RuleCondition implements org.apache.thrift.TBase<RuleCondition, RuleCondition._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RuleCondition");

  private static final org.apache.thrift.protocol.TField ORIGIN_CONDITION_FIELD_DESC = new org.apache.thrift.protocol.TField("originCondition", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SALES_DATE_CONDITION_FIELD_DESC = new org.apache.thrift.protocol.TField("salesDateCondition", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField TRAVEL_DATE_CONDITION_FIELD_DESC = new org.apache.thrift.protocol.TField("travelDateCondition", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RuleConditionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RuleConditionTupleSchemeFactory());
  }

  public OriginCondition originCondition; // optional
  public SalesDateSubItem salesDateCondition; // optional
  public TravelDateSubItem travelDateCondition; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORIGIN_CONDITION((short)1, "originCondition"),
    SALES_DATE_CONDITION((short)2, "salesDateCondition"),
    TRAVEL_DATE_CONDITION((short)3, "travelDateCondition");

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
        case 1: // ORIGIN_CONDITION
          return ORIGIN_CONDITION;
        case 2: // SALES_DATE_CONDITION
          return SALES_DATE_CONDITION;
        case 3: // TRAVEL_DATE_CONDITION
          return TRAVEL_DATE_CONDITION;
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
  private _Fields optionals[] = {_Fields.ORIGIN_CONDITION,_Fields.SALES_DATE_CONDITION,_Fields.TRAVEL_DATE_CONDITION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ORIGIN_CONDITION, new org.apache.thrift.meta_data.FieldMetaData("originCondition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, OriginCondition.class)));
    tmpMap.put(_Fields.SALES_DATE_CONDITION, new org.apache.thrift.meta_data.FieldMetaData("salesDateCondition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SalesDateSubItem.class)));
    tmpMap.put(_Fields.TRAVEL_DATE_CONDITION, new org.apache.thrift.meta_data.FieldMetaData("travelDateCondition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TravelDateSubItem.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RuleCondition.class, metaDataMap);
  }

  public RuleCondition() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RuleCondition(RuleCondition other) {
    if (other.isSetOriginCondition()) {
      this.originCondition = new OriginCondition(other.originCondition);
    }
    if (other.isSetSalesDateCondition()) {
      this.salesDateCondition = new SalesDateSubItem(other.salesDateCondition);
    }
    if (other.isSetTravelDateCondition()) {
      this.travelDateCondition = new TravelDateSubItem(other.travelDateCondition);
    }
  }

  public RuleCondition deepCopy() {
    return new RuleCondition(this);
  }

  @Override
  public void clear() {
    this.originCondition = null;
    this.salesDateCondition = null;
    this.travelDateCondition = null;
  }

  public OriginCondition getOriginCondition() {
    return this.originCondition;
  }

  public RuleCondition setOriginCondition(OriginCondition originCondition) {
    this.originCondition = originCondition;
    return this;
  }

  public void unsetOriginCondition() {
    this.originCondition = null;
  }

  /** Returns true if field originCondition is set (has been assigned a value) and false otherwise */
  public boolean isSetOriginCondition() {
    return this.originCondition != null;
  }

  public void setOriginConditionIsSet(boolean value) {
    if (!value) {
      this.originCondition = null;
    }
  }

  public SalesDateSubItem getSalesDateCondition() {
    return this.salesDateCondition;
  }

  public RuleCondition setSalesDateCondition(SalesDateSubItem salesDateCondition) {
    this.salesDateCondition = salesDateCondition;
    return this;
  }

  public void unsetSalesDateCondition() {
    this.salesDateCondition = null;
  }

  /** Returns true if field salesDateCondition is set (has been assigned a value) and false otherwise */
  public boolean isSetSalesDateCondition() {
    return this.salesDateCondition != null;
  }

  public void setSalesDateConditionIsSet(boolean value) {
    if (!value) {
      this.salesDateCondition = null;
    }
  }

  public TravelDateSubItem getTravelDateCondition() {
    return this.travelDateCondition;
  }

  public RuleCondition setTravelDateCondition(TravelDateSubItem travelDateCondition) {
    this.travelDateCondition = travelDateCondition;
    return this;
  }

  public void unsetTravelDateCondition() {
    this.travelDateCondition = null;
  }

  /** Returns true if field travelDateCondition is set (has been assigned a value) and false otherwise */
  public boolean isSetTravelDateCondition() {
    return this.travelDateCondition != null;
  }

  public void setTravelDateConditionIsSet(boolean value) {
    if (!value) {
      this.travelDateCondition = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ORIGIN_CONDITION:
      if (value == null) {
        unsetOriginCondition();
      } else {
        setOriginCondition((OriginCondition)value);
      }
      break;

    case SALES_DATE_CONDITION:
      if (value == null) {
        unsetSalesDateCondition();
      } else {
        setSalesDateCondition((SalesDateSubItem)value);
      }
      break;

    case TRAVEL_DATE_CONDITION:
      if (value == null) {
        unsetTravelDateCondition();
      } else {
        setTravelDateCondition((TravelDateSubItem)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ORIGIN_CONDITION:
      return getOriginCondition();

    case SALES_DATE_CONDITION:
      return getSalesDateCondition();

    case TRAVEL_DATE_CONDITION:
      return getTravelDateCondition();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ORIGIN_CONDITION:
      return isSetOriginCondition();
    case SALES_DATE_CONDITION:
      return isSetSalesDateCondition();
    case TRAVEL_DATE_CONDITION:
      return isSetTravelDateCondition();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RuleCondition)
      return this.equals((RuleCondition)that);
    return false;
  }

  public boolean equals(RuleCondition that) {
    if (that == null)
      return false;

    boolean this_present_originCondition = true && this.isSetOriginCondition();
    boolean that_present_originCondition = true && that.isSetOriginCondition();
    if (this_present_originCondition || that_present_originCondition) {
      if (!(this_present_originCondition && that_present_originCondition))
        return false;
      if (!this.originCondition.equals(that.originCondition))
        return false;
    }

    boolean this_present_salesDateCondition = true && this.isSetSalesDateCondition();
    boolean that_present_salesDateCondition = true && that.isSetSalesDateCondition();
    if (this_present_salesDateCondition || that_present_salesDateCondition) {
      if (!(this_present_salesDateCondition && that_present_salesDateCondition))
        return false;
      if (!this.salesDateCondition.equals(that.salesDateCondition))
        return false;
    }

    boolean this_present_travelDateCondition = true && this.isSetTravelDateCondition();
    boolean that_present_travelDateCondition = true && that.isSetTravelDateCondition();
    if (this_present_travelDateCondition || that_present_travelDateCondition) {
      if (!(this_present_travelDateCondition && that_present_travelDateCondition))
        return false;
      if (!this.travelDateCondition.equals(that.travelDateCondition))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(RuleCondition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RuleCondition typedOther = (RuleCondition)other;

    lastComparison = Boolean.valueOf(isSetOriginCondition()).compareTo(typedOther.isSetOriginCondition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOriginCondition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.originCondition, typedOther.originCondition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSalesDateCondition()).compareTo(typedOther.isSetSalesDateCondition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSalesDateCondition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.salesDateCondition, typedOther.salesDateCondition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTravelDateCondition()).compareTo(typedOther.isSetTravelDateCondition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTravelDateCondition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.travelDateCondition, typedOther.travelDateCondition);
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
    StringBuilder sb = new StringBuilder("RuleCondition(");
    boolean first = true;

    if (isSetOriginCondition()) {
      sb.append("originCondition:");
      if (this.originCondition == null) {
        sb.append("null");
      } else {
        sb.append(this.originCondition);
      }
      first = false;
    }
    if (isSetSalesDateCondition()) {
      if (!first) sb.append(", ");
      sb.append("salesDateCondition:");
      if (this.salesDateCondition == null) {
        sb.append("null");
      } else {
        sb.append(this.salesDateCondition);
      }
      first = false;
    }
    if (isSetTravelDateCondition()) {
      if (!first) sb.append(", ");
      sb.append("travelDateCondition:");
      if (this.travelDateCondition == null) {
        sb.append("null");
      } else {
        sb.append(this.travelDateCondition);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (originCondition != null) {
      originCondition.validate();
    }
    if (salesDateCondition != null) {
      salesDateCondition.validate();
    }
    if (travelDateCondition != null) {
      travelDateCondition.validate();
    }
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

  private static class RuleConditionStandardSchemeFactory implements SchemeFactory {
    public RuleConditionStandardScheme getScheme() {
      return new RuleConditionStandardScheme();
    }
  }

  private static class RuleConditionStandardScheme extends StandardScheme<RuleCondition> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RuleCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORIGIN_CONDITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.originCondition = new OriginCondition();
              struct.originCondition.read(iprot);
              struct.setOriginConditionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SALES_DATE_CONDITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.salesDateCondition = new SalesDateSubItem();
              struct.salesDateCondition.read(iprot);
              struct.setSalesDateConditionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TRAVEL_DATE_CONDITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.travelDateCondition = new TravelDateSubItem();
              struct.travelDateCondition.read(iprot);
              struct.setTravelDateConditionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RuleCondition struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.originCondition != null) {
        if (struct.isSetOriginCondition()) {
          oprot.writeFieldBegin(ORIGIN_CONDITION_FIELD_DESC);
          struct.originCondition.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.salesDateCondition != null) {
        if (struct.isSetSalesDateCondition()) {
          oprot.writeFieldBegin(SALES_DATE_CONDITION_FIELD_DESC);
          struct.salesDateCondition.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.travelDateCondition != null) {
        if (struct.isSetTravelDateCondition()) {
          oprot.writeFieldBegin(TRAVEL_DATE_CONDITION_FIELD_DESC);
          struct.travelDateCondition.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RuleConditionTupleSchemeFactory implements SchemeFactory {
    public RuleConditionTupleScheme getScheme() {
      return new RuleConditionTupleScheme();
    }
  }

  private static class RuleConditionTupleScheme extends TupleScheme<RuleCondition> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RuleCondition struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOriginCondition()) {
        optionals.set(0);
      }
      if (struct.isSetSalesDateCondition()) {
        optionals.set(1);
      }
      if (struct.isSetTravelDateCondition()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetOriginCondition()) {
        struct.originCondition.write(oprot);
      }
      if (struct.isSetSalesDateCondition()) {
        struct.salesDateCondition.write(oprot);
      }
      if (struct.isSetTravelDateCondition()) {
        struct.travelDateCondition.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RuleCondition struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.originCondition = new OriginCondition();
        struct.originCondition.read(iprot);
        struct.setOriginConditionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.salesDateCondition = new SalesDateSubItem();
        struct.salesDateCondition.read(iprot);
        struct.setSalesDateConditionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.travelDateCondition = new TravelDateSubItem();
        struct.travelDateCondition.read(iprot);
        struct.setTravelDateConditionIsSet(true);
      }
    }
  }

}

