package task1;

import java.util.*;

public class Site {
    private List<Player> playerList;

    public Site() {
        playerList = new ArrayList<>();
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void registration(Player player) {
        if (playerList.contains(player)) {
            System.out.println("Player with this nickname already have!");
        } else {
            playerList.add(player);
        }
    }

    public void updateRating(Player player, String game) {

        playerList.get(playerList.indexOf(player)).setRank(game);
    }

    public Set<String> getGamesList() {
        Set<String> games = new TreeSet<>();
        for (int i = 0; i < playerList.size(); i++) {
            Player player = playerList.get(i);
            Set<String> playerGamesList = player.getGamesList().keySet();
            games.addAll(playerGamesList);

        }
        return games;
    }

    public void printAllGamesList(){
        System.out.println("Game list:");
        for (String game : getGamesList()) {
            System.out.println(game);
        }
    }

    public int getPlayerRank(String nickname, String game) {
        int rank = -1;
        for (int i = 0; i < playerList.size(); i++) {
            Player player = playerList.get(i);
            String nick = player.getNickname();
            if (nick.equals(nickname)) {
                rank = player.getRank(game);
                break;
            }
        }
        return rank;
    }

    public void printPlayerRank(String nickname, String game) {
        int rank = getPlayerRank(nickname, game);
        String result = rank == -1 ? "Игрока с именем " + nickname + " нет" : nickname + "'s rank is " + rank;
        System.out.println(result);
    }

    public Map<String, Integer> getBestPlayersInOneGame(String game) {
        Map<String, Integer> gameRankList = new HashMap<>();
        int rank;
        for (int i = 0; i < playerList.size(); i++) {
            String nickname = playerList.get(i).getNickname();
            rank = getPlayerRank(nickname, game);
            if (rank != -1) {
                gameRankList.put(nickname, rank);
            }
        }
        return gameRankList;
    }

    public void printTenBestPlayersInOneGame(String game) {
        Map<String, Integer> tenBestPlayersInOneGame = getBestPlayersInOneGame(game);
        long count = tenBestPlayersInOneGame.entrySet().stream().sorted(Map.Entry.comparingByValue()).count();
        tenBestPlayersInOneGame.entrySet().stream().sorted(Map.Entry.comparingByValue()).skip(count - 10).forEach(System.out::println);

    }

    public void getTenBestPlayersInAllGames() {
        Map<String, Integer> allGameRankList = new HashMap<>();

        for (String game : getGamesList()) {
            Map<String, Integer> bestPlayersInOneGame = getBestPlayersInOneGame(game);
            allGameRankList.putAll(bestPlayersInOneGame);
        }

        long count = allGameRankList.entrySet().stream().sorted(Map.Entry.comparingByValue()).count();
        allGameRankList.entrySet().stream().sorted(Map.Entry.comparingByValue()).skip(count - 10).forEach(System.out::println);

    }

}

