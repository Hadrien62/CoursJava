import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Année de naissance: ");
            int yearOfBirth = sc.nextInt();
            System.out.println(yearOfBirth);
        }
        catch (InputMismatchException e){
            System.out.println("La saisie de la date est incorrecte.");
        }
        finally {
            System.out.println("Va te faire voir bon à rien!!!!");
        }
        Avion b = new Avion(2000986.90, "Boeing", 1678.98);
        b.fly("Kérosène");
    }

}

