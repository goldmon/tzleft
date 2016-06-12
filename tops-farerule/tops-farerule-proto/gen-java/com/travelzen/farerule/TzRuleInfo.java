/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.travelzen.farerule;

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

public class TzRuleInfo implements org.apache.thrift.TBase<TzRuleInfo, TzRuleInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TzRuleInfo");

  private static final org.apache.thrift.protocol.TField RULE_SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("ruleSource", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField JPECKER_RULE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jpeckerRuleId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PAPERFARE_RULE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("paperfareRuleId", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField TZEN_RULE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tzenRuleId", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TzRuleInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TzRuleInfoTupleSchemeFactory());
  }

  /**
   * 
   * @see RuleSourceEnum
   */
  public RuleSourceEnum ruleSource; // required
  public String jpeckerRuleId; // optional
  public long paperfareRuleId; // optional
  public long tzenRuleId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see RuleSourceEnum
     */
    RULE_SOURCE((short)1, "ruleSource"),
    JPECKER_RULE_ID((short)2, "jpeckerRuleId"),
    PAPERFARE_RULE_ID((short)3, "paperfareRuleId"),
    TZEN_RULE_ID((short)4, "tzenRuleId");

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
        case 1: // RULE_SOURCE
          return RULE_SOURCE;
        case 2: // JPECKER_RULE_ID
          return JPECKER_RULE_ID;
        case 3: // PAPERFARE_RULE_ID
          return PAPERFARE_RULE_ID;
        case 4: // TZEN_RULE_ID
          return TZEN_RULE_ID;
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
  private static final int __PAPERFARERULEID_ISSET_ID = 0;
  private static final int __TZENRULEID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.JPECKER_RULE_ID,_Fields.PAPERFARE_RULE_ID,_Fields.TZEN_RULE_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RULE_SOURCE, new org.apache.thrift.meta_data.FieldMetaData("ruleSource", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, RuleSourceEnum.class)));
    tmpMap.put(_Fields.JPECKER_RULE_ID, new org.apache.thrift.meta_data.FieldMetaData("jpeckerRuleId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PAPERFARE_RULE_ID, new org.apache.thrift.meta_data.FieldMetaData("paperfareRuleId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TZEN_RULE_ID, new org.apache.thrift.meta_data.FieldMetaData("tzenRuleId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TzRuleInfo.class, metaDataMap);
  }

  public TzRuleInfo() {
  }

  public TzRuleInfo(
    RuleSourceEnum ruleSource)
  {
    this();
    this.ruleSource = ruleSource;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TzRuleInfo(TzRuleInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRuleSource()) {
      this.ruleSource = other.ruleSource;
    }
    if (other.isSetJpeckerRuleId()) {
      this.jpeckerRuleId = other.jpeckerRuleId;
    }
    this.paperfareRuleId = other.paperfareRuleId;
    this.tzenRuleId = other.tzenRuleId;
  }

  public TzRuleInfo deepCopy() {
    return new TzRuleInfo(this);
  }

  @Override
  public void clear() {
    this.ruleSource = null;
    this.jpeckerRuleId = null;
    setPaperfareRuleIdIsSet(false);
    this.paperfareRuleId = 0;
    setTzenRuleIdIsSet(false);
    this.tzenRuleId = 0;
  }

  /**
   * 
   * @see RuleSourceEnum
   */
  public RuleSourceEnum getRuleSource() {
    return this.ruleSource;
  }

  /**
   * 
   * @see RuleSourceEnum
   */
  public TzRuleInfo setRuleSource(RuleSourceEnum ruleSource) {
    this.ruleSource = ruleSource;
    return this;
  }

  public void unsetRuleSource() {
    this.ruleSource = null;
  }

  /** Returns true if field ruleSource is set (has been assigned a value) and false otherwise */
  public boolean isSetRuleSource() {
    return this.ruleSource != null;
  }

  public void setRuleSourceIsSet(boolean value) {
    if (!value) {
      this.ruleSource = null;
    }
  }

  public String getJpeckerRuleId() {
    return this.jpeckerRuleId;
  }

  public TzRuleInfo setJpeckerRuleId(String jpeckerRuleId) {
    this.jpeckerRuleId = jpeckerRuleId;
    return this;
  }

  public void unsetJpeckerRuleId() {
    this.jpeckerRuleId = null;
  }

  /** Returns true if field jpeckerRuleId is set (has been assigned a value) and false otherwise */
  public boolean isSetJpeckerRuleId() {
    return this.jpeckerRuleId != null;
  }

  public void setJpeckerRuleIdIsSet(boolean value) {
    if (!value) {
      this.jpeckerRuleId = null;
    }
  }

  public long getPaperfareRuleId() {
    return this.paperfareRuleId;
  }

  public TzRuleInfo setPaperfareRuleId(long paperfareRuleId) {
    this.paperfareRuleId = paperfareRuleId;
    setPaperfareRuleIdIsSet(true);
    return this;
  }

  public void unsetPaperfareRuleId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PAPERFARERULEID_ISSET_ID);
  }

  /** Returns true if field paperfareRuleId is set (has been assigned a value) and false otherwise */
  public boolean isSetPaperfareRuleId() {
    return EncodingUtils.testBit(__isset_bitfield, __PAPERFARERULEID_ISSET_ID);
  }

  public void setPaperfareRuleIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PAPERFARERULEID_ISSET_ID, value);
  }

  public long getTzenRuleId() {
    return this.tzenRuleId;
  }

  public TzRuleInfo setTzenRuleId(long tzenRuleId) {
    this.tzenRuleId = tzenRuleId;
    setTzenRuleIdIsSet(true);
    return this;
  }

  public void unsetTzenRuleId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TZENRULEID_ISSET_ID);
  }

  /** Returns true if field tzenRuleId is set (has been assigned a value) and false otherwise */
  public boolean isSetTzenRuleId() {
    return EncodingUtils.testBit(__isset_bitfield, __TZENRULEID_ISSET_ID);
  }

  public void setTzenRuleIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TZENRULEID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RULE_SOURCE:
      if (value == null) {
        unsetRuleSource();
      } else {
        setRuleSource((RuleSourceEnum)value);
      }
      break;

    case JPECKER_RULE_ID:
      if (value == null) {
        unsetJpeckerRuleId();
      } else {
        setJpeckerRuleId((String)value);
      }
      break;

    case PAPERFARE_RULE_ID:
      if (value == null) {
        unsetPaperfareRuleId();
      } else {
        setPaperfareRuleId((Long)value);
      }
      break;

    case TZEN_RULE_ID:
      if (value == null) {
        unsetTzenRuleId();
      } else {
        setTzenRuleId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RULE_SOURCE:
      return getRuleSource();

    case JPECKER_RULE_ID:
      return getJpeckerRuleId();

    case PAPERFARE_RULE_ID:
      return Long.valueOf(getPaperfareRuleId());

    case TZEN_RULE_ID:
      return Long.valueOf(getTzenRuleId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RULE_SOURCE:
      return isSetRuleSource();
    case JPECKER_RULE_ID:
      return isSetJpeckerRuleId();
    case PAPERFARE_RULE_ID:
      return isSetPaperfareRuleId();
    case TZEN_RULE_ID:
      return isSetTzenRuleId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TzRuleInfo)
      return this.equals((TzRuleInfo)that);
    return false;
  }

  public boolean equals(TzRuleInfo that) {
    if (that == null)
      return false;

    boolean this_present_ruleSource = true && this.isSetRuleSource();
    boolean that_present_ruleSource = true && that.isSetRuleSource();
    if (this_present_ruleSource || that_present_ruleSource) {
      if (!(this_present_ruleSource && that_present_ruleSource))
        return false;
      if (!this.ruleSource.equals(that.ruleSource))
        return false;
    }

    boolean this_present_jpeckerRuleId = true && this.isSetJpeckerRuleId();
    boolean that_present_jpeckerRuleId = true && that.isSetJpeckerRuleId();
    if (this_present_jpeckerRuleId || that_present_jpeckerRuleId) {
      if (!(this_present_jpeckerRuleId && that_present_jpeckerRuleId))
        return false;
      if (!this.jpeckerRuleId.equals(that.jpeckerRuleId))
        return false;
    }

    boolean this_present_paperfareRuleId = true && this.isSetPaperfareRuleId();
    boolean that_present_paperfareRuleId = true && that.isSetPaperfareRuleId();
    if (this_present_paperfareRuleId || that_present_paperfareRuleId) {
      if (!(this_present_paperfareRuleId && that_present_paperfareRuleId))
        return false;
      if (this.paperfareRuleId != that.paperfareRuleId)
        return false;
    }

    boolean this_present_tzenRuleId = true && this.isSetTzenRuleId();
    boolean that_present_tzenRuleId = true && that.isSetTzenRuleId();
    if (this_present_tzenRuleId || that_present_tzenRuleId) {
      if (!(this_present_tzenRuleId && that_present_tzenRuleId))
        return false;
      if (this.tzenRuleId != that.tzenRuleId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TzRuleInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TzRuleInfo typedOther = (TzRuleInfo)other;

    lastComparison = Boolean.valueOf(isSetRuleSource()).compareTo(typedOther.isSetRuleSource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRuleSource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ruleSource, typedOther.ruleSource);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJpeckerRuleId()).compareTo(typedOther.isSetJpeckerRuleId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJpeckerRuleId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jpeckerRuleId, typedOther.jpeckerRuleId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPaperfareRuleId()).compareTo(typedOther.isSetPaperfareRuleId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPaperfareRuleId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paperfareRuleId, typedOther.paperfareRuleId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTzenRuleId()).compareTo(typedOther.isSetTzenRuleId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTzenRuleId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tzenRuleId, typedOther.tzenRuleId);
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
    StringBuilder sb = new StringBuilder("TzRuleInfo(");
    boolean first = true;

    sb.append("ruleSource:");
    if (this.ruleSource == null) {
      sb.append("null");
    } else {
      sb.append(this.ruleSource);
    }
    first = false;
    if (isSetJpeckerRuleId()) {
      if (!first) sb.append(", ");
      sb.append("jpeckerRuleId:");
      if (this.jpeckerRuleId == null) {
        sb.append("null");
      } else {
        sb.append(this.jpeckerRuleId);
      }
      first = false;
    }
    if (isSetPaperfareRuleId()) {
      if (!first) sb.append(", ");
      sb.append("paperfareRuleId:");
      sb.append(this.paperfareRuleId);
      first = false;
    }
    if (isSetTzenRuleId()) {
      if (!first) sb.append(", ");
      sb.append("tzenRuleId:");
      sb.append(this.tzenRuleId);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (ruleSource == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ruleSource' was not present! Struct: " + toString());
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

  private static class TzRuleInfoStandardSchemeFactory implements SchemeFactory {
    public TzRuleInfoStandardScheme getScheme() {
      return new TzRuleInfoStandardScheme();
    }
  }

  private static class TzRuleInfoStandardScheme extends StandardScheme<TzRuleInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TzRuleInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RULE_SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.ruleSource = RuleSourceEnum.findByValue(iprot.readI32());
              struct.setRuleSourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JPECKER_RULE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jpeckerRuleId = iprot.readString();
              struct.setJpeckerRuleIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PAPERFARE_RULE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.paperfareRuleId = iprot.readI64();
              struct.setPaperfareRuleIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TZEN_RULE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.tzenRuleId = iprot.readI64();
              struct.setTzenRuleIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TzRuleInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ruleSource != null) {
        oprot.writeFieldBegin(RULE_SOURCE_FIELD_DESC);
        oprot.writeI32(struct.ruleSource.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.jpeckerRuleId != null) {
        if (struct.isSetJpeckerRuleId()) {
          oprot.writeFieldBegin(JPECKER_RULE_ID_FIELD_DESC);
          oprot.writeString(struct.jpeckerRuleId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPaperfareRuleId()) {
        oprot.writeFieldBegin(PAPERFARE_RULE_ID_FIELD_DESC);
        oprot.writeI64(struct.paperfareRuleId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTzenRuleId()) {
        oprot.writeFieldBegin(TZEN_RULE_ID_FIELD_DESC);
        oprot.writeI64(struct.tzenRuleId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TzRuleInfoTupleSchemeFactory implements SchemeFactory {
    public TzRuleInfoTupleScheme getScheme() {
      return new TzRuleInfoTupleScheme();
    }
  }

  private static class TzRuleInfoTupleScheme extends TupleScheme<TzRuleInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TzRuleInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.ruleSource.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetJpeckerRuleId()) {
        optionals.set(0);
      }
      if (struct.isSetPaperfareRuleId()) {
        optionals.set(1);
      }
      if (struct.isSetTzenRuleId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetJpeckerRuleId()) {
        oprot.writeString(struct.jpeckerRuleId);
      }
      if (struct.isSetPaperfareRuleId()) {
        oprot.writeI64(struct.paperfareRuleId);
      }
      if (struct.isSetTzenRuleId()) {
        oprot.writeI64(struct.tzenRuleId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TzRuleInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.ruleSource = RuleSourceEnum.findByValue(iprot.readI32());
      struct.setRuleSourceIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.jpeckerRuleId = iprot.readString();
        struct.setJpeckerRuleIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.paperfareRuleId = iprot.readI64();
        struct.setPaperfareRuleIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tzenRuleId = iprot.readI64();
        struct.setTzenRuleIdIsSet(true);
      }
    }
  }

}

