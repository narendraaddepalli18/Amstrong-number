
import java.util.Scanner;
class Amstrong{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number to check");
    int amg=0;
        int num=s.nextInt();
        int dup=num;
        while(num>0){
      int extract=num%10;
       amg=amg+(extract*extract*extract);
      num=num/10;
        }
if(amg==dup){
    System.out.println("it is an amstrong");
}
else{
    System.out.println("the number is not amstrong");
}
    }
}

