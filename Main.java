

public class Main
{
    public static void main(String[] args)
    {
        Book book1 = new Book("Monogatari",128,"Nisio Isin");     //first constructor
        Book book2 = new Book("One Piece", 1029,98,"Shonen", "Oda Eiichiro");      //second constructor
        Book book3 = new Book("Chronicles of Farzad",420,69,"XXX","Farzad Ferdous");
        Book book4 = new Book("Bong Adventure", 800, "Joshua Bongiculoso");      //first constructor
        
        //print info for all books, use getters
        System.out.println("Book 1:\nTitle: "+book1.getTitle()+"\nChapters: "+book1.getChapters()+"\nAuthor: "+book1.getAuthor());
        System.out.println("\nBook 2:\nTitle: "+book2.getTitle()+"\nChapters: "+book2.getChapters()+"\nVolumes: "+book2.getVolumes()+"\nGenre: "+book2.getGenre()+"\nAuthor: "+book2.getAuthor());
        System.out.println("\nBook 3:\nTitle: "+book3.getTitle()+"\nChapters: "+book3.getChapters()+"\nVolumes: "+book3.getVolumes()+"\nGenre: "+book3.getGenre()+"\nAuthor: "+book3.getAuthor());
        System.out.println("\nBook 4:\nTitle: "+book4.getTitle()+"\nChapters: "+book4.getChapters()+"\nAuthor: "+book4.getAuthor());
    
        addRating(book1,book2,book3,book4); //calls method addRating with books as perameters
    }
    
    public static void addRating(Book A, Book B, Book C, Book D)    //static method with perameters that will take iin book objects 1-4
    {
        System.out.println("\nStats: \n");
        double r = 0;  //stores ratings
        double n = 0;  //total number of ratings
        for (int i = 1; i < 5; i++) //loop that prints each book (with number increment)
        {
            System.out.printf("Book "+i+" ratings: ");
            for (int j = 0; j < 3; j++) //gives 3 random ratings for each book
            {
                int k = (int)(Math.random() * 6);   //temp variable stores rating
                r += k;                             //adds rating to total
                System.out.print(k+" ");
                n++;                                //increments rating count
            }
            System.out.print("\n");
        }
        r /= n;     //divides total ratings to get average
        
        int tChapters = A.getChapters() + B.getChapters() + C.getChapters() + D.getChapters();
        System.out.println("\nTotal Chapters: "+tChapters); //adding chapters together from getters
        
        String t1 = A.getTitle();   //gets title strings to use lengths
        String t2 = B.getTitle();
        String t3 = C.getTitle();
        String t4 = D.getTitle();
        int tLetters = t1.length() + t2.length() + t3.length() + t4.length();
        System.out.println("Length of all titles: "+tLetters);
        
        String a1 = A.getAuthor();  //gets author strings to convert to substrings
        String a2 = B.getAuthor();
        String a3 = C.getAuthor();
        String a4 = D.getAuthor();
        String fa = a1.substring(0,1) + a2.substring(0,1) + a3.substring(0,1) + a4.substring(0,1);
        System.out.println("First letters of all authors put together: "+fa);   //prints concatednated first letters
        
        String lt = t1.substring(t1.length() - 1) + t2.substring(t2.length() - 1) + t3.substring(t3.length() - 1) + t4.substring(t4.length() - 1);
        System.out.println("Last letters of all titles together: "+lt); //prints last letters as substrings together in new string
        
        System.out.println("Average rating of all books: "+r);  //prints rating average
    }
}
