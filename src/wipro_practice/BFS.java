package wipro_practice;

import java.util.Arrays;

public class BFS {
    private static int[] bfs(int[][] graph, int sourceNode, int targetNode) {
        int[] queue = new int[graph.length];
        int[] distance = new int[graph.length];
        int[] parents = new int[graph.length];

        Arrays.fill(parents, -1);

        int queueStartIndex = 0;
        int queueEndIndex = 1;

        queue[0] = sourceNode;
        distance[sourceNode] = 0;

        while (queueStartIndex < queueEndIndex) {
            int currentNode = queue[queueStartIndex++];

            if (currentNode == targetNode) {
                return buildPath(targetNode,
                        distance[targetNode] + 1,
                        parents);
            }

            for (int childNode : graph[currentNode]) {
                if (parents[childNode] == -1) {
                    parents[childNode] = currentNode;
                    distance[childNode] = distance[currentNode] + 1;
                    queue[queueEndIndex++] = childNode;
                }
            }
        }

        return null;
    }

    private static int[] buildPath(int targetNode,
                                   int pathLength,
                                   int[] parents) {
        int[] path = new int[pathLength];
        int pathIndex = path.length - 1;
        int currentNode = targetNode;

        while (currentNode != -1) {
            path[pathIndex--] = currentNode;
            currentNode = parents[currentNode];
        }

        return path;
    }

    /*    B ----+
         /      |
        A       E
         \      /
          C - D
    */

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;

        int[][] graph = new int[5][];
        graph[a] = new int[]{ c, b };
        graph[b] = new int[]{ e };
        graph[c] = new int[]{ d };
        graph[d] = new int[]{ c, e };
        graph[e] = new int[]{ b, d };

        // A -> B -> E
        int[] path = bfs(graph, a, e);
        System.out.println(Arrays.toString(path));

        // A <- B <- E does not exist:
        System.out.println(Arrays.toString(bfs(graph, e, a)));
    }
}
