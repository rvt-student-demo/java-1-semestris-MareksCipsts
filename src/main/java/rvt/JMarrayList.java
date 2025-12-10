package rvt;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;
public class JMarrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (true) {
            names.add(sc.nextLine());
            if(names.get(i) == "") {
                int daudz = names.size() - 1;
                System.out.println("In total: " + daudz);
                break;
            } 
        
        }
    }
}

class OnTheList {
    public static void main(String[] args) {
    ArrayList<String> vardi = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    int t = 0;
    while(t != -1) {
        vardi.add(sc.nextLine());
        t++;
        if(vardi.get(t-1) == "") {
            vardi.remove(t-1);
            t = -1;
        }
    
    }
System.out.print("Search for?: ");
String vards = sc.nextLine();
boolean found = vardi.contains(vards);
if (found) {
    System.out.println(vards + " was found");
}
else {
    System.out.println(vards + " was not found!");

}
}
}

class OnlyTheseNumbers {
    public static void main(String[] args) {
    ArrayList<Integer> skaitli = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);

    int i = 0;
    while (i != -1) {
        skaitli.add(sc.nextInt());
        i++;
        if (skaitli.get(i-1) == -1) {
            i = -1;
        }
    }
    System.out.println("From where: ");
    int from = sc.nextInt();
    System.out.println("To where: ");
    int to = sc.nextInt();
    for (int j = from; j <= to; j++) {
        System.out.println(skaitli.get(j));

    }
    }
    }

class RemoveLast {
    public static void main(String[] args) {
        
    }
}
