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

public class PenaltiesRemark implements org.apache.thrift.TBase<PenaltiesRemark, PenaltiesRemark._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PenaltiesRemark");

  private static final org.apache.thrift.protocol.TField REMARK_FIELD_DESC = new org.apache.thrift.protocol.TField("remark", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PenaltiesRemarkStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PenaltiesRemarkTupleSchemeFactory());
  }

  public String remark; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REMARK((short)1, "remark");

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
        case 1: // REMARK
          return REMARK;
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
  private _Fields optionals[] = {_Fields.REMARK};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REMARK, new org.apache.thrift.meta_data.FieldMetaData("remark", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PenaltiesRemark.class, metaDataMap);
  }

  public PenaltiesRemark() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PenaltiesRemark(PenaltiesRemark other) {
    if (other.isSetRemark()) {
      this.remark = other.remark;
    }
  }

  public PenaltiesRemark deepCopy() {
    return new PenaltiesRemark(this);
  }

  @Override
  public void clear() {
    this.remark = null;
  }

  public String getRemark() {
    return this.remark;
  }

  public PenaltiesRemark setRemark(String remark) {
    this.remark = remark;
    return this;
  }

  public void unsetRemark() {
    this.remark = null;
  }

  /** Returns true if field remark is set (has been assigned a value) and false otherwise */
  public boolean isSetRemark() {
    return this.remark != null;
  }

  public void setRemarkIsSet(boolean value) {
    if (!value) {
      this.remark = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REMARK:
      if (value == null) {
        unsetRemark();
      } else {
        setRemark((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REMARK:
      return getRemark();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REMARK:
      return isSetRemark();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PenaltiesRemark)
      return this.equals((PenaltiesRemark)that);
    return false;
  }

  public boolean equals(PenaltiesRemark that) {
    if (that == null)
      return false;

    boolean this_present_remark = true && this.isSetRemark();
    boolean that_present_remark = true && that.isSetRemark();
    if (this_present_remark || that_present_remark) {
      if (!(this_present_remark && that_present_remark))
        return false;
      if (!this.remark.equals(that.remark))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(PenaltiesRemark other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PenaltiesRemark typedOther = (PenaltiesRemark)other;

    lastComparison = Boolean.valueOf(isSetRemark()).compareTo(typedOther.isSetRemark());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemark()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.remark, typedOther.remark);
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
    StringBuilder sb = new StringBuilder("PenaltiesRemark(");
    boolean first = true;

    if (isSetRemark()) {
      sb.append("remark:");
      if (this.remark == null) {
        sb.append("null");
      } else {
        sb.append(this.remark);
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

  private static class PenaltiesRemarkStandardSchemeFactory implements SchemeFactory {
    public PenaltiesRemarkStandardScheme getScheme() {
      return new PenaltiesRemarkStandardScheme();
    }
  }

  private static class PenaltiesRemarkStandardScheme extends StandardScheme<PenaltiesRemark> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PenaltiesRemark struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REMARK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.remark = iprot.readString();
              struct.setRemarkIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PenaltiesRemark struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.remark != null) {
        if (struct.isSetRemark()) {
          oprot.writeFieldBegin(REMARK_FIELD_DESC);
          oprot.writeString(struct.remark);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PenaltiesRemarkTupleSchemeFactory implements SchemeFactory {
    public PenaltiesRemarkTupleScheme getScheme() {
      return new PenaltiesRemarkTupleScheme();
    }
  }

  private static class PenaltiesRemarkTupleScheme extends TupleScheme<PenaltiesRemark> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PenaltiesRemark struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRemark()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRemark()) {
        oprot.writeString(struct.remark);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PenaltiesRemark struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.remark = iprot.readString();
        struct.setRemarkIsSet(true);
      }
    }
  }

}

