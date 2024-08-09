package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {


	HashMap<String,String> dictionary = new HashMap<String,String>();
	
	//コンストラクタ
	
	public Dictionary_Chapter21() {
	
	dictionary.put("apple","りんご");
	dictionary.put("peach","桃");
	dictionary.put("banana","バナナ");
	dictionary.put("lemon","レモン");
	dictionary.put("pear","梨");
	dictionary.put("kiwi","キウィ");
	dictionary.put("strawberry","いちご");
	dictionary.put("grape","ぶどう");
	dictionary.put("muscat","マスカット");
	dictionary.put("cherry","さくらんぼ");
	
	
	}
	
	
	public void seach(String[] fruit) {
		
	
	System.out.println("appleの意味は" + dictionary.get("apple"));
	System.out.println("bananaの意味は" + dictionary.get("banana"));
	System.out.println("grapeの意味は" + dictionary.get("grape"));
	
	
	String orangeMean = dictionary.get("orange");
	if (orangeMean == null) {
		System.out.println("orangeは辞書に存在しません");
	}
	else {
		System.out.println("orangeの意味は" + orangeMean);
	}
		
	
	}
	
	
 
}
