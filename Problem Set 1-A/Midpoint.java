// Arianna Zhang
// September 20, 2021
// AP Computer Science A

class Midpoint {
    public static void main (String [] args) {
        
        
        // Midpoint calculator
        
        // declare variables
            final double x1 = 0;
            final double x2 = 2;
            final double y1 = 0;
            final double y2 = 3;
        
        // equation    
            double Mx = (x1 + x2)/2;
            double My = (y1 + y2)/2;
            
        // print out answers
            System.out.println ("The midpoint between (" + (int) x1 + ", " 
            + (int) y1 + ") and (" + (int) x2 + ", " + (int) y2 + ") is (" + Mx 
            + ", " + My + ").");
    }
}