// Arianna Zhang
// September 20, 2021
// AP Computer Science A

class Quadratic {
    public static void main (String [] args) {
        
        // Quadratic formula calculator
        
        // declare variables
            final double a = 2;
            final double b = 3;
            final double c = 1;
            double x;
            double r = 2;
            
            double answer1 = ((-1*b) + Math.sqrt(b*b - 4*a*c))/ 2*a;
            double answer2 = ((-1*b) - Math.sqrt(b*b - 4*a*c))/ 2*a;
            
        // print out answers
            System.out.println("The solutions for " + (int) a + "x^2 + " + 
            (int) b + "x + " + (int) c + " are " + answer1 + " and " + 
            answer2 + ".");
        
          //  1- Math.pow (r,n)/(1-r)
    }
}