/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.yellowcab;


import org.apache.thrift.TEnum;

/**
 * Represents the different statuses of a Subscription
 * 
 */
public enum SubscriptionStatus implements org.apache.thrift.TEnum {
  /**
   * The subscription is established and active
   * 
   */
  ACTIVE(0),
  /**
   *     *  The subscription is established but
   *       currently in a paused state
   * 
   * *
   */
  PAUSED(1),
  /**
   *     * The subscription has been removed
   *       (would only appear in response to an UNSUBSCRIBE
   *       Action)
   * 
   * *
   */
  UNSUBSCRIBED(2);

  private final int value;

  private SubscriptionStatus(int value) {
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
  public static SubscriptionStatus findByValue(int value) {
    switch (value) {
      case 0:
        return ACTIVE;
      case 1:
        return PAUSED;
      case 2:
        return UNSUBSCRIBED;
      default:
        return null;
    }
  }
}