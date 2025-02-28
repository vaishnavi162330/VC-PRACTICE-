/*Write a program that takes a number (1–7) as input and prints the day 
of the week (e.g., 1 for Monday, 2 for Tuesday, etc.) using if-else conditions.
 */

 import java.util.Scanner;
    class WeekDays{
        public static void main(String args[]){
            Scanner s = new Scanner(System.in);

            System.out.print("Enter the number from 1-7 for Monday to Sunday:  ");
            int a = s.nextInt();

            if(a == 1){
                System.out.println("Monday");
            }
            else if(a == 2){
                System.out.println("Tuesday");
            }
            else if(a == 3){
                System.out.println("Wednesday");
            }
            else if(a == 4){
                System.out.println("Thursday");
            }
            else if(a == 5){
                System.out.println("Friday");
            }
            else if(a == 6){
                System.out.println("Saturday");
            }
            else if(a == 7){
                System.out.println("Sunday");
            }
            else{
                System.out.println("Invalid.");
            }
            System.out.println("THANK YOU FOR RUNNING MY CODE.");
        }
    }