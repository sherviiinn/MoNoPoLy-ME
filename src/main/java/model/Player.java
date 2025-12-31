package model;

public class Player {
    private int id;
    private String name;
    private int money;
    private int position;
    private boolean isInJail;

    public Player(int id, String name, int startingMoney) {
        this.id = id;
        this.name = name;
        this.money = startingMoney;
        this.position = 0;
        this.isInJail = false;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getMoney() { return money; }
    public void setMoney(int money) { this.money = money; }
    public int getPosition() { return position; }
    public void setPosition(int position) { this.position = position; }
    public boolean isInJail() { return isInJail; }
    public void setInJail(boolean inJail) { isInJail = inJail; }
}