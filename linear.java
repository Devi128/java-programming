class linear{
	public static void main(String args[]){
		int a[]={1,4,6,8,7,2};
		int key=0;
		System.out.println(" key found "+linear(a,key));
	}
	static int linear(int[] a,int key){
		for(int i=0;i<a.length;i++)
			if(a[i]==key)
				return (i+1);
			return -1;
		}
}
