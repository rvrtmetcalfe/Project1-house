/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square sqr;
    private Circle circ;
    private Triangle tri;



    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {


        int sqrxpos=0;
        int sqrypos=300;
        int sqrsize=500;



            
            for(int i=1;i<=22;i++)
            {

                if(i==1)
                {
                    sqr = new Square();
                    sqr.changeColor("magenta");
                    sqr.setxPosition(0);
                    sqr.setyPosition(300);
                    sqr.changeSize(sqrsize);
                    sqr.makeVisible();
                    sqr.slowMoveVertical(-300);
                }
                else if(i%2==0) {
                    sqr = new Square();
                    sqr.changeColor("black");
                    sqr.setxPosition(sqrxpos);
                    sqr.setyPosition(sqrypos);
                    sqrsize -= 20;
                    sqr.changeSize(sqrsize);
                    sqr.makeVisible();

                    sqr.slowMoveVertical(-300);
                }
                else{
                    sqr = new Square();
                    sqr.changeColor("magenta");

                    sqr.setxPosition(sqrxpos);
                    sqr.setyPosition(sqrypos);
                    sqrsize -= 20;
                    sqr.changeSize(sqrsize);
                    sqr.makeVisible();

                    sqr.slowMoveVertical(-300);
                }
                sqrxpos += 10;
                sqrypos += 10;

            }
        sqr = new Square();
        sqr.changeSize(289);
        sqr.setxPosition(105);
        sqr.setyPosition(-300);
        sqr.changeColor("red");
        sqr.makeVisible();
        sqr.slowMoveVertical(305);

        circ = new Circle();
        circ.setxPosition(105);
        circ.setyPosition(300);
        circ.changeColor("blue");
        circ.changeSize(289);
        circ.makeVisible();
        circ.slowMoveVertical(-295);

        sqr = new Square();
        sqr.changeSize(1000);
        sqr.setxPosition(0);
        sqr.setyPosition(300);
        sqr.changeColor("black");
        sqr.makeVisible();
        sqr.slowMoveVertical(-90);

        tri = new Triangle();
        tri.setxPosition(250);
        tri.setyPosition(300);
        tri.changeSize(216, 250);
        tri.changeColor("yellow");
        tri.makeVisible();
        tri.slowMoveVertical(-290);

        tri = new Triangle();
        tri.setxPosition(250);
        tri.setyPosition(300);
        tri.changeSize(54, 63);
        tri.changeColor("black");
        tri.makeVisible();
        tri.slowMoveVertical(-177);



        int width=2000;
        int height =(int)(width*0.2);
        for(int i=1;i<=40;i++) {

            if(i==1)
            {
                tri = new Triangle();
                tri.changeColor("green");
                tri.setxPosition(250);
                tri.setyPosition(300);
                tri.changeSize(height, width);
                tri.makeVisible();
                width = width - (width / 10);
                tri.slowMoveVertical(-140);
            }
            else if(i%2==0) {
                tri = new Triangle();
                tri.changeColor("black");
                tri.setxPosition(250);
                tri.setyPosition(300);
                tri.changeSize(height, width);
                tri.makeVisible();
                width = width - (width / 10);
                tri.slowMoveVertical(-140);
            }
            else{
                tri = new Triangle();
                tri.changeColor("green");
                tri.setxPosition(250);
                tri.setyPosition(300);
                tri.changeSize(height, width);
                tri.makeVisible();
                width = width - (width / 10);
                tri.slowMoveVertical(-140);
            }

        }
        tri = new Triangle();
        tri.setxPosition(250);
        tri.setyPosition(0);
        tri.changeSize(50, 59);
        tri.changeColor("white");
        tri.makeVisible();
        tri.slowMoveVertical(125);


        



        

    }


    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (sqr != null)   // only if it's painted already...
        {

            
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (sqr != null)   // only if it's painted already...
        {
            sqr.changeColor("red");
           
        }
    }
}
