import java.util.*;

class PathVector {
    String destination;
    List<String> path;
    int cost;

    public PathVector(String destination, List<String> path, int cost) {
        this.destination = destination;
        this.path = new ArrayList<>(path);
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Dest: " + destination + ", Path: " + path + ", Cost: " + cost;
    }
}

class Router {
    String name;
    Map<String, PathVector> routingTable;
    List<Router> neighbors;

    public Router(String name) {
        this.name = name;
        this.routingTable = new HashMap<>();
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Router neighbor) {
        neighbors.add(neighbor);
    }

    public void addInitialPath(String destination, int cost) {
        routingTable.put(destination, new PathVector(destination, Arrays.asList(name), cost));
    }

    public void exchangeRoutes() {
        for (Router neighbor : neighbors) {
            for (PathVector pv : routingTable.values()) {
                if (!pv.path.contains(neighbor.name)) { // Avoid loops
                    List<String> newPath = new ArrayList<>(pv.path);
                    newPath.add(neighbor.name);
                    int newCost = pv.cost + 1;

                    if (!neighbor.routingTable.containsKey(pv.destination) ||
                            neighbor.routingTable.get(pv.destination).cost > newCost) {
                        neighbor.routingTable.put(pv.destination, new PathVector(pv.destination, newPath, newCost));
                    }
                }
            }
        }
    }

    public void printRoutingTable() {
        System.out.println("Routing Table for " + name + ":");
        for (PathVector pv : routingTable.values()) {
            System.out.println(pv);
        }
        System.out.println();
    }
}

public class PathVectorRouting {
    public static void main(String[] args) {
        Router A = new Router("A");
        Router B = new Router("B");
        Router C = new Router("C");
        Router D = new Router("D");

        // Creating connections
        A.addNeighbor(B);
        B.addNeighbor(A);
        B.addNeighbor(C);
        C.addNeighbor(B);
        C.addNeighbor(D);
        D.addNeighbor(C);

        // Initial paths
        A.addInitialPath("A", 0);
        B.addInitialPath("B", 0);
        C.addInitialPath("C", 0);
        D.addInitialPath("D", 0);

        // Simulating path vector routing updates
        for (int i = 0; i < 3; i++) { // Iterate multiple times to converge
            A.exchangeRoutes();
            B.exchangeRoutes();
            C.exchangeRoutes();
            D.exchangeRoutes();
        }

        // Display routing tables
        A.printRoutingTable();
        B.printRoutingTable();
        C.printRoutingTable();
        D.printRoutingTable();
    }
}