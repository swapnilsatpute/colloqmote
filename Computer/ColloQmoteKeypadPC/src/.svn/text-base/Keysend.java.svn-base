import java.awt.event.*;
import java.io.InputStream;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class Keysend extends javax.swing.JFrame {
	
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox16;
    private javax.swing.JComboBox jComboBox17;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
 
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    Robot key;						//Robot class is used for generation of key strokes
    Bluetooth pcclient;	
    public Keysend(Bluetooth pcclient) {
            try
        {
           key=new Robot();
        }
        catch(Exception e){}
        this.pcclient=pcclient;
        this.initComponents();
        setVisible(true);
    }
     boolean send=true;

	//'presentvalues' is array which contains current bindings of mobile keys with keyboard keys
 int[] presentvalues={-1,KeyEvent.VK_UP,-1,KeyEvent.VK_LEFT,KeyEvent.VK_ENTER,KeyEvent.VK_RIGHT,-1,KeyEvent.VK_DOWN,-1,-1,KeyEvent.VK_SPACE,-1,KeyEvent.VK_UP,KeyEvent.VK_LEFT,KeyEvent.VK_RIGHT,KeyEvent.VK_SPACE,KeyEvent.VK_DOWN};

//(-1 indicates no key is bound)

  public void keypressvar(InputStream in)
    {

      int value=0;
           while(send)
                {
                    try{
                      value=in.read();       //gets the ASCII value of the key which is pressed in mobile
                      //this.pcclient.log(value+"");   

                        if(value==-1)//-1 is send when port from mobile side is closed
                        send=false;


                    switch(value)
                    {
           //Cases for generating keystrokes according to bound key
                        
                        case 49:
                            if(this.presentvalues[0]>0)
                            key.keyPress(this.presentvalues[0]);
                            break;
                        case 50:
                            if(this.presentvalues[1]>0)
                            key.keyPress(this.presentvalues[1]);
                            break;
                        case 51:
                            if(this.presentvalues[2]>0)
                            key.keyPress(this.presentvalues[2]);
                            break;
                        case 52:
                            if(this.presentvalues[3]>0)
                            key.keyPress(this.presentvalues[3]);
                            break;
                        case 53:
                            if(this.presentvalues[4]>0)
                            key.keyPress(this.presentvalues[4]);
                            break;
                        case 54:
                            if(this.presentvalues[5]>0)
                            key.keyPress(this.presentvalues[5]);
                            break;
                        case 55:
                            if(this.presentvalues[6]>0)
                            key.keyPress(this.presentvalues[6]);
                            break;
                        case 56:
                            if(this.presentvalues[7]>0)
                            key.keyPress(this.presentvalues[7]);
                            break;
                        case 57:
                            if(this.presentvalues[8]>0)
                            key.keyPress(this.presentvalues[8]);
                            break;
                        case 42:
                            if(this.presentvalues[9]>0)
                            key.keyPress(this.presentvalues[9]);
                            break;
                        case 48:
                            if(this.presentvalues[10]>0)
                            key.keyPress(this.presentvalues[10]);
                            break;
                        case 35:
                            if(this.presentvalues[11]>0)
                            key.keyPress(this.presentvalues[11]);
                            break;
                        case 255:
                             if(this.presentvalues[12]>0)
                            key.keyPress(this.presentvalues[12]);
                            break;
                        case 253:
                             if(this.presentvalues[13]>0)
                            key.keyPress(this.presentvalues[13]);
                            break;
                        case 252:
                                 if(this.presentvalues[14]>0)
                            key.keyPress(this.presentvalues[14]);
                            break;

                            //15pending
                        case 254:
                                 if(this.presentvalues[16]>0)
                            key.keyPress(this.presentvalues[16]);
                            break;
                           
                    }
          }
          catch(Exception e)
          {

          }
                  

      }
  }

//Creating GUI	
    private void initComponents() {
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jComboBox11 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox13 = new javax.swing.JComboBox();
        jComboBox14 = new javax.swing.JComboBox();
        jComboBox15 = new javax.swing.JComboBox();
        jComboBox16 = new javax.swing.JComboBox();
        jComboBox17 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

//Combo box creation and Initialisation
        
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jLabel1.setText("          1:");

        jLabel2.setText("2:");

        jLabel3.setText("3:");

        jLabel4.setText("4:");

        jLabel5.setText("5:");

        jLabel6.setText("6:");

        jLabel7.setText("7:");

        jLabel8.setText("8:");

        jLabel9.setText("9:");

        jLabel10.setText("*:");

        jLabel11.setText("          0:");

        jLabel12.setText("          #:");

        jButton1.setText("Done");

        jButton2.setText("Set Defaults");


        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALT", "CNTRL", "SHIFT", "TAB" , "ENTER", "UP", "DOWN", "LEFT", "RIGHT", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12","NULL","SPACE"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)
                        .addGap(30, 30, 30)))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(82, 82, 82)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jButton2))
        );

    final javax.swing.JComboBox[] jcombo={jComboBox1,jComboBox2,jComboBox3,jComboBox4,jComboBox5,jComboBox6,jComboBox7,jComboBox8,jComboBox9,jComboBox10,jComboBox11,jComboBox12,jComboBox13,jComboBox14,jComboBox15,jComboBox16,jComboBox17};



