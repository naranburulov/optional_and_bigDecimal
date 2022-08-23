package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,4,2,10,23);

        System.out.println("empty() - isPresent():");


        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());
        System.out.println(Optional.of(number).isPresent());

        //System.out.println(empty.get());

        System.out.println("ifPresent()");

        Optional<Integer> bigNumber = number.stream()
                .filter(x -> x>100).findAny();

        bigNumber.ifPresent(System.out::println);


        System.out.println("get:");
        //System.out.println(bigNumber.get());


        System.out.println("orElse:");
        System.out.println(bigNumber.orElse(5));




    }
}
