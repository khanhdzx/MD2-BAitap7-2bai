package Bai1;

public class RectangleTest {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3,5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5,3.8,"orange",true);
//        System.out.println(rectangle);
        Rectangle[] rectangles =new Rectangle[3];
        rectangles[0]= new Rectangle(2.3,5.8);
        rectangles[1]=new Rectangle(2.5,5.9,"red",false);
        rectangles[2]=new Rectangle(2.6,3.8,"green",true);
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i]);
        }
    }

}
