import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class PersonConstructorTest {

    @Test
    public void personConstructors() throws Exception {
        Stream.of("Spock", "Data")
                .map(Person::new)
                .forEach(System.out::println);

        Stream.of("Montgomery Scott", "Hikaru Sulu")
                .map(name -> name.split(" "))
                .map(Person::new)
                .forEach(System.out::println);

        Stream.of("James Tiberius Kirk", "Peter Quincy Taggert")
                .map(name -> name.split(" "))
                .map(Person::new)
                .forEach(System.out::println);
    }
}