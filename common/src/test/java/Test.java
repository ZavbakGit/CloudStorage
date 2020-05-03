import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream.of(1,2,3).forEach(integer -> {
            System.out.println(integer);
        });
    }
}
