
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Main {
	


    public static void main(String[] args) {
    	System.out.println(isAnagram());
    }


    static String isAnagram() {
    	Scanner scanner = new Scanner(System.in);
    	String A = scanner.next().toLowerCase();
    	String B = scanner.next().toLowerCase();
    	Set<Character> a = new HashSet<Character>();
    	Set<Character> b = new HashSet<Character>();
    	scanner.close();
    	for(char c : A.toCharArray()) {
    		a.add(c);
    	}
    	for(char c : B.toCharArray()) {
    		b.add(c);
    	}
    	
    	if(a.equals(b)) return ("Anagrams");
    	 
		return "Not Anagrams";
    }
    
        
    
}
