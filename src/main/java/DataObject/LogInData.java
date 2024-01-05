package DataObject;

import com.github.javafaker.Faker;

public class LogInData {
    static Faker faker1 = new Faker();



    public static String correctEmail = "nini.chachkhalia@gmail.com";
    public static String correctPassword = "Nini123";

    public static String incorrectMail = faker1.bothify("?????###@gmail.com");
    public static String incorrectPassword = faker1.bothify("?????###");
    public static String mobileNumber = "596121153";




}
