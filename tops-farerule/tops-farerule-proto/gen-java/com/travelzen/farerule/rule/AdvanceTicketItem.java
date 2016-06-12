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

public class AdvanceTicketItem implements org.apache.thrift.TBase<AdvanceTicketItem, AdvanceTicketItem._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AdvanceTicketItem");

  private static final org.apache.thrift.protocol.TField ORIGIN_CONDITION_FIELD_DESC = new org.apache.thrift.protocol.TField("originCondition", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ADVANCE_TICKET_SUB_ITEM_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("advanceTicketSubItemList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AdvanceTicketItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AdvanceTicketItemTupleSchemeFactory());
  }

  public com.travelzen.farerule.condition.OriginCondition originCondition; // optional
  public List<AdvanceTicketSubItem> advanceTicketSubItemList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORIGIN_CONDITION((short)1, "originCondition"),
    ADVANCE_TICKET_SUB_ITEM_LIST((short)2, "advanceTicketSubItemList");

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
        case 2: // ADVANCE_TICKET_SUB_ITEM_LIST
          return ADVANCE_TICKET_SUB_ITEM_LIST;
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
  private _Fields optionals[] = {_Fields.ORIGIN_CONDITION,_Fields.ADVANCE_TICKET_SUB_ITEM_LIST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ORIGIN_CONDITION, new org.apache.thrift.meta_data.FieldMetaData("originCondition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.travelzen.farerule.condition.OriginCondition.class)));
    tmpMap.put(_Fields.ADVANCE_TICKET_SUB_ITEM_LIST, new org.apache.thrift.meta_data.FieldMetaData("advanceTicketSubItemList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AdvanceTicketSubItem.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AdvanceTicketItem.class, metaDataMap);
  }

  public AdvanceTicketItem() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AdvanceTicketItem(AdvanceTicketItem other) {
    if (other.isSetOriginCondition()) {
      this.originCondition = new com.travelzen.farerule.condition.OriginCondition(other.originCondition);
    }
    if (other.isSetAdvanceTicketSubItemList()) {
      List<AdvanceTicketSubItem> __this__advanceTicketSubItemList = new ArrayList<AdvanceTicketSubItem>();
      for (AdvanceTicketSubItem other_element : other.advanceTicketSubItemList) {
        __this__advanceTicketSubItemList.add(new AdvanceTicketSubItem(other_element));
      }
      this.advanceTicketSubItemList = __this__advanceTicketSubItemList;
    }
  }

  public AdvanceTicketItem deepCopy() {
    return new AdvanceTicketItem(this);
  }

  @Override
  public void clear() {
    this.originCondition = null;
    this.advanceTicketSubItemList = null;
  }

  public com.travelzen.farerule.condition.OriginCondition getOriginCondition() {
    return this.originCondition;
  }

  public AdvanceTicketItem setOriginCondition(com.travelzen.farerule.condition.OriginCondition originCondition) {
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

  public int getAdvanceTicketSubItemListSize() {
    return (this.advanceTicketSubItemList == null) ? 0 : this.advanceTicketSubItemList.size();
  }

  public java.util.Iterator<AdvanceTicketSubItem> getAdvanceTicketSubItemListIterator() {
    return (this.advanceTicketSubItemList == null) ? null : this.advanceTicketSubItemList.iterator();
  }

  public void addToAdvanceTicketSubItemList(AdvanceTicketSubItem elem) {
    if (this.advanceTicketSubItemList == null) {
      this.advanceTicketSubItemList = new ArrayList<AdvanceTicketSubItem>();
    }
    this.advanceTicketSubItemList.add(elem);
  }

  public List<AdvanceTicketSubItem> getAdvanceTicketSubItemList() {
    return this.advanceTicketSubItemList;
  }

  public AdvanceTicketItem setAdvanceTicketSubItemList(List<AdvanceTicketSubItem> advanceTicketSubItemList) {
    this.advanceTicketSubItemList = advanceTicketSubItemList;
    return this;
  }

  public void unsetAdvanceTicketSubItemList() {
    this.advanceTicketSubItemList = null;
  }

  /** Returns true if field advanceTicketSubItemList is set (has been assigned a value) and false otherwise */
  public boolean isSetAdvanceTicketSubItemList() {
    return this.advanceTicketSubItemList != null;
  }

  public void setAdvanceTicketSubItemListIsSet(boolean value) {
    if (!value) {
      this.advanceTicketSubItemList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ORIGIN_CONDITION:
      if (value == null) {
        unsetOriginCondition();
      } else {
        setOriginCondition((com.travelzen.farerule.condition.OriginCondition)value);
      }
      break;

    case ADVANCE_TICKET_SUB_ITEM_LIST:
      if (value == null) {
        unsetAdvanceTicketSubItemList();
      } else {
        setAdvanceTicketSubItemList((List<AdvanceTicketSubItem>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ORIGIN_CONDITION:
      return getOriginCondition();

    case ADVANCE_TICKET_SUB_ITEM_LIST:
      return getAdvanceTicketSubItemList();

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
    case ADVANCE_TICKET_SUB_ITEM_LIST:
      return isSetAdvanceTicketSubItemList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AdvanceTicketItem)
      return this.equals((AdvanceTicketItem)that);
    return false;
  }

  public boolean equals(AdvanceTicketItem that) {
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

    boolean this_present_advanceTicketSubItemList = true && this.isSetAdvanceTicketSubItemList();
    boolean that_present_advanceTicketSubItemList = true && that.isSetAdvanceTicketSubItemList();
    if (this_present_advanceTicketSubItemList || that_present_advanceTicketSubItemList) {
      if (!(this_present_advanceTicketSubItemList && that_present_advanceTicketSubItemList))
        return false;
      if (!this.advanceTicketSubItemList.equals(that.advanceTicketSubItemList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(AdvanceTicketItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    AdvanceTicketItem typedOther = (AdvanceTicketItem)other;

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
    lastComparison = Boolean.valueOf(isSetAdvanceTicketSubItemList()).compareTo(typedOther.isSetAdvanceTicketSubItemList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdvanceTicketSubItemList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.advanceTicketSubItemList, typedOther.advanceTicketSubItemList);
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
    StringBuilder sb = new StringBuilder("AdvanceTicketItem(");
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
    if (isSetAdvanceTicketSubItemList()) {
      if (!first) sb.append(", ");
      sb.append("advanceTicketSubItemList:");
      if (this.advanceTicketSubItemList == null) {
        sb.append("null");
      } else {
        sb.append(this.advanceTicketSubItemList);
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

  private static class AdvanceTicketItemStandardSchemeFactory implements SchemeFactory {
    public AdvanceTicketItemStandardScheme getScheme() {
      return new AdvanceTicketItemStandardScheme();
    }
  }

  private static class AdvanceTicketItemStandardScheme extends StandardScheme<AdvanceTicketItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AdvanceTicketItem struct) throws org.apache.thrift.TException {
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
              struct.originCondition = new com.travelzen.farerule.condition.OriginCondition();
              struct.originCondition.read(iprot);
              struct.setOriginConditionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ADVANCE_TICKET_SUB_ITEM_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.advanceTicketSubItemList = new ArrayList<AdvanceTicketSubItem>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  AdvanceTicketSubItem _elem10; // required
                  _elem10 = new AdvanceTicketSubItem();
                  _elem10.read(iprot);
                  struct.advanceTicketSubItemList.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setAdvanceTicketSubItemListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AdvanceTicketItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.originCondition != null) {
        if (struct.isSetOriginCondition()) {
          oprot.writeFieldBegin(ORIGIN_CONDITION_FIELD_DESC);
          struct.originCondition.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.advanceTicketSubItemList != null) {
        if (struct.isSetAdvanceTicketSubItemList()) {
          oprot.writeFieldBegin(ADVANCE_TICKET_SUB_ITEM_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.advanceTicketSubItemList.size()));
            for (AdvanceTicketSubItem _iter11 : struct.advanceTicketSubItemList)
            {
              _iter11.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AdvanceTicketItemTupleSchemeFactory implements SchemeFactory {
    public AdvanceTicketItemTupleScheme getScheme() {
      return new AdvanceTicketItemTupleScheme();
    }
  }

  private static class AdvanceTicketItemTupleScheme extends TupleScheme<AdvanceTicketItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AdvanceTicketItem struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOriginCondition()) {
        optionals.set(0);
      }
      if (struct.isSetAdvanceTicketSubItemList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetOriginCondition()) {
        struct.originCondition.write(oprot);
      }
      if (struct.isSetAdvanceTicketSubItemList()) {
        {
          oprot.writeI32(struct.advanceTicketSubItemList.size());
          for (AdvanceTicketSubItem _iter12 : struct.advanceTicketSubItemList)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AdvanceTicketItem struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.originCondition = new com.travelzen.farerule.condition.OriginCondition();
        struct.originCondition.read(iprot);
        struct.setOriginConditionIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.advanceTicketSubItemList = new ArrayList<AdvanceTicketSubItem>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            AdvanceTicketSubItem _elem15; // required
            _elem15 = new AdvanceTicketSubItem();
            _elem15.read(iprot);
            struct.advanceTicketSubItemList.add(_elem15);
          }
        }
        struct.setAdvanceTicketSubItemListIsSet(true);
      }
    }
  }

}
