package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return null;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	for(int i = 0; i < eggs.size(); i++) {
    		if(eggs.get(i).equals("cracked")) {
    			return i;
    		}
    	}
        return -1;
    }
    
   public static int countPearls(List<Boolean> oysters) {
	   int count = 0;
	   for(int i = 0; i < oysters.size(); i++) {
		   if(oysters.get(i) == true) {
			   count++;
		   }
	   }
	   return count;
   }
   
}
