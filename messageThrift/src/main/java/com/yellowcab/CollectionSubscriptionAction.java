/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.yellowcab;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * The action to take for a collection subscription request
 * 
 */
public enum CollectionSubscriptionAction implements org.apache.thrift.TEnum {
  /**
   * * Suspend delivery of content for the identified
   *   subscription
   * *
   */
  PAUSE(0),
  /**
   *    * Resume delivery of content for the identified
   *      subscription
   * *
   */
  RESUME(1),
  /**
   *    * Request information on subscriptions the
   *      requester has established for the named TAXII Data
   *      Collection. No subscription state is changed in response
   *      to this action.
   * *
   */
  STATUS(2),
  /**
   *    * Request a subscription to the named TAXII
   *      Data Collection.
   * 
   * *
   */
  SUBSCRIBE(3),
  /**
   *    * Request cancellation of an existing
   *      subscription to the named TAXII Data Collection.
   * 
   * *
   */
  UNSUBSCRIBE(4);

  private final int value;

  private CollectionSubscriptionAction(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static CollectionSubscriptionAction findByValue(int value) { 
    switch (value) {
      case 0:
        return PAUSE;
      case 1:
        return RESUME;
      case 2:
        return STATUS;
      case 3:
        return SUBSCRIBE;
      case 4:
        return UNSUBSCRIBE;
      default:
        return null;
    }
  }
}
