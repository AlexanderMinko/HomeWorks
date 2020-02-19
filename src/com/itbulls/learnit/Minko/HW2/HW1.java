package com.itbulls.learnit.Minko.HW2;
import java.io.*;

public class HW1 {
	public static void sum() {
		String  a = "5";
		String b = "7";
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int s = a1 + b1;
		System.out.println("Sum of two numbers " + a1 + " and " + b1 + " is: " + s);
	}
	public static void areaOfTringle() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double p = 0.0d;
		double area = 0.0d;
		char[] tringleSides = {'A', 'B', 'C'};
		double[] tringle = new double[tringleSides.length];
		for(int i=0; i<tringle.length; i++) {
			System.out.print("Enter side " + tringleSides[i] +" of tringle: ");
			String s = reader.readLine();
			if(s.isEmpty()) {
				break;
			}
			tringle[i] = Double.parseDouble(s);
			p = p + tringle[i];
			area = Math.sqrt((p/2)*((p/2)-tringle[0])*((p/2)-tringle[1])*((p/2)-tringle[2]));
		}
		area = (int) (area * 100);
		area = (double)(area/100);
		System.out.println("Area of the tringle is: " + area);
	}
	public static void circumFerence() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please, enter circle radius: " );
		double r = Double.parseDouble(reader.readLine());
		double circumference = 2 * Math.PI*r;
		circumference = (int) (circumference * 100);
		circumference = (double)(circumference/100);
		System.out.println("Your circumferense is: " + circumference);
	}
	}
