package breadth_first_search;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class My {

    public static Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        search("you");
    }

    private static boolean search(String name) {
        Queue<String> searched = new ArrayDeque<>(graph.get(name));
        List<String> search = new ArrayList<>();
        int count = 0;
        while (!searched.isEmpty()) {
            String firstName = searched.poll();

            if (!search.contains(firstName)) {
                if (firstName.endsWith("y")) {
                    System.out.println(firstName + " is a salesman mango");

                    return true;
                } else {
                    searched.addAll(graph.get(firstName));
                    search.add(firstName);
                }
            }
        }
        return false;
    }
}
