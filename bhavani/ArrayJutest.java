package project;

public class ArrayJUTest {

    public static void main(String[] args){
        ArrayJUTest array = new ArrayJUTest();
        int arr[] = {23,25,50,68,3};
        System.out.println(array.arrayLessThan(arr));
    }

    public  boolean arrayLessThan(int array[]){
        for (int element : array) {
        	return true;
        }


           if(element>20){
                return true;
            }
            else {
                return false;
            }

        }


   }
package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseA {

	@Test
	public void test() {
		int[] arr = {12,42,65,36};
		ArrayJUTest a=new ArrayJUTest();
		boolean b=a.arrayLessThan(arr);
		assertEquals(false,b);
	}

}