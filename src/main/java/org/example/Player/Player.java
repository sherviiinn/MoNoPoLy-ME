package org.example.Player;

import org.example.Board.Property;
import org.example.Board.Tile;
import org.example.DS.LinkedList;
import org.example.DS.Node;

public class Player {
    private float balance;
    private String name;
    private int id;
    private Node<Tile> currentPosition;
    private LinkedList<Property> ownedProperties;
    public Player(float balance, String name, int id, Node<Tile> startNode ) {
        this.balance = balance;
        this.name = name;
        this.id = id;
        this.currentPosition = startNode;
        this.ownedProperties = new LinkedList<>();

    }


    public void move(int steps) {
        for (int i = 0; i < steps; i++) {
            if (currentPosition != null) {
                currentPosition = currentPosition.next;
            }
        }
    }
    public void addProperty(Property p) {
        ownedProperties.add(p);
    }
    public String getName() { return name; }
    public int getId() { return id; }
    public float getBalance() { return balance; }
    public void setBalance(float balance) { this.balance = balance; }

    public Node<Tile> getCurrentPositionNode() { return currentPosition; }
    public Tile getCurrentTile() { return currentPosition.data; }
}