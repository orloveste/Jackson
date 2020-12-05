package main;

import com.fasterxml.jackson.databind.ObjectMapper;
import person.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("ghita");
        person.setId(1);

        ObjectMapper objectMapper = new ObjectMapper(); // deserializare
    }
}
