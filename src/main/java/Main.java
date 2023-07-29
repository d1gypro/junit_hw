import java.util.*;

public class Main {
    public static void main(String[] args) {

        Collection<Singer> singers = new ArrayList<>();

        singers.add (new Singer("Ivan", "Skripkin", 21, 50_000, 58));
        singers.add (new Singer("Petr", "Fleytin", 15, 5_000, 244));
        singers.add (new Singer("Yana", "Trambonova", 44, 500_000, 35));
        singers.add (new Singer("Elena", "Kontrobasova", 66, 5_000_000, 4));
        singers.add (new Singer("Ludmila", "Gitara", 45, 2_250_000, 11));
        singers.add (new Singer("Sergey", "Dudkin", 16, 3_000, 199));
        singers.add (new Singer("Vadim", "Royalkin", 68, 150_000, 98));
        singers.add (new Singer("Aleksandr", "Molotov", 70, 1, 499));
        singers.add (new Singer("Yaroslav", "Barabanov", 21, 1_500_000, 16));


        System.out.println(SingerMetods.findMostPopularSingerPrice(singers));

        System.out.println(SingerMetods.findYoungestSingerFamily(singers));

        System.out.println(SingerMetods.findTop3SingersFamily(singers));
    }

}
