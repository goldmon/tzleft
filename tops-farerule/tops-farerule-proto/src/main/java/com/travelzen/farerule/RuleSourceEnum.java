/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.travelzen.farerule;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum RuleSourceEnum implements org.apache.thrift.TEnum {
  JPECKER(0),
  PAPERFARE(1),
  TZEN(2);

  private final int value;

  private RuleSourceEnum(int value) {
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
  public static RuleSourceEnum findByValue(int value) { 
    switch (value) {
      case 0:
        return JPECKER;
      case 1:
        return PAPERFARE;
      case 2:
        return TZEN;
      default:
        return null;
    }
  }
}