//default values(initial values)
                         presentvalues[0]=-1;
                         presentvalues[1]=KeyEvent.VK_UP;
                         presentvalues[2]=-1;
                         presentvalues[3]=KeyEvent.VK_LEFT;
                         presentvalues[4]=KeyEvent.VK_ENTER;
                         presentvalues[5]=KeyEvent.VK_RIGHT;
                         presentvalues[6]=-1;
                         presentvalues[7]=KeyEvent.VK_DOWN;
                         presentvalues[8]=-1;
                         presentvalues[9]=-1;
                         presentvalues[10]=KeyEvent.VK_SPACE;
                         presentvalues[11]=-1;
                         presentvalues[12]=KeyEvent.VK_UP;
                         presentvalues[13]=KeyEvent.VK_LEFT;
                         presentvalues[14]=KeyEvent.VK_RIGHT;
                         presentvalues[15]=KeyEvent.VK_SPACE;
                         presentvalues[16]=KeyEvent.VK_DOWN;

//selects initial values of combo box
                         jComboBox1.setSelectedIndex(57);
                         jComboBox3.setSelectedIndex(57);
                         jComboBox5.setSelectedIndex(4);
                         jComboBox7.setSelectedIndex(57);
                         jComboBox9.setSelectedIndex(57);
                         jComboBox10.setSelectedIndex(57);
                         jComboBox12.setSelectedIndex(57);
                         jComboBox2.setSelectedIndex(5);
                         jComboBox4.setSelectedIndex(7);
                         jComboBox6.setSelectedIndex(8);
                         jComboBox8.setSelectedIndex(6);
                         jComboBox11.setSelectedIndex(58);
                         jComboBox13.setSelectedIndex(5);
                         jComboBox14.setSelectedIndex(7);
                         jComboBox15.setSelectedIndex(8);
                         jComboBox16.setSelectedIndex(58);
                         jComboBox17.setSelectedIndex(6);

