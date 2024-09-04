// import java.util.*;
// public class Classroom1 {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         // empty arraylist create
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }
//         graph[0].add(new Edge(0, 1 , 2));
//         graph[0].add(new Edge(0, 2 , 2));

//         graph[1].add(new Edge(1, 2, 10));
//         graph[1].add(new Edge(1, 3, 0));

//         graph[2].add(new Edge(2, 0, 2));
//         graph[2].add(new Edge(2, 1, 10));
//         graph[2].add(new Edge(2, 3, -1));

//         graph[3].add(new Edge(3, 1, 0));
//         graph[3].add(new Edge(3, 2, -1));

//     }

//     public static void main(String args[]) {
//         int V = 4;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         //print 2's neighbours
//         for(int i=0; i<graph[2].size(); i++){
//             Edge e = graph[2].get(i);
//             System.out.print(e.dest+","+e.wt);
//         }

//     }
// }

//Que1. GRAPH traversals bfs approch 
// import java.util.*;
// public class Classroom1 {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;

//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         // empty arraylist create
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }
//         graph[0].add(new Edge(0, 1 ));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));
//          
//        graph[6].add(new Edge(6, 5));
//     }
//     public static void bfs(ArrayList<Edge> graph[], int V){
//       Queue<Integer> q = new LinkedList<>();
//       boolean vis[] = new boolean[V];
//       q.add(0);
//       while(!q.isEmpty()){
//         int curr = q.remove();
//         if(vis[curr] == false){
//             System.out.println(curr+" ");
//             vis[curr] = true;
//             for(int i=0; i<graph[curr].size(); i++){
//                 Edge e = graph[curr].get(i);
//                 q.add(e.dest);
//             }
//         }
//       }
//     }

//     public static void main(String args[]) {
//         int V = 7;
//         //     1 --- 3
//         //   /       | \
//         //   0       |  5 -- 6
//         //   \       |  /
//         //     2 --- 4 
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         bfs(graph, V);
//         System.out.println();
//         }

//     }

//Que2 graph traversal  if disconnected parts given of a graph
// import java.util.*;
// public class Classroom1 {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;

//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         // empty arraylist create
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }
//         graph[0].add(new Edge(0, 1 ));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));

//           graph[6].add(new Edge(6, 5));
//     }
//     public static void bfs(ArrayList<Edge> graph[], int V, boolean vis[], int start){
//       Queue<Integer> q = new LinkedList<>();

//       q.add(start);
//       while(!q.isEmpty()){
//         int curr = q.remove();
//         if(vis[curr] == false){
//             System.out.println(curr+" ");
//             vis[curr] = true;
//             for(int i=0; i<graph[curr].size(); i++){
//                 Edge e = graph[curr].get(i);
//                 q.add(e.dest);
//             }
//         }
//       }
//     }

//     public static void main(String args[]) {
//         int V = 7;
//         //     1 --- 3
//         //   /       | \
//         //   0       |  5 -- 6
//         //   \       |  /
//         //     2 --- 4 
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         boolean vis[] = new boolean[V];
//         for(int i=0; i<V; i++){
//             if(vis[i] == false){
//                 bfs(graph, V, vis, i);
//             }
//         }

//         System.out.println();
//         }

//     }

//Que3 graph trvaersal in dfs type (dept firest search)
// import java.util.*;
// public class Classroom1 {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;

//         }
//     }

// public static void createGraph(ArrayList<Edge> graph[]) {
//     // empty arraylist create
//     for (int i = 0; i < graph.length; i++) {
//         graph[i] = new ArrayList<Edge>();
//     }
//     graph[0].add(new Edge(0, 1 ));
//     graph[0].add(new Edge(0, 2));

//     graph[1].add(new Edge(1, 0));
//     graph[1].add(new Edge(1, 3));

//     graph[2].add(new Edge(2, 0));
//     graph[2].add(new Edge(2, 4));

//     graph[3].add(new Edge(3, 1));
//     graph[3].add(new Edge(3, 4));
//     graph[3].add(new Edge(3, 5));

//     graph[4].add(new Edge(4, 2));
//     graph[4].add(new Edge(4, 3));
//     graph[4].add(new Edge(4, 5));

