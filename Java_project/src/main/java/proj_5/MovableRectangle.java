package proj_5;
//import practis_4.company.Retangle;

public class MovableRectangle extends Retangle implements Movable{

    MovablePoint TopLeft;
    MovablePoint BottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2){
        TopLeft = new MovablePoint(x1, y1);
        BottomRight = new MovablePoint(x2, y2);
        width = y1-y2;
        length = x2-x1;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        int length1 = (int) length;
        BottomRight.setX(TopLeft.getX()+length1);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        int width1 = (int) width;
        TopLeft.setY(BottomRight.getY()+width1);
    }

    public void Check(){
        if (width== TopLeft.getY() - BottomRight.getY() && length== BottomRight.getX() - TopLeft.getX()) {
            System.out.println("Okay");
        }
        else {
            System.out.println("Not okay");
        }
    }

    @Override
    public void move(int right, int up) {
        TopLeft.setX(TopLeft.getX() + right);
        TopLeft.setY(TopLeft.getY() + up);
        BottomRight.setX(BottomRight.getX() + right);
        BottomRight.setY(BottomRight.getY() + up);
        Check();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "TopLeft=" + TopLeft +
                ", BottomRight=" + BottomRight +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
