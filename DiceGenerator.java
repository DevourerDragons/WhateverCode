import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceGenerator {
    public static void main(String[] args) {
        List<Integer> zahlen = generiereZufallszahlen(4, 20);
        System.out.println(zahlen);
    }

    public static List<Integer> generiereZufallszahlen(int numberOfRolls, int diceSize) {
        Random random = new Random();
        List<Integer> ergebnisse = new ArrayList<>();

        for (int i = 0; i < numberOfRolls; i++) {
            int roll = random.nextInt(diceSize) + 1;
            ergebnisse.add(roll);
        }

        return ergebnisse;
    }
}
//Kommentare:
//Ein alter "Würfel-Emulator", den ich mal im Matheunterricht gemacht hatte, weil mir langweilig war. Unsere Taschenrechner hatten ein Python und Java Modul!
//die erste Eingabe gibt an, wie oft er den "Würfel" werfen soll, die zweite, was für eine Größe der Würfel hat.
//Kontext ist, dass eines meiner Hobbies Würfel-Rollenspiele, die neben klassischen D6 auch 4, 8, 12 und 20-seitige Würfel brauchten.
//Im Moment würfelt er zum Beispiel 4d20, also 4 mal einen 20-seitigen Würfel.