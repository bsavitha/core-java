class  Printname{
static void Pname(){
System.out.println("savi");
System.out.println("savithasavi1829@gmail.com");
}
static void Pname(String name){
	System.out.println(name);
	
}
static void Pemail(String email){
	System.out.println(email);
}

static void countrystatecityarea(){
System.out.println("india");
System.out.println("karnataka");
System.out.println("bangalore");
System.out.println("indranager");
}
}

class  favourite{
	static void actormovie(){
System.out.println("vijay");
System.out.println("theri");
}

static void placecountry(){
System.out.println("manali");
System.out.println("Australia");
}

static void job(){
System.out.println("work in IT field");
}
}

class Runner{
public static void main(String[] runs){
	Printname.Pname();
	Printname.countrystatecityarea();
	favourite.actormovie();
	favourite.placecountry();
    favourite.job();
	Printname.Pname("sonu");
	Printname.Pemail("sonu12@gmail.com");
}
}

