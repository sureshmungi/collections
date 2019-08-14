package capgemini.collections;

import java.util.Arrays;

public class Test_collections {
public static void main(String[] args) {
	//int array...
	int[] nums= {1,9,7,5,3,2,4};
	for (int index = 0; index < nums.length; index++) {
		System.out.println(nums[index]);
	}
	
	System.out.println("Natural order:"+Arrays.toString(nums));
	//enhanced forloop...not index based...
	for(int num:nums){
		System.out.println(num);
	}
//algorithms for arrays
  Arrays.sort(nums);
System.out.println("sorted order:"+Arrays.toString(nums));
//char array..
char[] alpha= {'A','C','B','F','E'};

System.out.println("Natural order:"+Arrays.toString(alpha));
Arrays.sort(alpha);
System.out.println("sorted order:"+Arrays.toString(alpha));

String[] days={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
System.out.println("Natural order:"+Arrays.toString(days));
Arrays.sort(days);
System.out.println("sorted order:"+Arrays.toString(days));



}
}
