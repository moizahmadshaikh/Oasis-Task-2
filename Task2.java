package oasis;

import java.util.*;
class Task2
{
	Scanner sc = new Scanner(System.in);
	HashMap<String,Integer> info = new HashMap<String,Integer>();
	public void login()
	{
		info.put("moiz1",1111);
		info.put("moiz2",2222);
		info.put("moiz3",3333);
		info.put("moiz4",4444);
		info.put("moiz5",5555);
		String id;
		int pwd;
		System.out.println("LOGIN");
		System.out.println("Enter Username:");
		id = sc.next();
		System.out.println("Enter Passoword:");
		pwd = sc.nextInt();
		if(info.containsKey(id) && info.get(id)==pwd)
		{
			System.out.println("\nLogin successful!");
			menu();
		}
		else
		{
			System.out.println("\nIncorrect user ID or password!\nTry again!\n");
			login();
		}
	}
	public void menu()
	{
		int ch;
		System.out.println("\nEnter Choice:");
		System.out.println("1.Update profile \n2.Start Exam \n3.Logout");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				info = update();
				menu();
				break;
			case 2:
				startExam();
				menu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Choose correct choice");
		}
	}
	public HashMap<String,Integer> update()
	{
		String update_id;
		int update_pwd;
		System.out.println("Enter Username:");
		update_id = sc.next();
		System.out.println("Enter Old Password:");
		update_pwd = sc.nextInt();
		if(info.containsKey(update_id) && info.get(update_id)==update_pwd)
		{
			System.out.println("Enter New Password:");
			update_pwd = sc.nextInt();
			info.replace(update_id,update_pwd);
			System.out.println("PASSWORD CHANGED SUCCESSFULLY");
		}
		else
		{
			System.out.println("User not found\n");
		}
		return info;
	}
	public void startExam()
	{
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 30;
		int score = 0,ans;
		
		while(System.currentTimeMillis()<endTime)
		{
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q1.The device through which data and instructions are entered into a computer?");
			System.out.println("1.input device \t2.Output device \t3.Software \t4.Hardware");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 1)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q2.ALU stands for?");
			System.out.println("1.Arithmetic Lexical Unit\t2.Arithmetic Logical Unit\t3.Arrival Location Time \t4.None");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 2)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q3.Which is operating system?");
			System.out.println("1.Linux\t2.MySQL\t3.Jetbrains\t4.Eclipse");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 1)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q4.Inventor of Computer?");
			System.out.println("1.Elon Musk\t2.Charles Babbage\t3.Tata Jamshed\t4.Bill Gates");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 2)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q5.Full form of CPU?");
			System.out.println("1. Computer Principle Unit\t2.) Computer Processing Unit\t3. Central Processing Unit\t4.Control Processing Unit");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 3)
				score+=5;
			else
				score--;
			System.out.println("-------------------------------------------------------------");
			break;
		}
		System.out.println("Exam Finished");
		System.out.println();
		System.out.println("Grade ="+score);
		if(score>10)
			System.out.println("Congrats!!!!!!");
		else
			System.out.println("Better Luck Next Time");
	}
	public static void main(String args[])
	{
		Task2 obj  = new Task2();
		obj.login();
	}
}

