package com.company;

// import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Alex123", "parol", UserType.ADMIN);
        //Same user
        //User user2 = new User("Alex123", "parol", UserType.ADMIN);
        User user2 = new User("Pashka999", "passs", UserType.PREMIUM);

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println("Hash of user user1 = " + user1.hashCode());
        System.out.println("Hash of user user2 = " + user2.hashCode());
        compareObjects(user1, user2);

        System.out.println("Possible user types:");
        UserType [] arrTypes = UserType.values();
        System.out.println(Arrays.toString(arrTypes));

        System.out.println("Приоритет пользователя " + UserType.ADMIN.toString() + " = " + UserType.ADMIN.getPriority());
}

    private static void compareObjects(User one, User two) {
        if (one.equals(two)) {
            System.out.println("Same user");
        } else {
            System.out.println("Diff user");
        }
        if (one.hashCode() == two.hashCode()) {
            System.out.println("Same hash");
        } else {
            System.out.println("Different hash");
        }
    }
}


// Classwork
// Report report = new Report(Seasons.Spring, "some text ");
//       Report r1 = new Report(Seasons.Autumn,"Rep");
//        Report r2 = new Report(Seasons.Autumn,"rrr");
//       //Report r2 = r1;
//       //Report r2 = new Report(Seasons.Autumn,"Rep");
//       if (r1.equals(r2)) {
//           System.out.println("same");
//       } else System.out.println("different");
//

       //System.out.println("Report: " + report.toString()); // класс в строку


/*         String mySeason = Seasons.Spring.toString(); //возвращает название элемента enum как string
        System.out.println(mySeason);
        String mySeason2 = Seasons.Autumn.name(); //name - уставеший метод
        System.out.println(mySeason2);
        Seasons mySeason3 = Seasons.Winter;
        System.out.println("Ordinal = " + mySeason3.ordinal()); // порядковый номер массива enum
        System.out.println(Seasons.valueOf(mySeason));
        Seasons [] sArr = Seasons.values();
        System.out.println(Arrays.toString(sArr)); // вывод на экран элементов массива

        Seasons s2 = Seasons.Spring;
        System.out.println(s2.getWarmT());
        System.out.println("How warm is " + s2.getRuCaption() +": " + s2.getWarmT());
*/
