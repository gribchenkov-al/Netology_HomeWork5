public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;


    public Book(String title, int releaseYear, Author author, int pages)
    {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.author = author;

        System.out.println("Книга создана");
    }
    public boolean isBig()
    {
        if (pages>=500)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean matches(String word)
    {
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }
    public int estimatePrice()
    {
        int price = (int) Math.floor( (3 * pages) * Math.sqrt(author.rating));
        if (price <= 250)
        {
            return 250;
        }
        else
        {return price;
        }
    }
}
