import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
            Defense defense = new Defense();

            setPlayerFields(reader, defense, position);

            defense.setTackles(Integer.parseInt(reader.readLine()));
            defense.setSacks(Float.parseFloat(reader.readLine()));
            defense.setInterceptions(Integer.parseInt(reader.readLine()));

            return defense;
        } else if (position.equals("Tight End") || position.equals("Running Back") || position.equals("Receiver")) {
            Receiver receiver = new Receiver();

            setPlayerFields(reader, receiver, position);

            receiver.setReceptions(Integer.parseInt(reader.readLine()));
            receiver.setReceptionYards(Integer.parseInt(reader.readLine()));
            receiver.setRushes(Integer.parseInt(reader.readLine()));
            receiver.setRushingYards(Integer.parseInt(reader.readLine()));
            receiver.setTouchdowns(Integer.parseInt(reader.readLine()));
            receiver.setFumbles(Integer.parseInt(reader.readLine()));

            return receiver;
        } else if (position.equals("Quarterback")) {
            Quarterback quarterback = new Quarterback();

            setPlayerFields(reader, quarterback, position);

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

    private static void setPlayerFields(BufferedReader reader, Player player, String position) throws IOException {
        String name = reader.readLine();
        float weight = Float.parseFloat(reader.readLine());
        int age = Integer.parseInt(reader.readLine());

        player.setPosition(position);
        player.setName(name);
        player.setWeight(weight);
        player.setAge(age);
    }
}
