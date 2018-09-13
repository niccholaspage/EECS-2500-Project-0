import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Project 0
 * EECS 2500-001
 * Nicholas Nassar
 */
public class Reader {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("playerinfo.txt"))) {
            while (reader.ready()) {
                Player player = generatePlayer(reader);

                if (player != null) {
                    players.add(player);
                }
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

        if (position.equals("Defense")) {
            Defense defense = (Defense) constructPlayer(reader, position);

            defense.setTackles(Integer.parseInt(reader.readLine()));
            defense.setSacks(Float.parseFloat(reader.readLine()));
            defense.setInterceptions(Integer.parseInt(reader.readLine()));

            return defense;
        } else if (position.equals("Tight End") || position.equals("Running Back") || position.equals("Receiver")) {
            Receiver receiver = (Receiver) constructPlayer(reader, position);

            receiver.setReceptions(Integer.parseInt(reader.readLine()));
            receiver.setReceptionYards(Integer.parseInt(reader.readLine()));
            receiver.setRushes(Integer.parseInt(reader.readLine()));
            receiver.setRushingYards(Integer.parseInt(reader.readLine()));
            receiver.setTouchdowns(Integer.parseInt(reader.readLine()));
            receiver.setFumbles(Integer.parseInt(reader.readLine()));

            return receiver;
        } else if (position.equals("Quarterback")) {
            Quarterback quarterback = (Quarterback) constructPlayer(reader, position);

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

    private static Player constructPlayer(BufferedReader reader, String position) throws IOException {
        String name = reader.readLine();
        float weight = Float.parseFloat(reader.readLine());
        int age = Integer.parseInt(reader.readLine());

        if (position.equals("Defense")) {
            return new Defense(position, name, weight, age);
        } else if (position.equals("Tight End") || position.equals("Running Back") || position.equals("Receiver")) {
            return new Receiver(position, name, weight, age);
        } else if (position.equals("Quarterback")) {
            return new Quarterback(position, name, weight, age);
        } else {
            return null;
        }
    }
}
