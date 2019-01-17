

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Lines {

    public static void main(String[] args) {
    	readLines();
    }
    
    private static void readLines() {
    	Scanner scanner = new Scanner(System.in);
    	int c =1;
    	while(scanner.hasNext()) {
    		String line = c+" "+scanner.nextLine();

    		System.out.println(line);
    		c+=1;
    	
    		
    	}
    
    }
    

}
