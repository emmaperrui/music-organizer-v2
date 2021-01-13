

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class lista.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class lista
{
    private MusicOrganizer MusicOrganizer;

    /**
     * Default constructor for test class lista
     */
    public lista()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        MusicOrganizer = new MusicOrganizer();
        MusicOrganizer.addFile("audio/hayloft.mp3");
        MusicOrganizer.addFile("audio/little-dark-age.mp3");
        MusicOrganizer.addFile("audio/rhinestone-eyes.mp3");
        MusicOrganizer.startPlaying(2);
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
