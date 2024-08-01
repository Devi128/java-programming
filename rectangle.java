class Rectangle{
	double width,height;
	Rectangle(){
		width=15;
		height=20;
	}
	Rectangle(double w,double h){
		width=w;
		height=h;
	}
	public double getArea(){
		return width*height;
	}
	public double getPerimeter(){
		return 2*(width+height);
	}
}
class Rectangle1{
	public static void main(String args[]){
		Rectangle area=new Rectangle();
		System.out.println(area.getArea());
		Rectangle perimeter=new Rectangle();
		System.out.println(perimeter.getPerimeter());
	}
}

