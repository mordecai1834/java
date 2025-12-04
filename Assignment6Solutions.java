import java.util.List;
import java.util.Comparator;
import java.time.Year;

public class Assignment6Solutions {
    public static void task1(List<Division> nhl) {
          nhl.stream().forEach(d -> {
        System.out.println(d.getName());

        d.getMembers().forEach(a -> {
        System.out.printf("%s %s, %s (%s) - Founded %d%n",a.getName(),a.getCity(),a.getProvince(),a.getCountry(),a.getYearFounded()
            );
            });
        });
    }

    public static void task2(List<Division> nhl) {
        nhl.stream().flatMap(t -> t.getMembers().stream())
        .sorted((a,b) -> Integer.compare(a.getYearFounded(), b.getYearFounded()))
        .limit(6)
        .map(g -> g.getName())
        .forEach(System.out::println);
    }

    public static void task3(List<Division> nhl) {
        nhl.stream().flatMap(t -> t.getMembers().stream())
        .map(d -> d.getProvince())
        .distinct()
        .sorted((a,b) -> a.compareTo(b))
        .forEach(System.out::println); 
    }

    public static void task4(List<Division> nhl) {
        System.out.println(nhl.stream().flatMap(t -> t.getMembers().stream())
        .filter(a -> a.getProvince().equals("NY"))
        .count()); 
        
        
    }

    public static void task5(List<Division> nhl) {
      nhl.stream().flatMap(t -> t.getMembers().stream())
        .filter(a -> a.getCountry()== Country.CAN)
        .max(Comparator.comparingInt(Team::getYearFounded))
        .ifPresent(t-> System.out.print(t.getName())); 
             
    }

    public static void task6(List<Division> nhl) {
    int currentYear = Year.now().getValue();

    nhl.stream()
        .sorted((a, b) -> Double.compare(b.getMembers().stream()
        .mapToInt(t -> currentYear - t.getYearFounded())
        .average().orElse(0),a.getMembers().stream()
        .mapToInt(t -> currentYear - t.getYearFounded())
        .average().orElse(0)))
        .forEach(d -> System.out.println(d.getName()));
    

    }

    public static void task7(List<Division> nhl) {
       nhl.stream()
       .max(Comparator.comparing(d -> d.getMembers().stream()
       .filter(t -> t.getCountry() == Country.CAN)
       .count()
       ))
       .ifPresent(t->System.out.println(t.getName()));
       
    }

    public static void task8(List<Division> nhl) {
        nhl.stream().flatMap(t -> t.getMembers().stream())
        .filter(t-> t.getName().equals("Carolina Hurricanes"))
        .findFirst()
        .ifPresent(t->System.out.println(2006-t.getYearFounded()));
    }
}

