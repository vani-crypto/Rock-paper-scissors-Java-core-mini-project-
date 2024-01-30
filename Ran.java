package com.sample.pro1;
import java.util.Random;
import java.util.Scanner;
public class Ran {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("                        ROCK PAPER SCISSOR                     ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		int a=10;
		
		int H=0;
		int AI=0;
		int no=0;
		System.out.println("enter your name:");
		String n= s.nextLine();
		while(a>0) {
			display();
			
			System.out.println("enter your option");
			
			String c=s.nextLine();
			Random r=new Random();
			if(no>5) {
				System.out.println("Final Score: ");
				System.out.println(n+": "+H+" | AI: "+AI);
				System.exit(0);
				}
			if(c.equals("R")) {
				int comp=10+r.nextInt(3)+1;
				if(comp==11) {
					System.out.println("you:rock");
					System.out.println("AI:scissors");
					System.out.println("win");
					no=no+1;
					H=H+1;
					AI=AI+0;
					System.out.println(n+": "+H+" | AI: "+AI);
				}
				else if(comp==12) {
					System.out.println("you:rock");
					System.out.println("AI:paper");
					System.out.println("loose");
					no=no+1;
					H=H+0;
					AI=AI+1;
					System.out.println(n+": "+H+" | AI: "+AI);
	
				}
				else if(comp==13) {
					System.out.println("you:rock");
					System.out.println("AI:rock");
					System.out.println("draw");
					no=no+1;
					H=H+1;
					AI=AI+1;
					System.out.println(n+": "+H+" | AI: "+AI);
				}
				
			}
				
				else if(c.equals("P")) {
				    int comp=20+r.nextInt(3)+1;
				    if(comp==21) {
					System.out.println("you:paper");
					System.out.println("AI:scissors");
					System.out.println("loose");
					no=no+1;
					H=H+0;
					AI=AI+1;
					System.out.println(n+": "+H+" | AI: "+AI);

				}
				else if(comp==22) {
					System.out.println("you:paper");
					System.out.println("AI:paper");
					System.out.println("draw");
					no=no+1;
					H=H+1;
					AI=AI+1;
					System.out.println(n+": "+H+" | AI: "+AI);
	
				}
				else if(comp==23) {
					System.out.println("you:paper");
					System.out.println("AI:rock");
					System.out.println("win");
					no=no+1;
					H=H+1;
					AI=AI+0;
					System.out.println(n+": "+H+" | AI: "+AI);
				}
				}
				else if(c.equals("S")) {
				    int comp=30+r.nextInt(3)+1;
				    if(comp==31) {
					System.out.println("you:scissors");
					System.out.println("AI:scissors");
					System.out.println("draw");
					no=no+1;
					H=H+1;
					AI=AI+1;
					System.out.println(n+": "+H+" | AI: "+AI);
				}
				else if(comp==32) {
					System.out.println("you:scissors");
					System.out.println("AI:paper");
					System.out.println("lose");
					no=no+1;
					H=H+0;
					AI=AI+1;
					System.out.println(n+": "+H+" | AI: "+AI);
				
	
				}
				else if(comp==33) {
					System.out.println("you:scissors");
					System.out.println("AI:rock");
					System.out.println("win");
					no=no+1;
					H=H+1;
					AI=AI+0;
					System.out.println(n+": "+H+" | AI: "+AI);
				}
				}
			}if (H==AI) {
				System.out.println("draw");
				System.out.println("play once again");
				display();
			}
			
		}
		public static void display() {
			System.out.println("ROCK:R");
			System.out.println("PAPER:P");
			System.out.println("SCISSORS:S");
			System.out.println("----------------------------------------------------------------");
	
		
			
	}
	

}
