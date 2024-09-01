package kadai_018;

abstract public class Kato_Chapter18 {
	
	//姓フィールド
	public String familyName;
	//名フィールド
	public String givenName;
	//住所フィールド
	public String address;
	

	//抽象メソッド(中に何も入れない)
	public void commonIntroduce() {
		//famirynameとaddressを外に出して、下のSystem.outの部分をここに持ってくる。
		familyName = "加藤";
		address = "東京都中野区○×";
		
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	abstract void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}