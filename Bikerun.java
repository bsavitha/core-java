class Bike{
static void details(String company,int price, String color,int regno,String ownername,String rcno,float weight){
System.out.println(company);
System.out.println(price);
System.out.println(color);
System.out.println(regno);
System.out.println(ownername);
System.out.println(rcno);
System.out.println( weight);
}
}
class Bikerun{
public static void main(String[] runs){
Bike.details("tvs",50000,"red",KA1829,"Shreyas","1234qwer",50.7f);
Bike.details("honda",550000,"yellow",1829,"Shreyas","1234qwer",50.00f);
Bike.details("ktm",78000,"blue",1829,"Shreyas","1234qwer",70.00f);
Bike.details("duke",80000,"blue",1829,"Shreyas","1234qwer",50.76f);
Bike.details("yamaha",75000,"white",1829,"Shreyas","1234qwer",50.76f);
}
}