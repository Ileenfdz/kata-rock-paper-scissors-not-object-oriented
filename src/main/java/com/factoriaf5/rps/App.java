package com.factoriaf5.rps;

public class App {
    public static String main( String p1, String p2 )
    {
        p1.toLowerCase();
        p2.toLowerCase();
        
        return(p1 == p2? "Draw!":
            p1 == "rock" && p2 == "scissors"?"Player 1 won!":
            p1 == "paper" && p2 == "rock"?"Player 1 won!":
            p1 == "scissors" && p2 == "paper"?"Player 1 won!":
            "Player 2 won!"
        );
    }
}
