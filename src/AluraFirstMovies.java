

/*
    Simple code about Rating of movies and prices
    Challanges:
    Personal: NO AI direct solution [3]; Google[00009] Blinded [NO]
    
    Alura (translated from portuguese): 
    I   Create a progam that makes the avarage, with decimal values, between two ratings and print
    II  Declare variable double and interger also cast double to interget;
    III Declare char and String and merge into a sentence;
    IV  Declare double priceProduct and an int quantity, calcule final price and print
    V   Declare double inDollar, transform dollar value into reais
    VI  Declare double originalPrice, reais, declare double discountPercent, calculate discount and print final price

    More in the end of the code
*/

public class AluraFirstMovies {
    public static void main(String[] args) throws Exception {
        //Variables
        String welcome ="""

                Welcome to Joodragon's worst buy or rent movies
                Your BEST worst choice to come
                
                Please select from the movies bellow
                """;        
        int rating1=1;  
        int rating2=4;
        int rating3=7;
        int rating4=8;
        double totalRating= rating1+rating2+rating3+rating4;
        double avarageRating= totalRating/4;
        int avgRating=(int)avarageRating;
        char exclamation = '!';
        String hello = "Hello there ";
        String welcomeResult= hello+exclamation;


        int priceProduct= 180;
        int amount=7;
        int finalPrice= priceProduct*amount;
        float dollarPrice= 5.61f;
        double inDollar= finalPrice/dollarPrice;
        float promotion= 1.27f;
        double priceDiscount= finalPrice/promotion;
        double saved= finalPrice-priceDiscount; 


        //run
        System.out.println(welcomeResult);
        System.out.println(welcome);
        System.out.println("you selected movies");
        System.out.println("the avaraage rating is "+avgRating);
        System.out.println("the price is "+finalPrice+" reais and in dollar goes for "+inDollar+" dollares");
        System.out.println("you got a promotion heres 27% discount "+saved+" was saved "+priceDiscount+" reais the final offer");



    }
}
