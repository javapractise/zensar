import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class ReplaceArray {

public static void main(String[] args) {

	try {

	ArrayList<String> list = new ArrayList<>();
        
        add() method

	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");

	System.out.println(list);

	list.set(2, "E");

	System.out.println(list);

	}

	catch (Exception e) {

	System.out.println(e);
	}
    }
}
