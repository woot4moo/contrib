/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.yellowcab;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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

public class InboxServiceContent implements org.apache.thrift.TBase<InboxServiceContent, InboxServiceContent._Fields>, java.io.Serializable, Cloneable, Comparable<InboxServiceContent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InboxServiceContent");

  private static final org.apache.thrift.protocol.TField SUBTYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("subtypes", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InboxServiceContentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InboxServiceContentTupleSchemeFactory());
  }

  /**
   * * This field identifies content binding subtypes of the specified
   *   Content Binding. Each Subtype MUST be a Content Binding
   *   Subtype ID as defined in the TAXII Content Binding
   *   Reference or by a third party. Absence of this field indicates
   *   that the Inbox Service accepts all subtypes of the specified
   *   Content Binding.
   * 
   * *
   */
  public List<String> subtypes; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * * This field identifies content binding subtypes of the specified
     *   Content Binding. Each Subtype MUST be a Content Binding
     *   Subtype ID as defined in the TAXII Content Binding
     *   Reference or by a third party. Absence of this field indicates
     *   that the Inbox Service accepts all subtypes of the specified
     *   Content Binding.
     * 
     * *
     */
    SUBTYPES((short)1, "subtypes");

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
        case 1: // SUBTYPES
          return SUBTYPES;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUBTYPES, new org.apache.thrift.meta_data.FieldMetaData("subtypes", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InboxServiceContent.class, metaDataMap);
  }

  public InboxServiceContent() {
  }

  public InboxServiceContent(
    List<String> subtypes)
  {
    this();
    this.subtypes = subtypes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InboxServiceContent(InboxServiceContent other) {
    if (other.isSetSubtypes()) {
      List<String> __this__subtypes = new ArrayList<String>(other.subtypes);
      this.subtypes = __this__subtypes;
    }
  }

  public InboxServiceContent deepCopy() {
    return new InboxServiceContent(this);
  }

  @Override
  public void clear() {
    this.subtypes = null;
  }

  public int getSubtypesSize() {
    return (this.subtypes == null) ? 0 : this.subtypes.size();
  }

  public java.util.Iterator<String> getSubtypesIterator() {
    return (this.subtypes == null) ? null : this.subtypes.iterator();
  }

  public void addToSubtypes(String elem) {
    if (this.subtypes == null) {
      this.subtypes = new ArrayList<String>();
    }
    this.subtypes.add(elem);
  }

  /**
   * * This field identifies content binding subtypes of the specified
   *   Content Binding. Each Subtype MUST be a Content Binding
   *   Subtype ID as defined in the TAXII Content Binding
   *   Reference or by a third party. Absence of this field indicates
   *   that the Inbox Service accepts all subtypes of the specified
   *   Content Binding.
   * 
   * *
   */
  public List<String> getSubtypes() {
    return this.subtypes;
  }

  /**
   * * This field identifies content binding subtypes of the specified
   *   Content Binding. Each Subtype MUST be a Content Binding
   *   Subtype ID as defined in the TAXII Content Binding
   *   Reference or by a third party. Absence of this field indicates
   *   that the Inbox Service accepts all subtypes of the specified
   *   Content Binding.
   * 
   * *
   */
  public InboxServiceContent setSubtypes(List<String> subtypes) {
    this.subtypes = subtypes;
    return this;
  }

  public void unsetSubtypes() {
    this.subtypes = null;
  }

  /** Returns true if field subtypes is set (has been assigned a value) and false otherwise */
  public boolean isSetSubtypes() {
    return this.subtypes != null;
  }

  public void setSubtypesIsSet(boolean value) {
    if (!value) {
      this.subtypes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUBTYPES:
      if (value == null) {
        unsetSubtypes();
      } else {
        setSubtypes((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUBTYPES:
      return getSubtypes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUBTYPES:
      return isSetSubtypes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InboxServiceContent)
      return this.equals((InboxServiceContent)that);
    return false;
  }

  public boolean equals(InboxServiceContent that) {
    if (that == null)
      return false;

    boolean this_present_subtypes = true && this.isSetSubtypes();
    boolean that_present_subtypes = true && that.isSetSubtypes();
    if (this_present_subtypes || that_present_subtypes) {
      if (!(this_present_subtypes && that_present_subtypes))
        return false;
      if (!this.subtypes.equals(that.subtypes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(InboxServiceContent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSubtypes()).compareTo(other.isSetSubtypes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubtypes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subtypes, other.subtypes);
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
    StringBuilder sb = new StringBuilder("InboxServiceContent(");
    boolean first = true;

    sb.append("subtypes:");
    if (this.subtypes == null) {
      sb.append("null");
    } else {
      sb.append(this.subtypes);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (subtypes == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'subtypes' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class InboxServiceContentStandardSchemeFactory implements SchemeFactory {
    public InboxServiceContentStandardScheme getScheme() {
      return new InboxServiceContentStandardScheme();
    }
  }

  private static class InboxServiceContentStandardScheme extends StandardScheme<InboxServiceContent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InboxServiceContent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUBTYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.subtypes = new ArrayList<String>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  String _elem18;
                  _elem18 = iprot.readString();
                  struct.subtypes.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setSubtypesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, InboxServiceContent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.subtypes != null) {
        oprot.writeFieldBegin(SUBTYPES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.subtypes.size()));
          for (String _iter19 : struct.subtypes)
          {
            oprot.writeString(_iter19);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InboxServiceContentTupleSchemeFactory implements SchemeFactory {
    public InboxServiceContentTupleScheme getScheme() {
      return new InboxServiceContentTupleScheme();
    }
  }

  private static class InboxServiceContentTupleScheme extends TupleScheme<InboxServiceContent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InboxServiceContent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.subtypes.size());
        for (String _iter20 : struct.subtypes)
        {
          oprot.writeString(_iter20);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InboxServiceContent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.subtypes = new ArrayList<String>(_list21.size);
        for (int _i22 = 0; _i22 < _list21.size; ++_i22)
        {
          String _elem23;
          _elem23 = iprot.readString();
          struct.subtypes.add(_elem23);
        }
      }
      struct.setSubtypesIsSet(true);
    }
  }

}

