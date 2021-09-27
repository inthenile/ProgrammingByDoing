public class Main {
    public static void main(String[] args) {
        //Making the for loops generate numbers all the way up to 45 and no more, since we are looking for numbers that add up to 45.
        for (int A = 0; A <= 45; A++) {
            for (int B = 0; B <= 45; B++) {
                for (int C = 0; C <= 45; C++) {
                    for (int D = 0; D <= 45; D++) {
                        //The condition is the following:
                        if(A + B + C + D == 45 && (A+2 == B-2) && (B-2 == C*2) && (C*2 == D/2)){
                            System.out.println("A is: " + A);
                            System.out.println("B is: " + B);
                            System.out.println("C is: " + C);
                            System.out.println("D is: " + D);
                            System.out.println("----------------------");
                            System.out.println("The total sum of these numbers is: " + (A+B+C+D));

                            //Checking the result
                            System.out.println("----------------------");
                            System.out.println(("A + 2 =  " + (A+2)) + " \t=\t B - 2 = " + (B-2) );
                            System.out.println(("B - 2 =  " + (B-2)) + " \t=\t C * 2 = " + (C*2) );
                            System.out.println(("C * 2 =  " + (C*2)) + " \t=\t D / 2 = " + (D/2) );
                        }
                    }
                }
            }
        }
    }
 }
