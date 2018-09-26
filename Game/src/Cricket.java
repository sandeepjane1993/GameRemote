
import java.util.Random;

public class Cricket {


	public static void main(String[] args)
	{
		Player Team1Captain = new Player();
		Player Team2Captain = new Player();
		Cricket a = new Cricket();
		Team1Captain.Name = "Sachin";
		Team2Captain.Name = "pointing";
		int rpo1 = a.runsPerOver();
		int rpi1 = a.runsPerInnings(10);
		a.toss(Team1Captain,Team2Captain );
		System.out.println("runs per over" + rpo1);
		System.out.println("Total score in 1st innings : " + rpi1);
		System.out.println("Total to chase : " + (rpi1+1));
		
		int rpi2 = a.runsPerInnings(10);
		System.out.println("Total score in 2nd innings(chasers) : " + rpi2);
		if(rpi2>rpi1)
		{
			System.out.println("Chasers win");
		}
		else
		{
			System.out.println("Defending team wins");
		}
		
	}
		
	public void toss(Player p1,Player p2)
	{
		Random toss = new Random();
		int tossResult = toss.nextInt(2);
		Random bat_or_bowl = new Random();
		int choice = bat_or_bowl.nextInt(2);
		
		if(tossResult == 1)
		{
			System.out.println(p1.Name + " won the toss (Team1)");
			if(choice == 1)
			{
				System.out.println(p1.Name + " chose to bat");
			}
			else 
			{
				System.out.println(p1.Name + " chose to bowl");
				}
		}
		else {
			System.out.println(p2.Name + " won the toss (Team2)");
			if(choice == 1)
			{
				System.out.println(p2.Name + " chose to bat");
			}
			else
				System.out.println(p2.Name + " chose to bowl");
			}
		
	}
	public int runsPerInnings(int overs)
	{
		int score = 0;
		int[] arr = new int[overs];
		for(int i=0;i<overs;i++)
		{
			arr[i] = runsPerOver(); 
			score = score + arr[i];
		}
		return score;
	}
	public int runsPerOver()
	{
		int score = 0;
		for(int i=0;i<=6;i++)
		{
			score = score + runsPerBall();
		}
		return score;
	}
	public int runsPerBall()
	{
		Random hit = new Random();
		int score = hit.nextInt(6);
		if(score == 1)
		{
			return boundary();
		}
		Random bat_or_bowl = new Random();
		int choice = bat_or_bowl.nextInt(3);
		return choice;
	}
	public int boundary()
	{
		if(bounce())
		{
			return 4;
		}
		return 6;
	}
	public boolean bounce()
	{
		Random toss = new Random();
		int tossResult = toss.nextInt(2);
		if(tossResult == 1)
		{
			return true;
			}
			return false; 
	}
	

}
	
