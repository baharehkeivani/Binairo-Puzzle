public class Coordinates {
    private int x;
    private int y;
    private String value;

    public Coordinates(int x, int y, String value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {return x;}

    public int getY() {return y;}

    public String getValue() {return value;}

    public void setValue(String value) {this.value = value;}
}
