// WhiteSpaces in Java

import java.util.*;
import java.util.lang; 
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class WhiteSpaces
{
public static void main(String args[])
{
String S="i am   emplolyee of  zensar company";
System.out.println("Before remove white spaces");
System.out.println("i am   emplolyee of  zensar company");
S=S.replaceAll("\\s","");
System.out.println("after remove white spaces:\t"+S);
}
}