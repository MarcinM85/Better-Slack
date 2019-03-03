package sandbox;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationPerson {

    public static void main(String[] args) {

        Person person = new Person("John", "Smith", 30);
        Purchase purchase = new Purchase("laptop", 5234.99);
        person.addPurchase(purchase);

        for (int i = 0; i < 3; i++) {
            person.addInteger();
        }


        ObjectMapper objectMapper= new ObjectMapper();


    }




}
