package kadai_026;
	
	import java.util.Scanner;

	public class Jyanken_Chapter26 {
	    int playerHand = -1;
	    int computerHand = 0;
	    String[] computerBox = {"パー", "チョキ", "グー"};
	    Scanner scanner = new Scanner(System.in); // Scanner のインスタンスをクラスフィールドにする
	
	public String getMyChoice() {
		//自分のじゃんけんの手を入力する
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		 
		 String input = scanner.next();
		

      if(input.equals("r")) {
          System.out.println("自分の手はグー");
          playerHand = 2;
          return "グー";
      } else if (input.equals("s")) {
          System.out.println("自分の手はチョキ");
          playerHand = 1;
          return "チョキ";
      } else if (input.equals("p")) {
          System.out.println("自分の手はパー");
          playerHand = 0;
          return "パー";
      } else {
          System.out.println("入力された文字は正しくありません、再度入力しましょう");
          return getMyChoice(); // 再度メソッドを呼び出す
      }
  }

  public String getRandom() {
      computerHand = (int) Math.floor(Math.random() * 3);
      System.out.println("対戦相手の手は" + computerBox[computerHand]);
      return computerBox[computerHand];
  }

  public void playGame() {
      if (((playerHand - computerHand + 3) % 3) == 1) {
          System.out.println("自分の勝ちです");
      } else if ((playerHand - computerHand + 3) % 3 == 0) {
          System.out.println("あいこです");
      } else {
          System.out.println("自分の負けです");
      }
  }

  public void cleanup() {
      scanner.close(); // プログラム終了後に Scanner を閉じる
  }
	

}
