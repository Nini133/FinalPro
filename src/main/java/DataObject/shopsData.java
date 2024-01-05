package DataObject;

import com.github.javafaker.Faker;

public class shopsData {
    static Faker faker1 = new Faker();
    public static String wrongAddress = faker1.address().city();
}
