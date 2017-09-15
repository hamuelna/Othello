package logic.entity;

/**
 * Created by karn806 on 9/11/17.
 */
public class Cell {

    /**
     * cell coordinate
     */
    private int x;
    private int y;

    Coin coin;

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        String coordinate = String.format("(%d, %d)", x, y);
        if(coin == null) return " ";
        if(coin.color.equals(Color.WHITE)) return "W";
        return "B";
    }
}