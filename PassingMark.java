import java.util.Scanner;

public class PassingMark {
    public static void main(String[] args) {
                        //-------SUBJECT VARIABLES DEFİNED-----
        double math, physics, chemistry, biology, literature, history, german, music, dance;


                    //---GETTING DATA FROM USER BY INPUT FUNCTION--------
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Math mark:  ");
        math = input.nextDouble();
        if (math > 100 || math < 0){
            math = 0;
            System.out.println("Your updated math mark:  "+ math);
        }

        System.out.print("Enter your Physics mark:  ");
        physics = input.nextDouble();
        if (physics > 100 || physics < 0){
            physics = 0;
            System.out.println("Your updated physics mark:  "+ physics);
        }

        System.out.print("Enter your Chemistry mark:  ");
        chemistry = input.nextDouble();
        if (chemistry > 100 || chemistry < 0){
            chemistry = 0;
            System.out.println("Your updated chemistry mark:  "+ chemistry);
        }

        System.out.print("Enter your Biology mark:  ");
        biology = input.nextDouble();
        if (biology > 100 || biology < 0){
            biology = 0;
            System.out.println("Your updated biology mark:  "+ biology);
        }

        System.out.print("Enter your Literature mark:  ");
        literature = input.nextDouble();
        if (literature > 100 || literature < 0){
            literature = 0;
            System.out.println("Your updated literature mark:  "+ literature);
        }

        System.out.print("Enter your History mark:  ");
        history = input.nextDouble();
        if (history > 100 || history < 0){
            history = 0;
            System.out.println("Your updated history mark:  "+ history);
        }

        System.out.print("Enter your German mark:  ");
        german = input.nextDouble();
        if (german > 100 || german < 0){
            german = 0;
            System.out.println("Your updated german mark:  "+ german);
        }

        System.out.print("Enter your Music mark:  ");
        music = input.nextDouble();
        if (music > 100 || music < 0){
            music = 0;
            System.out.println("Your updated music mark:  "+ music);
        }

        System.out.print("Enter your Dance mark:  ");
        dance = input.nextDouble();
        if (dance > 100 || dance < 0){
            dance = 0;
            System.out.println("Your updated dance mark:  "+ dance);
        }

                        //-----SUBJECT MARKS ARE GETTING CALCULATED BY ADDITION AND DIVISION---------
        double total = (math + physics + chemistry + biology + literature + history + german + music + dance)/9;

                        //-----BY OUTPUT SHOWING RESULT TO USER--------
        if (total <= 54){
            System.out.println("Failed! Your Approx Mark:  "+ total);
        }else if (total >= 55){
            System.out.println("You Passed! Your Approx Mark:  "+ total);
        }else{
            System.out.println();
        }
    }
}
