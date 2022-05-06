package project;

import junit.framework.TestCase;
          public class Demo extends TestCase {
        	  public void testEquality() throws Exception {
        		  String a = "abcde";
        		  String b = new String(a);
        		  assertTrue(a.equals(b));
        		  assertFalse(a == b);
        		  assertEquals(a, b);
        		  }
        	  }