//saves setting according to combo box values(user setting)
    jButton1.addActionListener(new ActionListener()
        {            
           public void actionPerformed(ActionEvent ae)
            {
        
               for(int i=0;i<17;i++)
               {
                   switch (jcombo[i].getSelectedIndex())
        {
            case 0:presentvalues[i]=KeyEvent.VK_ALT;break;
            case 1:presentvalues[i]=KeyEvent.VK_CONTROL;break;
            case 2:presentvalues[i]=KeyEvent.VK_SHIFT;break;
            case 3:presentvalues[i]=KeyEvent.VK_TAB;break;
            case 4:presentvalues[i]=KeyEvent.VK_ENTER;break;
            case 5:presentvalues[i]=KeyEvent.VK_UP;break;
            case 6:presentvalues[i]=KeyEvent.VK_DOWN;break;
            case 7:presentvalues[i]=KeyEvent.VK_LEFT;break;
            case 8:presentvalues[i]=KeyEvent.VK_RIGHT;break;
            case 9:presentvalues[i]=KeyEvent.VK_0;break;
            case 10:presentvalues[i]=KeyEvent.VK_1;break;
            case 11:presentvalues[i]=KeyEvent.VK_2;break;
            case 12:presentvalues[i]=KeyEvent.VK_3;break;
            case 13:presentvalues[i]=KeyEvent.VK_4;break;
            case 14:presentvalues[i]=KeyEvent.VK_5;break;
            case 15:presentvalues[i]=KeyEvent.VK_6;break;
            case 16:presentvalues[i]=KeyEvent.VK_7;break;
            case 17:presentvalues[i]=KeyEvent.VK_8;break;
            case 18:presentvalues[i]=KeyEvent.VK_9;break;
            case 19:presentvalues[i]=KeyEvent.VK_A;break;
            case 20:presentvalues[i]=KeyEvent.VK_B;break;
            case 21:presentvalues[i]=KeyEvent.VK_C;break;
            case 22:presentvalues[i]=KeyEvent.VK_D;break;
            case 23:presentvalues[i]=KeyEvent.VK_E;break;
            case 24:presentvalues[i]=KeyEvent.VK_F;break;
            case 25:presentvalues[i]=KeyEvent.VK_G;break;
            case 26:presentvalues[i]=KeyEvent.VK_H;break;
            case 27:presentvalues[i]=KeyEvent.VK_I;break;
            case 28:presentvalues[i]=KeyEvent.VK_J;break;
            case 29:presentvalues[i]=KeyEvent.VK_K;break;
            case 30:presentvalues[i]=KeyEvent.VK_L;break;
            case 31:presentvalues[i]=KeyEvent.VK_M;break;
            case 32:presentvalues[i]=KeyEvent.VK_N;break;
            case 33:presentvalues[i]=KeyEvent.VK_O;break;
            case 34:presentvalues[i]=KeyEvent.VK_P;break;
            case 35:presentvalues[i]=KeyEvent.VK_Q;break;
            case 36:presentvalues[i]=KeyEvent.VK_R;break;
            case 37:presentvalues[i]=KeyEvent.VK_S;break;
            case 38:presentvalues[i]=KeyEvent.VK_T;break;
            case 39:presentvalues[i]=KeyEvent.VK_U;break;
            case 40:presentvalues[i]=KeyEvent.VK_V;break;
            case 41:presentvalues[i]=KeyEvent.VK_W;break;
            case 42:presentvalues[i]=KeyEvent.VK_X;break;
            case 43:presentvalues[i]=KeyEvent.VK_Y;break;
            case 44:presentvalues[i]=KeyEvent.VK_Z;break;
            case 45:presentvalues[i]=KeyEvent.VK_F1;break;
            case 46:presentvalues[i]=KeyEvent.VK_F2;break;
            case 47:presentvalues[i]=KeyEvent.VK_F3;break;
            case 48:presentvalues[i]=KeyEvent.VK_F4;break;
            case 49:presentvalues[i]=KeyEvent.VK_F5;break;
            case 50:presentvalues[i]=KeyEvent.VK_F6;break;
            case 51:presentvalues[i]=KeyEvent.VK_F7;break;
            case 52:presentvalues[i]=KeyEvent.VK_F8;break;
            case 53:presentvalues[i]=KeyEvent.VK_F9;break;
            case 54:presentvalues[i]=KeyEvent.VK_F10;break;
            case 55:presentvalues[i]=KeyEvent.VK_F11;break;
            case 56:presentvalues[i]=KeyEvent.VK_F12;break;
            case 57:presentvalues[i]=-1;break;
            case 58:presentvalues[i]=KeyEvent.VK_SPACE;break;
                   }
                }
            }
        });
//sets default values 
//	- sets combo box
//	- set 'presentvalues' array
        jButton2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {

                         presentvalues[0]=-1;
                         presentvalues[1]=KeyEvent.VK_UP;
                         presentvalues[2]=-1;
                         presentvalues[3]=KeyEvent.VK_LEFT;
                         presentvalues[4]=KeyEvent.VK_ENTER;
                         presentvalues[5]=KeyEvent.VK_RIGHT;
                         presentvalues[6]=KeyEvent.VK_ENTER;
                         presentvalues[7]=KeyEvent.VK_DOWN;
                         presentvalues[8]=-1;
                         presentvalues[9]=-1;
                         presentvalues[10]=KeyEvent.VK_SPACE;
                         presentvalues[11]=-1;
                         presentvalues[12]=KeyEvent.VK_UP;
                         presentvalues[13]=KeyEvent.VK_LEFT;
                         presentvalues[14]=KeyEvent.VK_RIGHT;
                         presentvalues[15]=KeyEvent.VK_SPACE;
                         presentvalues[16]=KeyEvent.VK_DOWN;

                         jComboBox1.setSelectedIndex(57);
                         jComboBox3.setSelectedIndex(57);
                         jComboBox5.setSelectedIndex(4);
                         jComboBox7.setSelectedIndex(57);
                         jComboBox9.setSelectedIndex(57);
                         jComboBox10.setSelectedIndex(57);
                         jComboBox12.setSelectedIndex(57);
                         jComboBox2.setSelectedIndex(5);
                         jComboBox4.setSelectedIndex(7);
                         jComboBox6.setSelectedIndex(8);
                         jComboBox8.setSelectedIndex(6);
                         jComboBox11.setSelectedIndex(58);
                         jComboBox13.setSelectedIndex(5);
                         jComboBox14.setSelectedIndex(7);
                         jComboBox15.setSelectedIndex(8);
                         jComboBox16.setSelectedIndex(58);
                         jComboBox17.setSelectedIndex(6);

            }
           
       
    }) ;
        pack();
        jComboBox16.setEnabled(false); //Spare if for OK button if some ASCII is associated with it.
}
    

 }
