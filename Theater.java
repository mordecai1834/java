class Theater{
private int numSeats;
private double Price; 
private Movie currentlyShowing ;  

public Theater(int numSeats){


  if (numSeats <= 0) {
            throw new IllegalArgumentException("Number of seats must be positive");
        }

this.numSeats = numSeats;

}

public int getnumSeats(){
//read only

return numSeats;
}

public double getPrice(){

return Price;
}

public Movie getcurrentlyShowing(){

return currentlyShowing;
}

  public void setPrice(double Price){
        if (Price<0 ){
            throw new IllegalArgumentException("Price cannot be less than 0");
        }
        this.Price =Price; 
    } 
  public void setcurrentlyShowing(Movie currentlyShowing){
        this.currentlyShowing = currentlyShowing;
    } 
    
    @Override
    public String toString(){
        return String.format(numSeats + " seats avaible to see " + currentlyShowing + "for $" + Price ); 
    
    }
}