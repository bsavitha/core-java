class Converter{
public static void main(String[] values){
	String acres="100";
	double wrappedacres=Double.parseDouble(acres);
	System.out.println(wrappedacres);
	
	
	String rupees="200";
	double wrappedrupees=Double.parseDouble(rupees);
	System.out.println(wrappedrupees);
	
	
	int price=200;
	Integer wrappedmango=Integer.valueOf(price);
	System.out.println(wrappedmango);
	
	String gender="Female";
	char wrappedchar=gender.charAt(1);
		System.out.println(wrappedchar);

	
}
}