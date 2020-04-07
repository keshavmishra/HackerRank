import java.util.Scanner;

public class Solution {


	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		java.util.List<String> strList = new java.util.ArrayList<String>();
		for (int i = 0; i <= s.length() - k; i++) {
			strList.add(s.substring(i, k + i));
		}
		java.util.Collections.sort(strList);
		smallest = strList.get(0);
		largest = strList.get(strList.size() - 1);
		return smallest + "\n" + largest;
	}



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}