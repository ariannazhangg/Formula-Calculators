// Arianna Zhang
// September 20, 2021
// AP Computer Science A

class formulas {
    public static void main (String [] args) {
        
        // Quadratic formula calculator
        
        // declare variables
            final double Qa = 1; // value a for ax^2 in quadratic formula
            final double Qb = 5; // value b for bx in quadratic formula
            final double Qc = 6; // value c for c in quadratic formula
            double Qx; // x in quadratic formula
            
        // equation + version of quadratic formula
            double Qanswer1 = ((-1*Qb) + Math.sqrt(Qb*Qb - 4*Qa*Qc))/ 2*Qa;
            
        // equation - version of quadratic formula
            double Qanswer2 = ((-1*Qb) - Math.sqrt(Qb*Qb - 4*Qa*Qc))/ 2*Qa;
            
        // print out answers
            System.out.println("QUADRATIC FORMULA");
            System.out.println("The solutions for " + (int) Qa + "x^2 + " + 
            (int) Qb + "x + " + (int) Qc + " are " + Qanswer2 + " and " + 
            Qanswer1 + ".");
            System.out.println();
        
        
        // Slope calculator
        
        // declare variables
            final double Sx1 = 0; // x value of the first coordinate
            final double Sy1 = 0; // y value of the first coordinate
            final double Sx2 = 2; // x value of the second coordinate
            final double Sy2 = 3; // y value of the second coordinate
        
        // equation for slope      
            double SM = (Sy2 - Sy1)/(Sx2 - Sx1);
            
        // print out answers
            System.out.println("SLOPE FORMULA");
            System.out.println ("A line connecting the points (" + (int) Sx1 + ", " 
            + (int) Sy1 + ") and (" + (int) Sx2 + ", " + (int) Sy2 + ") has a slope of " + SM);
            System.out.println();
            
            
        // Midpoint calculator
        
        // declare variables
            final double Mx1 = 0; // x value of the first coordinate
            final double Mx2 = 2; // x value of the second coordinate
            final double My1 = 0; // y value of the first coordinate
            final double My2 = 3; // y value of the second coordinate
        
        // equation    
            double MMx = (Mx1 + Mx2)/2; // midpoint between x values of both coordinates
            double MMy = (My1 + My2)/2; // midpoint between y values of both coordinates
            
        // print out answers
            System.out.println("MIDPOINT FORMULA");
            System.out.println ("The midpoint between (" + (int) Mx1 + ", " 
            + (int) My1 + ") and (" + (int) Mx2 + ", " + (int) My2 + ") is (" + MMx 
            + ", " + MMy + ")");
            System.out.println();

            
        // Sum of an arithmetic series calculator ;-;
        
        // declare variables
            final double Ak = 5; // number of terms in series
            final double Aa1 = 1; // first term of series
            final double Aa2 = 5; // last term of series
        
        // equation    
            double Asum = (Ak/2) * (Aa1 + Aa2);
            
        // print out answers
            System.out.println("SUM OF AN ARITHMETIC SERIES");
            System.out.println ("The sum of the first " + (int) Ak + " terms of an arithemetic series that starts with " 
            + Aa1 );
            System.out.println ("and increases by 1.0 " + "is " + Asum);
            System.out.println();
        
            
        // Sum of a geometric series calculator :3
        
        // declare variables
            final double Gk = 3; // number of terms in geometric series
            final double Gr = 2; // common ratio/ amount it increases for geometric series
            final double Gg = 3; // first term of geometric series
        
        // equation    
            double Gsum = Gg * ((1- Math.pow (Gr,Gk))/(1 - Gr));
            
        // print out answer
            System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
            System.out.println ("The sum of the first " + (int) Gk + " terms of a finite geomeric series that starts with "
            + Gg);
            System.out.println("and increases by a rate of " + Gr + " is " + Gsum);

            
    }
}