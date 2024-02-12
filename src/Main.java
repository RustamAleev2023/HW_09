import task1.Player;
import task1.Site;
import task2.Invoice;
import task2.Item;
import task2.Stock;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        task1();
        task2();
    }

    //Задание 1
    //Есть сайт, на котором рассчитывается рейтинг игроков
    //различных сетевых игр.
    //Игрок при регистрации указывает ник, а так же список
    //игр, в которые он играет.
    //Задача – написать программу, которая:
    //■ регистрирует игроков в системе (должна быть проверка,
    //занят ли ник);
    //■ добавляет рейтинг игроку, в случае его выигрыша в игре;
    //■ выводит список игр, в которые играют все игроки на сайте;
    //■ выводит рейтинг по имени игрока и игре;
    //■ выводит 10 лучших игроков в определенной игре;
    //■ выводит 10 лучших игроков с учетом всех игр
    public static void task1() {
        List<String> pl1Games = new ArrayList<>();
        pl1Games.add("game1");
        pl1Games.add("game2");
        List<String> pl2Games = new ArrayList<>();
        pl2Games.add("game1");
        pl2Games.add("game2");
        List<String> pl3Games = new ArrayList<>();
        pl3Games.add("game1");
        pl3Games.add("game2");
        List<String> pl4Games = new ArrayList<>();
        pl4Games.add("game1");
        pl4Games.add("game2");
        List<String> pl5Games = new ArrayList<>();
        pl5Games.add("game1");
        pl5Games.add("game2");
        List<String> pl6Games = new ArrayList<>();
        pl6Games.add("game1");
        pl6Games.add("game2");
        List<String> pl7Games = new ArrayList<>();
        pl7Games.add("game1");
        pl7Games.add("game2");
        List<String> pl8Games = new ArrayList<>();
        pl8Games.add("game1");
        pl8Games.add("game2");
        List<String> pl9Games = new ArrayList<>();
        pl9Games.add("game1");
        pl9Games.add("game2");
        List<String> pl10Games = new ArrayList<>();
        pl10Games.add("game1");
        pl10Games.add("game2");
        List<String> pl11Games = new ArrayList<>();
        pl11Games.add("game1");
        pl11Games.add("game2");
        List<String> pl12Games = new ArrayList<>();
        pl12Games.add("game1");
        pl12Games.add("game2");
        List<String> pl13Games = new ArrayList<>();
        pl13Games.add("game2");


        Player player1 = new Player("player1", pl1Games);
        Player player2 = new Player("player2", pl2Games);
        Player player3 = new Player("player3", pl3Games);
        Player player4 = new Player("player4", pl4Games);
        Player player5 = new Player("player5", pl5Games);
        Player player6 = new Player("player6", pl6Games);
        Player player7 = new Player("player7", pl7Games);
        Player player8 = new Player("player8", pl8Games);
        Player player9 = new Player("player9", pl9Games);
        Player player10 = new Player("player10", pl10Games);
        Player player11 = new Player("player11", pl11Games);
        Player player12 = new Player("player12", pl12Games);
        Player player13 = new Player("player13", pl13Games);

        Site site = new Site();

        site.registration(player1);
        site.registration(player2);
        site.registration(player3);
        site.registration(player4);
        site.registration(player5);
        site.registration(player6);
        site.registration(player7);
        site.registration(player8);
        site.registration(player9);
        site.registration(player10);
        site.registration(player11);
        site.registration(player12);
        site.registration(player13);
        System.out.println("=======================================");
        System.out.println("Вывод все игроков: ");
        for (int i = 0; i < site.getPlayerList().size(); i++) {
            System.out.println(site.getPlayerList().get(i).toString());
        }
        System.out.println("================================");
        System.out.println("Установка рейтинга: ");
        for (int i = 0; i < site.getPlayerList().size(); i++) {
            site.getPlayerList().get(i).setRank("game1");
        }

        for (int i = 0; i < 10; i++) {
            site.getPlayerList().get(i).setRank("game1");
        }
        for (int i = 0; i < 5; i++) {
            site.getPlayerList().get(i).setRank("game1");
        }
        for (int i = 0; i < 3; i++) {
            site.getPlayerList().get(i).setRank("game1");
        }
        site.getPlayerList().get(0).setRank("game1");

        player4.setRank("game1");
        player4.setRank("game1");
        player4.setRank("game1");

        player12.setRank("game1");
        player12.setRank("game1");
        player12.setRank("game1");

        player4.setRank("game2");
        player4.setRank("game2");
        player4.setRank("game2");

        player12.setRank("game2");
        player12.setRank("game2");
        player12.setRank("game2");
        player12.setRank("game2");
        player12.setRank("game2");
        player12.setRank("game2");
        player12.setRank("game2");
        player12.setRank("game2");
        player12.setRank("game2");

        for (int i = 0; i < site.getPlayerList().size(); i++) {
            site.getPlayerList().get(i).setRank("game2");
        }

        for (int i = 0; i < 10; i++) {
            site.getPlayerList().get(i).setRank("game2");
        }
        System.out.println("Список игроков после установки рейтинга");
        for (int i = 0; i < site.getPlayerList().size(); i++) {
            System.out.println(site.getPlayerList().get(i).toString());
        }
        System.out.println("=======================================");
        System.out.println("Вывод списка всех игр");
        site.printAllGamesList();

        System.out.println("=======================================");
        System.out.println("Вывод рейтинга игрока по его имени:");
        site.printPlayerRank("player2", "game1");
        site.printPlayerRank("player20", "game1");

        System.out.println("=======================================");
        System.out.println("Вывод  10 лучших игроков в определенной игре");
        site.printTenBestPlayersInOneGame("game1");

        System.out.println("=======================================");
        System.out.println("Вывод 10 лучших игроков с учетом всех игр");
        site.getTenBestPlayersInAllGames();
    }

    //Задание 2
    //В компании XXX есть несколько складов с продукцией,
    //каждый склад имеет свой собственный юридический адрес.
    //Регистрация поступления или отгрузки товаров осуществляется по накладной (документ). Товары могут поступать
    //как от внешних поставщиков, так и перемещаться между
    //складами компании.
    //Накладная имеет такие данные (см. рисунок).
    //Задача – разработать программу складского учета.
    //Программа должна:
    //■ содержать форму ввода накладной;
    //■ выводить список всех товаров на складе;
    //■ выводить список всех внешних поставщиков;
    //■ искать товар на складе по наименованию
    public static void task2(){
        Item item1 = new Item("Item1", "pcs", 10, 1);
        Item item2 = new Item("Item2", "pcs", 10, 2);
        Item item3 = new Item("Item3", "pcs", 10, 3);
        Item item4 = new Item("Item4", "pcs", 10, 4);
        Item item5 = new Item("Item5", "pcs", 10, 5);

        ArrayList<Item> items1 = new ArrayList<>();
        items1.add(item1);
        items1.add(item2);
        items1.add(item3);
        items1.add(item4);
        items1.add(item5);

        Invoice invoice1 = new Invoice("03.02.2024",
                "Roga i Kopyta",
                "Outer",
                "Stock1",
                " ",
                " ",
                items1);


        Item item6 = new Item("Item6", "pcs", 10, 6);
        Item item7 = new Item("Item7", "pcs", 10, 7);
        Item item8 = new Item("Item8", "pcs", 10, 8);
        Item item9 = new Item("Item1", "pcs", 10, 2);
        Item item10 = new Item("Item2", "pcs", 10, 4);

        ArrayList<Item> items2 = new ArrayList<>();
        items2.add(item6);
        items2.add(item7);
        items2.add(item8);
        items2.add(item9);
        items2.add(item10);

        Invoice invoice2 = new Invoice("03.02.2024",
                "Stock2",
                "Inner",
                "Stock1",
                " ",
                " ",
                items2);

        Stock stock = new Stock("Stack1", "Kalinigrad");

        stock.addInvoiceToList(invoice1);
        stock.addInvoiceToList(invoice2);
        System.out.println("==============================");
        System.out.println("Вывод всех товаров на складе: ");
        stock.printAllItemsName();
        System.out.println("==============================");
        System.out.println("Вывод списка всех внешних поставщиков: ");
        stock.printOuterSenders();
        System.out.println("==============================");
        System.out.println("Поиск товара на складе по наименованию: ");
        stock.printFoundItemByNameList("Item1");

    }

}