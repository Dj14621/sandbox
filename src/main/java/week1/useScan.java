package week1;

public class useScan {


        //Welcome to Java
        public static String welcomeToJava(){
            return "//Welcome to Java!\n" +
                    "/*\n" +
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
                    "*/\n";

        }

//Comment
    public static String JavaComment(){
            return "//Comments\n" +
                    "/*\n" +
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
                    "*/\n ";
    }


          public static int myAge(){
            int Age = 4;
            return Age;
          }

          public static double myScore(){
            double Score = 99.9;
          return Score;
          }

           public static String hola(){
           String word = "hello";
           return word;
           }

           public static char myGroup(){
            char group = 'a';
            return group;
            }

            public static boolean areYouSure(){
            boolean correct = true;
            return correct;
            }

            public static String myConcat(){
            String one = "Hello ";
            String two = " World";
            return (one + two);
            }

            public static String myInterpolaion(){
            String one="hello";
                String temp = String.format("%s  world!", one);
                return temp;
            }

    }

