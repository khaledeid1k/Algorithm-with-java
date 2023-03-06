package Dijkstra;

import java.util.*;

public class DijkstraAlgorithm {

    private static HashMap<String, HashMap<String, Integer>> graph = new HashMap();
    private static HashMap<String, Integer> costs = new HashMap<>();
    private static HashMap<String, String> parents = new HashMap<>();

    private static List<String> processed = new ArrayList<>();
    static String node="";
    static StringBuilder path=new StringBuilder();

    private static int least_distance() {
        node = find_lowest_cost();
            while (!costs.isEmpty()) {
                if(Objects.equals(node, "none")){return 0;}
                int cost = costs.get(node);
                HashMap<String, Integer> distance = graph.get(node);
                for (String n : distance.keySet()) {
                    int new_cost = cost + distance.get(n);
                    if (costs.get(n) > new_cost) {
                        costs.put(n, new_cost);
                        parents.put(n, node);
                    }
                }
                processed.add(node);
                path.append(node).append("->");
                node = find_lowest_cost();
            }



        return 0;
    }

    private static String find_lowest_cost() {
        int lowest_cost = Integer.MAX_VALUE;;
        String lowest_cost_node = "none";


        for (Map.Entry<String, Integer> node :
                costs.entrySet()) {
            Integer cost = costs.get(node.getKey());
            if(cost<lowest_cost &&
                    !processed.contains(node.getKey())){
                lowest_cost=cost;
                lowest_cost_node=node.getKey();
            }
        }
        return lowest_cost_node;
    }


    public static void main(String[] args) {

        HashMap<String, Integer> StartDistance = new HashMap<>();
        StartDistance.put("A", 6);
        StartDistance.put("B", 2);
        graph.put("Start", StartDistance);

        HashMap<String, Integer> ADistance = new HashMap<>();
        ADistance.put("Fin", 1);
        graph.put("A", ADistance);
        parents.put("A", "Start");
        costs.put("A", 6);


        HashMap<String, Integer> BDistance = new HashMap<>();
        BDistance.put("A", 3);
        BDistance.put("Fin", 5);
        graph.put("B", BDistance);
        parents.put("B", "Start");
        costs.put("B", 2);


        HashMap<String, Integer> finDistance = new HashMap<>();
        graph.put("Fin", finDistance);
        parents.put("Fin", null);
        costs.put("Fin", Integer.MAX_VALUE);
        finDistance.put("Fin", Integer.MAX_VALUE);

        least_distance();
        System.out.println(path);

    }

}
