package LeetCode.Compete;

import java.util.*;

/*

5400. Destination City

    User Accepted: 2914
    User Tried: 3148
    Total Accepted: 2927
    Total Submissions: 3323
    Difficulty: Easy

You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

*/

public class destination_city {

    public String destCity(List<List<String>> paths) {

        HashSet<String> departures = new HashSet<>();
        List<String> arrivals = new ArrayList<>();

        for (int x = 0; x < paths.size(); x++) {
            departures.add(paths.get(x).get(0));
            arrivals.add(paths.get(x).get(1));
        }

        String answer = "";

        for (int x = 0; x < paths.size(); x++) {
            if (!departures.contains(arrivals.get(x))) {
                answer = arrivals.get(x);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // List<List <String>> input = [["London","New York"] ["New York","Lima"]["Lima"
        // "Sao Paulo"]];
    }
}