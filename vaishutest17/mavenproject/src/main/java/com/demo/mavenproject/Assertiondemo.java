package com.demo.mavenproject;

import org.junit.Test;

import junit.framework.TestCase;


public class Assertiondemo extends TestCase {
    public void testEquality() throws Exception {
        String a = "abcde";
        String b = new String(a);
        assertTrue(a.equals(b));
        assertFalse(a == b);
        assertEquals(a, b);
    }
}
