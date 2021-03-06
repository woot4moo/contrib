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

/**
 * Represents the status of a message.
 * 
 */
public class MessageStatus implements org.apache.thrift.TBase<MessageStatus, MessageStatus._Fields>, java.io.Serializable, Cloneable, Comparable<MessageStatus> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MessageStatus");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField STATUS_DETAILS_FIELD_DESC = new org.apache.thrift.protocol.TField("statusDetails", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MessageStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MessageStatusTupleSchemeFactory());
  }

  /**
   * 
   * @see MessageStatusType
   */
  public MessageStatusType status; // required
  /**
   *  Additional information for the status. There is no expectation
   *  that this field be interpretable by a machine; it is instead
   *  targeted to a human operator.
   * *
   */
  public String description; // optional
  public Message message; // required
  /**
   *   Additional information for the status. There is no expectation
   *   that this field be interpretable by a machine; it is instead
   *   targeted to a human operator.
   * *
   */
  public List<MessageStatusDetail> statusDetails; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see MessageStatusType
     */
    STATUS((short)1, "status"),
    /**
     *  Additional information for the status. There is no expectation
     *  that this field be interpretable by a machine; it is instead
     *  targeted to a human operator.
     * *
     */
    DESCRIPTION((short)2, "description"),
    MESSAGE((short)3, "message"),
    /**
     *   Additional information for the status. There is no expectation
     *   that this field be interpretable by a machine; it is instead
     *   targeted to a human operator.
     * *
     */
    STATUS_DETAILS((short)4, "statusDetails");

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
        case 1: // STATUS
          return STATUS;
        case 2: // DESCRIPTION
          return DESCRIPTION;
        case 3: // MESSAGE
          return MESSAGE;
        case 4: // STATUS_DETAILS
          return STATUS_DETAILS;
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
  private _Fields optionals[] = {_Fields.DESCRIPTION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MessageStatusType.class)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Message.class)));
    tmpMap.put(_Fields.STATUS_DETAILS, new org.apache.thrift.meta_data.FieldMetaData("statusDetails", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MessageStatusDetail.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MessageStatus.class, metaDataMap);
  }

  public MessageStatus() {
  }

  public MessageStatus(
    MessageStatusType status,
    Message message,
    List<MessageStatusDetail> statusDetails)
  {
    this();
    this.status = status;
    this.message = message;
    this.statusDetails = statusDetails;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MessageStatus(MessageStatus other) {
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    if (other.isSetMessage()) {
      this.message = new Message(other.message);
    }
    if (other.isSetStatusDetails()) {
      List<MessageStatusDetail> __this__statusDetails = new ArrayList<MessageStatusDetail>(other.statusDetails.size());
      for (MessageStatusDetail other_element : other.statusDetails) {
        __this__statusDetails.add(new MessageStatusDetail(other_element));
      }
      this.statusDetails = __this__statusDetails;
    }
  }

  public MessageStatus deepCopy() {
    return new MessageStatus(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.description = null;
    this.message = null;
    this.statusDetails = null;
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
  public MessageStatus setStatus(MessageStatusType status) {
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

  /**
   *  Additional information for the status. There is no expectation
   *  that this field be interpretable by a machine; it is instead
   *  targeted to a human operator.
   * *
   */
  public String getDescription() {
    return this.description;
  }

  /**
   *  Additional information for the status. There is no expectation
   *  that this field be interpretable by a machine; it is instead
   *  targeted to a human operator.
   * *
   */
  public MessageStatus setDescription(String description) {
    this.description = description;
    return this;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public Message getMessage() {
    return this.message;
  }

  public MessageStatus setMessage(Message message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public int getStatusDetailsSize() {
    return (this.statusDetails == null) ? 0 : this.statusDetails.size();
  }

  public java.util.Iterator<MessageStatusDetail> getStatusDetailsIterator() {
    return (this.statusDetails == null) ? null : this.statusDetails.iterator();
  }

  public void addToStatusDetails(MessageStatusDetail elem) {
    if (this.statusDetails == null) {
      this.statusDetails = new ArrayList<MessageStatusDetail>();
    }
    this.statusDetails.add(elem);
  }

  /**
   *   Additional information for the status. There is no expectation
   *   that this field be interpretable by a machine; it is instead
   *   targeted to a human operator.
   * *
   */
  public List<MessageStatusDetail> getStatusDetails() {
    return this.statusDetails;
  }

  /**
   *   Additional information for the status. There is no expectation
   *   that this field be interpretable by a machine; it is instead
   *   targeted to a human operator.
   * *
   */
  public MessageStatus setStatusDetails(List<MessageStatusDetail> statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  public void unsetStatusDetails() {
    this.statusDetails = null;
  }

  /** Returns true if field statusDetails is set (has been assigned a value) and false otherwise */
  public boolean isSetStatusDetails() {
    return this.statusDetails != null;
  }

  public void setStatusDetailsIsSet(boolean value) {
    if (!value) {
      this.statusDetails = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((MessageStatusType)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((String)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((Message)value);
      }
      break;

    case STATUS_DETAILS:
      if (value == null) {
        unsetStatusDetails();
      } else {
        setStatusDetails((List<MessageStatusDetail>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case DESCRIPTION:
      return getDescription();

    case MESSAGE:
      return getMessage();

    case STATUS_DETAILS:
      return getStatusDetails();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case DESCRIPTION:
      return isSetDescription();
    case MESSAGE:
      return isSetMessage();
    case STATUS_DETAILS:
      return isSetStatusDetails();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MessageStatus)
      return this.equals((MessageStatus)that);
    return false;
  }

  public boolean equals(MessageStatus that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_statusDetails = true && this.isSetStatusDetails();
    boolean that_present_statusDetails = true && that.isSetStatusDetails();
    if (this_present_statusDetails || that_present_statusDetails) {
      if (!(this_present_statusDetails && that_present_statusDetails))
        return false;
      if (!this.statusDetails.equals(that.statusDetails))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(MessageStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatusDetails()).compareTo(other.isSetStatusDetails());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatusDetails()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statusDetails, other.statusDetails);
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
    StringBuilder sb = new StringBuilder("MessageStatus(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetDescription()) {
      if (!first) sb.append(", ");
      sb.append("description:");
      if (this.description == null) {
        sb.append("null");
      } else {
        sb.append(this.description);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("statusDetails:");
    if (this.statusDetails == null) {
      sb.append("null");
    } else {
      sb.append(this.statusDetails);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
    if (message == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'message' was not present! Struct: " + toString());
    }
    if (statusDetails == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'statusDetails' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (message != null) {
      message.validate();
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

  private static class MessageStatusStandardSchemeFactory implements SchemeFactory {
    public MessageStatusStandardScheme getScheme() {
      return new MessageStatusStandardScheme();
    }
  }

  private static class MessageStatusStandardScheme extends StandardScheme<MessageStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MessageStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = MessageStatusType.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.message = new Message();
              struct.message.read(iprot);
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATUS_DETAILS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list48 = iprot.readListBegin();
                struct.statusDetails = new ArrayList<MessageStatusDetail>(_list48.size);
                for (int _i49 = 0; _i49 < _list48.size; ++_i49)
                {
                  MessageStatusDetail _elem50;
                  _elem50 = new MessageStatusDetail();
                  _elem50.read(iprot);
                  struct.statusDetails.add(_elem50);
                }
                iprot.readListEnd();
              }
              struct.setStatusDetailsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MessageStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.description != null) {
        if (struct.isSetDescription()) {
          oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.description);
          oprot.writeFieldEnd();
        }
      }
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        struct.message.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.statusDetails != null) {
        oprot.writeFieldBegin(STATUS_DETAILS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.statusDetails.size()));
          for (MessageStatusDetail _iter51 : struct.statusDetails)
          {
            _iter51.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageStatusTupleSchemeFactory implements SchemeFactory {
    public MessageStatusTupleScheme getScheme() {
      return new MessageStatusTupleScheme();
    }
  }

  private static class MessageStatusTupleScheme extends TupleScheme<MessageStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MessageStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.status.getValue());
      struct.message.write(oprot);
      {
        oprot.writeI32(struct.statusDetails.size());
        for (MessageStatusDetail _iter52 : struct.statusDetails)
        {
          _iter52.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetDescription()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MessageStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.status = MessageStatusType.findByValue(iprot.readI32());
      struct.setStatusIsSet(true);
      struct.message = new Message();
      struct.message.read(iprot);
      struct.setMessageIsSet(true);
      {
        org.apache.thrift.protocol.TList _list53 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.statusDetails = new ArrayList<MessageStatusDetail>(_list53.size);
        for (int _i54 = 0; _i54 < _list53.size; ++_i54)
        {
          MessageStatusDetail _elem55;
          _elem55 = new MessageStatusDetail();
          _elem55.read(iprot);
          struct.statusDetails.add(_elem55);
        }
      }
      struct.setStatusDetailsIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
    }
  }

}

