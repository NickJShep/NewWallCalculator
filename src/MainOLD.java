public class MainOLD {
    public static void main(String[] args) {

        MainOLD myObj = new MainOLD();
        ;
    }
}

        int x = 50;
        int y = 10;
        if (x > y) {
            System.out.println("Greater");
        }


        Scanner sc= new Scanner(System.in);
        System.out.println("What is the width of your wall in CM");
        int width = sc.nextInt();  // Read user input
        System.out.println("What is the height of your wall in CM");
        int height = sc.nextInt();  // Read user input
        double area = (width * height)/10000.0;
        System.out.println("The surface area of your wall is: "+area+" M Square");
        double LitrePaint = area*0.154;
        int RoundedPaint = (int) Math.rint(LitrePaint);
        System.out.println("You need: "+LitrePaint+" Litres of paint");
        System.out.println("How many coats of paint do you want to do");
        int coats = sc.nextInt();  // Read user input
        double MultiCoatLitrePaint = LitrePaint*coats;
        System.out.println("You need: "+MultiCoatLitrePaint+" Litres of paint for "+coats+" coats of paint");



    }

}
