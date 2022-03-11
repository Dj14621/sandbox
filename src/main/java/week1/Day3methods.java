
import jdk.dynalink.beans.StaticClass;
import java.sql.Statement;
import java.util.Scanner;



public class Day3methods {
    public static void main(String[] args) {
        System.out.println(welcome());
        System.out.println(comments());
        System.out.println(variables());
        System.out.println(vExamples());
        System.out.println(cExamples());
        System.out.println(iExamples());
        System.out.println(sformatting());
        System.out.println(sFExamples());
    }



    public static String welcome() {
        return "/*\n" +
                "Welcome to Java!\n" +
                "Java is a high level, modern programming language designed in the early 1990s by\n" +
                "Sun Microsystems, and currently owned by Oracle.\n" +
                "\n" +
                "Java is Platform Independent, which means that you only need to write the program once\n" +
                "to be able to run it on a number of different platforms! Java is portable, robust,\n" +
                "and dynamic, with the ability to fit the needs of virtually any type of application.\n" +
                "\n" +
                "Java guarantees that you'll be able to Write Once, Run Anywhere.\n" +
                "\n" +
                "More than 3 billion devices run Java.\n" +
                "Java is used to develop apps for Google's Android OS, various Desktop Applications, such\n" +
                "as media players, antivirus programs, Web Applications, Enterprise Applications (i.e. banking),\n" +
                "and many more!\n" +
                "*/";
    }



    public static String comments() {
        return "/*\n" +
                "Comments\n" +
                "The purpose of including comments in your code is to explain what the code is doing.\n" +
                "Java supports both single and multi-line comments. All characters that appear within a\n" +
                "comment are ignored by the Java compiler.\n" +
                "\n" +
                "A single-line comment starts with two forward slashes and continues until it reaches the end\n" +
                "of the line.\n" +
                "For example:\n" +
                "\n" +
                "// This is a single line comment\n" +
                "x = 5; // This is a single-line comment\n" +
                "\n" +
                "Adding comments as you write code is a good practice, because they provide clarification and\n" +
                "understanding when you need to refer back to it, as well as for others who might need to read it.\n" +
                "\n" +
                "Multi-Line Comments\n" +
                "Java also supports comments that span multiple lines. You start this type of comment with a\n" +
                "forward slash followed by an asterisk, and end it with an asterisk followed by a forward slash.\n" +
                "*/\n";
    }



    public static String variables() {
        return "/*\n" +
                "Variables\n" +
                "Store data for processing. A variable is given a name (or identifier), such as area,\n" +
                "age, height, and the like. The name uniquely identifies each variable, assigning a value to\n" +
                "the variable and retrieving the value stored.\n" +
                "\n" +
                "Variables have types.\n" +
                "- int: for integers\n" +
                "- double: for floating point or real numbers with optional decimal points and fractional parts\n" +
                "- String: for texts such as \"Hello\" or \"Good Morning!\". Text strings are enclosed within double\n" +
                " quotes.\n" +
                "\n" +
                "You can declare a variable of a type and assign it a value.\n" +
                "\n" +
                "Example:\n" +
                "String name = \"David\";\n" +
                "\n" +
                "This creates a variable called name of type String, and assigns it the value \"David\".\n" +
                "\n" +
                "It is important to note that a variable is associated with a type with a type, and is only\n" +
                "capable of storing values of that particular type. For example: an int variable can store\n" +
                "integer value, but cannot store double values or texts like \"Hello\".\n" +
                "\n" +
                "The char stands for character and hold a single character.\n" +
                "\n" +
                "Another type is the Boolean type, which has only two possible values: true and false.\n" +
                "This data type is used for simple flags that track true/false conditions.\n" +
                "*/";
    }
    public static String vExamples(){
        System.out.println("//Variables\n");
        System.out.println(vExamples1());
        System.out.println(vExamples2());
        System.out.println(vExamples3());
        System.out.println(vExamples4());
        System.out.println(vExamples5());
        return "";
    }
    public static int vExamples1() {
        int age = 4;
        return age;
    }
    public static double vExamples2() {
        double score = 99.9;
        return score;
    }
    public static String vExamples3() {
        String word = "hello";
        return word;
    }
    public static char vExamples4() {
        char group = 'a';
        return group;
    }
    public static boolean vExamples5(){
        boolean correct = true;
        return correct;
    }
    public static String cExamples() {
        System.out.println("//String concat\n");
        System.out.println(cExamples1());
        System.out.println(cExamples2());
        System.out.println("//System.out.println(one.concat(two));");
        System.out.println("//System.out.println(one+two);");
        return "";
    }
    public static String cExamples1() {
        String one = "Hello";
        return one;
    }
    public static String cExamples2() {
        String two = "World!";
        return two;
    }
    public static String iExamples(){
        return "String Interpolation\n" +
                "greetng=%sello" + " + userInput(h)"+ " = hello";
    }
    public static String sformatting(){
        return "/*System.out.printf(\"%s world!\\n\", one);\n" +
                " *System.out.println(temp);";
    }
    public static String sFExamples(){
        String temp = String.format("%s world!", cExamples1());
        return temp;
    }
}
