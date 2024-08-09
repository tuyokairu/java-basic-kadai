package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {


	HashMap<String,String> dictionary = new HashMap<String,String>();
	
	//コンストラクタ
	
	public void fruitDic() {
	
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
		 for (String word : fruit) {
	            // 検索語が辞書に含まれているかチェック
	            if (dictionary.containsKey(word)) {
	                // 含まれている場合、その意味を表示
	                String meaning = dictionary.get(word);
	                System.out.println(word + "の意味は " + meaning + " です。");
	            } else {
	                // 含まれていない場合、その旨を表示
	                System.out.println(word + "は辞書に含まれていません。");
	            }
		 }
	
	}
	
 
}
