public class Printing {
    public static void main(String[] args) {

        //  System.out.print() -> Never automatically advances the cursor to a new line, 
        //  nor will it automatically provide spaces or indentation.

        System.out.print("Text");
        System.out.print("Words");
        System.out.print("Sentences");
        System.out.print("TextWordsSentences");
        System.out.print("Text" + "Words" + "Sentences");



        //  Here we have spaces, but the text is still on one line.
        //  This is a complete mess.

        System.out.print("Text Words Sentences");
        System.out.print("Text" + "Words" + "Sentences");
        System.out.print("Text " + "Words " + "Sentences");
        System.out.print("Text" + " Words " + " Sentences");



        //  It is now time to print text onto multiple lines as needed 
        //  and efficiently space our words.  Notice when println() enters our code.

        System.out.print("Text\nWords\nSentences\n");
        System.out.println("Text\nWords\nSentences");
        System.out.println("Text"); 
        System.out.println("Words");
        System.out.println("Sentences");
        System.out.print("Text\tWords\tSentences\n");
        System.out.print("\tText\n"); 
        System.out.print("\tWords\n");
        System.out.print("\tSentences\n");


        /*
            This program is an absolute disaster.  Its purpose is to demonstrate how much control
            you can have over how your text is formatted.
        */


        
    }
}
