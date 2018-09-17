package hashmap;

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
}
