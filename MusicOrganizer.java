
import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
        player = new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    public void listAllFiles () {
        int index = 0;
        while (index < files.size()) {
            String filename = files.get(index);
            System.out.println((index + 1) + ".-" + filename);
            index++;
        }
    }

    public void listMatching (String searchString) {
        boolean cancionEncontrada = false;
        for(String filename : files) {
            if(filename.contains (searchString)) {
                System.out.println (filename);
                cancionEncontrada = true;
            }
        } 
        if (!cancionEncontrada){
            System.out.println ("ERROR " + searchString + " NO V�LIDO!! Intruduzca nuevo nombre");
        }
    }

    public void playSamplesArtist (String cancionAutor) {
        for(String filename : files) {
            if(filename.contains (cancionAutor)) {
                player.playSample(filename);
            }
        } 
    }

    /**
     * Localiza el �ndice del primer archivo que se corresponde con
     * la cadena de b�squeda indicada. (imprimir en qu� puesto del �ndice
     * se encuentra la canci�n que hemos buscado)
     * @param searchString La cadena que hay que buscar.
     * @return El �ndice de la primera aparici�n o -1 si
     * no se encuentra ninguna correspondencia
     */
    public int findFirst(String searchString){
        int index = 0;
        boolean cadenaEncontrada = false;
        while (index < files.size() && !cadenaEncontrada){
            if (files.get(index).contains(searchString)){
                cadenaEncontrada = true;
            }else {
                index++;
            }
        }
        if (cadenaEncontrada == false){
            index = -1;
        }
        return index;
    }
}
