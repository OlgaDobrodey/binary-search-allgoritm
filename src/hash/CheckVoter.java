package hash;

import java.util.HashMap;
import java.util.Map;

public class CheckVoter {
    private static Map<String, Boolean> voted = new HashMap<>();

    private static void checkVoter(String name) {
        System.out.println(voted.get(name));

        if (voted.containsKey(name)) {
            System.out.println("kick them out!");
        } else {
            voted.put(name, true);
            System.out.println("let them vote!");
        }
        System.out.println(voted);
    }

    public static void main(String[] args) {
        checkVoter("tom"); // let them vote!
        checkVoter("mike"); // let them vote!
        checkVoter("mike"); // kick them out!
    }
}
