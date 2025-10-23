import java.io.FileWriter;

public class VerleihProtokollierer
{
    public final static String AUSLEIHE = "Ausleihe";
    public final static String RUECKGABE = "Rückgabe";

    public static void protokolliere(String ereignis, Verleihkarte verleihkarte)
            throws ProtokollierException
    {
        /*   System.out.println(ereignis + " des Mediums " + verleihkarte.getMedium()
                + ", ausgeliehen von " + verleihkarte.getEntleiher() + "am "
                + verleihkarte.getAusleihdatum() + "(ausgeliehen für "
                + verleihkarte.getAusleihdauer() + " Tag(e))"); */
        try (FileWriter protokollierer = new FileWriter("./protokoll.txt",
                true))
        {
            protokollierer.write(ereignis + " des Mediums "
                    + verleihkarte.getMedium() + ", ausgeliehen von "
                    + verleihkarte.getEntleiher() + "am "
                    + verleihkarte.getAusleihdatum() + "(ausgeliehen für "
                    + verleihkarte.getAusleihdauer() + " Tag(e))\n");
        }
        catch (Exception e)
        {
            throw new ProtokollierException(e.getMessage());
        }
    }
}
