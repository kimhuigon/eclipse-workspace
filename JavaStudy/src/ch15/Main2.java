package ch15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Main2 {
	public static void main(String[] args) {
		// [1, 2, 3, 4, 5, ...]
		// [{k1 : v1, k2 : v2}, {k1 : v1, k2 : v2}, {k1 : v1, k2 : v2}, ...]
		List a = new ArrayList();
		List b = new LinkedList();
		List c = new Vector();
		
		// {"key1" : "value1", "key2" : "value2",...}
		// {"key1" : [1, 2, 3], "key2" : {"key3" : "value3"}, ...}
		Map m = new HashMap();
		Map m2 = new Hashtable();
	}
}