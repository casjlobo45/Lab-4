
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RecursiveFunction {
	
	public static void main( String[] args ){
		
		Scanner getInput = new Scanner( System.in );
		int n, result, totalSeconds;
		
		System.out.print( "Enter an integer value for n: " );
		n = getInput.nextInt();
		
		long start, end, time;
		
		start = System.currentTimeMillis();
		result = recursiveFunction( n );
		end = System.currentTimeMillis();
		
		time = ( end - start );
		
		long seconds = TimeUnit.SECONDS.convert(time, TimeUnit.MILLISECONDS );
		Long converter = new Long( seconds );
		
		totalSeconds = converter.intValue();
		
		System.out.printf( "f(%d) = %d\n", n, result );
		
		System.out.println( "Computation time: " + totalSeconds + " seconds." );
		
	} // End main()
	
	
	private static int recursiveFunction( int n ){
		
		if( n == 0 ){
			return 2;
		}
		else if( n == 1 ){
			return 2;
		}
		else{
			return recursiveFunction( n - 1 ) + (recursiveFunction( n - 2 ) / 2 );
		}

	} // End recursiveFunction()

} // End class definition
