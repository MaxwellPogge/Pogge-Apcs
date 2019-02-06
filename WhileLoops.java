class WhileLoops{ 
    public static void main(String[]args){
    
    int w = 1;
    while(w < 10) {
        System.out.println(w);
        w++;
    }
    
    
           Boolean shouldLoop = true;
    int n = 1;
    while(shouldLoop) {
         if(n == 100) {
            System.out.println("100 loop passes occured.");
            break;
        }
        if (n<100) {
            System.out.println(n);
            n++;

        }
            
    
            
    }


    }
}