package dominio;

public class ClasePunto {

    private int x = 0;
    private int y = 0;
    private int mover=0;

    public int getMover() {
        return mover;
    }

    public void setMover(int mover) {
        this.mover = mover;
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

    public String mostrar() {

        return this.x + ";" + this.y;
    }
}