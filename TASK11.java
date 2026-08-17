import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		Set<String> uniqueNameSet = new HashSet<String>();
		for (int i = 0; i < t; i++) {
			String name = scanner.nextLine();
			name = name.trim();
			uniqueNameSet.add(name);
			System.out.println(uniqueNameSet.size());
		}
		scanner.close();
    }
}


//    OUTPUT  

Sample Input

5
john tom
john mary
john tom
mary anna
mary anna

  
Sample Output

1
2
2
3
3
