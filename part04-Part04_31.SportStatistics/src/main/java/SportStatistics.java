
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            int count = 0;
            int wins = 0;
            int losses = 0;

            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();

                String[] splited = data.split(",");
                String homeTeam = splited[0];
                String visitingTeam = splited[1];
                int homeTeamPoints = Integer.valueOf(splited[2]);
                int visitingTeamPoints = Integer.valueOf(splited[3]);

                games.add(new Game(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }

            for (Game game : games) {
                if (game.isHomeTeam(team)) {
                    count++;

                    if (game.getHomeTeamPoints() > game.getVisitingTeamPoints()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

                if (game.isVisitingTeam(team)) {
                    count++;

                    if (game.getVisitingTeamPoints() > game.getHomeTeamPoints()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }

            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}