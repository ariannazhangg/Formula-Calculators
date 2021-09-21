// Arianna Zhang
// September 20, 2021
// AP Computer Science A

class Slope {
    public static void main (String [] args) {
        
        
        // Slope calculator
        
        // declare variables
            final double x1 = 0;
            final double y1 = 0;
            final double x2 = 2;
            final double y2 = 3;
        
        // equation      
            double M = (y2 - y1)/(x2-x1);
            
        // print out answers
            System.out.println ("A line connecting the points (" + (int) x1 + ", " 
            + (int) y1 + ") and (" + (int) x2 + ", " + (int) y2 + ") has a slope of " + M + ".");
    }
}