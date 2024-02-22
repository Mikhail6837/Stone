package tito;

import java.util.Random;
import java.util.Scanner;


public class Kamen implements SharedConst {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int ask1() {
        System.out.print ("ВВедите 1 2 3 :");
        int input = sc.nextInt();
        if (input == 1)
            System.out.println ("Камень");
        else if (input == 2)
            System.out.println ("Ножницы");
        else
            System.out.println ("Бумага");
        int prob = rand.nextInt(3) +1;
        if (prob == 1)
            System.out.println ("2 Игрок поставил Камень");
        else if (prob == 2)
            System.out.println ("2 Игрок поставил Ножницы");
        else
            System.out.println ("2 Игрок поставил Бумага");
        if(input == prob)
            return NO;
        else if ((input == 1 && prob == 2 ) || (input == 2 && prob == 3 ) || (input == 3 && prob == 1 ) )
            return IGROK;
        else
            return IGROKTY;

    }
}
class Ask1 implements SharedConst{
    static void answer (int result) {
        switch (result){
            case NO:
                System.out.println ("НИЧЬЯ");
                break;
            case IGROK:
                System.out.println ("1 Игрок выиграл");
                break;
            case IGROKTY:
                System.out.println ("2 Игрок выиграл");
                break;
        }

    }
    public static void main (String args[]) {
        Kamen q = new Kamen();
        answer(q.ask1());


    }
}

