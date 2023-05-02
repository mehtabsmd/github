package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(3);
        myList.add(1);
        myList.add(9);

        System.out.println(myList);

        Collections.sort(myList);

        System.out.println(myList);

        Collections.sort(myList, Collections.reverseOrder());

        System.out.println(myList);

        List<String> strList = new ArrayList<>();
        strList.add("Sunil");
        strList.add("Prash");
        strList.add("Anil");

        System.out.println(strList);
        Collections.sort(strList);

        System.out.println(strList);

        Collections.sort(strList, Collections.reverseOrder());

        System.out.println(strList);

        List<Player> playerList = new ArrayList<>();
        Player player1 = new Player(12, 34, "Sunil");
        Player player2 = new Player(1, 56, "Anoop");
        Player player3 = new Player(92, 78, "Prash");

        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);

        System.out.println(playerList);

        Collections.sort(playerList);

        System.out.println(playerList);


}
}