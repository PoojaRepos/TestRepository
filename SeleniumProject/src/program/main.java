
package program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class main{

public static void main(String[] args )
{

	String str = "xyzxyabc";
	
	char[] ch = str.toCharArray();
	
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	for(Character ch1 : ch) {
		if(map.containsKey(ch1)) {
			map.put(ch1, map.get(ch1)+1);	
		}
		else{
		map.put(ch1, 1);
		}
			
	}
		Set<Map.Entry<Character,Integer>> entryset = map.entrySet();
        for (Map.Entry<Character, Integer> entry: entryset)
        {
            if(entry.getValue()>1) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }
            
 
		
	}
}

	
	
