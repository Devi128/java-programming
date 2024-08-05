import java.util.Scanner;
public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
            A[i] = sc.nextInt();
        sort(A);
        System.out.println("Sorted array:");
        for (int i = 0; i < A.length; i++) 
            System.out.print(A[i] + " ");
    }
    
    public static void sort(int[] A){
    	int n=A.length;
    	for(int i=0;i<n-1;i++){
    		int minInd=i;
    		for(int j=i+1;j<n;j++)
    			if(A[minInd]>A[j])
    				minInd=j;
    		int temp=A[i];
    		A[i]=A[minInd];
    		A[minInd]=temp;
    	}
    }
} //end of class
