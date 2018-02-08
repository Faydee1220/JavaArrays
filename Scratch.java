import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

String[] friends = {
  "Treasure",
  "Ben", 
  "Alena", 
  "Pasan", 
  "Faydee"};

//jshell> Arrays.sort(friends, Comparator.comparing(String::length))
//jshell> friends
//friends ==> String[5] { "Ben", "Alena", "Pasan", "Faydee", "Treasure" }   

//jshell> Arrays.sort(friends, Comparator.comparing(String::length).reversed())
//jshell> friends
//friends ==> String[5] { "Treasure", "Faydee", "Alena", "Pasan", "Ben" }  

//jshell> char[] letters = "treehouse".toCharArray()
//letters ==> char[9] { 't', 'r', 'e', 'e', 'h', 'o', 'u', 's', 'e' }
//jshell> Arrays.sort(letters)
//jshell> letters
//letters ==> char[9] { 'e', 'e', 'e', 'h', 'o', 'r', 's', 't', 'u' } 

// ... 代表可放入任意數量參數（0 個、3 個、10 個都可以），且型態是陣列，只能在最後一個參數使用
public String pickLunchSpot(String... spots) {
  System.out.printf("Randomly picking %d lunch spots. %n",
                   spots.length);
  if (spots.length == 0) {
    return "Someplace with tacos";
  }
  
  Random random = new Random();
  return spots[random.nextInt(spots.length)];
}


int[][] scoreCards = {
  // Ben's
  {1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2},
    
  // Alena's
  {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2},
    
  // Pasan's
  {4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2}
};