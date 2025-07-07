import java.util.*;

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {

    boolean checkforcycle(int src, ArrayList<ArrayList<Integer>> adj, int[] vis) {
        vis[src] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int node = curr.first;
            int parent = curr.second;

            for (int adjnode : adj.get(node)) {
                if (vis[adjnode] == 0) {
                    vis[adjnode] = 1;
                    q.add(new Pair(adjnode, node));
                } else if (adjnode != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] vis = new int[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                if (checkforcycle(i, adj, vis)) return true;
            }
        }

        return false;
    }
}