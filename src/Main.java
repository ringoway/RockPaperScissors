import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Напиши одну из трёх цифр: 1 - Камень, 2 - Ножницы, 3 - Бумага");
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

        switch (Check) {
            case "Камень":
                if (Check==randS) {
                    System.out.println("Ничья");
                } else if (Check=="Камень"&&randS=="Бумага") {
                    System.out.println("Победил бот");
                } else if (Check=="Камень"&&randS=="Ножницы") {
                    System.out.println("Победил игрок");
                }
            case "Бумага":
                if (Check==randS) {
                    System.out.println("Ничья");
                } else if (randS=="Бумага"&&Check=="Ножницы") {
                    System.out.println("Победил бот");
                } else if (randS=="Бумага"&&Check=="Бумага") {
                    System.out.println("Победил игрок");
                }

    }
}