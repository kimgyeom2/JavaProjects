
public class Ex05 {
public static void main(String[] args) {
	int[] arr1=new int[] {10,20,30,40,50};
	int[] arr2=new int[] {1,2,3,4,5};
	int[] arr3=new int[5]; 
	for(int t=0;t<arr1.length;t++) {
		arr3[t]=arr1[t]+arr2[4-t];
		System.out.println(arr3[t]);
	}
}
}
