package org.example.Board;

import org.example.Player.Player;

public abstract class Tile {
    protected int tileId;
    protected String name;
    protected TileType type;

    public Tile(int tileId, String name, TileType type) {
        this.tileId = tileId;
        this.name = name;
        this.type = type;
    }
    public abstract void onLand(Player player);
    public String getName() { return name; }
    public TileType getType() { return type; }
}