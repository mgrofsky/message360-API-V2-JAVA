/*
 * YtelAPIV3Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ytel.api.models.*;
import com.ytel.api.exceptions.*;
import com.ytel.api.APIHelper;
import com.ytel.api.Configuration;
import com.ytel.api.testing.TestHelper;
import com.ytel.api.controllers.PhoneNumberController;

import com.fasterxml.jackson.core.type.TypeReference;

public class PhoneNumberControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static PhoneNumberController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getPhoneNumber();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Retrieve a list of purchased phones numbers associated with your Ytel account.
     * @throws Throwable
     */
    @Test
    public void testTestListNumbers() throws Throwable {
        // Parameters for the API call
        Integer page = null;
        Integer pageSize = null;
        NumberType14Enum numberType = null;
        String friendlyName = null;

        // Set callback and perform API call
        String result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.createListNumbers(page, pageSize, numberType, friendlyName);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

}
