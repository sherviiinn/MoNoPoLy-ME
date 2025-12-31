package model;

public class Tile {
    private int id;
    private TileType type;
    private String name;

    public Tile(int id, TileType type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }

    public int getId() { return id; }
    public TileType getType() { return type; }
    public String getName() { return name; }
}