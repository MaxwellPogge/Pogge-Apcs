class Example {
    static int age = 14;
    static int year = 2018;
        
    public static void main(String[] args) {
        //calling a non void function
         int birthyear = calcbirthyear(year, age);
        
    }
                                                                                                                    
    public static int calcbirthyear (int age, int year) {
        return age - year; 
    }




}