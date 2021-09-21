// Arianna Zhang
// September 20, 2021
// AP Computer Science A

class Quadratic {
    public static void main (String [] args) {
        
        // Quadratic formula calculator
        
        // declare variables
            final double a = 1;
            final double b = 5;
            final double c = 6;
            double x;
            double r = 2;
            
        // equation  
            double answer1 = ((-1*b) + Math.sqrt(b*b - 4*a*c))/ 2*a;
            double answer2 = ((-1*b) - Math.sqrt(b*b - 4*a*c))/ 2*a;
            
        // print out answers
            System.out.println("The solutions for " + (int) a + "x^2 + " + 
            (int) b + "x + " + (int) c + " are " + answer2 + " and " + 
            answer1 + ".");
        
          //  1- Math.pow (r,n)/(1-r)
    }
}