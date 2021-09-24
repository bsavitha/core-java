class LabRun{
public static void main(String[] values){

String name="CS";
String location="1st floor";
int noofRooms=1;
String[] operatorname={"Shrey","Savi","sadiya","saba"};
Laboratory ref= new Laboratory(name,location,noofRooms,operatorname);
System.out.println(ref.name);
System.out.println(ref.location);
System.out.println(ref.noofRooms);
System.out.println(operatorname[0]);
ref.type=LabType.MECH;
System.out.println(ref.type);

}



}