public class Tosscoin {
   public String chanceFunc() {
      double float = (Math.floor(Math.random() * 1));
      if (chance <0.5) {
         return"tails";
      } else {
         return"heads";
      }
   }
}
public class Flip {
   public static void main(String args[]) {
      Toss t = new Toss();
      int heads = 0;
      int tails = 0;
      int chances = 10;
      for (int i = 1; i<= chances; i++) {
         if (t.chanceFunc().equals("tails")) {
            tails++;
         } else {
            heads++;
         }
      }
      System.out.println("Chances = " + chances);
      System.out.println("Heads: " + heads);
      System.out.println("Tails: " + tails);
   }
}