//     graph[5].add(new Edge(5, 3));
//     graph[5].add(new Edge(5, 4));
//     graph[5].add(new Edge(5, 6));

//      graph[6].add(new Edge(6, 5));
// }
//     public static void bfs(ArrayList<Edge> graph[], int V){
//       Queue<Integer> q = new LinkedList<>();
//       boolean vis[] = new boolean[V];
//       q.add(0);
//       while(!q.isEmpty()){
//         int curr = q.remove();
//         if(vis[curr] == false){
//             System.out.println(curr+" ");
//             vis[curr] = true;
//             for(int i=0; i<graph[curr].size(); i++){
//                 Edge e = graph[curr].get(i);
//                 q.add(e.dest);
//             }
//         }
//       }
//     }
//     public static  void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
//         System.out.println(curr+" ");
//         vis[curr] = true;
//         for(int i=0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);
//             if(vis[e.dest] == false){
//             dfs(graph, e.dest, vis);
//         }
//     }
// }

//Que 3 find all possible paths form 0 to 5  O(V^V)
// public static void  printAllPath(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar){
//     if(curr == tar){
//         System.out.println(path);
//         return;
//     }
//     for(int i=0; i<graph[curr].size(); i++){
//         Edge e = graph[curr].get(i);
//         if(!vis[e.dest]){
//             vis[curr] = true;
//             printAllPath(graph, vis, e.dest, path + e.dest, tar);
//             vis[curr] = false;
//         }
//     }
// }

// public static void main(String args[]) {
//     int V = 7;

//     //     1 --- 3
//     //   /       | \
//     //   0       |  5 -- 6
//     //   \       |  /
//     //     2 --- 4 
//     ArrayList<Edge> graph[] = new ArrayList[V];
//     createGraph(graph);
//     //  boolean vis[] = new boolean[V];
//     // dfs(graph, 0, vis);
//     // System.out.println();

//     //Que3.
//     int src = 0,  tar = 5;
//     printAllPath(graph, new boolean[V], src, "0", tar);
//     } 

// }

//Que4. Detech cycle in graph //O(V+E)
// import java.util.*;
// public class Classroom1{
//     static class Edge{
//       int src;
//       int dest;

//       public Edge(int s, int d){
//       this.src = s;
//       this.dest = d;
//     }
// }
// public static void createGraph(ArrayList<Edge> graph[]){
//     for(int i=0; i<graph.length; i++){
//         graph[i] =  new ArrayList<Edge>();
//     }
//     graph[0].add(new Edge(0, 2));

//     graph[1].add(new Edge(1, 0));
//     graph[2].add(new Edge(2, 3));
//     graph[3].add(new Edge(3, 0));

// }
// public static boolean isCycleDirection(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]){
//     vis[curr] = true;
//     rec[curr] = true;
//     for(int i=0; i<graph[curr].size(); i++){
//         Edge e = graph[curr].get(i);
//         //cycle condition
//         if(rec[e.dest]){
//             return true;
//         }else if(!vis[e.dest]){
//            if(isCycleDirection(graph, vis, e.dest, rec)){
//             return true;
//            }

//         }
//     }
//     rec[curr] = false;    -->vapas jate hata denge recursion stack sai
//     return false;
// }

//     public static void main(String args[]){
//         int V = 4;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         boolean vis[] = new boolean[V];
//         boolean rec[] = new boolean[V];
//         for(int i=0; i<V; i++){
//             if(!vis[i]){
//         boolean isCycle = isCycleDirection(graph, vis, 0, rec);
//          if(isCycle){
//             System.out.println(isCycle);
//             break;
//          }
//             }
//         }

//     }
// }

