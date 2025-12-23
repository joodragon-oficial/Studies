

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
