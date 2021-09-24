class primeministers{
static void getministersdetails(String name,String countryname,int age,String married,String alive,String duration){

System.out.println(name);
System.out.println(countryname);
System.out.println(age);
System.out.println(married);
System.out.println(alive);
System.out.println(duration);
}
}
class mindetails{
	public static void main(String[] values){
		primeministers.getministersdetails("Indira Gandhi","India",66,"married","NO","11years");
			primeministers.getministersdetails("Modi","India",70,"Not married","Yes","2014-present");
				primeministers.getministersdetails("Justin Trudeau","canada",49,"married","Yes","5years-present");
					primeministers.getministersdetails("Barack obama","US",60,"married","Yes","8years");
		
		
	}
	
}