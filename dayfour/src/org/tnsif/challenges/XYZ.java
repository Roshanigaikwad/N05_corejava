/*there are n people standing in a circle waiting to be executed.the counting out bengings are some 
 * point in the circle are proceeds the around the 
	circle in fixed direction in each step a certain number of people are skip and the next person is executed.the elimination proceeds around the circle
	(which is becoming smaller and smaller  as the executed people are removed),until the only the last person ,who is given freedom.
	given the total number of person n and a number k which indicates that n-1 person are skipped and the cake person is killed in circle
	the task is used to choose the person in the initial circle that survive..
	 */

package org.tnsif.challenges;

import java.util.Scanner;

public class XYZ {
	static int survive(int n,int k) {
	
		if(n==1)
			return 1;
		else
			return((survive(n-1,k)+k-1)%n+1);
	}
	
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));
		
		

	}

}