//Que4 find the topological sorted order
// import java.util.*;
// public class Classroom1{
//     static class Edge{
//         int src;
//         int dest;
//     public Edge(int s, int d){
//         this.src = s;
//         this.dest = d;
//     }
//     }
//     public static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0; i<graph.length; i++){
//           graph[i] = new ArrayList<Edge>();
//         }
//         graph[2].add(new Edge(2,3));
//         graph[3].add(new Edge(3,1));
//         graph[4].add(new Edge(4,0));
//         graph[4].add(new Edge(4,1));
//         graph[5].add(new Edge(5,0));
//         graph[5].add(new Edge(5,2));
//      }
//      public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> stack){
//         vis[curr] = true;
//         for(int i=0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);
//             if(!vis[e.dest]){
//                 topSortUtil(graph, e.dest, vis, stack);
//             }
//         }
//         stack.push(curr);
//      }
//      public static void topSort(ArrayList<Edge> graph[],int V){
//         boolean  vis[] = new boolean[V];
//         Stack<Integer> stack = new Stack<>();
//         for(int i=0; i<V; i++){
//             if(!vis[i]){
//                 topSortUtil(graph, i, vis, stack);
//             }
//         }
//         while(!stack.isEmpty()){
//           System.out.print(stack.pop()+" ");
//         }

//      }

// public static void main(String args[]){
//     int V = 6;
//     ArrayList<Edge> graph[]= new ArrayList[V];
//     createGraph(graph);
//     topSort(graph, V);
// }
// }

//Que5. detect cycle in undirected graph
// import java.util.*;
//     public class Classroom1{
//         static class Edge{
//             int src;
//             int dest;
//         public Edge(int s, int d){
//             this.src = s;
//             this.dest = d;
//         }
//         }
//         public static void createGraph(ArrayList<Edge> graph[]){
//             for(int i=0; i<graph.length; i++){
//               graph[i] = new ArrayList<Edge>();
//             }
//             graph[0].add(new Edge(0,1));
//             graph[0].add(new Edge(0,4));
//             graph[1].add(new Edge(1,0));
//             graph[1].add(new Edge(1,2));
//             graph[1].add(new Edge(1,4));
//             graph[2].add(new Edge(2,1));
//             graph[2].add(new Edge(2,3));
//             graph[3].add(new Edge(3,2));
//             graph[4].add(new Edge(4,0));
//             graph[4].add(new Edge(4,1));
//             graph[4].add(new Edge(4,5));
//             graph[5].add(new Edge(5,4));

//      }
//     public static boolean isCycleUndirected(ArrayList<Edge> graph[], boolean vis[], int curr, int par){
//         vis[curr] = true;
//         for(int i=0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);
//             if(vis[e.dest] && e.dest != par){
//                 return true;
//             }
//             else if(!vis[e.dest]){
//                 if(isCycleUndirected(graph, vis, e.dest, curr)){
//                     return true;

//                 }
//             }
//         }
//         return false;
//     }

// public static void main(String args[]){
//     int V = 6;
//     ArrayList<Edge> graph[]= new ArrayList[V];
//     createGraph(graph);
//     System.out.println(isCycleUndirected(graph, new boolean[V], 0, -1));

// }
// }

//Que6. shortest path(Dijksta's algorithim2)
// import java.util.*;
// public class Classroom1{
//     static class Edge{
//         int src;
//         int dest;
//         int wt;
//     public Edge(int s, int d,int w){
//         this.src = s;
//         this.dest = d;
//         this.wt = w;
//     }
//     }
//     public static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0; i<graph.length; i++){
//           graph[i] = new ArrayList<Edge>();

//         }
//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));
//         graph[1].add(new Edge(1, 3, 7));
//         graph[1].add(new Edge(1, 2, 1));
//         graph[2].add(new Edge(2, 4, 3));
//         graph[3].add(new Edge(3, 5, 1));
//         graph[4].add(new Edge(4, 3, 2));
// graph[4].add(new Edge(4, 5, 5));
// }
// public static class Pair implements Comparable<Pair>{
//     int node;
//     int dist;
//     public Pair(int n, int d){
//         this.node = n;
//         this.dist = d;
//     }
//     @Override
//     public int compareTo(Pair p2){
//      return this.dist - p2.dist; //ascending order
//     }
// }
// public static void dijkstra(ArrayList<Edge> graph[], int src,int V){
//  PriorityQueue<Pair> pq = new PriorityQueue<>();
//  int dist[] = new int [V];
//  for(int i=0; i<V; i++){
//     if( i != src){
//         dist[i] = Integer.MAX_VALUE;   //--> initialize by infinite
//     }
//  }
//  boolean vis[] = new boolean[V];
//  pq.add(new Pair(0, 0));
//  while(!pq.isEmpty()){
//     Pair curr = pq.remove();
//     if(!vis[curr.node]){
//     vis[curr.node] = true;
//     for(int i=0; i<graph[curr.node].size(); i++){
//         Edge e = graph[curr.node].get(i);
//         int u = e.src;
//         int v = e.dest;
//         if(dist[u] + e.wt < dist[v]){
//           dist[v] = dist[u] + e.wt;
//           pq.add(new Pair(v, dist[v]));
//         }
//     }
//  }
// }
// for(int i=0; i<V; i++){
//     System.out.println(dist[i]+" ");
// }
// System.out.println();
// }

