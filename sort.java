import java.util.Scanner;
public class sort{
    public static void main (String [] args){
        String temp;
        int i, j,count;
        Scanner scan = new Scanner(System.in);
        System.out.println("no of string");
        count=scan.nextInt();
        count=count+1;
        String[] str =new String[count];
        Scanner scan2=new Scanner(System.in);
        System.out.println("Enter the string one by one ");
        for (i=0;i<count;i++){
            str[i]=scan.nextLine();
        }
         System.out.println("the string before sort ");
          for (i=0;i<count;i++){
            System.out.println(str[i]);
          }
          for (i=0;i<count;i++){
            for (j=i+1;j<count;j++){
                if((str[i].compareTo(str[j]))>0){
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;

                }
            }
          
          }
           System.out.println("the string after sort ");
          for (i=0;i<count;i++){
            System.out.println(str[i]);
          }
    }
}