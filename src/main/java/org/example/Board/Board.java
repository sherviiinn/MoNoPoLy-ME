package org.example.Board;

import org.example.DS.CircularLinkedList;
import org.example.DS.Node;

public class Board {
    private CircularLinkedList<Tile> tiles;

    public Board() {
        tiles = new CircularLinkedList<>();
        initializeBoard();
    }

    private void initializeBoard() {
       //todo
    }

    public Node<Tile> getStartNode() {
        return tiles.getHeadNode();
    }

    public Node<Tile> getNextNode(Node<Tile> startNode, int steps) {
        Node<Tile> temp = startNode;
        for (int i = 0; i < steps; i++) {
            temp = temp.next;
        }
        return temp;
    }
}