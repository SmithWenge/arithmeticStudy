package ×Ö·û´®;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {
	List<String> list = new ArrayList<String>();
	      
	public List<String> getCircleWord(String str) {
		String bigStr = str + str;
		
		for(int i = 0; i < str.length(); i++) {
			list.add(bigStr.substring(i, i + str.length()));
		}
		
		return list;
	}

}
