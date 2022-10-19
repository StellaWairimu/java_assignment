public class Operators{
    public static void main(String[] args)
    {
        int valueA = 10;
        int valueB  = 20;
        //valueB = 100;

        int Examscore = 80;
        String studentInitial = "B";
        int examScore = 80;

        if (Examscore >= 70 && studentInitial == "A") {
            System.out.println("Passed with A");

        }
        else if (Examscore >= 60) {
            System.out.println("Passed with B");
        }

        else if (Examscore >= 50) {
            System.out.println("Passed with C");
        }

        else if (Examscore < 60) {
            System.out.println("yOU HAVE fAILED");
        }
       switch (examScore) {
        case 70:
        System.out.println("Top Achiever");       
            break;
            case 60:
            System.out.println("Mid Achiever");       
                break;
       
        default: 
        System.out.println("Last last , all go chop breakfast");
            break;
       }
       


    }
/*
 * ==Equal to
 * != Not equal
 * IF Else
 * Switch
 * Iterations and Loops - while loop / For loop
 */

}