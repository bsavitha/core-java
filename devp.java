class Developers{
static void getdevp(){
System.out.println("developers NAMESSS");
String Name[]={"savi","shrey","sonu","chinnu"};
for (int i=0;i<=Name.length-1;i++){
	
System.out.println(Name[i]);
}
}
static void getmla(){
System.out.println("MLA NAMESSS");
String Mla[]={"Govindrajan","Rajendran","Joseph Samel","RD Sekar","MK Stalin","Babu","Ravi"};
for (int m=0;m<=Mla.length-1;m++){
	
System.out.println(Mla[m]);
}
}

static void getmall(){
	System.out.println("Mall NAMESS");
	String Mall[]={"Total mall","Forum mall","Garuda mall","Orian mall"};
	for (int l=0;l<=Mall.length-1;l++){
		
	System.out.println(Mall[l]);
	}	
	
}
}

class devp{
	
	public static void main(String[] values){
	Developers.getdevp();
	Developers.getmla();
	Developers.getmall();
	}
}
