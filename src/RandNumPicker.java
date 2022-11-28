import java.util.*;

public class RandNumPicker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, choose, num;

        System.out.print("Zadejte maximální hodnotu čísla, ze kterých budeme vybírat: ");
        max = sc.nextInt();
        System.out.print("\nZadejte počet vybíraných čísel: ");
        choose = sc.nextInt();
        System.out.println();

        HashSet<Integer> used = new HashSet<>();
        ArrayList<Integer> picked = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < choose; i++) {
            num = 0;
            while (num == 0 || used.contains(num))
                num = rand.nextInt(max-1)+1;
            picked.add(num);
            used.add(num);
        }
        for (Integer i: picked) System.out.print(i + " ");
    }
}
