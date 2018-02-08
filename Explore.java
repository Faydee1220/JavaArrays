public class Explore {
 
  public static void main(String[] args) {
    
    String[] friends = {"Ben", "Alena", "Pasan"};
    // Swift 的 array
    // var friends = ["Ben", "Alena", "Pasan"]
    
    // 2D array
    int[][] scoreCards = {
      // Ben's
      {1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2},
        
      // Alena's
      {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2},
        
      // Pasan's
      {4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2}
    };
    
    // Nested for loop
    // for each friend
    for (int i = 0; i < friends.length; i += 1) {
      // print their name
      System.out.printf("%s %n-------------%n",
                       friends[i]);
      // for each hole
      for (int j = 0; j < scoreCards[i].length; j += 1) {
        // print their score
        System.out.printf("Hole #%d %d %n",
                         j + 1,
                         scoreCards[i][j]);
      };
    };
    
    
    // Enhance for in loop
    // : 代表 in
    // : 右方的 array 是 iterable 的
//    for (String friend : friends) {
//      System.out.printf("Hey %s! The movie starts at 7, C U there!%n",
//                        friend);
//    }
    // Swift 的 for in loop
    // for friend in friends {}
    
    // 古早的 for loop
    // for (初始化變數; 終止條件(true 時繼續執行); 遞增(每 run 完一次 loop 後執行))
//    for (int i = 0; i < friends.length; i += 1) {
//      String friend = friends[i];
//      System.out.printf("Hey %s! The movie starts at 7, C U there!%n",
//                        friend);
//    }
//    
//    int[] bensScoreCard = {1, 2, 1, 5, 2, 4, 4, 4, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};
//    for (int i = 0; i < bensScoreCard.length; i += 1) {
//      System.out.printf("Hole #%d,: %d%n",
//                       i + 1,
//                       bensScoreCard[i]);
//    }
    
  }
  
}