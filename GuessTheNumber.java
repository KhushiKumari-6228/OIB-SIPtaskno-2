import java.util.*;               
class Game{
        int attempts=1; 
    //Object for Scanner Class.
    Scanner input=new Scanner(System.in);
    
    //Creating Object for Random Number.
    Random random= new Random();
    
    //creating a variable for giving points
    int points;
    
    //method for game
    public void MainGame(){
    
    //creating random no.
    int rand=random.nextInt(100)+1;
    
    //taking user input.
    int GuessedNum;
    System.out.println("Guess a nuumber between 1 to 100. ");
    
    //Limiting no. of trials
    for(int i=1;i<=10;i++){
        System.out.print("Enter your Guessed Number: ");
        GuessedNum=input.nextInt();
        
        //checking whether the input given by user is valid or not. 
        if(GuessedNum>0 && GuessedNum<101){
            
            //checking if the user got the correct number or not.
            if(GuessedNum==rand){
                System.out.println("Hurray you got the correct number.");
                System.out.println("You got the number at your "+ attempts+ " attempt.");
                System.out.print("******Your Score is: ");
                
                switch(attempts){
                    case 1: 
                            System.out.print("10 ******\nWonderful!You are the best guessor.\n");
                            break;
                    case 2: 
                            System.out.print("9 ******\nGreat! We are surprised that you guessed in very less time.\n");
                            break;
                    case 3: 
                            System.out.print("8 ******\nWaao! Amazing.\n");  
                            break;
                    case 4: 
                            System.out.print("7 ******\nWell Played!\n");
                            break;
                    case 5: 
                            System.out.print("6 ******\nYou have a good IQ.\n");
                            break;
                    case 6: 
                            System.out.print("5 ******\nNice One!\n");
                            break;
                    case 7: 
                            System.out.print("4 ******\nNice Try!\n");
                            break;
                    case 8: 
                            System.out.print("3 ******\nYou can do Better./n");
                            break;    
                    case 9: 
                            System.out.print("2 ******\nYou can do Better.\n");
                            break;
                    case 10:
                            System.out.print("1 ******\nWaao!! You escaped the game to get over.\n");
                            break;
                }
                break;}
            else if(GuessedNum>rand){
                System.out.println("Oops! try again with a Smaller Number");
                System.out.println();
                attempts++;}
                if( attempts>10){
                    System.out.println("Game Over.. \nBetter Luck Next Time..");
                    System.out.println();
                        break;}
            else if(GuessedNum<rand){
                System.out.println("Oops! try again with a Larger Number");
                System.out.println();
                attempts++;
                if(attempts>10){
                   System.out.println("Game Over.. \nBetter Luck Next Time..");
                   System.out.println();
                    break;}}
            }
        else{
            System.out.println("Please Enter a Valid number i.e between 1 to 100");
            System.out.println();}}
                
    }}

public class GuessTheNumber {

    public static void main(String[] args) {
        Game g=new Game();
        g.MainGame();
        Scanner input=new Scanner(System.in);
        String s;
        while(true){
             System.out.print("Do you want to play again? Y/N: ");
             s=input.next();
             if(s.equalsIgnoreCase("Y")){
                g.MainGame();}
            else if(s.equalsIgnoreCase("N")){
                System.out.println();
                System.out.println("Thanks for Playing.\nHope seeing you soon.\nTill then Bubye!!!");
                break;}
        else{
            System.out.println("Please Enter a valid choice i.e either Y/N or y/n");
            System.out.println();}
    

        }
    }
}
