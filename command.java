class command{
	public static void main(String args[]){
		System.out.println("Number of command line arguments:"+args.length);
		for(int i=0;i<args.length;i++)
			System.out.println(args[i].toLowerCase()+"_"+args[i].length());
		}
}
