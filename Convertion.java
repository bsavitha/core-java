class Convertion{
public static void main(String[] values){
	System.out.println("converting string to BYTE");
String bytevalue="-128";
byte wrapperbyte=Byte.parseByte(bytevalue);
System.out.println(wrapperbyte);
System.out.println("__________________________-");

System.out.println("converting string to SHORT");
String shortvalue="-32767";
short wrappershort=Short.parseShort(shortvalue);
System.out.println(wrappershort);
System.out.println("__________________________-");

System.out.println("converting string to INT");
String integer = "1";
Integer wrapperint=Integer.parseInt(integer);
System.out.println(wrapperint);
System.out.println("__________________________-");

System.out.println("converting string to LONG");
String longvalue="12345678910";
long wrapperlong=Long.parseLong(longvalue);
System.out.println(wrapperlong);
System.out.println("__________________________-");

System.out.println("converting string to FLOAT");
String floatvalue="100.12";
float wrapperfloat=Float.parseFloat(floatvalue);
System.out.println(wrapperfloat);
System.out.println("__________________________-");

System.out.println("converting string to DOUBLE");
String doublevalue="7777";
double wrapperdouble=Double.parseDouble(doublevalue);
System.out.println(wrapperdouble);
System.out.println("__________________________-");

System.out.println("converting string to BOOLEAN");
String booleanvalue="True";
boolean wrapperboolean=Boolean.parseBoolean(booleanvalue);
System.out.println(wrapperboolean);
System.out.println("__________________________-");

System.out.println("converting string to CHARACTER");
	String charvalue="Female";
	char wrappedchar=charvalue.charAt(0);
		System.out.println(wrappedchar);
		System.out.println("__________________________-");
		
		System.out.println("*************************************************************");
		
		System.out.println("converting primitive to non primitive");
String value="12";
byte wrappedbyte=Byte.valueOf(value);
System.out.println(wrappedbyte);
System.out.println("__________________________-");


		
		


		
		
}
} 