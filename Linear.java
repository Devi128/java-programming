import java.util.Scanner;
class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter "+ n + " numbers : ");
        for (int i=0; i<n; i++)
            A[i] = sc.nextInt();
        System.out.print("Enter element to search : ");
        int key = sc.nextInt();
        int x = linearsearch(A, key);
        if (x!= -1)
            System.out.println("Element found at location " + x);
        else
            System.out.println("Element not found");      
    }
    public static int linearsearch(int[] A, int key){
        for (int i=0; i<A.length; i++)
            if (A[i] == key)
                return i;
        return -1;
    }
}
