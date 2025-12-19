package org.example.Board;

import org.example.Player.Player;

public class Property extends Tile {
    private int price;
    private int rent;
    private int ownerId = -1;
    private ColorGroup colorGroup;
    private int houseCount = 0;
    private boolean isMortgaged = false;

    public Property(int id, String name, int price, int rent, ColorGroup colorGroup) {
        super(id, name, TileType.PROPERTY);
        this.price = price;
        this.rent = rent;
        this.colorGroup = colorGroup;
    }

    public int getPrice() { return price; }
    public int getRent() {
        return rent;
    }
    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }
    public int getOwnerId() { return ownerId; }

    @Override
    public void onLand(Player player) {
        //todo
    }
}