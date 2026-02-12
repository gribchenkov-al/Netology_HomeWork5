//TIP Для <b>запуска</b> кода нажмите <shortcut actionId="Run"/> или
// щелкните значок <icon src="AllIcons.Actions.Execute"/> в боковой области.
public class Main {
    public static void main(String[] args) {
        //TIP Нажмите <shortcut actionId="ShowIntentionActions"/>, поместив каретку на выделенный текст
        // чтобы увидеть, как GIGA IDE предлагает исправить это.
        System.out.println("Привет! Давай ка создадим книгу");

        Author authorAleshaBook = new Author("Филип","Котлер",12);

        Book book_alesha = new Book("Основы маркетинга",2002,authorAleshaBook,251);

        System.out.println("В ней страниц: " + book_alesha.pages);
        System.out.println("Её автор: "+ book_alesha.author.name + " " + book_alesha.author.surname);
        System.out.println("Её название " + book_alesha.title);
        System.out.println("Она вышла в "+ book_alesha.releaseYear + " году");
        if (book_alesha.isBig() == true )
        {
            System.out.println("Она большая");
        }
        else
        {
            System.out.println("Она не большая");
        }
        System.out.println("Содержится ли Филип в описании? " + book_alesha.matches("Филип"));
        System.out.println("Содержится ли JAVA в описании? " + book_alesha.matches("JAVA"));
        System.out.println("Стоимость книги: " + book_alesha.estimatePrice() + " Рублей");
        }
    }
