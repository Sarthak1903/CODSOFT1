import java.util.*;
public class StudentGradeCalculator {
    
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //WE TAKE TOTAL NO. OF SUBJECT BE 5.
        //ENTER MARKS FROM (0 TO 100) AS SUBJECT CONTAIN 100 MARKS EACH::

        System.out.print("ENTER TOTAL NO. OF SUBJECT::");
        int totalsubject=sc.nextInt();
        
        System.out.print("ENTER MARKS OF MATH::");
        int Math=sc.nextInt();

        System.out.print("ENTER MARKS OF PHYSICS::");
        int Physics=sc.nextInt();

        System.out.print("ENTER MARKS OF CHEMISTRY::");
        int Chemistry=sc.nextInt();

        System.out.print("ENTER MARKS OF ENGLISH::");
        int English=sc.nextInt();

        System.out.print("ENTER MARKS OF HINDI::");
        int Hindi=sc.nextInt();
        System.out.println();


        int totalmarks=Math+Physics+English+Chemistry+Hindi;
        
        int Percentage=totalmarks/totalsubject;


        System.out.println("THE TOTAL MARKS OBTAINED::"+totalmarks);
       
        System.out.println("PERCENTAGE(%) ::"+Percentage);
      

        if(Percentage>=90){
            System.out.println("GRADE IS::A+");
        }
        else if(Percentage>75){
            System.out.println("GRADE IS::A");

        }else if(Percentage>50){
            System.out.println("GRADE IS::B");
        }
        else{
            System.out.println("GRADE IS::fail");
        }

        


      }

}
