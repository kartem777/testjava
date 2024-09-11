import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while(flag != false){
            System.out.println("num1");
            double num1 = scanner.nextInt();
            double num2 = 0;
            System.out.println("1+ 2- 3* 4/ 5!");
            int action = scanner.nextInt();
            while(action > 5 && action < 1){
                System.out.println("error. pls enter from 1 to 6\n1+ 2- 3* 4/ 5! ");
                action = scanner.nextInt();
            }
            if(action != 5){
                System.out.println("num2");
                num2 = scanner.nextInt();
            }
            switch(action){
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    System.out.println(factorial(num1));
                    break;

            }
            System.out.println("exit - false, again - true");
            flag = scanner.nextBoolean();
        }
    }
    public static double factorial(double num){
        if (num > 1){return num * factorial(num - 1);}
        else{return num;}
    }
}