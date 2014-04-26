/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.yellowcab;

import org.apache.thrift.TException;
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
 * * This message is sent from a Discovery Service in response to a TAXII Discovery Request if the request is
 *   successful. If there is an error condition, a TAXII Status Message indicating the nature of the error is sent
 *   instead.
 * 
 * *
 */
public class DiscoveryResponseMessage implements org.apache.thrift.TBase<DiscoveryResponseMessage, DiscoveryResponseMessage._Fields>, java.io.Serializable, Cloneable, Comparable<DiscoveryResponseMessage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DiscoveryResponseMessage");

  private static final org.apache.thrift.protocol.TField SERVICE_INSTANCES_FIELD_DESC = new org.apache.thrift.protocol.TField("serviceInstances", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DiscoveryResponseMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DiscoveryResponseMessageTupleSchemeFactory());
  }

  /**
   * * This field MAY appear any number of times (including 0),
   *   each time identifying a different instance of a TAXII Service.
   *   This field has several sub-fields. Absence of this field
   *   indicates that there are no TAXII Services that can be
   *   revealed to the requester.
   * 
   * *
   */
  public List<ServiceInstance> serviceInstances; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * * This field MAY appear any number of times (including 0),
     *   each time identifying a different instance of a TAXII Service.
     *   This field has several sub-fields. Absence of this field
     *   indicates that there are no TAXII Services that can be
     *   revealed to the requester.
     * 
     * *
     */
    SERVICE_INSTANCES((short)1, "serviceInstances");

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
        case 1: // SERVICE_INSTANCES
          return SERVICE_INSTANCES;
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
  private _Fields optionals[] = {_Fields.SERVICE_INSTANCES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SERVICE_INSTANCES, new org.apache.thrift.meta_data.FieldMetaData("serviceInstances", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ServiceInstance.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DiscoveryResponseMessage.class, metaDataMap);
  }

  public DiscoveryResponseMessage() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DiscoveryResponseMessage(DiscoveryResponseMessage other) {
    if (other.isSetServiceInstances()) {
      List<ServiceInstance> __this__serviceInstances = new ArrayList<ServiceInstance>(other.serviceInstances.size());
      for (ServiceInstance other_element : other.serviceInstances) {
        __this__serviceInstances.add(new ServiceInstance(other_element));
      }
      this.serviceInstances = __this__serviceInstances;
    }
  }

  public DiscoveryResponseMessage deepCopy() {
    return new DiscoveryResponseMessage(this);
  }

  @Override
  public void clear() {
    this.serviceInstances = null;
  }

  public int getServiceInstancesSize() {
    return (this.serviceInstances == null) ? 0 : this.serviceInstances.size();
  }

  public java.util.Iterator<ServiceInstance> getServiceInstancesIterator() {
    return (this.serviceInstances == null) ? null : this.serviceInstances.iterator();
  }

  public void addToServiceInstances(ServiceInstance elem) {
    if (this.serviceInstances == null) {
      this.serviceInstances = new ArrayList<ServiceInstance>();
    }
    this.serviceInstances.add(elem);
  }

  /**
   * * This field MAY appear any number of times (including 0),
   *   each time identifying a different instance of a TAXII Service.
   *   This field has several sub-fields. Absence of this field
   *   indicates that there are no TAXII Services that can be
   *   revealed to the requester.
   * 
   * *
   */
  public List<ServiceInstance> getServiceInstances() {
    return this.serviceInstances;
  }

  /**
   * * This field MAY appear any number of times (including 0),
   *   each time identifying a different instance of a TAXII Service.
   *   This field has several sub-fields. Absence of this field
   *   indicates that there are no TAXII Services that can be
   *   revealed to the requester.
   * 
   * *
   */
  public DiscoveryResponseMessage setServiceInstances(List<ServiceInstance> serviceInstances) {
    this.serviceInstances = serviceInstances;
    return this;
  }

  public void unsetServiceInstances() {
    this.serviceInstances = null;
  }

  /** Returns true if field serviceInstances is set (has been assigned a value) and false otherwise */
  public boolean isSetServiceInstances() {
    return this.serviceInstances != null;
  }

  public void setServiceInstancesIsSet(boolean value) {
    if (!value) {
      this.serviceInstances = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SERVICE_INSTANCES:
      if (value == null) {
        unsetServiceInstances();
      } else {
        setServiceInstances((List<ServiceInstance>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SERVICE_INSTANCES:
      return getServiceInstances();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SERVICE_INSTANCES:
      return isSetServiceInstances();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DiscoveryResponseMessage)
      return this.equals((DiscoveryResponseMessage)that);
    return false;
  }

  public boolean equals(DiscoveryResponseMessage that) {
    if (that == null)
      return false;

    boolean this_present_serviceInstances = true && this.isSetServiceInstances();
    boolean that_present_serviceInstances = true && that.isSetServiceInstances();
    if (this_present_serviceInstances || that_present_serviceInstances) {
      if (!(this_present_serviceInstances && that_present_serviceInstances))
        return false;
      if (!this.serviceInstances.equals(that.serviceInstances))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(DiscoveryResponseMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetServiceInstances()).compareTo(other.isSetServiceInstances());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServiceInstances()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serviceInstances, other.serviceInstances);
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
    StringBuilder sb = new StringBuilder("DiscoveryResponseMessage(");
    boolean first = true;

    if (isSetServiceInstances()) {
      sb.append("serviceInstances:");
      if (this.serviceInstances == null) {
        sb.append("null");
      } else {
        sb.append(this.serviceInstances);
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

  private static class DiscoveryResponseMessageStandardSchemeFactory implements SchemeFactory {
    public DiscoveryResponseMessageStandardScheme getScheme() {
      return new DiscoveryResponseMessageStandardScheme();
    }
  }

  private static class DiscoveryResponseMessageStandardScheme extends StandardScheme<DiscoveryResponseMessage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DiscoveryResponseMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SERVICE_INSTANCES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
                struct.serviceInstances = new ArrayList<ServiceInstance>(_list64.size);
                for (int _i65 = 0; _i65 < _list64.size; ++_i65)
                {
                  ServiceInstance _elem66;
                  _elem66 = new ServiceInstance();
                  _elem66.read(iprot);
                  struct.serviceInstances.add(_elem66);
                }
                iprot.readListEnd();
              }
              struct.setServiceInstancesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DiscoveryResponseMessage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.serviceInstances != null) {
        if (struct.isSetServiceInstances()) {
          oprot.writeFieldBegin(SERVICE_INSTANCES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.serviceInstances.size()));
            for (ServiceInstance _iter67 : struct.serviceInstances)
            {
              _iter67.write(oprot);
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

  private static class DiscoveryResponseMessageTupleSchemeFactory implements SchemeFactory {
    public DiscoveryResponseMessageTupleScheme getScheme() {
      return new DiscoveryResponseMessageTupleScheme();
    }
  }

  private static class DiscoveryResponseMessageTupleScheme extends TupleScheme<DiscoveryResponseMessage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DiscoveryResponseMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetServiceInstances()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetServiceInstances()) {
        {
          oprot.writeI32(struct.serviceInstances.size());
          for (ServiceInstance _iter68 : struct.serviceInstances)
          {
            _iter68.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DiscoveryResponseMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list69 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.serviceInstances = new ArrayList<ServiceInstance>(_list69.size);
          for (int _i70 = 0; _i70 < _list69.size; ++_i70)
          {
            ServiceInstance _elem71;
            _elem71 = new ServiceInstance();
            _elem71.read(iprot);
            struct.serviceInstances.add(_elem71);
          }
        }
        struct.setServiceInstancesIsSet(true);
      }
    }
  }

}
