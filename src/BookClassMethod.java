class Book{
    String title;
    String author;
    int year;
    boolean available;
    Book(String title,String author,int year,boolean available){
        this.author=author;
        this.title=title;
        this.year=year;
        this.available=available;}

       public void display() {
            System.out.println("the name of book is :" + title);
            System.out.println("the author of book is :" + author);
            System.out.println("published year:" + year);
            System.out.println("availability:\n"+available);
        }
    }

public class BookClassMethod {
    public static void main(String[] args) {
        Book book1=new Book("Sahara","S B Mane",2015,true);
        Book book2=new Book("Agnipankh","A P J Abdul Kalam",2008,false);
        book1.display();
        book2.display();;

    }
}
