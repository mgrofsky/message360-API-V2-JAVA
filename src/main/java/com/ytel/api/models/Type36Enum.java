/*
 * YtelAPIV3Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum Type36Enum {
    TEXT, //Email send as text format
    HTML; //Email send as HTML format

    private static TreeMap<String, Type36Enum> valueMap = new TreeMap<String, Type36Enum>();
    private String value;

    static {
        TEXT.value = "text";
        HTML.value = "html";

        valueMap.put("text", TEXT);
        valueMap.put("html", HTML);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Type36Enum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Type36Enum values to list of string values
     * @param toConvert The list of Type36Enum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<Type36Enum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (Type36Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 