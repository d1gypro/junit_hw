import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SingerMetods {
    public static final int findMostPopularSingerPrice(Collection<Singer> singers) {
        List<Singer> mostPopular = singers.stream()
                .sorted(Comparator.comparing(Singer::getPopularity))
                .limit(1)
                .collect(Collectors.toList());

        return mostPopular.get(0).getPrice();
    }

    public static String findYoungestSingerFamily(Collection<Singer> singers) {
        List<Singer> youngestSinger = singers.stream()
                .sorted(Comparator.comparing(Singer::getAge))
                .limit(1)
                .collect(Collectors.toList());

        return youngestSinger.get(0).getFamily().toString();
    }

    public static List<String> findTop3SingersFamily(Collection<Singer> singers) {
        List<String> top = singers.stream()
                .sorted(Comparator.comparing(Singer::getPopularity))
                .limit(3)
                .map(x ->x.getFamily())
                .collect(Collectors.toList());

        return top;
    }
}
