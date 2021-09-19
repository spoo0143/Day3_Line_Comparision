package lineday3;
import java.util.Scanner;

public class Linecomparision {



     int comparison () {
        double x1, x2, y1, y2;

        double dis;

        try (Scanner sc = new Scanner ( System.in )) {
			System.out.print ( "enter x1 point: " );

			x1 = sc.nextInt ();

			System.out.print ( "enter y1 point: " );

			y1 = sc.nextInt ();

			System.out.print ( "enter x2 point: " );

			x2 = sc.nextInt ();

			System.out.print ( "enter y2 point: " );

			y2 = sc.nextInt ();
		}

        dis = Math.sqrt ( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) );

        System.out.println ( "distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + dis );

        return (int) dis;
    }

    public void equal ( double line1, double line2 ) {
        if (line1 == line2) {
            System.out.println ( "\nBoth lines are Equal" );
        } else {
            System.out.println ( "\nLines are Not Equal" );
        }
    }

    public void compare ( double line1, double line2 ) {
        if (line1 == line2) {
            System.out.println ( "\nBoth lines are Equal" );
        } else if (line1 > line2) {
            System.out.println ( "\n line 1 is greater than line 2 " );
        } else {
            System.out.println ( "\nline 2 is greater than line 1" );
        }
    }

public static void main ( String[] args ) {
	Linecomparision lineComparison = new Linecomparision  ();
    System.out.println ( "***************\n    Welcome To Line Comparison Computation \n*****************" );
    System.out.println ( "\nEnter line 1 coordinates" );
    int line1 = lineComparison.comparison ();
    System.out.println ( "\nEnter line 2 coordinates" );
    int line2 = lineComparison.comparison ();
    lineComparison.equal ( line1,line2 );
    lineComparison.compare ( line1,line2 );
}
}

