class MatchRun{
public static void main(String[] values)
{
String brand="tiger";
int noofsticks=30;
String emptyorfull="full";

MatchBox ref=new MatchBox(brand,noofsticks,emptyorfull);
System.out.println(ref.brand);
System.out.println(ref.noofsticks);
System.out.println(ref.emptyorfull);

ref.size=Size.LARGE;
System.out.println(ref.size);
}

}