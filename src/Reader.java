import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File("playerinfo.txt")))) {
            while (reader.ready()) {
                players.add(generatePlayer(reader));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Player player : players) {
            System.out.println(player);
        }
    }

    private static Player generatePlayer(BufferedReader reader) throws IOException {
        Player player;

        String position = reader.readLine();

        switch (position) {
            case "Defensive":
                player = new Defensive();
                break;
            case "Tight End":
            case "Running Back":
            case "Receiver":
                player = new TERBR();
                break;
            case "Quarterback":
                player = new Quarterback();
                break;
            default:
                throw new IllegalArgumentException();
        }

        player.setPosition(position);
        player.setName(reader.readLine());
        player.setWeight(Float.parseFloat(reader.readLine()));
        player.setAge(Integer.parseInt(reader.readLine()));

        if (player instanceof Defensive) {
            Defensive defensive = (Defensive) player;

            defensive.setTackles(Integer.parseInt(reader.readLine()));
            defensive.setSacks(Float.parseFloat(reader.readLine()));
            defensive.setInterceptions(Integer.parseInt(reader.readLine()));
        } else if (player instanceof TERBR) {
            TERBR tightEnd = (TERBR) player;

            tightEnd.setReceptions(Integer.parseInt(reader.readLine()));
            tightEnd.setReceptionYards(Integer.parseInt(reader.readLine()));
            tightEnd.setRushes(Integer.parseInt(reader.readLine()));
            tightEnd.setRushingYards(Integer.parseInt(reader.readLine()));
            tightEnd.setTouchdowns(Integer.parseInt(reader.readLine()));
            tightEnd.setFumbles(Integer.parseInt(reader.readLine()));
        } else if (player instanceof Quarterback) {
            Quarterback quarterback = (Quarterback) player;

            quarterback.setPassAttempts(Integer.parseInt(reader.readLine()));
            quarterback.setPassCompletions(Integer.parseInt(reader.readLine()));
            quarterback.setPassingYards(Integer.parseInt(reader.readLine()));
            quarterback.setRushingAttempts(Integer.parseInt(reader.readLine()));
            quarterback.setRushingYards(Integer.parseInt(reader.readLine()));
            quarterback.setTouchdowns(Integer.parseInt(reader.readLine()));
            quarterback.setInterceptions(Integer.parseInt(reader.readLine()));
            quarterback.setFumbles(Integer.parseInt(reader.readLine()));
            quarterback.setSacks(Integer.parseInt(reader.readLine()));
        }

        return player;
    }
}
