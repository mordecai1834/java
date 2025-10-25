class MovieCall {
public static void main(String[] args){

Movie Movie1 = new Movie("The Lord of the Rings: Fellowship of the Ring","Sir Peter Jackson",2001);
Movie Movie2 = new Movie("The Lord of the Rings: The Two Towers","Sir Peter Jackson",2002);
Movie Movie3 = new Movie("The Lord of the Rings: The Return of the King","Sir Peter Jackson",2003);


System.out.println(Movie1);
System.out.println(Movie2);
System.out.println(Movie3);

Theater[] Theaters = new Theater[5];
Theaters[0] = new Theater(30);
Theaters[1] = new Theater(50);
Theaters[2] = new Theater(60);
Theaters[3] = new Theater(90);
Theaters[4] = new Theater(100);

Theaters[0].setPrice(9.99);
Theaters[1].setPrice(14.99);
Theaters[2].setPrice(4.99);
Theaters[3].setPrice(19.99);
Theaters[4].setPrice(14.99);

Theaters[0].setcurrentlyShowing(Movie1);
Theaters[1].setcurrentlyShowing(Movie2);
Theaters[2].setcurrentlyShowing(Movie3);
Theaters[3].setcurrentlyShowing(Movie1); 
Theaters[4].setcurrentlyShowing(Movie2);

for(int i = 0; i<5; i++){


System.out.println(Theaters[i]);

}
}



}