package sellingfruit;

public class MainTest {
    public static void main(String[] args) {
        // Define object variables
        Seller seler1 = new Seller(10,20);
        Seller seler2 = new Seller(5,2);
        Buyer buyer1 = new Buyer(50000);
        Buyer buyer2 = new Buyer(70000);
        Buyer buyer3 = new Buyer(100000);

        // call order method of all Test.Buyer instance variables
        buyer1.order(seler1,0,1);
        buyer2.order(seler1,2,0);
        buyer2.order(seler1,0,2);
        buyer3.order(seler1,1,1);

        // print field variable of all instances
        System.out.println("buyer1 budget is "+buyer1.budget);
        System.out.println("buyer2 budget is "+buyer2.budget);
        System.out.println("buyer3 budget is "+buyer3.budget);
        System.out.println("=================================");
        System.out.println("seler1 holdAppleQuantity: "+seler1.holdAppleQuantity);
        System.out.println("seler1 holdBananaQuantity: "+seler1.holdBananaQuantity);
    }
}
