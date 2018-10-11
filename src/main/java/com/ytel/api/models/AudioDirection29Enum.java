/*
 * YtelAPIV3Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum AudioDirection29Enum {
    IN, //TODO: Write general description for this element
    OUT; //TODO: Write general description for this element

    private static TreeMap<String, AudioDirection29Enum> valueMap = new TreeMap<String, AudioDirection29Enum>();
    private String value;

    static {
        IN.value = "in";
        OUT.value = "out";

        valueMap.put("in", IN);
        valueMap.put("out", OUT);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static AudioDirection29Enum fromString(String toConvert) {
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
     * Convert list of AudioDirection29Enum values to list of string values
     * @param toConvert The list of AudioDirection29Enum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<AudioDirection29Enum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (AudioDirection29Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 