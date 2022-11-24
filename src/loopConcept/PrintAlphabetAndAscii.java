package loopConcept;

public class PrintAlphabetAndAscii {
    public static void main(String[] args) {

        PrintAlphabetAsci p = new PrintAlphabetAsci();
        p.printAlphabet();
        p.printAscii();
    }
}

class PrintAlphabetAsci{

    public void printAlphabet(){
        System.out.println("Method to print Alphabet");
        for (char c = 'a'; c<='z'; c++){
            System.out.print(c+" ");
        }
    }

    public void printAscii(){
        System.out.println("\nMethod to print Ascii value Alphabet");
        for (char c = 'a'; c<='z'; c++){
            System.out.print((int)c+" ");
        }
    }

}
