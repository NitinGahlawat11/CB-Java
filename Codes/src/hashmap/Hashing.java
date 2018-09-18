package hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer> map = new HashMap<>();
map.put("Usa", 290);
map.put("india",299);
map.put("russia",410);
System.out.println(map);
map.put("india",560);
map.put("rs", 410);
map.put("rs", 4140);
System.out.println(map);
Set<String> keys=map.keySet(); // using sets because values are unique;
for(String res:keys) {
	System.out.println(res);
}

Collection<Integer> vals=map.values();
for(Integer resi:vals) {
	System.out.println(resi);
}

Set<Map.Entry<String, Integer>> results= map.entrySet();
for(Map.Entry<String, Integer> res:results) {
	System.out.println(res.getKey()+"===>"+res.getValue());
}

System.out.println("-----------------------------max char");
String str="nitiinnnnn";
System.out.println(maxfreq(str));
	
	System.out.println("------------------intersection");
	int[]one= {5,11,56,25,29,21};
	int[]two= {41,22,47,51,11,554,5};
	ArrayList<Integer> list=intersection(one,two);
	System.out.println(list);
	
	}
public static char maxfreq(String str) {
	HashMap<Character, Integer> list= new HashMap<>();
	for(int i=0;i<str.length()-1;i++) {
		char cc=str.charAt(i);
		if(list.containsKey(cc)) {
			int ov=list.get(cc);
			int nv=ov+1;
			list.put(cc, nv);
		}
		else {
			list.put(cc, 1);
		}
	}
	int max=0;
	char maxchar='\0';
	Set<Map.Entry<Character,Integer>> ress=list.entrySet();
	for(Map.Entry<Character,Integer> res:ress) {
		if(res.getValue()>max) {
			max=res.getValue();
			maxchar=res.getKey();
			
		}
	}
	return maxchar;
}

public static ArrayList<Integer> intersection(int[]one,int[] two){
	HashMap<Integer, Boolean> map= new HashMap<>();
	ArrayList<Integer> list= new ArrayList<>();
	for(int i=0;i<one.length;i++) {
		map.put(one[i], false);
	}
	for(int j=0;j<two.length;j++) {
		if(map.containsKey(two[j])) {
		map.put(two[j], true);
		}
	}
	Set<Map.Entry<Integer, Boolean>> entries=map.entrySet();
	for(Map.Entry<Integer, Boolean> enrty:entries) {
		if(enrty.getValue()) {
			list.add(enrty.getKey());
		}
	}
	return list;
}

}
