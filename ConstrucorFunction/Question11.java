/*Question 11: Write a Java program to create a Player class and find the player with highest runs.

Description: Create a Player POJO class having playerId, playerName and runs.
 Initialize using constructor. 
 Store 5 player objects in an array and find the player who scored maximum runs.
INPUT:
Enter Player Details:
Player1: 1 Virat 85
Player2: 2 Rohit 120
Player3: 3 KL 45
Player4: 4 Gill 95
Player5: 5 Hardik 60

OUTPUT:
Highest Run Scorer: Rohit
Runs: 120

EXPLANATION:
Create Player class with playerId, playerName, runs. Use constructor
 to initialize each player. Create array Player[] players = new Player[5].
 Store 5 player objects. 
 Loop through array, find maximum runs and display player name with max runs.*/
 
 

import java.util.Scanner;
class NumberArray
{
	
	int playerId;
    String playerName;
	int runs;
	NumberArray(int playerId,String playerName,int runs)
	{
		this.arr=nums;
		this.playerId=playerId;
		this.playerName=playerName;
		this.runs=runs;
	}
	 int getRuns()
    {
        return runs;
    }

    String getPlayerName()
    {
        return playerName;
    }
}
class Question11
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the array element");
		
		Player[] players = new Player[5];
		 System.out.println("enter the player details");
		 for(int i=0;i<players.length;i++)
		 {
			 id=sc.nextInt();
			 name=sc.nextLine();
			 runs=sc.nextInt();
			 players[i] = new Player(id, name, runs);
	     }
   
        Player maxPlayer = players[0];
        for(int i = 1; i < 5; i++)
        {
            if(players[i].getRuns() > maxPlayer.getRuns())
            {
                maxPlayer = players[i];
            }
        }

        System.out.println("Highest Run Scorer: "+ maxPlayer.getPlayerName());

        System.out.println("Runs: "+ maxPlayer.getRuns());
    }
}
	 
  