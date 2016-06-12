/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.travelzen.farerule.rule;

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

public class PenaltyCondition implements org.apache.thrift.TBase<PenaltyCondition, PenaltyCondition._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PenaltyCondition");

  private static final org.apache.thrift.protocol.TField PENALTY_CONDITION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("penaltyConditionType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField BEFORE_DEPT_HOUR_FIELD_DESC = new org.apache.thrift.protocol.TField("beforeDeptHour", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PenaltyConditionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PenaltyConditionTupleSchemeFactory());
  }

  /**
   * 
   * @see PenaltyConditionTypeEnum
   */
  public PenaltyConditionTypeEnum penaltyConditionType; // required
  public int beforeDeptHour; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see PenaltyConditionTypeEnum
     */
    PENALTY_CONDITION_TYPE((short)1, "penaltyConditionType"),
    BEFORE_DEPT_HOUR((short)2, "beforeDeptHour");

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
        case 1: // PENALTY_CONDITION_TYPE
          return PENALTY_CONDITION_TYPE;
        case 2: // BEFORE_DEPT_HOUR
          return BEFORE_DEPT_HOUR;
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
  private static final int __BEFOREDEPTHOUR_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.BEFORE_DEPT_HOUR};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PENALTY_CONDITION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("penaltyConditionType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PenaltyConditionTypeEnum.class)));
    tmpMap.put(_Fields.BEFORE_DEPT_HOUR, new org.apache.thrift.meta_data.FieldMetaData("beforeDeptHour", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PenaltyCondition.class, metaDataMap);
  }

  public PenaltyCondition() {
  }

  public PenaltyCondition(
    PenaltyConditionTypeEnum penaltyConditionType)
  {
    this();
    this.penaltyConditionType = penaltyConditionType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PenaltyCondition(PenaltyCondition other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPenaltyConditionType()) {
      this.penaltyConditionType = other.penaltyConditionType;
    }
    this.beforeDeptHour = other.beforeDeptHour;
  }

  public PenaltyCondition deepCopy() {
    return new PenaltyCondition(this);
  }

  @Override
  public void clear() {
    this.penaltyConditionType = null;
    setBeforeDeptHourIsSet(false);
    this.beforeDeptHour = 0;
  }

  /**
   * 
   * @see PenaltyConditionTypeEnum
   */
  public PenaltyConditionTypeEnum getPenaltyConditionType() {
    return this.penaltyConditionType;
  }

  /**
   * 
   * @see PenaltyConditionTypeEnum
   */
  public PenaltyCondition setPenaltyConditionType(PenaltyConditionTypeEnum penaltyConditionType) {
    this.penaltyConditionType = penaltyConditionType;
    return this;
  }

  public void unsetPenaltyConditionType() {
    this.penaltyConditionType = null;
  }

  /** Returns true if field penaltyConditionType is set (has been assigned a value) and false otherwise */
  public boolean isSetPenaltyConditionType() {
    return this.penaltyConditionType != null;
  }

  public void setPenaltyConditionTypeIsSet(boolean value) {
    if (!value) {
      this.penaltyConditionType = null;
    }
  }

  public int getBeforeDeptHour() {
    return this.beforeDeptHour;
  }

  public PenaltyCondition setBeforeDeptHour(int beforeDeptHour) {
    this.beforeDeptHour = beforeDeptHour;
    setBeforeDeptHourIsSet(true);
    return this;
  }

  public void unsetBeforeDeptHour() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BEFOREDEPTHOUR_ISSET_ID);
  }

  /** Returns true if field beforeDeptHour is set (has been assigned a value) and false otherwise */
  public boolean isSetBeforeDeptHour() {
    return EncodingUtils.testBit(__isset_bitfield, __BEFOREDEPTHOUR_ISSET_ID);
  }

  public void setBeforeDeptHourIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BEFOREDEPTHOUR_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PENALTY_CONDITION_TYPE:
      if (value == null) {
        unsetPenaltyConditionType();
      } else {
        setPenaltyConditionType((PenaltyConditionTypeEnum)value);
      }
      break;

    case BEFORE_DEPT_HOUR:
      if (value == null) {
        unsetBeforeDeptHour();
      } else {
        setBeforeDeptHour((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PENALTY_CONDITION_TYPE:
      return getPenaltyConditionType();

    case BEFORE_DEPT_HOUR:
      return Integer.valueOf(getBeforeDeptHour());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PENALTY_CONDITION_TYPE:
      return isSetPenaltyConditionType();
    case BEFORE_DEPT_HOUR:
      return isSetBeforeDeptHour();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PenaltyCondition)
      return this.equals((PenaltyCondition)that);
    return false;
  }

  public boolean equals(PenaltyCondition that) {
    if (that == null)
      return false;

    boolean this_present_penaltyConditionType = true && this.isSetPenaltyConditionType();
    boolean that_present_penaltyConditionType = true && that.isSetPenaltyConditionType();
    if (this_present_penaltyConditionType || that_present_penaltyConditionType) {
      if (!(this_present_penaltyConditionType && that_present_penaltyConditionType))
        return false;
      if (!this.penaltyConditionType.equals(that.penaltyConditionType))
        return false;
    }

    boolean this_present_beforeDeptHour = true && this.isSetBeforeDeptHour();
    boolean that_present_beforeDeptHour = true && that.isSetBeforeDeptHour();
    if (this_present_beforeDeptHour || that_present_beforeDeptHour) {
      if (!(this_present_beforeDeptHour && that_present_beforeDeptHour))
        return false;
      if (this.beforeDeptHour != that.beforeDeptHour)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(PenaltyCondition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PenaltyCondition typedOther = (PenaltyCondition)other;

    lastComparison = Boolean.valueOf(isSetPenaltyConditionType()).compareTo(typedOther.isSetPenaltyConditionType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPenaltyConditionType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.penaltyConditionType, typedOther.penaltyConditionType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBeforeDeptHour()).compareTo(typedOther.isSetBeforeDeptHour());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBeforeDeptHour()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.beforeDeptHour, typedOther.beforeDeptHour);
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
    StringBuilder sb = new StringBuilder("PenaltyCondition(");
    boolean first = true;

    sb.append("penaltyConditionType:");
    if (this.penaltyConditionType == null) {
      sb.append("null");
    } else {
      sb.append(this.penaltyConditionType);
    }
    first = false;
    if (isSetBeforeDeptHour()) {
      if (!first) sb.append(", ");
      sb.append("beforeDeptHour:");
      sb.append(this.beforeDeptHour);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (penaltyConditionType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'penaltyConditionType' was not present! Struct: " + toString());
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PenaltyConditionStandardSchemeFactory implements SchemeFactory {
    public PenaltyConditionStandardScheme getScheme() {
      return new PenaltyConditionStandardScheme();
    }
  }

  private static class PenaltyConditionStandardScheme extends StandardScheme<PenaltyCondition> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PenaltyCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PENALTY_CONDITION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.penaltyConditionType = PenaltyConditionTypeEnum.findByValue(iprot.readI32());
              struct.setPenaltyConditionTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BEFORE_DEPT_HOUR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.beforeDeptHour = iprot.readI32();
              struct.setBeforeDeptHourIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PenaltyCondition struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.penaltyConditionType != null) {
        oprot.writeFieldBegin(PENALTY_CONDITION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.penaltyConditionType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetBeforeDeptHour()) {
        oprot.writeFieldBegin(BEFORE_DEPT_HOUR_FIELD_DESC);
        oprot.writeI32(struct.beforeDeptHour);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PenaltyConditionTupleSchemeFactory implements SchemeFactory {
    public PenaltyConditionTupleScheme getScheme() {
      return new PenaltyConditionTupleScheme();
    }
  }

  private static class PenaltyConditionTupleScheme extends TupleScheme<PenaltyCondition> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PenaltyCondition struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.penaltyConditionType.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetBeforeDeptHour()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetBeforeDeptHour()) {
        oprot.writeI32(struct.beforeDeptHour);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PenaltyCondition struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.penaltyConditionType = PenaltyConditionTypeEnum.findByValue(iprot.readI32());
      struct.setPenaltyConditionTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.beforeDeptHour = iprot.readI32();
        struct.setBeforeDeptHourIsSet(true);
      }
    }
  }

}

