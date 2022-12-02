import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Напиши одно из трёх: Камень, Ножницы, Бумага");
        Scanner scan = new Scanner (System.in);
        String Check = scan.nextLine();

        List<String> game = new LinkedList<>();
        game.add("Камень");
        game.add("Ножницы");
        game.add("Бумага");

        Random random = new Random();
        int i = random.nextInt(3);
        String randS = game.get(i);
        System.out.println("Бот выбрал "+randS);

        if (randS.equals("Камень") && Check.equals("Камень")){
            System.out.println("Ничья");
        }
        if (randS=="Ножницы"&&Check=="Ножницы"){
            System.out.println("Ничья");
        }
        if (randS=="Бумага"&&Check=="Бумага"){
            System.out.println("Ничья");
        }
        if (randS=="Камень"&&Check=="Ножницы"){
            System.out.println("Победил бот");
        }
        if (randS=="Камень"&&Check=="Бумага"){
            System.out.println("Победил игрок");
        }
        if (randS=="Ножницы"&&Check=="Бумага"){
            System.out.println("Победил бот");
        }
        if (randS=="Ножницы"&&Check=="Камень"){
            System.out.println("Победил игрок");
        }
        if (randS=="Бумага"&&Check=="Камень"){
            System.out.println("Победил бот");
        }
        if (randS=="Бумага"&&Check=="Ножницы"){
            System.out.println("Победил игрок");
        }

//        switch (Check) {
//            case "Камень":
//                if
//        }





        System.out.println(randS);

    }
}