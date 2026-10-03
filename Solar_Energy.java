import java.util.Scanner;
public class Solar_Energy {
public static void main(String[] args){
System.out.println("Enter Energy Generated in Kwh :");
Scanner sc = new Scanner(System.in);
int EnergygeneratedinKwh = sc.nextInt();
if (EnergygeneratedinKwh >=10 ){
System.out.println("Good Energy Generation");
}
else {
System.out.println("Low Energy Generation");
}
}
}