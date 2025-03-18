package Jan29_Array_Hashmap_key_value;

import java.util.ArrayList;
import java.util.HashMap;

public class Arraylist_And_Key_Value_Pair {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("Url");
		a.add("username");
		a.add("Password");
		a.add("manager");
		System.out.println(a.get(2));
		
		HashMap hm = new HashMap();
		hm.put("url","skdlflsjdk");
		hm.put("un", "admin");
		hm.put("password", "manager");
		hm.put("data", "hi");
		
		System.out.println(hm.get("password"));
		
	}

}
