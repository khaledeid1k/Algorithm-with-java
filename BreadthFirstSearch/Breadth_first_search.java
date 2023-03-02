package BreadthFirstSearch;

import java.util.*;

public class Breadth_first_search {
    private static HashMap<String, ArrayList<String>> graph = new HashMap<>();

    public static boolean Breadth_first_search(HashMap<String, ArrayList<String>> graph) {


        Queue<String> search_queue
                = new LinkedList<>(graph.get("you"));

        ArrayList<String> searched = new ArrayList<>();

        while (!search_queue.isEmpty()){
            String person = search_queue.remove();
            if(!searched.contains(person)){
                if(person.endsWith("m")){
                    System.out.println(person+ " is a mango seller!");
                    return true;
                }else {
                    if(graph.containsKey(person)) {
                        search_queue.addAll(graph.get(person));
                    }
                    searched.add(person);
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Omar");
        friends.add("Ahmed");
        friends.add("Ali");
        friends.add("Tarek");
        graph.put("you",friends);
        ArrayList<String> omarFriends = new ArrayList<>();
        omarFriends.add("Fatma");
        omarFriends.add("Samar");
        omarFriends.add("Samasm");
        omarFriends.add("Ali");
        graph.put("Omar",omarFriends);

    Breadth_first_search(graph);
    }
}
