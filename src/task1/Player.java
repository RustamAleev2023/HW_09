package task1;

import java.util.*;

public class Player {
    private String nickname;
    private HashMap<String, Integer> gamesList;


    public Player(String nickname, List<String> games) {
        this.nickname = nickname;
        this.gamesList = new HashMap<>();
        for (int i = 0; i < games.size(); i++) {
            gamesList.put(games.get(i), 0);
        }
    }

    public String getNickname() {
        return nickname;
    }

    public HashMap<String, Integer> getGamesList() {
        return gamesList;
    }

    public int getRank(String game) {
        int rank = -1;
        if (gamesList.containsKey(game)) {
        rank = gamesList.get(game);
        } else {
//            System.out.println("Игрок " + nickname + " не играет в игру " + game);
        }

        return rank;
    }

    public void setRank(String game) {
        if (gamesList.containsKey(game)) {
            int rank = gamesList.get(game);
            rank++;
            gamesList.put(game, rank);
        } else {
            System.out.println("Игрок " + nickname + " не играет в игру " + game);
        }

    }

    public void addGame(String game) {
        this.gamesList.put(game, 0);
    }

    public void addGamesList(HashMap<String, Integer> gamesList) {
        this.gamesList.putAll(gamesList);
    }

    public String playerGames() {
        StringJoiner joiner = new StringJoiner(", ");
        for (Map.Entry<String, Integer> entry : gamesList.entrySet()) {
            joiner.add(String.valueOf(entry.getKey() + " : " + entry.getValue()));
        }
        return joiner.toString();
    }


    @Override
    public String toString() {
        return "nickname: " + nickname + ", gamesList: " + playerGames();
    }
}
