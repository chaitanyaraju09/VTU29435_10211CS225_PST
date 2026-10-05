import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            deque.addLast(num);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            set.add(num);
            if (deque.size() > m) {
                int removed = deque.removeFirst();
                freq.put(removed, freq.get(removed) - 1);
                if (freq.get(removed) == 0) {
                    freq.remove(removed);
                    set.remove(removed);
                }
            }
            if (deque.size() == m) {
                max = Math.max(max, set.size());
            }
        }
        System.out.println(max);
        sc.close();
    }
}


//  OUTPUT  

Sample Input

6 3
5 3 5 2 3 2
Sample Output

3
