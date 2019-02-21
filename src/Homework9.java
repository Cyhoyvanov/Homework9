import java.util.Scanner;

public class Homework9 {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Введите число типа double: ");
	        double n = scan.nextDouble();
	        if(n%1 == 0){
	            System.out.println("Число "+n+" целое");
	        }else{
	            System.out.println("Число "+n+" не целое");
	        }
	    }
	}