//     public static void main(String args[]){
//          int V =6;
//          ArrayList<Edge> graph[] = new ArrayList[V];
//          createGraph(graph);
//          dijkstra(graph, 0, V);
//     }
// }

//Que7. bellman ford algorithim -->shortest distance between source and all distance

// import java.util.*;
// public class Classroom1{
//     static class Edge{
//         int src;
//         int dest;
//         int wt;
//     public Edge(int s, int d,int w){
//         this.src = s;
//         this.dest = d;
//         this.wt = w;
//     }
//     }
//     public static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0; i<graph.length; i++){
//           graph[i] = new ArrayList<Edge>();

//         }
//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));
//         graph[1].add(new Edge(1, 2, -4));
//         graph[2].add(new Edge(2, 3, 2));
//         graph[3].add(new Edge(3, 4, 4));
//         graph[4].add(new Edge(4, 1, -1));

//         }
//         public static void bellmanForde(ArrayList<Edge> graph[], int src, int V){
//             int dist[] = new int[V];
//             for(int i=0; i<V; i++){
//                 if(i != src){
//                     dist[i] = Integer.MAX_VALUE;
//                 }
//             }
//             for(int k=0; k<V-1; k++){ //O(V)
//                 //O(E)
//                 for(int i=0; i<V; i++){
//                     for(int j=0; j<graph[i].size(); j++){
//                         Edge e = graph[i].get(j);
//                        int u = e.src;
//                        int v = e.dest;
//                        if(dist[u] != Integer.MAX_VALUE && dist[u]+e.wt < dist[v]){
//                         dist[v] = dist[u] + e.wt;
//                        }
//                     }
//                 }
//             }
//             //print distance
//             for(int i=0; i<dist.length; i++){
//                 System.out.println(dist[i]+" ");
//             }
//          System.out.println();
//         }

//          public static void main(String args[]){
//          int V =5;
//          ArrayList<Edge> graph[] = new ArrayList[V];
//          createGraph(graph);
//          bellmanForde(graph, 0, V);
//     }
// }

// que8  Detect negative weight cycle in bellman ford
// import java.util.*;
// public class Classroom1{
//     static class Edge{
//         int src;
//         int dest;
//         int wt;
//     public Edge(int s, int d,int w){
//         this.src = s;
//         this.dest = d;
//         this.wt = w;
//     }
//     }
//     public static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0; i<graph.length; i++){
//           graph[i] = new ArrayList<Edge>();

// }
// graph[0].add(new Edge(0, 1, 2));
// graph[0].add(new Edge(0, 2, 4));
// graph[1].add(new Edge(1, 2, -4));
// graph[2].add(new Edge(2, 3, 2));
// graph[3].add(new Edge(3, 4, 4));
// graph[4].add(new Edge(4, 1, -10));

// }
// public static void bellmanForde(ArrayList<Edge> graph[], int src, int V){
//     int dist[] = new int[V];
//     for(int i=0; i<V; i++){
//         if(i != src){
//             dist[i] = Integer.MAX_VALUE;
//         }
//     }
//     for(int k=0; k<V-1; k++){ //O(V)
//         //O(E)
//         for(int i=0; i<V; i++){
//             for(int j=0; j<graph[i].size(); j++){
//                         Edge e = graph[i].get(j);
//                        int u = e.src;
//                        int v = e.dest;
//                        if(dist[u] != Integer.MAX_VALUE && dist[u]+e.wt < dist[v]){
//                         dist[v] = dist[u] + e.wt;
//                        }
//                     }
//                 }
//             }
//             //detect negative weight cycle
//             for(int i=0; i<V; i++){
//                     for(int j=0; j<graph[i].size(); j++){
//                         Edge e = graph[i].get(j);
//                        int u = e.src;
//                        int v = e.dest;
//                        if(dist[u] != Integer.MAX_VALUE && dist[u]+e.wt < dist[v]){
//                           System.out.println("negative wt cycle");
//                        }
//                     }
//                 }
//             //print distance
//             for(int i=0; i<dist.length; i++){
//                 System.out.println(dist[i]+" ");
//             }
//          System.out.println();
//         }

