package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DupCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br    = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A Value: ");
		String str="";
		try {
			str = br.readLine();
		} catch (IOException x) {
			// TODO Auto-generated catch block
			x.printStackTrace();
		}
		Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
		char[] chrs = str.toCharArray(); 
		for(Character ch:chrs)
		{
			if(dupMap.containsKey(ch))
			{
				dupMap.put(ch, dupMap.get(ch)+1); 
			}
			else
			{
				dupMap.put(ch, 1); 
			}
		}
		System.out.println("Duplicate Charcter"+"--->"+"Number Of Times Present");
		for(Character ch:dupMap.keySet())
		{
			if(dupMap.get(ch) > 1)
			{ 
				System.out.println(ch+"--->"+dupMap.get(ch));
				//System.out.println(dupMap);
			}
		}
	}

}
