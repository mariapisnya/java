package cw8;

import java.util.ArrayList;
import java.util.List;

/**
 * task 1
 * @author Pisnia Mariia
 */

class Connection {
    int filed;
}

public class ConnectionManager {
    private static final int MAX_CONNECTIONS = 10;
    private static List<Connection> connections = new ArrayList<>();

    static {
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            connections.add(new Connection());
        }
    }

    public static Connection getConnection() {
        if (!connections.isEmpty()) {
            return connections.remove(0);
        } else {
            throw new RuntimeException("No available connections");
        }
    }

    public static void releaseConnection(Connection connection) {
        if (connections.size() < MAX_CONNECTIONS) {
            connections.add(connection);
        } else {
            System.out.println("Connection pool is full");
        }
    }

    public static void main(String[] args) {
        Connection connection1 = ConnectionManager.getConnection();
        Connection connection2 = ConnectionManager.getConnection();
        ConnectionManager.releaseConnection(connection1);
        ConnectionManager.releaseConnection(connection2);
    }
}