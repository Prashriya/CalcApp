
package cs1.CalcApp;

import  cs1.app.*;

public class CalcApp
{
    //drawing row of circles with random color
    void drawCirclesRow( double startX, double startY, double radius, int n )
    {
        double curX = startX;
        double curY = startY;
        int count = 0;
        
        while ( count < n )
        {
            //getting random color
            String color = canvas.getRandomColor();       
            canvas.drawCircle( curX, curY, radius, color );
            
            curX = curX + 2 * radius;
            count = count + 1;
        }
    }
    
    //drawing the forest of circles
    void drawCirclesForest( double startX, double startY, double radius, int n )
    {
        double curX = startX;
        double curY = startY;
        
        double circRadius = radius;
        int noOfCircles = n;
        
        int count = 0;
        
        while( count < n )
        {
            drawCirclesRow( curX, curY, circRadius, noOfCircles );
            
            //updating current X and current Y position
            curX = curX - ( circRadius / 2 );
            curY = curY + ( circRadius / 2 );
            
            noOfCircles = noOfCircles * 2;
            circRadius = circRadius / 2;
        
            count = count + 1;
        }
    }
    
    //calculating an approximation of inverse of tan function
    double mystery( double x, int n )
    {
        double result = 0;
        double first = x;
        int second = 1;
        
        int count = 0;
        
        while( count < n )
        {
            double curNum = first / second;
            result = result + curNum;
            
            //updating the values
            first = first * x * x * (-1);
            second = second + 1;
            
            count = count + 1;
        }
        return result;
    }
    
    //computing amount in a saving amount
    double savings( double deposit, double rate, int years )
    {
        double initialAmount = deposit;
        
        int count = 0;
        
        while( count < years )
        {
            double curAmount = initialAmount * rate;
            initialAmount = initialAmount + curAmount;
            
            count = count + 1;
        }
        return initialAmount;
    }
    
    //calculating square root of given number using Babylonian method
    double sqrt( int x, int steps )
    {
        //guess is half of the given number
        double guess = x / 2;
        
        int count = 0;
        
        while ( count < steps )
        {
            guess = ( guess + ( x / guess )) / 2;
            
            count = count + 1;
        }
        return guess;
    }
    
    //computing nth number in the given sequence
    double sequence( int n )
    {
        //initializing the values
        int firstNum = -2;
        int secondNum = 0;
        int thirdNum = -1;
        
        int count = 1;
        
        while( count < n )
        {
            //calculating the next term in given sequence
            int nextNum = ( 2 * firstNum ) - thirdNum;
            
            //updating the values
            firstNum = secondNum;
            secondNum = thirdNum;
            thirdNum = nextNum;
            
            count = count + 1;
        }
        return firstNum;
    }
    
    public void run()
    {
        //drawCirclesRow( 100, 70, 20, 6 );
        //drawCirclesRow( 50, 250, 40, 4 );
        //drawCirclesRow( 90, 470, 15, 8 );
        //drawCirclesRow( 40, 340, 30, 5 );
        //drawCirclesRow( 170, 570, 25, 3 );
        
        //drawCirclesForest( 100, 90, 80, 2 );
        //drawCirclesForest( 70, 280, 55, 3 );
        //drawCirclesForest( 60, 440, 40, 4 );
        //drawCirclesForest( 40, 550, 28, 6 );
        //drawCirclesForest( 50, 600, 20, 7 );
        
        //System.out.println( "mystery( 753.68, 0 ): " + mystery( 753.68, 0 ) );
        //System.out.println( "mystery( 2.0, 4 ): " + mystery( 2.0, 4 ) );
        //System.out.println( "mystery( 3.0, 3 ): " + mystery( 3.0, 3 ) );
        //System.out.println( "mystery( 4.0, 6 ): " + mystery( 4.0, 6 ) );
        //System.out.println( "mystery( 5.0, 2 ): " + mystery( 5.0, 2 ) );
        
        //System.out.println( "savings( 100, 0.10, 3 ): " + savings( 100, 0.10, 3 ) );
        //System.out.println( "savings( 200, 0.05, 4 ): " + savings( 200, 0.05, 4 ) );
        //System.out.println( "savings( 300, 0.5, 2 ): " + savings( 300, 0.5, 2 ) );
        //System.out.println( "savings( 400, 0.20, 6 ): " + savings( 400, 0.20, 6 ) );
        //System.out.println( "savings( 500, 0.35, 8 ): " + savings( 500, 0.35, 8 ) );
        
        //System.out.println( "sqrt( 678, 3 ): " + sqrt( 678, 3 ) );
        //System.out.println( "sqrt( 225, 4 ): " + sqrt( 225, 4 ) );
        //System.out.println( "sqrt( 440, 7 ): " + sqrt( 440, 7 ) );
        //System.out.println( "sqrt( 568, 6 ): " + sqrt( 568, 6 ) );
        //System.out.println( "sqrt( 28, 2 ): " + sqrt( 28, 2 ) );
        
        //System.out.println( "sequence( 6 ): " + sequence( 6 ) );
        //System.out.println( "sequence( 8 ): " + sequence( 8 ) );
        //System.out.println( "sequence( 2 ): " + sequence( 2 ) );
        //System.out.println( "sequence( 14 ): " + sequence( 14 ) );
        //System.out.println( "sequence( 11 ): " + sequence( 11 ) );
    }
}