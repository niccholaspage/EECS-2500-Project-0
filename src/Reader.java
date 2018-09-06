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
        String position = reader.readLine();
        String name = reader.readLine();
        float weight = Float.parseFloat(reader.readLine());
        int age = Integer.parseInt(reader.readLine());

        if (position.equals("Defensive")) {
            Defensive defensive = new Defensive();

            defensive.setPosition(position);
            defensive.setName(name);
            defensive.setWeight(weight);
            defensive.setAge(age);

            defensive.setTackles(Integer.parseInt(reader.readLine()));
            defensive.setSacks(Float.parseFloat(reader.readLine()));
            defensive.setInterceptions(Integer.parseInt(reader.readLine()));

            return defensive;
        } else if (position.equals("Tight End") || position.equals("Running Back") || position.equals("Receiver")) {
            TERBR terbr = new TERBR();

            terbr.setPosition(position);
            terbr.setName(name);
            terbr.setWeight(weight);
            terbr.setAge(age);

            terbr.setReceptions(Integer.parseInt(reader.readLine()));
            terbr.setReceptionYards(Integer.parseInt(reader.readLine()));
            terbr.setRushes(Integer.parseInt(reader.readLine()));
            terbr.setRushingYards(Integer.parseInt(reader.readLine()));
            terbr.setTouchdowns(Integer.parseInt(reader.readLine()));
            terbr.setFumbles(Integer.parseInt(reader.readLine()));

            return terbr;
        } else if (position.equals("Quarterback")) {
            Quarterback quarterback = new Quarterback();

            quarterback.setPosition(position);
            quarterback.setName(name);
            quarterback.setWeight(weight);
            quarterback.setAge(age);

            quarterback.setPassAttempts(Integer.parseInt(reader.readLine()));
            quarterback.setPassCompletions(Integer.parseInt(reader.readLine()));
            quarterback.setPassingYards(Integer.parseInt(reader.readLine()));
            quarterback.setRushingAttempts(Integer.parseInt(reader.readLine()));
            quarterback.setRushingYards(Integer.parseInt(reader.readLine()));
            quarterback.setTouchdowns(Integer.parseInt(reader.readLine()));
            quarterback.setInterceptions(Integer.parseInt(reader.readLine()));
            quarterback.setFumbles(Integer.parseInt(reader.readLine()));
            quarterback.setSacks(Integer.parseInt(reader.readLine()));

            return quarterback;
        } else {
            return null;
        }
    }
}
