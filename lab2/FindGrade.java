public class FindGrade {

    public static void main(String[] args){
        if(args.length > 0){
            int score = Integer.parseInt(args[0]);

            if(score > 100 || score < 0){
                System.out.println("It is not a valid score.");
            }
            else if(score >= 90){
                System.out.println("Your grade is A");
            }
            else if(score >= 80){
                System.out.println("Your grade is B");
            }
            else if(score >= 70){
                System.out.println("Your grade is C");
            }
            else if(score >= 60){
                System.out.println("Your grade is D");
            }
            else{
                System.out.println("Your grade is F");
            }

        }
    }
}
