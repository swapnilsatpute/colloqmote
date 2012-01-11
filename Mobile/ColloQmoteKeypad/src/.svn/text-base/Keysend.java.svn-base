
import javax.microedition.lcdui.*;

 public class Keysend extends Canvas{
    String msg;
    int width=getWidth(),height=getHeight();                             //getting max co-ordinates for mobile screen
    int k;
    Bluetooth m;
    public Keysend(Bluetooth m)
    {
        this.m=m;
    }


    public void keyPressed (int key)
    {
        k=key;
        m.send(k);                                                     //sends ascii of button pressed
        switch(k)                                                      //displays which key is pressed
        {
            case -1:msg="UP";break;
            case -2:msg = "DOWN";break;
            case -3:msg="LEFT";break;
            case -4:msg="RIGHT";break;
            case 49:msg="1";break;
            case 35:msg="#";break;
            case 50:msg="2";break;
            case 51:msg="3";break;
            case 52:msg="4";break;
            case 53:msg="5";break;
            case 54:msg="6";break;
            case 55:msg="7";break;
            case 56:msg="8";break;
            case 57:msg="9";break;
            case 42:msg="*";break;
            case 48:msg="0";break;

        }
        repaint();                                                    //repainting of screen
    }

	
    public void paint(Graphics g)
    {
        g.setColor(0,0,0);
        g.fillRect(0, 0, width, height);
        g.setColor(255,255,255);
        g.drawString("Connected", 10, 10, Graphics.TOP|Graphics.LEFT);
          
        g.drawString("KeyPressed:"+msg+"("+ k +")",20, 50, Graphics.TOP|Graphics.LEFT);
    }

}
