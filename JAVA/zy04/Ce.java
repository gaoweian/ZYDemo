public class  Ce{
	public static void main(String[] args){
		String brand = "google";
		String color = "red";
		double price = 0.22;
		showInfo(brand,color,price);
	}
	public static void showInfo(String brand,String color,double price){		
		System.out.println(brand+ "手机是"+color+"色的"+"价值"+price);
	}
}