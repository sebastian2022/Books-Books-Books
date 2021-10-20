
public class Book
{
    private String title;   //instance variables
    private int chapters;
    private String author;
    private String genre;
    private int volumes;
    
    public Book(String itsTitle, int numChapters, String itsAuthor) //two different Book constructors, each having different perameters
    {
        title = itsTitle;
        chapters = numChapters;
        author = itsAuthor;
    }
    
    public Book(String itsTitle, int numChapters, int numVolumes, String itsGenre, String itsAuthor)
    {
        title = itsTitle;
        chapters = numChapters;
        volumes = numVolumes;
        genre = itsGenre;
        author = itsAuthor;
    }
    
    public String getTitle()    //getters
    {
        return title;
    }
    public int getChapters()
    {
        return chapters;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getGenre()
    {
        return genre;
    }
    public int getVolumes()
    {
        return volumes;
    }
}
