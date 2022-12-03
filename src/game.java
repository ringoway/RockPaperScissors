import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class game {
    public void startgame(){
        Scanner scan = new Scanner (System.in);
        String Check = scan.nextLine();
        System.out.println("Игрок выбрал "+Check);

        List<String> game = new LinkedList<>();
        game.add("Камень");
        game.add("Ножницы");
        game.add("Бумага");

        Random random = new Random();
        int i = random.nextInt(3);
        String randS = game.get(i);
        System.out.println("Бот выбрал "+randS);

        if (randS==Check)
            switch (Check) {
                case "Камень":
                    if (Check == randS) {
                        System.out.println("Ничья");
                    } else if (Check == "Камень" && randS == "Бумага") {
                        System.out.println("Победил бот");
                    } else if (Check == "Камень" && randS == "Ножницы") {
                        System.out.println("Победил игрок");
                    }
                    break;
                case "Бумага":
                    if (Check == randS) {
                        System.out.println("Ничья");
                    } else if (Check == "Бумага" && randS == "Ножницы") {
                        System.out.println("Победил бот");
                    } else if (Check == "Бумага" && randS == "Камень") {
                        System.out.println("Победил игрок");
                    }
                    break;
                case "Ножницы":
                    if (Check == randS) {
                        System.out.println("Ничья");
                    } else if (Check == "Ножницы" && randS == "Камень") {
                        System.out.println("Победил бот");
                    } else if (Check == "Ножницы" && randS == "Бумага") {
                        System.out.println("Победил игрок");
                    }
                    break;
            }
    }
}