//          public static void main(String args[]){
//          int V =5;
//          ArrayList<Edge> graph[] = new ArrayList[V];
//          createGraph(graph);
//          bellmanForde(graph, 0, V);
//     }
// }

//Que9. prims algorithim (mst minimun spanning tree)sari edges nhi subgraph where all vertex
//  import java.util.*;
// public class Classroom1{
//     static class Edge{
//         int src;
//         int dest;
//         int wt;
//     public Edge(int s, int d,int w){
//         this.src = s;
//         this.dest = d;
//         this.wt = w;
//     }
//     }
//     public static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0; i<graph.length; i++){
//           graph[i] = new ArrayList<Edge>();

//         }
//         graph[0].add(new Edge(0, 1, 10));
//         graph[0].add(new Edge(0, 2, 15));
//         graph[0].add(new Edge(0, 3, 30));
//         graph[1].add(new Edge(1, 0, 10));
//         graph[1].add(new Edge(1, 3, 40));
//         graph[2].add(new Edge(2, 0, 15));
//         graph[2].add(new Edge(2, 3, 50));
//         graph[3].add(new Edge(3, 1, 40));
//         graph[3].add(new Edge(3, 2, 50));

//         } 
//         public static class Pair implements Comparable<Pair>{
//             int node;
//             int cost;
//             public Pair(int n, int c){
//                 this.node = n;
//                 this.cost = c;
//             }
//             @Override
//             public int compareTo(Pair p2){
//                 return this.cost - p2.cost; //ascending
//             }
//         }
//         public static void primsAlgo(ArrayList<Edge> graph[], int V){
//         PriorityQueue<Pair> pq = new PriorityQueue<>();  //(node - int, cost - int) non mst set  ElogE 
//         boolean vis[] = new boolean[V];  //mst set
//             pq.add(new Pair(0, 0));
//             int mstCost = 0;
//             while(!pq.isEmpty()){
//                 Pair curr = pq.remove();
//                 if(!vis[curr.node]){
//                     vis[curr.node] = true;
//                     mstCost += curr.cost;
//                     for(int i=0; i<graph[curr.node].size(); i++){
//                         Edge e = graph[curr.node].get(i);
//                         if(!vis[e.dest]){
//                         pq.add(new Pair(e.dest, e.wt));
//                     }
//                 }
//             }
//             }
//             System.out.println("min cost of mst = "+mstCost);
//         }
//          public static void main(String args[]){
//          int V =4;
//          ArrayList<Edge> graph[] = new ArrayList[V];
//          createGraph(graph);
//          primsAlgo(graph, V);

//     }
// }

//Que10. strongly connected component --> kosaraju's algorithim scc O(V+E)
//  import java.util.*;
// public class Classroom1{
//     static class Edge{
//         int src;
//         int dest;

//     public Edge(int s, int d){
//         this.src = s;
//         this.dest = d;

//     }
//     }
//     public static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0; i<graph.length; i++){
//           graph[i] = new ArrayList<Edge>();

//         }
//         graph[0].add(new Edge(0, 2));
//         graph[0].add(new Edge(0, 3));
//         graph[1].add(new Edge(1, 0));
//         graph[2].add(new Edge(2, 1));
//         graph[3].add(new Edge(3, 4));
//          }
//          public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
//             vis[curr] = true;
//             for(int i=0; i<graph[curr].size(); i++){
//                 Edge e = graph[curr].get(i);
//                 if(!vis[e.dest]){
//                     topSort(graph, e.dest, vis, s);
//                 }
//             }
//             s.push(curr);
//          } 
//          public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
//             vis[curr] = true;
//             System.out.print(curr+" ");
//             for(int i=0; i<graph[curr].size(); i++){
//                 Edge e = graph[curr].get(i);
//                 if(!vis[e.dest]){
//                     dfs(graph, e.dest, vis);
//                 }
//             }
//          }
//          public static void kosarajuAlgo(ArrayList<Edge> graph[], int V){
//             //step1 topology order in a stack store O(V+E)
//         Stack<Integer> s = new Stack<>();
//         boolean vis[] = new boolean[V];
//         for(int i=0; i<V; i++){
//            if(!vis[i]){
//             topSort(graph, i, vis, s);
//            }
//         }
//         //step2(V+E)
//         ArrayList<Edge> transpose[] = new ArrayList[V];
//         for(int i=0; i<graph.length; i++){
//             vis[i] = false;
//             transpose[i] = new ArrayList<Edge>();
//         }

