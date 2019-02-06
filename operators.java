class Operators {
    public static void main(String args[]) {
        double wallet = 25.00;

        if(wallet != 0) {
            if(wallet >= 10) {
                System.out.println("I can afford some fast food.");
                if (wallet > 30) {
                    System.out.println("I can afford a nice restaurant.");            
                }
            }
            if(wallet >= 20 && wallet <= 30) {
                System.out.println("I could buy fast food for just one or two friends; if I had any.");            
            }
            if(wallet % 5 == 0) {
                System.out.println("The money in my wallet is divisible by 5.");
            }
            if(wallet % 2 != 0) {
                System.out.println("The amount of money in my wallet is and odd number.");
            }
        }
        else {
            System.out.println("I'm broke as a joke.");
        }
            double creditCardBalance = 0;
            double mealPrice = 8.25;
 
                    if(wallet > mealPrice) {
                        System.out.println("Pay with cash.");       
                    }
                    else if (creditCardBalance < 50) {
                        System.out.println("Pay with credit.");
                    }
                    else {
                        System.out.println("Go hungry.");
                    }
            }
        }