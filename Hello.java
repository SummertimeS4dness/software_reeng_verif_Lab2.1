public class Hello {
	public static void main( String argv[] )
	{
		// Default is "World"
		// Author: Anton Mishchenko(Anton@somewhere.com)
		String name = "World";
		if ( argv.length != 0 )
		{
			name = argv[0];
		}
		System.out.println( "Hello, " + name + "!" );
	}
}