class TeaterRun{
public static void main(String[] values){


TicketPrice tp=TicketPrice.GANDHI;
System.out.println("GANDHI = "+tp.price);
TicketPrice btp=TicketPrice.GANDHI;
System.out.println(btp.price);
System.out.println(btp.tax);


System.out.println(TicketPrice.BOX.tax);

System.out.println(TicketPrice.BOX.price);


}
}