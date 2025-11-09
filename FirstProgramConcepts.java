public class FirstProgramConcepts {
	public static void main(String[]  args) {
		System.out.println("wordsword");
	}
}

/*
		Line 1: 
			Declares a class; all Java programs exist within a class.  The 
			keyword 'public' indicates that this class is accessible to 
			other parts of the program.  Next the keyword 'class' is
			used to indicate that this  IS a class.  A class holds the 
			data required to make an object.  This class is named
			'FirstProgramConcepts'.   Capitalize class names and 
			remember that this class name must match the file name.
			Only one public class is allowed per file.  A non-public class
			may exist with other non-public classes, but class should be
			contained in their own files.  Lastly, a curly brace signals the 
			beginning of the block of code that is the class body.

		Line 2:
			Keyword 'public' is used again, this time to indicate that the 
			main method is accessible to the entire application.  This just 
			means that if you write other classes, they can communicate 
			with the main method.  Keyword 'static' will be explained 
			elsewhere, but for now know that 'static' methods mean no
			object needs to be created prior to their usage.  Keyword
			'void' indicates the method's return type.  Because this 
			method is void, nothing is returned; an action is performed
			instead,  such as printing to the screen.  'main' is the name
			and must be named main in lower case letters.  (String[] args)
			is a parameter list, and honelty can't properly explain it in this
			context.  

		Line 3:
			Brace that closes the main method.
		Line 4:
			Closing brace for the entire class that holds the method.

*/