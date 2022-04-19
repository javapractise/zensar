import java.io.*;
import java.util.Scanner;

import java.util.*;

class Ascending {
	public static void main(String[] args)
	{

		Integer array[] = { 1, 2, 3, 4, 5 };

		Arrays.sort(array, Collections.reverseOrder());

		System.out.println(Arrays.toString(array));
	}
}
