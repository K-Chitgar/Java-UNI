// Kasra Chitgar - Tamrin 2-2 (pishniaz & hamniaz doros)
// classes : Lessons

package Session2;

import java.util.Scanner;

public class Tamrin22 {

    public static void main(String[] args) {
        Lessons mabani_computer = new Lessons();
        mabani_computer.Etelaat = "pishniaz: - \nhamniaz: - \nTedad vahed: 3";

        Lessons madarhaie_electronici=new Lessons();
        madarhaie_electronici.Etelaat = "pishniaz: moadelat difransiel \nhamniaz: - \nTedad vahed: 3";

        Lessons riaziat_gosaste=new Lessons();
        riaziat_gosaste.Etelaat = "pishniaz: - \nhamniaz: riazi 1 & mabani computer \nTedad vahed: 3";

        Lessons barnamesazi_pishrafte=new Lessons();
        barnamesazi_pishrafte.Etelaat = "pishniaz: mabani computer & barname sazi \nhamniaz: - \nTedad vahed: 3";

        Lessons sakhtemanhaie_dade=new Lessons();
        sakhtemanhaie_dade.Etelaat = "pishniaz: riaziat gosaste & barnamesazi pishrafte \nhamniaz: - \nTedad vahed: 3";

        Lessons madarhaie_manteghi=new Lessons();
        madarhaie_manteghi.Etelaat = "pishniaz: - \nhamniaz: riaziat gosaste \nTedad vahed: 3";

        Lessons nazarie_zabanha_mashinha=new Lessons();
        nazarie_zabanha_mashinha.Etelaat = "pishniaz: sakhtemanhaie dade \nhamniaz: - \nTedad vahed: 3";

        Lessons zaban_takhasosi=new Lessons();
        zaban_takhasosi.Etelaat = "pishniaz: zaban english \nhamniaz: - \nTedad vahed: 2";

        Lessons ravesh_pazhohesh_erae=new Lessons();
        ravesh_pazhohesh_erae.Etelaat = "pishniaz: zaban takhasosi \nhamniaz: - \nTedad vahed: 2";

        Lessons riaziat_mahandesi=new Lessons();
        riaziat_mahandesi.Etelaat = "pishniaz: riazi 2 & moadelat difransiel \nhamniaz: - \nTedad vahed: 3";

//*******************************************************************

        System.out.println("HELP (NAM DOROS) : mabani computer - madarhaie electronici \n riaziat gosaste - " +
                "barnamesazi pishrafte -sakhtemanhaie dade - madarhaie manteghi \n nazarie zabanha mashinha - " +
                "zaban takhasosi - ravesh pazhohesh erae - riaziat mahandesi \n ");

        System.out.print("Name dars ra vared namaied: ");
        Scanner scanner = new Scanner(System.in);
        String dars = scanner.nextLine();

        switch (dars) {
            case "mabani computer":
                System.out.println(dars + "\n" + mabani_computer.Etelaat);
                break;

            case "madarhaie electronici":
                System.out.println(dars + "\n" + madarhaie_electronici.Etelaat);
                break;

            case "riaziat gosaste":
                System.out.println(dars + "\n" + riaziat_gosaste.Etelaat);
                break;

            case "barnamesazi pishrafte":
                System.out.println(dars + "\n" + barnamesazi_pishrafte.Etelaat);
                break;

            case "sakhtemanhaie dade":
                System.out.println(dars + "\n" + sakhtemanhaie_dade.Etelaat);
                break;

            case "madarhaie manteghi":
                System.out.println(dars + "\n" + madarhaie_manteghi.Etelaat);
                break;

            case "nazarie zabanha mashinha":
                System.out.println(dars + "\n" + nazarie_zabanha_mashinha.Etelaat);
                break;

            case "zaban takhasosi":
                System.out.println(dars + "\n" + zaban_takhasosi.Etelaat);
                break;

            case "ravesh pazhohesh erae":
                System.out.println(dars + "\n" + ravesh_pazhohesh_erae.Etelaat);
                break;

            case "riaziat mahandesi":
                System.out.println(dars + "\n" + riaziat_mahandesi.Etelaat);
                break;

            default:
                System.out.println("dars mored nazar yaft nashod.");
                break;


        }
    }
}