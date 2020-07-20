package td.edu;

import java.util.Scanner;

import td.edu.util.Calc;

public class GitConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Calc cal = new Calc();

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int result1 = cal.sumFnc(num1);
		int result2 = cal.sumFnc(num2);

		cal.outputFnc(num1, result1);
		cal.outputFnc(num2, result2);

	}

}