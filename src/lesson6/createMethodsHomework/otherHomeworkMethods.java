package lesson6.createMethodsHomework;

public class otherHomeworkMethods {

    /**
     * В метод передаем кол-во строк и кол-во колонок,
     * метод печатает на консоль квадрат из единичек
     * по этим параметрам
     */
    public static void printSquare() {

        int[][] square = new int[5][5];
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                if (row >= col || row <= col) {

                    System.out.print(" 1 ");
                }
            }
            System.out.println();
        }
    }

    /**
     * В метод передаем 3 числа,
     * метод должен вернуть меньшее число из 3-х
     */

    public static int findTheMinimumNumber() {

        int num1 = 3;
        int num2 = 5;
        int num3 = 9;
        int min = 0;

        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }

        System.out.println(min);

        return min;
    }

    /**
     * В метод передаем сумму депозита,
     * банковский процент и кол-во лет,
     * и метод возвращает значение прироста процентов
     * которые мы заберем с банка через столько лет
     */

    public static double interestGrowth() {

        double money = 100000;
        double prosent = 8;
        int year = 5;

        for (int month = 0; month < year * 12; month++) {
            money = money + (money / 100 * prosent) / 12;
        }
        System.out.println(money);
        return (money);
    }

    /**
     * В метод передаем email,
     * метод должен вернуть true или false подходит нам email или нет.
     * Подходит: когда содержит @, когда нет пробелов,
     * когда часть текста после @ содержит в себе точку
     */

    public static void checkTheValidityOfTheEmail() {

        String email = "masyanya@mail.ru";

        if (!email.contains("@")) {
            System.out.println("Не содержит собачку!!!");
            return;
        }

        String[] partsOfEmail = email.split("@");
        if (partsOfEmail.length > 2) {
            System.out.println("Собачек больше одной!!!");
            return;
        }

        if (email.startsWith("@") || email.endsWith("@")) {
            System.out.println("Email не может начинаться или заканчиваться собачкой!!!");
            return;
        }

        String lastPart = partsOfEmail[1];
        if (!lastPart.contains(".")) {
            System.out.println("Email не содержит точку после собачки!!!");
            return;
        }

        String lastPartForDot = partsOfEmail[1];
        if (lastPartForDot.startsWith(".")) {
            System.out.println("Email содержит точку сразу после собачки!!!");
            return;
        }

        if (email.contains("#") || email.contains("$") || email.contains("%") || email.contains("&")
                || email.contains("`") || email.contains("~") || email.contains("'") || email.contains("*")
                || email.contains("+") || email.contains("=") || email.contains("/") || email.contains("?")
                || email.contains("^") || email.contains("|") || email.contains("(") || email.contains(")")
                || email.contains("[") || email.contains("]") || email.contains("{") || email.contains("}")) {
            System.out.println("Содержит запрещеный символ!!!");
            return;
        }

        String numberCharactersFirstPart = partsOfEmail[0];
        int countNumberFirstPart = numberCharactersFirstPart.length();
        if (countNumberFirstPart < 4 || countNumberFirstPart > 20) { //
            System.out.println("Почта содержит не корректное количество символов!!!");
            return;
        }


        if (email.startsWith(".") || email.endsWith(".")) {
            System.out.println("Email не может начинаться или заканчиваться точкой!!!");
            return;
        }

        String[] partsOfEmailDot = email.split("[.]");
        String lastPartDot = partsOfEmailDot[partsOfEmailDot.length - 1];
        if (lastPartDot.contains("0") || lastPartDot.contains("1") || lastPartDot.contains("2")
                || lastPartDot.contains("3") || lastPartDot.contains("4") || lastPartDot.contains("5")
                || lastPartDot.contains("6") || lastPartDot.contains("7") || lastPartDot.contains("8")
                || lastPartDot.contains("9")) {
            System.out.println("Содержит цифры после последней точки!!!");
            return;
        }

        if (email.contains(" ")) {
            System.out.println("Почта содержит пробелы!!!");
            return;
        }

        System.out.println("Email подходит!!!");
    }
}
