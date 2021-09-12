package com.practice.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestExpressionParser {

    @Test
    public void testAssertEqual(){
        assertEquals(1,1);
    }

    @Test
    public void testNotEqual(){
        assertNotEquals(1,2);
    }

}
