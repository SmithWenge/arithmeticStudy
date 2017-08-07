package ×Ö·û´®;

import java.util.List;

public class Ðý×ª´Ê {
	public static void main(String[] args) {
		StringUtil stringUtil = new StringUtil();
		List<String> list = stringUtil.getCircleWord("1234");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
