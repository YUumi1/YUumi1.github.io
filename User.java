package Collection;

public class User {
    public static void main(String[] args) {
        //Movie m1 = new Movie();
       // m1.display();
    }
}

class Movie{
    private String title,year,director;

    void setTitle(String movieTitle){
        title = movieTitle;
    }

    void setYear(String nen){
        year = nen;
    }

    void setActor(String seiyuu){
        director = seiyuu;
    }

    void display(){
        System.out.println("Movie title    >> " + title);
        System.out.println("Movie released >> " + year);
        System.out.println("Movie director >> " + director);
    }

    Movie(String head,String nen,String direct){
        title = head;
        year = nen;
        director = direct;
    }
}