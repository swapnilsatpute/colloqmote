import java.io.InputStream;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Robot;
public class Accelerometer extends javax.swing.JFrame implements ChangeListener{
    Robot key;					//robot class is use to generate key strokes 
    public boolean start=true;			
    Bluetooth pcclient;
    boolean connect=false;
	private javax.swing.JButton jButton1;
   private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSlider jSlider1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
  
    public Accelerometer(Bluetooth pcclient) {
         try
            {
            key=new Robot();
            }
            catch(Exception e)
            {
                pcclient.log(e);
            }
        this.pcclient=pcclient;
        initComponents();
        this.setVisible(true);
       }

    /** This method is called from within the constructor to
     * initialize the form.
     */
   

//following code generated Bluetooth form(GUI creation)
       private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider(0,1000,1000);// the slider value varies from 0-1000(But.in GUI it is shown in %)
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("   X                                         Y                                        Z   ");

        jTextField2.setEditable(false);
        jTextField2.setText(" 000");

        jTextField3.setEditable(false);
        jTextField3.setText("  000");

        jTextField4.setEditable(false);
        jTextField4.setText(" 000");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("Sensitivity:");

        jLabel3.setText("0%");

        jLabel4.setText("100%");

        jTextField5.setEditable(false);
        jTextField5.setText("100");

        jLabel5.setText("%");

        jButton1.setText("Pause");

        jSlider1.addChangeListener(this);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(98, 98, 98)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton1)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
         jButton1.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent ae)
            {
                    start=!start;
                    if(start==false)
                        jButton1.setText("Start");
                    else
                         jButton1.setText("Pause");
                    
           }
         });
    }
   public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
        if (source.getValueIsAdjusting()) {
                 this.jTextField5.setText(source.getValue()/10+"");
        }
        }
   void readxyz(InputStream in)
    {
       byte[] sen=new byte[3];

       while(connect)
       {

           try{

                      in.read(sen);  //gets x,y,z values from mobile
           }
           catch(Exception e){
            pcclient.log(e);
                  }
  if(start)//skip values depending on sensitivity 
           {           
						if(sen[0]==100&&sen[1]==100&&sen[2]==100)
                                                {
                                                    connect = false;//disconnect if StopToken is received i.e. (100,100,100)
                                                   }

					/*
					*Accelrometer co-ordinate range is from -70 to +70 ( particularly for nokia 5800 mobile)
					* The range may vary from device to device depending on the accelrometer sensor resolution
					* Array 'sen' contains accelerometer co-ordinate values ==>
					* sen[0]=x co-ordinate value
					* sen[1]=y co-ordinate value
					* sen[2]=z co-ordinate value
					*
					*These values are unsigned so 256 is subtracted to convert them to signed format for simplicity
					*/

                                                    if(sen[0]>70)
                                                    sen[0]=(byte)(sen[0]-256);
                                                    if(sen[1]>70)
                                                        sen[1]=(byte)(sen[1]-256);
                                                    if(sen[2]>70)
                                                        sen[2]=(byte)(sen[2]-256);
						//log("Read " + sen[0]+"  "+sen[1]);       prints data in log
                                                     jTextField2.setText(" "+sen[0]+" ");
                                        jTextField3.setText(" "+sen[1]+" ");
                                        jTextField4.setText(" "+sen[2]+" ");

						
                                                if(sen[0]>=20 && sen[0]<=40)
                                                {
						/*Threads like this are created to adjust the sensitivity value corrosponding to slider(jslider1)
						* when the thread is sleeping the received co-ordinate values are skipped hence no event is performed for 
						*((1000-jSlider1.getValue()) milisec.
						*/
                                                    Thread t=new Thread(){
                                                    public  void run()
                                                        {
                                                                start=false;//Start skipping
                                                                try
                                                                {
                                                                   Thread.sleep(1000-jSlider1.getValue());
                                                                }
                                                                catch(Exception e)
                                                                {

                                                                }
                                                                start=true;//Stop skipping

                                                    }
                                                    
                                                    };
                                                    t.start();
                                                 
                                                }


                                               else if(sen[0]<=-20&&sen[0]>=-40)
                                                {

                                         

                                                    Thread t=new Thread(){
                                                    public  void run()
                                                        {
                                                                start=false;
                                                                try
                                                                {
                                                                   Thread.sleep(1000-jSlider1.getValue());
                                                                }
                                                                catch(Exception e)
                                                                {

                                                                }
                                                                start=true;

                                                    }
                                                    };
                                                t.start();
                                                  
                                                }


 						else if (sen[1] >= 20 && sen[1] <= 40)
                                              {

                                          

                                                    Thread t=new Thread(){
                                                    public  void run()
                                                        {
                                                                start=false;
                                                                try
                                                                {
                                                                   Thread.sleep(1000-jSlider1.getValue());
                                                                }
                                                                catch(Exception e)
                                                                {

                                                                }
                                                                start=true;

                                                    }
                                                    };
                                                
                                                t.start();
                                                    }

        					   else if(sen[1] <= -20 && sen[1] >= -40)
                                              {

                                        

                                                    Thread t=new Thread(){
                                                    public  void run()
                                                        {
                                                                start=false;
                                                                try
                                                                {
                                                                   Thread.sleep(1000-jSlider1.getValue());
                                                                }
                                                                catch(Exception e)
                                                                {

                                                                }
                                                                start=true;

                                                    }
                                                    };
                                                  
                                                t.start();
                                                    }

                                                if(sen[0]>20)
                                                {

                                                    key.keyPress(KeyEvent.VK_DOWN);//generates down key stroke

                                                }


                                                if(sen[0]<-20)
                                                {
                                                    key.keyPress(KeyEvent.VK_UP);//generates up key stroke
                                                    
                                                }
                                                    if(sen[1]>20)
                                                    {
                                                    key.keyPress(KeyEvent.VK_RIGHT);//generates right key stroke
                                                    }

                                                if(sen[1]<-20)
                                                {

                                                      key.keyPress(KeyEvent.VK_LEFT);//generates left key stroke
                                                }
                            
        
      }

        }
   }
 
 
 
}