//         //purane graph pr loop laga kai edges nikalana ek ek vertex pai and then neighbour edge
//         for(int i=0; i<V; i++){
//             for(int j=0; j<graph[i].size(); j++){
//                 Edge e = graph[i].get(j);
//                 transpose[e.dest].add(new Edge(e.dest, e.src));
//             }
//         }
//             //step3(V+E)
//             while(!s.isEmpty()){
//                 int curr = s.pop();
//                 if(!vis[curr]){
//                     dfs(transpose, curr, vis);
//                     System.out.println();
//                 }

//             }
//         }

//          public static void main(String args[]){
//          int V = 5;
//          ArrayList<Edge> graph[] = new ArrayList[V];
//          createGraph(graph);
//          kosarajuAlgo(graph, V);

//     }
// }

//Que11. Bridge in graph
// import java.util.*;

// public class Classroom1 {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;

//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();

//         }
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[0].add(new Edge(0, 3));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 2));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 1));

//         graph[3].add(new Edge(3, 0));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//     }

//     public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[], int dt[], int low[], int time, int par) {
//         vis[curr] = true;
//         dt[curr] = low[curr] = ++time;
//         for (int i = 0; i < graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if (e.dest == par) {
//                 continue;
//             } // neighboure unvisted
//             else if (!vis[e.dest]) {
//                 dfs(graph, e.dest, vis, dt, low, time, curr);
//                 low[curr] = Math.min(low[curr], low[e.dest]);
//                 if (dt[curr] < low[e.dest]) {
//                     System.out.println("bridge is:" + curr + "--" + e.dest);
//                 }
//                 // 3rd case visited kai liye
//             } else {
//                 low[curr] = Math.min(low[curr], dt[e.dest]);
//             }
//         }
//     }

//     public static void getBridge(ArrayList<Edge> graph[], int V) {
//         int dt[] = new int[V];
//         int low[] = new int[V];
//         int time = 0;
//         boolean vis[] = new boolean[V];
//         for (int i = 0; i < V; i++) {
//             if (!vis[i]) {
//                 dfs(graph, i, vis, dt, low, time, -1);
//             }
//         }

//     }

//     public static void main(String args[]) {
//         int V = 6;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         getBridge(graph, V);

//     }
// }

//Que12 articulation point (a vertex in an und graph if node remove disconnect graph known as ap)
import java.util.*;

public class Classroom1 {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();

        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }
    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int low[], boolean vis[], int time, boolean ap[]){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            int neigh = e.dest;
            //case1
            if(par == neigh){
                continue;
//case 2
            } else if(vis[neigh]){
                low[curr] = Math.min(low[curr], dt[neigh]);
                //case3
            } else {
                dfs(graph, neigh, curr,dt,low, vis, time,ap);
                low[curr] = Math.min(low[curr], low[neigh]);
                if(dt[curr] <= low[neigh] && par != -1){
                    ap[curr] = true;
                }
                children++;
            }
        }
        if(par == -1 && children >1){
            ap[curr] = true;
        }
    }
    public static void getAP(ArrayList<Edge> graph[], int V){
        int dt[] = new int [V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean ap[] =  new boolean[V];
        for(int i=0; i<V; i++){
           if(!vis[i]){
             dfs(graph, i, -1, dt, low, vis, time, ap);
           }
        }
        for (int i=0; i<V; i++){
            if(ap[i]){
                System.out.println("AP : "+i);
            }
        }

    }


    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getAP(graph, V);

    }
}
