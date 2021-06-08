public class BarChart {
    public static void main(String[] args) {


      //  int peter[] = {0, 0, 0, 6, 9, 10, 12, 15};

        //System.out.println("GradePoint");

        //for (int counter = 0; counter < peter.length; counter++) {
          //  if (counter == 10)

            //    System.out.printf("%5d ", 100);
            //else
              //  System.out.printf("%02d-%02d :", counter * 10, counter * 10 + 9);

            //for (int stars = 0; stars <= peter[counter]; stars++)

                //System.out.printf("*");
            //System.out.println();

        int [] scores ={0,0,0,0,6,8,0,1,5,8,20,0,0,1};

        System.out.println("StudentPoint");

        for(int counter =0; counter< scores.length; counter++){
            if (counter ==0)
                System.out.printf("%7d", 100);
            else
                System.out.printf("%02d-%02d :", counter * 10 , counter* 10 + 9);

            for(int stars=0; stars <= scores[counter]; stars++)

                System.out.printf("*");

                  System.out.println();

        }
    }


    }
