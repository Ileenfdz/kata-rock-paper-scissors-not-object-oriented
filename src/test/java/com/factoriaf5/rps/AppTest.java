package com.factoriaf5.rps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldAnswerWithPlayer1Won()
    {
        assertEquals( "Player 1 won!", App.main("rock", "scissors") );
        assertEquals( "Player 1 won!", App.main("paper", "rock") );
        assertEquals( "Player 1 won!", App.main("scissors", "paper") );
    }

    @Test
    public void shouldAnswerWithPlayer2Won()
    {
        assertEquals( "Player 2 won!", App.main("scissors", "rock") );
        assertEquals( "Player 2 won!", App.main("rock", "paper") );
        assertEquals( "Player 2 won!", App.main("paper", "scissors") );
    }

    @Test
    public void shouldAnswerWithDraw()
    {
        assertEquals( "Draw!", App.main("rock", "rock") );
        assertEquals( "Draw!", App.main("paper", "paper") );
        assertEquals( "Draw!", App.main("scissors", "scissors") );
    }
}
