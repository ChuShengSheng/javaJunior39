package lesson5;

public class homeworkEmail {
    public static void main(String[] args) {
        // Есть почта, и нам нужно понять подходит она или нет

        String email = "skdj@jkh.dkhf";

        /**
         * 1) В почте есть собачка и она одна
         * 2) Она не должна быть в начале или в конце
         * 3) Точка должна быть обязательно, точек может быть сколько угодна в части до @
         * 4) Точка может быть только одна после собачки
         * 5) После последней точки могут быть только больше 2-х символов
         * 6) Не может быть русских символов
         * 7) Не может быть пробелов
         */

        // Присутствует ли собачка

        if (!email.contains("@")) {
            System.out.println("В емэйл нет собачки!!!");
            return;
        }

        // split - разрезать текст по определенному символу (или по определенной маске поиска)

        // Собачек более 1

        String[] partsOfEmail = email.split("@");
        if (partsOfEmail.length != 2) {
            System.out.println("Несколько собачек!!!");
            return;
        }

        // Емэйл начинается на собачку

        String startLine = new String("@");
        if (email.startsWith("@")) {
            System.out.println("Емайл начинается с собачки!!!");
            return;

            // Емэйл заканчивается на собачку
        }
        String endLine = new String("@");
        if (email.endsWith("@")) {
            System.out.println("Емайл заканчивается собачкой!!!");
            return;
        }

        // Убираются пробелы

        String spaces = " skdj@jkh.dkhf ";
            System.out.println(spaces.trim());
            return;
        }
    }


