package main;

import com.fasterxml.jackson.databind.ObjectMapper;
import person.Person;

public class Test {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setName("ghita");
        person.setId(1);

        ObjectMapper objectMapper = new ObjectMapper(); // deserializare

        String json = objectMapper.writeValueAsString(person);

        System.out.println(json);

        // invers din text faci obiect java
        String text="{\"id\":1,\"name\":\"ghita\"}";

        Person personFromText = objectMapper.readValue(text, Person.class);
        System.out.println(personFromText);
    }
}
