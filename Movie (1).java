class Movie{

private String title,director;

private int year; 

public Movie(String title, String director, int year ){
if (title == null || title.isBlank() ){
            throw new IllegalArgumentException("title cannot be null or empty");
        }
        this.title =title; 
        
if (director == null || director.isBlank() ){
            throw new IllegalArgumentException("title cannot be null or empty");
        }
        this.director =director; 

 if(year<1900 || year>2026){
         throw new IllegalArgumentException("Movie year must be within 1900 or 2026");
        }
    
    this.year = year; 
    
}

public String GetTitle(){


        return title; 
}

public String GetDirector(){


        
        return director; 
}


public int GetYear(){

     if(year<1900 || year>2026){
         throw new IllegalArgumentException("Movie year must be within 1900 or 2026");
        }
    
    return year; 
}


  @Override
    public String toString(){
        return String.format(title + " ,by " + director + "(" + year + ")"); 
    
    }
    


}