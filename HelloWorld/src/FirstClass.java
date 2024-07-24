public class FirstClass {
    public static void main(String[] args) {
        FirstClass firstObj = new FirstClass();
        int result1500Score = firstObj.calculateHighScorePosition(1500);
        System.out.println("Result for score of 1500 is "+result1500Score);
        firstObj.displayHighScorePosition("Navin", result1500Score);
        System.out.println("=================================================");

        int result1000Score = firstObj.calculateHighScorePosition(1000);
        System.out.println("Result for score of 1000 is "+result1000Score);
        firstObj.displayHighScorePosition("Tim", result1000Score);
        System.out.println("=================================================");

        int result500Score = firstObj.calculateHighScorePosition(500);
        System.out.println("Result for score of 500 is " + result500Score);
        firstObj.displayHighScorePosition("John", result500Score);
        System.out.println("=================================================");

        int result100Score = firstObj.calculateHighScorePosition(100);
        System.out.println("Result for score of 100 is "+result100Score);
        firstObj.displayHighScorePosition("Siddhant", result100Score);
        System.out.println("=================================================");

        int result25Score = firstObj.calculateHighScorePosition(25);
        System.out.println("Result for score of 25 is "+result25Score);
        firstObj.displayHighScorePosition("Shankar", result25Score);
        System.out.println("=================================================");


    }

    //display High score position
    //one for players name
    //one for players position in a high score list
    public void displayHighScorePosition(String playersName, int playersPosition) {

        //the method will print a message like
        // <Name> managed to get into position <number> on the high score list
        System.out.println(playersName + " managed to get into position "+ playersPosition + " on the high score list");
    }

    //second method
    //calculateHighScorePosition
    public int calculateHighScorePosition(int score) {
        if(score >=  1000) {
            return 1;
        }
        else if(score >= 500) {
            return 2;
        }
        else if(score >= 100) {
            return 3;
        }
        return 4;
    }
}