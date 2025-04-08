import java.util.Scanner;
class sports{
String sport;
int Rating;
sports(String spo, int ra){
sport = spo;
Rating = ra;
}
}
class student extends sports{
String Grade;
double Overall_per;
student(String spo, int ra, String gd, double per){
super(spo,ra);
Grade = gd;
Overall_per = per;
}
}
public class result extends student{
result(String spo, int ra, String gd, double per){
super(spo, ra, gd, per);
}
void display(){
System.out.println("\n Sports Details of Student" );
System.out.println("Sport: "+sport );
System.out.println("Rating: "+Rating );
System.out.println("\nAcademic Details of Student" );
System.out.println("\nAcademic Grade: "+Grade );
System.out.println("Overall percentage: "+Overall_per );
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of Students");
int num=sc.nextInt();
result arr[]=new result[num];
for(int i=0;i<num;i++){
    int j=i+1;
System.out.println("\n Sports Details of Student :" +j+").");
System.out.println("\n Sport: ");
String a = sc.next();
System.out.println("\n Sport Rating out of 10: " );
int b = sc.nextInt();
System.out.println("\nEnter the academic  Details of Students" );
System.out.println("\n Aademic Grade: " );
String c = sc.next();
System.out.println("\n Overall percentage: " );
double d = sc.nextDouble();

arr[i]= new result (a,b,c,d);
}
for(int i=0;i<num;i++){
    int j1=i+1;
    System.out.println("**********Student Detail of "+j1+").***********");
arr[i].display();
}
sc.close();
}
}