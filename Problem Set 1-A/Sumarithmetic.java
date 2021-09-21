// Arianna Zhang
// September 20, 2021
// AP Computer Science A

class Sumarithmetic {
    public static void main (String [] args) {
        
        
        // Sum of an arithmetic series calculator ;-;
        
        // declare variables
            final double k = 5;
            final double a1 = 1;
            final double a2 = 5;
        
        // equation    
            double sum = (k/2) * (a1 + a2);
            
        // print out answers
            System.out.println ("The sum of the first " + (int) k + " terms of an arithemetic series that starts with " 
            + a1 );
            System.out.print ("and increases by 1.0 " + "is " + sum);
    }
}