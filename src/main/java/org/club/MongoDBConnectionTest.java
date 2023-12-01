package org.club;

import com.mongodb.MongoCredential;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
public class MongoDBConnectionTest {
    public static void main(String[] args) {
        // Replace these with your actual MongoDB connection details
        testMongoDBConnection(Constant.getConnectionString());
    }

    public static void testMongoDBConnection(String connectionString) {
        try {
            // Set up MongoDB connection credentials
            MongoCredential credential = MongoCredential.createCredential("computerscienceprojects2023", "sports_club_system", "mongodb4maringo".toCharArray());
            // Set up MongoClient settings
            MongoClient mongoClient = MongoClients.create(connectionString);
            // Test the connection by listing the available databases
            mongoClient.listDatabaseNames().forEach(System.out::println);
            // Close the MongoClient when done
            mongoClient.close();
            System.out.println("Connection test successful!");
        } catch (Exception e) {
            // Handle connection errors
            System.err.println("Connection test failed: " + e.getMessage());
        }
    }
}
