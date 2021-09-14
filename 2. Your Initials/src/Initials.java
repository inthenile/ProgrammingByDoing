import java.util.Scanner;
public class Initials {
    public static void main(String[] args) {

        // I wanted to add a little flair into the assignment.
        // The user input determines the initials.
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        String[] initials = name.split(" ");
        for (int n = 0; n < initials.length; n++) {

        //Making symbols out of initials
        if (initials[n].startsWith("a") || initials[n].startsWith("A")){
            System.out.println("  A  ");
            System.out.println(" A A ");
            System.out.println("A   A");
            System.out.println("AAAAA");
            System.out.println("A   A");
            System.out.println("A   A");
            System.out.println("A   A\n");
        } else if (initials[n].startsWith("b") || initials[n].startsWith("B")){
            System.out.println("BBBB ");
            System.out.println("B   B");
            System.out.println("B   B");
            System.out.println("BBBB ");
            System.out.println("B   B");
            System.out.println("B   B");
            System.out.println("BBBB \n");
        } else if (initials[n].startsWith("c") || initials[n].startsWith("C")){
            System.out.println(" CCC ");
            System.out.println("C   C");
            System.out.println("C    ");
            System.out.println("C    ");
            System.out.println("C    ");
            System.out.println("C   C");
            System.out.println(" CCC \n");
        }else if (initials[n].startsWith("d") || initials[n].startsWith("D")){
            System.out.println("DDDD ");
            System.out.println("D   D");
            System.out.println("D   D");
            System.out.println("D   D");
            System.out.println("D   D");
            System.out.println("D   D");
            System.out.println("DDDD \n");
        } else if (initials[n].startsWith("e") || initials[n].startsWith("E")){
            System.out.println("EEEEE");
            System.out.println("E    ");
            System.out.println("E    ");
            System.out.println("EEE  ");
            System.out.println("E    ");
            System.out.println("E    ");
            System.out.println("EEEEE\n");
        }else if (initials[n].startsWith("f") || initials[n].startsWith("F")){
            System.out.println("FFFFF");
            System.out.println("F    ");
            System.out.println("F    ");
            System.out.println("FFF  ");
            System.out.println("F    ");
            System.out.println("F    ");
            System.out.println("F    \n");
        }else if (initials[n].startsWith("g") || initials[n].startsWith("G")){
            System.out.println(" GGG ");
            System.out.println("G   G");
            System.out.println("G    ");
            System.out.println("GGGGG");
            System.out.println("G   G");
            System.out.println("G   G");
            System.out.println(" GGG \n");
        }else if (initials[n].startsWith("h") || initials[n].startsWith("H")){
            System.out.println("H   H");
            System.out.println("H   H");
            System.out.println("H   H");
            System.out.println("HHHHH");
            System.out.println("H   H");
            System.out.println("H   H");
            System.out.println("H   H\n");
        } else if (initials[n].startsWith("i") || initials[n].startsWith("I")){
            System.out.println("IIIII");
            System.out.println("  I  ");
            System.out.println("  I  ");
            System.out.println("  I  ");
            System.out.println("  I  ");
            System.out.println("  I  ");
            System.out.println("IIIII\n");
        } else if (initials[n].startsWith("j") || initials[n].startsWith("J")){
            System.out.println("JJJJJ");
            System.out.println("  J  ");
            System.out.println("  J  ");
            System.out.println("  J  ");
            System.out.println("J J  ");
            System.out.println("J J  ");
            System.out.println(" JJ  \n");
        } else if (initials[n].startsWith("k") || initials[n].startsWith("K")){
            System.out.println("K   K");
            System.out.println("K  K ");
            System.out.println("K K  ");
            System.out.println("KK   ");
            System.out.println("K K  ");
            System.out.println("K  K ");
            System.out.println("K   K\n");
        } else if (initials[n].startsWith("l") || initials[n].startsWith("L")){
            System.out.println("L    ");
            System.out.println("L    ");
            System.out.println("L    ");
            System.out.println("L    ");
            System.out.println("L    ");
            System.out.println("L    ");
            System.out.println("LLLLL\n");
        } else if (initials[n].startsWith("m") || initials[n].startsWith("M")){
            System.out.println("M   M");
            System.out.println("MM MM");
            System.out.println("MM MM");
            System.out.println("M M M");
            System.out.println("M   M");
            System.out.println("M   M");
            System.out.println("M   M\n");
        } else if (initials[n].startsWith("n") || initials[n].startsWith("N")){
            System.out.println("N   N");
            System.out.println("NN  N");
            System.out.println("N N N");
            System.out.println("N  NN");
            System.out.println("N   N");
            System.out.println("N   N");
            System.out.println("N   N\n");
        } else if (initials[n].startsWith("o") || initials[n].startsWith("O")){
            System.out.println(" OOO ");
            System.out.println("O   O");
            System.out.println("O   O");
            System.out.println("O   O");
            System.out.println("O   O");
            System.out.println("O   O");
            System.out.println(" OOO \n");
        } else if (initials[n].startsWith("p") || initials[n].startsWith("P")){
            System.out.println("PPPP ");
            System.out.println("P   P");
            System.out.println("P   P");
            System.out.println("PPPP ");
            System.out.println("P    ");
            System.out.println("P    ");
            System.out.println("P    \n");
        } else if (initials[n].startsWith("q") || initials[n].startsWith("Q")){
            System.out.println(" QQQ ");
            System.out.println("Q   Q");
            System.out.println("Q   Q");
            System.out.println("Q   Q");
            System.out.println("Q   Q");
            System.out.println("Q  Q ");
            System.out.println(" QQ Q\n");
        } else if (initials[n].startsWith("r") || initials[n].startsWith("R")){
            System.out.println("RRRR ");
            System.out.println("R   R");
            System.out.println("R   R");
            System.out.println("RRRR ");
            System.out.println("R R  ");
            System.out.println("R  R ");
            System.out.println("R   R\n");
        } else if (initials[n].startsWith("s") || initials[n].startsWith("S")){
            System.out.println(" SSS ");
            System.out.println("S   S");
            System.out.println("S    ");
            System.out.println(" SSS ");
            System.out.println("    S");
            System.out.println("S   S");
            System.out.println(" SSS \n");
        } else if (initials[n].startsWith("t") || initials[n].startsWith("T")){
            System.out.println("TTTTT");
            System.out.println("  T  ");
            System.out.println("  T  ");
            System.out.println("  T  ");
            System.out.println("  T  ");
            System.out.println("  T  ");
            System.out.println("  T  \n");
        } else if (initials[n].startsWith("u") || initials[n].startsWith("U")){
            System.out.println("U   U");
            System.out.println("U   U");
            System.out.println("U   U");
            System.out.println("U   U");
            System.out.println("U   U");
            System.out.println("U   U");
            System.out.println(" UUU \n");
        } else if (initials[n].startsWith("v") || initials[n].startsWith("V")){
            System.out.println("V   V");
            System.out.println("V   V");
            System.out.println("V   V");
            System.out.println("V   V");
            System.out.println("V   V");
            System.out.println(" V V ");
            System.out.println("  V  \n");
        } else if (initials[n].startsWith("w") || initials[n].startsWith("W")){
            System.out.println("W   W");
            System.out.println("W   W");
            System.out.println("W   W");
            System.out.println("W W W");
            System.out.println("WW WW");
            System.out.println("WW WW");
            System.out.println("W   W\n");
        } else if (initials[n].startsWith("x") || initials[n].startsWith("X")){
            System.out.println("X   X");
            System.out.println("X   X");
            System.out.println(" X X ");
            System.out.println("  X  ");
            System.out.println(" X X ");
            System.out.println("X   X");
            System.out.println("X   X\n");
        } else if (initials[n].startsWith("y") || initials[n].startsWith("Y")){
            System.out.println("Y   Y");
            System.out.println(" Y Y ");
            System.out.println("  Y  ");
            System.out.println("  Y  ");
            System.out.println("  Y  ");
            System.out.println("  Y  ");
            System.out.println("  Y  \n");
        } else if (initials[n].startsWith("z") || initials[n].startsWith("Z")){
            System.out.println("ZZZZZ");
            System.out.println("    Z");
            System.out.println("   Z ");
            System.out.println("  Z  ");
            System.out.println(" Z   ");
            System.out.println("Z    ");
            System.out.println("ZZZZZ\n");
        }

        }
    }
}
