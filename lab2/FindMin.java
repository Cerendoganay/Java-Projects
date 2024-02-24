public class FindMin {
    public static void main(String[] args){

        if(args.length > 0){

            int value1 = Integer.parseInt(args[0]);
            int value2 = Integer.parseInt(args[1]);
            int value3 = Integer.parseInt(args[2]);

            int min = value1 < value2 ? value1 : value2 ;

            min = min < value3 ? min : value3 ;

            System.out.println("Min : " + min);



        }

    }
}
