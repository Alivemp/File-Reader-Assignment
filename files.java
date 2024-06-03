import java.util.Scanner;
import java.io.*;
public class files {
    public static void main(String[] args) throws IOException {
        // find the amount of lines
        int count =0;
        Scanner input=new Scanner(new File("assignment.txt")); 
        while (input.hasNextLine()) {
            String line=input.nextLine();
            Scanner Scanline=new Scanner(line);
            count ++;
        }
        // print the answers to the questions asked in the assignment.
        System.out.println("There are "+count+" lines");
        System.out.println("There are "+characterCount()+" characters");
        System.out.println("The average amount of characters per word are "+averageWords());
    }
    public static int words() throws FileNotFoundException {
        Scanner input=new Scanner(new File("assignment.txt"));
        int averageWords = 0;
        //find the amount of wourds
        while (input.hasNextLine()) {
            int lineNum = 0;
            
            String line=input.nextLine();
            Scanner Scanline=new Scanner(line);
            int count2 = 0;
            while (Scanline.hasNext()) {
                String word=Scanline.next();
                count2 ++;
                lineNum ++;
                averageWords ++;
            }
            System.out.println("Line "+lineNum+" has "+count2+" words");
        }
        return averageWords;
    }
    public static int characterCount() throws IOException {
        // copy the word part from before to figure out the total length
        Scanner input=new Scanner(new File("assignment.txt"));
        int charCount = 0;
        while (input.hasNextLine()) {
            String line=input.nextLine();
            Scanner Scanline=new Scanner(line);
            while (Scanline.hasNext()) {
                String word=Scanline.next();
                charCount += word.length();
            }
        }
        return charCount;
    }
    public static int averageWords() throws IOException {
        //use the average of the characters and amount of words to find out the average word characters
        int averagewordscount = characterCount() / words();
        return averagewordscount;
    }
}
