enum TicketPrice{
GANDHI(30,0.0f),MIDDLE(50,0.5f),BANCONY(100,1.0f),BOX(150,2.0f);

int price;
float tax;

TicketPrice(int price,float tax){
this.price=price;
this.tax=tax;

}
}