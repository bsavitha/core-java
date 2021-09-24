class NewsPaperRun{
public static void main(String[] values){
String name="Times";
String ownername="savi";
String editor="shrey";

NewsPaper ref=new NewsPaper(name,ownername,editor);

System.out.println("**************************");
System.out.println("Name of Newspaper is" + ref.name);
System.out.println("Owner is" + ref.ownername);
System.out.println("editor" + ref.editor);
System.out.println("**************************");



System.out.println("***************************");
System.out.println(Lang.ENGLISH);
System.out.println(Lang.ENGLISH.price);
System.out.println(Lang.ENGLISH.type);
System.out.println("**************************");


}
}


