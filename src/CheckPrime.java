import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số cần tìm vào: ");
        int number = sc.nextInt();

        if(number < 2){
            System.out.println(+number+ " không là số nguyên tố");
        }
        else {
            boolean check = true;
            int i = 2;
            while (i<=Math.sqrt(number)){
                if(number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check == true){
                System.out.println(+number+ " là số nguyên tố");
            }
            else {
                System.out.println(+number+ " không là số nguyên tố");
            }
        }
    }
}
