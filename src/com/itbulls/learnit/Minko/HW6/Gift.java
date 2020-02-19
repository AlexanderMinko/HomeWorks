package com.itbulls.learnit.Minko.HW6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.*;

public class Gift {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		List<Candy> myGift = candyInGift();
		System.out.print("Enter range of calories. First minimum of range: ");
		int min = Integer.parseInt(r.readLine());
		System.out.print("Now maximum of range: ");
		int max = Integer.parseInt(r.readLine());
		getCalorie(min, max, myGift);
		System.out.println("Wanna sort candys by weight? Say yes or no: ");
		String answer = r.readLine();
		if (answer.equals("yes")) {
			Collections.sort(myGift, new SortList());
			System.out.println();
			System.out.println("Candys in gift sorted by weight: ");
			print(myGift);
		} else {
			System.out.println("ok :(");
		}
		System.out.println("Wanna make our own gift? Say yes or no:");
		String answer2 = r.readLine();
		if (answer2.equals("yes")) {
			System.out.println("Enter names of candys what u wanna add: ");
			List<Candy> ownGift = ownGift();
			System.out.println("Your own gift consist of: ");
			print(ownGift);
		} else {
			System.out.println("ok ;(");
		}

	}

	private static List<Candy> candyInGift() {
		List<Candy> candyInGift = new ArrayList<>();
		candyInGift.add(new ChocolateCandy(0, "Mars", 50, 300));
		candyInGift.add(new ChocolateCandy(1, "Jupiter", 30, 230));
		candyInGift.add(new CaramelCandy(2, "Stonks", 60, 180));
		candyInGift.add(new CaramelCandy(3, "Faq", 37, 220));
		return candyInGift;
	}

	private static void getCalorie(int downCalorie, int topCalorie, List<Candy> candyInGift) {
		int n;
		for (Candy i : candyInGift) {
			if (i.getCalorie() > downCalorie && i.getCalorie() < topCalorie) {
				n = i.getNumber();
				System.out.println(candyInGift.get(n) + " has calorie beetwen " + downCalorie + " and " + topCalorie);
			}
		}
	}

	private static List<Candy> ownGift() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		List<Candy> ownList = new ArrayList<>();
		while (true) {
			String candi = r.readLine();
			if (candi.equals("Mars"))
				ownList.add(new ChocolateCandy(0, "Mars", 50, 300));
			else if (candi.equals("Jupiter"))
				ownList.add(new ChocolateCandy(1, "Jupiter", 30, 230));
			else if (candi.equals("Stonks"))
				ownList.add(new CaramelCandy(2, "Stonks", 60, 180));
			else if (candi.equals("Faq"))
				ownList.add(new CaramelCandy(3, "Faq", 37, 220));
			else if (candi.isEmpty())
				break;
		}
		return ownList;

	}

	private static void print(List<Candy> arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
