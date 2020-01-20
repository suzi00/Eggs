import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Egg> listOfEggs = new ArrayList<Egg>();
    static Scanner input = new Scanner(System.in);
    static Pot pot;
    public static void main(String[] args) {
        Initialize();
    }

    static void Initialize(){
        while(true){
            System.out.println("1. Dobavi tendjara");
            System.out.println("2. Dobavi qice");
            System.out.println("3. Svari qica");
            System.out.println("4. Proveri qicata");
            System.out.println("5. Izlez");
            int chislo = input.nextInt();

            if (chislo == 1){
                if (listOfEggs.size() == 0){
                    System.out.println("Molq dobavete qica purvo!");
                }
                else{
                    pot = new Pot(listOfEggs);
                }
            }
            if (chislo == 2){
                listOfEggs.add(new Egg());
            }
            if (chislo == 3){
                System.out.println("Qicata se varqt");
                System.out.println("Kalorii: " + 10 * listOfEggs.size());
                pot.cook();
            }
            if (chislo == 4){
                System.out.println(pot.check());
            }
            if (chislo == 5){
                return;
            }
        }
    }
}
