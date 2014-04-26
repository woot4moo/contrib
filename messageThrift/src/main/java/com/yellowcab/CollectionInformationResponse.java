/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.yellowcab;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.server.AbstractNonblockingServer.*;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * * This message is sent in response to a TAXII Collection Information Request if the request is successful. If
 *   there is an error condition, a TAXII Status Message indicating the nature of the error is sent instead.
 *   Note that the Producer is under no obligation to list all Collections and can exclude any or all Collections
 *   from this response for any reason. For example, the Producer might wish to exclude Collections created
 *   for a specific customer from a list of all Collections. As such, different requesters might be given
 *   different lists of Collections to their requests to the same Collection Management Service.
 * *
 */
public class CollectionInformationResponse implements org.apache.thrift.TBase<CollectionInformationResponse, CollectionInformationResponse._Fields>, java.io.Serializable, Cloneable, Comparable<CollectionInformationResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CollectionInformationResponse");

  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField COLLECTION_INFORMATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("collectionInformations", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CollectionInformationResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CollectionInformationResponseTupleSchemeFactory());
  }

  public TAXIIHeader header; // required
  /**
   * 
   * @see MessageStatusType
   */
  public MessageStatusType status; // optional
  public List<CollectionInformation> collectionInformations; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER((short)1, "header"),
    /**
     * 
     * @see MessageStatusType
     */
    STATUS((short)2, "status"),
    COLLECTION_INFORMATIONS((short)3, "collectionInformations");

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
        case 1: // HEADER
          return HEADER;
        case 2: // STATUS
          return STATUS;
        case 3: // COLLECTION_INFORMATIONS
          return COLLECTION_INFORMATIONS;
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
  private _Fields optionals[] = {_Fields.STATUS, _Fields.COLLECTION_INFORMATIONS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TAXIIHeader.class)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MessageStatusType.class)));
    tmpMap.put(_Fields.COLLECTION_INFORMATIONS, new org.apache.thrift.meta_data.FieldMetaData("collectionInformations", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CollectionInformation.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CollectionInformationResponse.class, metaDataMap);
  }

  public CollectionInformationResponse() {
  }

  public CollectionInformationResponse(
    TAXIIHeader header)
  {
    this();
    this.header = header;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CollectionInformationResponse(CollectionInformationResponse other) {
    if (other.isSetHeader()) {
      this.header = new TAXIIHeader(other.header);
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetCollectionInformations()) {
      List<CollectionInformation> __this__collectionInformations = new ArrayList<CollectionInformation>(other.collectionInformations.size());
      for (CollectionInformation other_element : other.collectionInformations) {
        __this__collectionInformations.add(new CollectionInformation(other_element));
      }
      this.collectionInformations = __this__collectionInformations;
    }
  }

  public CollectionInformationResponse deepCopy() {
    return new CollectionInformationResponse(this);
  }

  @Override
  public void clear() {
    this.header = null;
    this.status = null;
    this.collectionInformations = null;
  }

  public TAXIIHeader getHeader() {
    return this.header;
  }

  public CollectionInformationResponse setHeader(TAXIIHeader header) {
    this.header = header;
    return this;
  }

  public void unsetHeader() {
    this.header = null;
  }

  /** Returns true if field header is set (has been assigned a value) and false otherwise */
  public boolean isSetHeader() {
    return this.header != null;
  }

  public void setHeaderIsSet(boolean value) {
    if (!value) {
      this.header = null;
    }
  }

  /**
   * 
   * @see MessageStatusType
   */
  public MessageStatusType getStatus() {
    return this.status;
  }

  /**
   * 
   * @see MessageStatusType
   */
  public CollectionInformationResponse setStatus(MessageStatusType status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public int getCollectionInformationsSize() {
    return (this.collectionInformations == null) ? 0 : this.collectionInformations.size();
  }

  public java.util.Iterator<CollectionInformation> getCollectionInformationsIterator() {
    return (this.collectionInformations == null) ? null : this.collectionInformations.iterator();
  }

  public void addToCollectionInformations(CollectionInformation elem) {
    if (this.collectionInformations == null) {
      this.collectionInformations = new ArrayList<CollectionInformation>();
    }
    this.collectionInformations.add(elem);
  }

  public List<CollectionInformation> getCollectionInformations() {
    return this.collectionInformations;
  }

  public CollectionInformationResponse setCollectionInformations(List<CollectionInformation> collectionInformations) {
    this.collectionInformations = collectionInformations;
    return this;
  }

  public void unsetCollectionInformations() {
    this.collectionInformations = null;
  }

  /** Returns true if field collectionInformations is set (has been assigned a value) and false otherwise */
  public boolean isSetCollectionInformations() {
    return this.collectionInformations != null;
  }

  public void setCollectionInformationsIsSet(boolean value) {
    if (!value) {
      this.collectionInformations = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEADER:
      if (value == null) {
        unsetHeader();
      } else {
        setHeader((TAXIIHeader)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((MessageStatusType)value);
      }
      break;

    case COLLECTION_INFORMATIONS:
      if (value == null) {
        unsetCollectionInformations();
      } else {
        setCollectionInformations((List<CollectionInformation>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER:
      return getHeader();

    case STATUS:
      return getStatus();

    case COLLECTION_INFORMATIONS:
      return getCollectionInformations();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HEADER:
      return isSetHeader();
    case STATUS:
      return isSetStatus();
    case COLLECTION_INFORMATIONS:
      return isSetCollectionInformations();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CollectionInformationResponse)
      return this.equals((CollectionInformationResponse)that);
    return false;
  }

  public boolean equals(CollectionInformationResponse that) {
    if (that == null)
      return false;

    boolean this_present_header = true && this.isSetHeader();
    boolean that_present_header = true && that.isSetHeader();
    if (this_present_header || that_present_header) {
      if (!(this_present_header && that_present_header))
        return false;
      if (!this.header.equals(that.header))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_collectionInformations = true && this.isSetCollectionInformations();
    boolean that_present_collectionInformations = true && that.isSetCollectionInformations();
    if (this_present_collectionInformations || that_present_collectionInformations) {
      if (!(this_present_collectionInformations && that_present_collectionInformations))
        return false;
      if (!this.collectionInformations.equals(that.collectionInformations))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CollectionInformationResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHeader()).compareTo(other.isSetHeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.header, other.header);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCollectionInformations()).compareTo(other.isSetCollectionInformations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCollectionInformations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.collectionInformations, other.collectionInformations);
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
    StringBuilder sb = new StringBuilder("CollectionInformationResponse(");
    boolean first = true;

    sb.append("header:");
    if (this.header == null) {
      sb.append("null");
    } else {
      sb.append(this.header);
    }
    first = false;
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    if (isSetCollectionInformations()) {
      if (!first) sb.append(", ");
      sb.append("collectionInformations:");
      if (this.collectionInformations == null) {
        sb.append("null");
      } else {
        sb.append(this.collectionInformations);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (header == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'header' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (header != null) {
      header.validate();
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

  private static class CollectionInformationResponseStandardSchemeFactory implements SchemeFactory {
    public CollectionInformationResponseStandardScheme getScheme() {
      return new CollectionInformationResponseStandardScheme();
    }
  }

  private static class CollectionInformationResponseStandardScheme extends StandardScheme<CollectionInformationResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CollectionInformationResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HEADER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.header = new TAXIIHeader();
              struct.header.read(iprot);
              struct.setHeaderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = MessageStatusType.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COLLECTION_INFORMATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list168 = iprot.readListBegin();
                struct.collectionInformations = new ArrayList<CollectionInformation>(_list168.size);
                for (int _i169 = 0; _i169 < _list168.size; ++_i169)
                {
                  CollectionInformation _elem170;
                  _elem170 = new CollectionInformation();
                  _elem170.read(iprot);
                  struct.collectionInformations.add(_elem170);
                }
                iprot.readListEnd();
              }
              struct.setCollectionInformationsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CollectionInformationResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.header != null) {
        oprot.writeFieldBegin(HEADER_FIELD_DESC);
        struct.header.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          oprot.writeI32(struct.status.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.collectionInformations != null) {
        if (struct.isSetCollectionInformations()) {
          oprot.writeFieldBegin(COLLECTION_INFORMATIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.collectionInformations.size()));
            for (CollectionInformation _iter171 : struct.collectionInformations)
            {
              _iter171.write(oprot);
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

  private static class CollectionInformationResponseTupleSchemeFactory implements SchemeFactory {
    public CollectionInformationResponseTupleScheme getScheme() {
      return new CollectionInformationResponseTupleScheme();
    }
  }

  private static class CollectionInformationResponseTupleScheme extends TupleScheme<CollectionInformationResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CollectionInformationResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.header.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetCollectionInformations()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetCollectionInformations()) {
        {
          oprot.writeI32(struct.collectionInformations.size());
          for (CollectionInformation _iter172 : struct.collectionInformations)
          {
            _iter172.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CollectionInformationResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.header = new TAXIIHeader();
      struct.header.read(iprot);
      struct.setHeaderIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.status = MessageStatusType.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list173 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.collectionInformations = new ArrayList<CollectionInformation>(_list173.size);
          for (int _i174 = 0; _i174 < _list173.size; ++_i174)
          {
            CollectionInformation _elem175;
            _elem175 = new CollectionInformation();
            _elem175.read(iprot);
            struct.collectionInformations.add(_elem175);
          }
        }
        struct.setCollectionInformationsIsSet(true);
      }
    }
  }

}

