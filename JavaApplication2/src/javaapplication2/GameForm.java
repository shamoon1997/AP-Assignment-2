/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

/**123
 *
 * @author SHAMOON SHAHID
 */
public class GameForm extends javax.swing.JFrame {
    int turn_adjuster=0 ;
    String Player_name ;
    String option ;
    String Computer_option="X" ;
    int button_pressed[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int computer_winner_checker[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int Player_winner_checker[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int Previous_button_pressed ;

    
    
    /**
     * Creates new form GameForm
     */
    
    
    public boolean main_Logic()
    {
        return false  ;
    }
    public GameForm(String playernn,String user_option) {
        initComponents();
        Player_name=playernn;
        option=user_option ;
        jLabel2.setText(Player_name);
        if(option.equals(Computer_option))
        {
            Computer_option="O" ;
        }
        else
        {
            Computer_option="X" ;
        }
        Random rand = new Random();
          int randomInteger = rand.nextInt(16);
          if(randomInteger==1)
          {
              jButton1.setText(Computer_option);
              button_pressed[0]=1 ;
              jButton1.setBackground(Color.GREEN);
              computer_winner_checker[0]=1 ;
               Previous_button_pressed=1;
          }
        else if (randomInteger==2){
          
               jButton2.setText(Computer_option);
               button_pressed[1]=1 ;
               jButton2.setBackground(Color.GREEN);
               computer_winner_checker[1]=1 ;
                Previous_button_pressed=2;
          }
          else if (randomInteger==3)
          {
               jButton3.setText(Computer_option);
               button_pressed[2]=1 ;
               jButton3.setBackground(Color.GREEN);
               computer_winner_checker[2]=1 ;
                Previous_button_pressed=3;
          }
          else if (randomInteger==4)
          {
               jButton4.setText(Computer_option);
               button_pressed[3]=1 ;
               jButton4.setBackground(Color.GREEN);
               computer_winner_checker[3]=1 ;
                Previous_button_pressed=4;
          }
          else if (randomInteger==5)
          {
               jButton5.setText(Computer_option);
               button_pressed[4]=1 ;
               jButton5.setBackground(Color.GREEN);
               computer_winner_checker[4]=1 ;
                Previous_button_pressed=5;
          }
        else if (randomInteger==6)
          {
               jButton6.setText(Computer_option);
               button_pressed[5]=1 ;
               jButton6.setBackground(Color.GREEN);
               computer_winner_checker[5]=1 ;
                Previous_button_pressed=6;
          }
        else if (randomInteger==7)
          {
               jButton7.setText(Computer_option);
               button_pressed[6]=1 ;
               jButton7.setBackground(Color.GREEN);
               computer_winner_checker[6]=1 ;
                Previous_button_pressed=7;
          }
        else if (randomInteger==8)
          {
               jButton8.setText(Computer_option);
               button_pressed[7]=1 ;
               jButton8.setBackground(Color.GREEN);
               computer_winner_checker[7]=1 ;
                Previous_button_pressed=8;
          }
        else if (randomInteger==9)
          {
               jButton9.setText(Computer_option);
               button_pressed[8]=1 ;
               jButton9.setBackground(Color.GREEN);
               computer_winner_checker[8]=1 ;
                Previous_button_pressed=9;
          }
        else if (randomInteger==10)
          {
               jButton10.setText(Computer_option);
               button_pressed[9]=1 ;
               jButton10.setBackground(Color.GREEN);
               computer_winner_checker[9]=1 ;
                Previous_button_pressed=10;
          }
        else if (randomInteger==11)
          {
               jButton11.setText(Computer_option);
               button_pressed[10]=1 ;
               jButton11.setBackground(Color.GREEN);
               computer_winner_checker[10]=1 ;
                Previous_button_pressed=11;
          }
        else if (randomInteger==12)
          {
               jButton12.setText(Computer_option);
               button_pressed[11]=1 ;
               jButton12.setBackground(Color.GREEN);
               computer_winner_checker[11]=1 ;
                Previous_button_pressed=12;
          }
        else if (randomInteger==13)
          {
               jButton13.setText(Computer_option);
               button_pressed[12]=1 ;
               jButton13.setBackground(Color.GREEN);
               computer_winner_checker[12]=1 ;
                Previous_button_pressed=13;
          }
        else if (randomInteger==14)
          {
               jButton14.setText(Computer_option);
               button_pressed[13]=1 ;
               jButton14.setBackground(Color.GREEN);
               computer_winner_checker[13]=1 ;
                Previous_button_pressed=14;
          }
        else if (randomInteger==15)
          {
               jButton15.setText(Computer_option);
               button_pressed[14]=1 ;
               jButton15.setBackground(Color.GREEN);
               computer_winner_checker[14]=1 ;
                Previous_button_pressed=15;
          }
        else if (randomInteger==16)
          {
               jButton16.setText(Computer_option);
               button_pressed[15]=1 ;
               jButton16.setBackground(Color.GREEN);
               computer_winner_checker[15]=1 ;
                Previous_button_pressed=16;
          }
        
        
        
        
        
        
        
        
        
        
    }
    void main_logic_checker()
    {
          String b1=jButton1.getText();
         String b2=jButton2.getText();
         String b3=jButton3.getText();
         String b4=jButton4.getText();
         String b5=jButton5.getText();
         String b6=jButton6.getText();
         String b7=jButton7.getText();
         String b8=jButton8.getText();
         String b9=jButton9.getText();
         String b10=jButton10.getText();
         String b11=jButton11.getText();
         String b12=jButton12.getText();
         String b13=jButton13.getText();
         String b14=jButton14.getText();
         String b15=jButton15.getText();
         String b16=jButton16.getText();
         boolean flag=true ;
         if(b1.equals(Computer_option) && (b2 == null ? Computer_option == null : b2.equals(Computer_option)) && b3.equals(Computer_option))
         {
         jButton4.setText(Computer_option);
         jButton4.setBackground(Color.GREEN);
         button_pressed[3]=1 ;
          Previous_button_pressed=4;
         flag=false ;
        }
         else if(b2.equals(Computer_option)&&b3.equals(Computer_option)&&b4.equals(Computer_option))
         {
             jButton1.setText(Computer_option);
         jButton1.setBackground(Color.GREEN);
         button_pressed[0]=1 ;
         Previous_button_pressed=1;
         flag=false ;
         }
         else if(b1.equals(Computer_option)&&b3.equals(Computer_option)&&b4.equals(Computer_option))
         {
              jButton2.setText(Computer_option);
         jButton2.setBackground(Color.GREEN);
         button_pressed[1]=1 ;
         Previous_button_pressed=2;
         flag=false ;
         }
         else if(b1.equals(Computer_option)&&b2.equals(Computer_option)&&b4.equals(Computer_option))
         {
              jButton3.setText(Computer_option);
         jButton3.setBackground(Color.GREEN);
         button_pressed[2]=1 ;
         Previous_button_pressed=3;
         flag=false ;
         }
         
         
         else if(b5.equals(Computer_option)&&b6.equals(Computer_option)&&b7.equals(Computer_option))
         {
             jButton8.setText(Computer_option);
         jButton8.setBackground(Color.GREEN);
         button_pressed[7]=1 ;
         Previous_button_pressed=8;
         flag=false ;
         }
         else if(b6.equals(Computer_option)&&b7.equals(Computer_option)&&b8.equals(Computer_option))
         {
             jButton5.setText(Computer_option);
         jButton5.setBackground(Color.GREEN);
         button_pressed[4]=1 ;
         Previous_button_pressed=5;
         flag=false ;
         }
          else if(b5.equals(Computer_option)&&b6.equals(Computer_option)&&b8.equals(Computer_option))
         {
             jButton7.setText(Computer_option);
         jButton7.setBackground(Color.GREEN);
         button_pressed[6]=1 ;
         Previous_button_pressed=7;
         flag=false ;
         }
           else if(b5.equals(Computer_option)&&b7.equals(Computer_option)&&b8.equals(Computer_option))
         {
             jButton6.setText(Computer_option);
         jButton6.setBackground(Color.GREEN);
         button_pressed[5]=1 ;
         Previous_button_pressed=6;
         flag=false ;
         }
           
           
         
         else if(b9.equals(Computer_option)&&b10.equals(Computer_option)&&b11.equals(Computer_option))
         {
             jButton12.setText(Computer_option);
         jButton12.setBackground(Color.GREEN);
         button_pressed[11]=1 ;
         Previous_button_pressed=12;
         flag=false ;
         }
         else if(b10.equals(Computer_option)&&b11.equals(Computer_option)&&b12.equals(Computer_option))
         {
             jButton9.setText(Computer_option);
         jButton9.setBackground(Color.GREEN);
         button_pressed[8]=1 ;
         Previous_button_pressed=9;
         flag=false ;
         }
         else if(b9.equals(Computer_option)&&b11.equals(Computer_option)&&b12.equals(Computer_option))
         {
             jButton10.setText(Computer_option);
         jButton10.setBackground(Color.GREEN);
         button_pressed[9]=1 ;
         Previous_button_pressed=10;
         flag=false ;
         }
         else if(b9.equals(Computer_option)&&b10.equals(Computer_option)&&b12.equals(Computer_option))
         {
             jButton11.setText(Computer_option);
         jButton11.setBackground(Color.GREEN);
         button_pressed[10]=1 ;
         Previous_button_pressed=11;
         flag=false ;
         }
         
         
         
         
         
         
         else if(b13.equals(Computer_option)&&b14.equals(Computer_option)&&b15.equals(Computer_option))
         {
             jButton16.setText(Computer_option);
         jButton16.setBackground(Color.GREEN);
         button_pressed[15]=1 ;
         Previous_button_pressed=16;
         flag=false ;
         }
         else if(b14.equals(Computer_option)&&b15.equals(Computer_option)&&b16.equals(Computer_option))
         {
             jButton13.setText(Computer_option);
         jButton13.setBackground(Color.GREEN);
         button_pressed[12]=1 ;
         Previous_button_pressed=13;
         flag=false ;
         }
         else if(b13.equals(Computer_option)&&b15.equals(Computer_option)&&b16.equals(Computer_option))
         {
             jButton14.setText(Computer_option);
         jButton14.setBackground(Color.GREEN);
         button_pressed[13]=1 ;
         Previous_button_pressed=14;
         flag=false ;
         }
         else if(b13.equals(Computer_option)&&b14.equals(Computer_option)&&b16.equals(Computer_option))
         {
             jButton15.setText(Computer_option);
         jButton15.setBackground(Color.GREEN);
         button_pressed[14]=1 ;
         Previous_button_pressed=15;
         flag=false ;
         }
         
         
         
         
         
         
         ////// --------------------------------Vertical Condition now-------------------
         if(b1.equals(Computer_option) && (b5 == null ? Computer_option == null : b5.equals(Computer_option)) && b9.equals(Computer_option))
         {
         jButton13.setText(Computer_option);
         jButton13.setBackground(Color.GREEN);
         button_pressed[12]=1 ;
         Previous_button_pressed=13;
         flag=false ;
        }
          else if(b5.equals(Computer_option)&&b9.equals(Computer_option)&&b13.equals(Computer_option))
         {
             jButton1.setText(Computer_option);
         jButton1.setBackground(Color.GREEN);
         button_pressed[0]=1 ;
         Previous_button_pressed=1;
         flag=false ;
         }
          else if(b1.equals(Computer_option)&&b9.equals(Computer_option)&&b13.equals(Computer_option))
         {
             jButton5.setText(Computer_option);
         jButton5.setBackground(Color.GREEN);
         button_pressed[4]=1 ;
         Previous_button_pressed=5;
         flag=false ;
         }
            else if(b1.equals(Computer_option)&&b5.equals(Computer_option)&&b13.equals(Computer_option))
         {
             jButton9.setText(Computer_option);
         jButton9.setBackground(Color.GREEN);
         button_pressed[8]=1 ;
         Previous_button_pressed=9;
         flag=false ;
         }
         
         
         
         
         
         
         
         
         
         
         
          else if(b2.equals(Computer_option)&&b6.equals(Computer_option)&&b10.equals(Computer_option))
         {
             jButton14.setText(Computer_option);
         jButton14.setBackground(Color.GREEN);
         button_pressed[13]=1 ;
         Previous_button_pressed=14;
         flag=false ;
         }
          else if(b6.equals(Computer_option)&&b10.equals(Computer_option)&&b14.equals(Computer_option))
         {
             jButton2.setText(Computer_option);
         jButton2.setBackground(Color.GREEN);
         button_pressed[1]=1 ;
         Previous_button_pressed=2;
         flag=false ;
         }
          else if(b2.equals(Computer_option)&&b10.equals(Computer_option)&&b14.equals(Computer_option))
         {
             jButton6.setText(Computer_option);
         jButton6.setBackground(Color.GREEN);
         button_pressed[5]=1 ;
         Previous_button_pressed=6;
         flag=false ;
         }
          else if(b2.equals(Computer_option)&&b6.equals(Computer_option)&&b14.equals(Computer_option))
         {
             jButton10.setText(Computer_option);
         jButton10.setBackground(Color.GREEN);
         button_pressed[9]=1 ;
         Previous_button_pressed=10;
         flag=false ;
         
         }
          
          
          
          
          
          
          
          
          
          
          
          else if(b3.equals(Computer_option)&&b7.equals(Computer_option)&&b11.equals(Computer_option))
          {
                jButton15.setText(Computer_option);
         jButton15.setBackground(Color.GREEN);
         button_pressed[14]=1 ;
         Previous_button_pressed=15;
         flag=false ;
         
          }
          else if(b7.equals(Computer_option)&&b11.equals(Computer_option)&&b15.equals(Computer_option))
          {
                jButton3.setText(Computer_option);
         jButton3.setBackground(Color.GREEN);
         button_pressed[2]=1 ;
         Previous_button_pressed=3;
         flag=false ;
          }
          else if(b3.equals(Computer_option)&&b11.equals(Computer_option)&&b15.equals(Computer_option))
          {
                jButton7.setText(Computer_option);
         jButton7.setBackground(Color.GREEN);
         button_pressed[6]=1 ;
         Previous_button_pressed=7;
         flag=false ;
          }
          else if(b3.equals(Computer_option)&&b7.equals(Computer_option)&&b15.equals(Computer_option))
          {
                jButton11.setText(Computer_option);
         jButton11.setBackground(Color.GREEN);
         button_pressed[10]=1 ;
         Previous_button_pressed=11;
         flag=false ;
          }
          
          
          
          
          
          
          
          
          else if(b4.equals(Computer_option)&&b8.equals(Computer_option)&&b12.equals(Computer_option))
          {
                jButton16.setText(Computer_option);
         jButton16.setBackground(Color.GREEN);
         button_pressed[15]=1 ;
         Previous_button_pressed=16;
         flag=false ;
          }
           else if(b8.equals(Computer_option)&&b12.equals(Computer_option)&&b16.equals(Computer_option))
          {
                jButton4.setText(Computer_option);
         jButton4.setBackground(Color.GREEN);
         button_pressed[3]=1 ;
         Previous_button_pressed=4;
         flag=false ;
          }
           else if(b4.equals(Computer_option)&&b12.equals(Computer_option)&&b16.equals(Computer_option))
          {
                jButton8.setText(Computer_option);
         jButton8.setBackground(Color.GREEN);
         button_pressed[7]=1 ;
         Previous_button_pressed=8;
         flag=false ;
         
          }
           else if(b4.equals(Computer_option)&&b8.equals(Computer_option)&&b16.equals(Computer_option))
          {
                jButton12.setText(Computer_option);
         jButton12.setBackground(Color.GREEN);
         button_pressed[11]=1 ;
         Previous_button_pressed=12;
         flag=false ;
          }
         
         /////// Diagonal Condition ----------
          else if(b4.equals(Computer_option)&&b7.equals(Computer_option)&&b10.equals(Computer_option))
          {
                jButton13.setText(Computer_option);
         jButton13.setBackground(Color.GREEN);
         
         button_pressed[12]=1 ;
         Previous_button_pressed=13;
         flag=false ;
          }
          else if(b7.equals(Computer_option)&&b10.equals(Computer_option)&&b13.equals(Computer_option))
          {
                jButton4.setText(Computer_option);
         jButton4.setBackground(Color.GREEN);
         button_pressed[3]=1 ;
         Previous_button_pressed=4;
         flag=false ;
          }
          else if(b4.equals(Computer_option)&&b10.equals(Computer_option)&&b13.equals(Computer_option))
          {
                jButton7.setText(Computer_option);
         jButton7.setBackground(Color.GREEN);
         button_pressed[6]=1 ;
         Previous_button_pressed=7;
         flag=false ;
          }
          else if(b4.equals(Computer_option)&&b7.equals(Computer_option)&&b13.equals(Computer_option))
          {
                jButton10.setText(Computer_option);
         jButton10.setBackground(Color.GREEN);
         button_pressed[9]=1 ;
         Previous_button_pressed=10;
         flag=false ;
          }
         
         
         
          else if(b1.equals(Computer_option)&&b6.equals(Computer_option)&&b11.equals(Computer_option))
          {
                jButton16.setText(Computer_option);
         jButton16.setBackground(Color.GREEN);
         button_pressed[15]=1 ;
         Previous_button_pressed=16;
         flag=false ;
          }
          else if(b6.equals(Computer_option)&&b11.equals(Computer_option)&&b16.equals(Computer_option))
          {
                jButton1.setText(Computer_option);
         jButton1.setBackground(Color.GREEN);
         button_pressed[0]=1 ;
         Previous_button_pressed=1;
         flag=false ;
          }
          else if(b1.equals(Computer_option)&&b11.equals(Computer_option)&&b16.equals(Computer_option))
          {
                jButton6.setText(Computer_option);
         jButton6.setBackground(Color.GREEN);
         button_pressed[5]=1 ;
         Previous_button_pressed=6;
         flag=false ;
          }
          else if(b1.equals(Computer_option)&&b6.equals(Computer_option)&&b16.equals(Computer_option))
          {
                jButton11.setText(Computer_option);
         jButton11.setBackground(Color.GREEN);
         button_pressed[10]=1 ;
         Previous_button_pressed=11;
         flag=false ;
         
          }
         ///// These above were all win conditions for Computer itself 
         
         //This staisfy point Two of Game
         if(b1.equals(option) && (b2 == null ? option == null : b2.equals(option)) && b3.equals(option))
         {
         jButton4.setText(Computer_option);
         jButton4.setBackground(Color.GREEN);
         button_pressed[3]=1 ;
         Previous_button_pressed=4;
         flag=false ;
        }
         else if(b2.equals(option)&&b3.equals(option)&&b4.equals(option))
         {
             jButton1.setText(Computer_option);
         jButton1.setBackground(Color.GREEN);
         button_pressed[0]=1 ;
         Previous_button_pressed=1;
         flag=false ;
         }
         else if(b1.equals(option)&&b3.equals(option)&&b4.equals(option))
         {
              jButton2.setText(Computer_option);
         jButton2.setBackground(Color.GREEN);
         button_pressed[1]=1 ;
         Previous_button_pressed=2;
         flag=false ;
         }
         else if(b1.equals(option)&&b2.equals(option)&&b4.equals(option))
         {
              jButton3.setText(Computer_option);
         jButton3.setBackground(Color.GREEN);
         button_pressed[2]=1 ;
         Previous_button_pressed=3;
         flag=false ;
         }
         
         
         else if(b5.equals(option)&&b6.equals(option)&&b7.equals(option))
         {
             jButton8.setText(Computer_option);
         jButton8.setBackground(Color.GREEN);
         button_pressed[4]=1 ;
         Previous_button_pressed=8;
         flag=false ;
         }
         else if(b6.equals(option)&&b7.equals(option)&&b8.equals(option))
         {
             jButton5.setText(Computer_option);
         jButton5.setBackground(Color.GREEN);
         button_pressed[4]=1 ;
         Previous_button_pressed=5;
         flag=false ;
         }
          else if(b5.equals(option)&&b6.equals(option)&&b8.equals(option))
         {
             jButton7.setText(Computer_option);
         jButton7.setBackground(Color.GREEN);
         button_pressed[6]=1 ;
         Previous_button_pressed=7;
         flag=false ;
         }
           else if(b5.equals(option)&&b7.equals(option)&&b8.equals(option))
         {
             jButton6.setText(Computer_option);
         jButton6.setBackground(Color.GREEN);
         button_pressed[5]=1 ;
         Previous_button_pressed=6;
         flag=false ;
         }
           
           
         
         else if(b9.equals(option)&&b10.equals(option)&&b11.equals(option))
         {
             jButton12.setText(Computer_option);
         jButton12.setBackground(Color.GREEN);
         button_pressed[11]=1 ;
         Previous_button_pressed=12;
         flag=false ;
         }
         else if(b10.equals(option)&&b11.equals(option)&&b12.equals(option))
         {
             jButton9.setText(Computer_option);
         jButton9.setBackground(Color.GREEN);
         button_pressed[8]=1 ;
         Previous_button_pressed=9;
         flag=false ;
         }
         else if(b9.equals(option)&&b11.equals(option)&&b12.equals(option))
         {
             jButton10.setText(Computer_option);
         jButton10.setBackground(Color.GREEN);
         button_pressed[9]=1 ;
         Previous_button_pressed=10;
         flag=false ;
         
         }
         else if(b9.equals(option)&&b10.equals(option)&&b12.equals(option))
         {
             jButton11.setText(Computer_option);
         jButton11.setBackground(Color.GREEN);
         button_pressed[10]=1 ;
         Previous_button_pressed=11;
         flag=false ;
         }
         
         
         
         
         
         
         else if(b13.equals(option)&&b14.equals(option)&&b15.equals(option))
         {
             jButton16.setText(Computer_option);
         jButton16.setBackground(Color.GREEN);
         button_pressed[15]=1 ;
         Previous_button_pressed=16;
         flag=false ;
         }
         else if(b14.equals(option)&&b15.equals(option)&&b16.equals(option))
         {
             jButton13.setText(Computer_option);
         jButton13.setBackground(Color.GREEN);
         button_pressed[12]=1 ;
         Previous_button_pressed=13;
         flag=false ;
         
         }
         else if(b13.equals(option)&&b15.equals(option)&&b16.equals(option))
         {
             jButton14.setText(Computer_option);
         jButton14.setBackground(Color.GREEN);
         button_pressed[13]=1 ;
         Previous_button_pressed=14;
         flag=false ;
         }
         else if(b13.equals(option)&&b14.equals(option)&&b16.equals(option))
         {
             jButton15.setText(Computer_option);
         jButton15.setBackground(Color.GREEN);
         button_pressed[14]=1 ;
         Previous_button_pressed=15;
         flag=false ;
         }
         
         
         
         
         
         
         ////// --------------------------------Vertical Condition now-------------------
         if(b1.equals(option) && (b5 == null ? option == null : b5.equals(option)) && b9.equals(option))
         {
         jButton13.setText(Computer_option);
         jButton13.setBackground(Color.GREEN);
         button_pressed[12]=1 ;
         Previous_button_pressed=13;
         flag=false ;
        }
          else if(b5.equals(option)&&b9.equals(option)&&b13.equals(option))
         {
             jButton1.setText(Computer_option);
         jButton1.setBackground(Color.GREEN);
         button_pressed[0]=1 ;
         Previous_button_pressed=1;
         flag=false ;
         }
          else if(b1.equals(option)&&b9.equals(option)&&b13.equals(option))
         {
             jButton5.setText(Computer_option);
         jButton5.setBackground(Color.GREEN);
         button_pressed[4]=1 ;
         Previous_button_pressed=5;
         flag=false ;
         }
            else if(b1.equals(option)&&b5.equals(option)&&b13.equals(option))
         {
             jButton9.setText(Computer_option);
         jButton9.setBackground(Color.GREEN);
         button_pressed[8]=1 ;
         Previous_button_pressed=9;
         flag=false ;
         }
         
         
         
         
         
         
         
         
         
         
         
          else if(b2.equals(option)&&b6.equals(option)&&b10.equals(option))
         {
             jButton14.setText(Computer_option);
         jButton14.setBackground(Color.GREEN);
         button_pressed[13]=1 ;
         Previous_button_pressed=14;
         flag=false ;
         }
          else if(b6.equals(option)&&b10.equals(option)&&b14.equals(option))
         {
             jButton2.setText(Computer_option);
         jButton2.setBackground(Color.GREEN);
         button_pressed[1]=1 ;
         Previous_button_pressed=2;
         flag=false ;
         }
          else if(b2.equals(option)&&b10.equals(option)&&b14.equals(option))
         {
             jButton6.setText(Computer_option);
         jButton6.setBackground(Color.GREEN);
         button_pressed[5]=1 ;
         Previous_button_pressed=6;
         flag=false ;
         }
          else if(b2.equals(option)&&b6.equals(option)&&b14.equals(option))
         {
             jButton10.setText(Computer_option);
         jButton10.setBackground(Color.GREEN);
         button_pressed[9]=1 ;
         Previous_button_pressed=10;
         flag=false ;
         }
          
          
          
          
          
          
          
          
          
          
          
          else if(b3.equals(option)&&b7.equals(option)&&b11.equals(option))
          {
                jButton15.setText(Computer_option);
         jButton15.setBackground(Color.GREEN);
         button_pressed[14]=1 ;
         Previous_button_pressed=15;
         flag=false ;
          }
          else if(b7.equals(option)&&b11.equals(option)&&b15.equals(option))
          {
                jButton3.setText(Computer_option);
         jButton3.setBackground(Color.GREEN);
         button_pressed[2]=1 ;
         Previous_button_pressed=3;
         flag=false ;
          }
          else if(b3.equals(option)&&b11.equals(option)&&b15.equals(option))
          {
                jButton7.setText(Computer_option);
         jButton7.setBackground(Color.GREEN);
         button_pressed[6]=1 ;
         Previous_button_pressed=7;
         flag=false ;
          }
          else if(b3.equals(option)&&b7.equals(option)&&b15.equals(option))
          {
                jButton11.setText(Computer_option);
         jButton11.setBackground(Color.GREEN);
         button_pressed[10]=1 ;
         Previous_button_pressed=11;
         flag=false ;
          }
          
          
          
          
          
          
          
          
          else if(b4.equals(option)&&b8.equals(option)&&b12.equals(option))
          {
                jButton16.setText(Computer_option);
         jButton16.setBackground(Color.GREEN);
         button_pressed[15]=1 ;
         Previous_button_pressed=16;
         flag=false ;
          }
           else if(b8.equals(option)&&b12.equals(option)&&b16.equals(option))
          {
                jButton4.setText(Computer_option);
         jButton4.setBackground(Color.GREEN);
         button_pressed[3]=1 ;
         Previous_button_pressed=4;
         flag=false ;
          }
           else if(b4.equals(option)&&b12.equals(option)&&b16.equals(option))
          {
                jButton8.setText(Computer_option);
         jButton8.setBackground(Color.GREEN);
         button_pressed[7]=1 ;
         Previous_button_pressed=8;
         flag=false ;
          }
           else if(b4.equals(option)&&b8.equals(option)&&b16.equals(option))
          {
                jButton12.setText(Computer_option);
         jButton12.setBackground(Color.GREEN);
         button_pressed[11]=1 ;
         Previous_button_pressed=12;
         flag=false ;
          }
         
         /////// Diagonal Condition ----------
          else if(b4.equals(option)&&b7.equals(option)&&b10.equals(option))
          {
                jButton13.setText(Computer_option);
         jButton13.setBackground(Color.GREEN);
         button_pressed[12]=1 ;
         Previous_button_pressed=13;
         flag=false ;
          }
          else if(b7.equals(option)&&b10.equals(option)&&b13.equals(option))
          {
                jButton4.setText(Computer_option);
         jButton4.setBackground(Color.GREEN);
         button_pressed[3]=1 ;
         Previous_button_pressed=4;
         flag=false ;
          }
          else if(b4.equals(option)&&b10.equals(option)&&b13.equals(option))
          {
                jButton7.setText(Computer_option);
         jButton7.setBackground(Color.GREEN);
         button_pressed[6]=1 ;
         Previous_button_pressed=7;
         flag=false ;
          }
          else if(b4.equals(option)&&b7.equals(option)&&b13.equals(option))
          {
                jButton10.setText(Computer_option);
         jButton10.setBackground(Color.GREEN);
         button_pressed[9]=1 ;
         Previous_button_pressed=10;
         flag=false ;
          }
         
         
         
          else if(b1.equals(option)&&b6.equals(option)&&b11.equals(option))
          {
                jButton16.setText(Computer_option);
         jButton16.setBackground(Color.GREEN);
         button_pressed[15]=1 ;
         Previous_button_pressed=16;
         flag=false ;
         
          }
          else if(b6.equals(option)&&b11.equals(option)&&b16.equals(option))
          {
                jButton1.setText(Computer_option);
         jButton1.setBackground(Color.GREEN);
         button_pressed[0]=1 ;
         Previous_button_pressed=1;
         flag=false ;
          }
          else if(b1.equals(option)&&b11.equals(option)&&b16.equals(option))
          {
                jButton6.setText(Computer_option);
         jButton6.setBackground(Color.GREEN);
         button_pressed[5]=1 ;
         Previous_button_pressed=6;
         flag=false ;
          }
          else if(b1.equals(option)&&b6.equals(option)&&b16.equals(option))
          {
                jButton11.setText(Computer_option);
         jButton11.setBackground(Color.GREEN);
         button_pressed[10]=1 ;
         Previous_button_pressed=11;
         flag=false ;
          }
         
         
         // Staisfying third Condition
         
         
         
          if(b1.equals(option) && (b2 == null ? option == null : b2.equals(option)))
         {
         jButton4.setText(Computer_option);
         jButton4.setBackground(Color.GREEN);
         button_pressed[3]=1 ;
         Previous_button_pressed=4;
         flag=false ;
         
        }
         else if(b2.equals(option)&&b3.equals(option))
         {
             jButton1.setText(Computer_option);
         jButton1.setBackground(Color.GREEN);
         button_pressed[0]=1 ;
         Previous_button_pressed=1;
         flag=false ;
         }
         else if(b1.equals(option)&&b3.equals(option))
         {
              jButton2.setText(Computer_option);
         jButton2.setBackground(Color.GREEN);
         button_pressed[1]=1 ;
         Previous_button_pressed=2;
         flag=false ;
         
         }
         else if(b3.equals(option)&&b4.equals(option))
         {
              jButton2.setText(Computer_option);
         jButton2.setBackground(Color.GREEN);
         button_pressed[1]=1 ;
         Previous_button_pressed=2;
         flag=false ;
         }
         else if(b1.equals(option)&&b4.equals(option))
         {
              jButton2.setText(Computer_option);
         jButton2.setBackground(Color.GREEN);
         button_pressed[1]=1 ;
         Previous_button_pressed=2;
         flag=false ;
         }
         
         else if(b5.equals(option)&&b6.equals(option))
         {
             jButton8.setText(Computer_option);
         jButton8.setBackground(Color.GREEN);
         button_pressed[7]=1 ;
         Previous_button_pressed=8;
         flag=false ;
         }
         else if(b6.equals(option)&&b7.equals(option))
         {
             jButton5.setText(Computer_option);
         jButton5.setBackground(Color.GREEN);
         button_pressed[4]=1 ;
         Previous_button_pressed=5;
         flag=false ;
         }
          else if(b5.equals(option)&&b7.equals(option))
         {
             jButton6.setText(Computer_option);
         jButton6.setBackground(Color.GREEN);
         button_pressed[5]=1 ;
         Previous_button_pressed=6;
         flag=false ;
         }
           else if(b5.equals(option)&&b8.equals(option))
         {
             jButton6.setText(Computer_option);
         jButton6.setBackground(Color.GREEN);
         button_pressed[5]=1 ;
         Previous_button_pressed=6;
         flag=false ;
         }
            else if(b7.equals(option)&&b8.equals(option))
         {
             jButton5.setText(Computer_option);
         jButton5.setBackground(Color.GREEN);
         button_pressed[4]=1 ;
         Previous_button_pressed=5;
         flag=false ;
         }
           
           
         
         else if(b9.equals(option)&&b10.equals(option))
         {
             jButton12.setText(Computer_option);
         jButton12.setBackground(Color.GREEN);
         button_pressed[11]=1 ;
         Previous_button_pressed=12;
         flag=false ;
         }
         else if(b10.equals(option)&&b11.equals(option))
         {
             jButton9.setText(Computer_option);
         jButton9.setBackground(Color.GREEN);
         button_pressed[8]=1 ;
         Previous_button_pressed=9;
         flag=false ;
         }
         else if(b9.equals(option)&&b11.equals(option))
         {
             jButton10.setText(Computer_option);
         jButton10.setBackground(Color.GREEN);
         button_pressed[9]=1 ;
         Previous_button_pressed=10;
         flag=false ;
         }
         else if(b11.equals(option)&&b12.equals(option))
         {
             jButton10.setText(Computer_option);
         jButton10.setBackground(Color.GREEN);
         button_pressed[9]=1 ;
         Previous_button_pressed=10;
         flag=false ;
         }
          else if(b9.equals(option)&&b12.equals(option))
         {
             jButton10.setText(Computer_option);
         jButton10.setBackground(Color.GREEN);
         button_pressed[9]=1 ;
         Previous_button_pressed=10;
         flag=false ;
         }
         
         
         
         
         
         
         else if(b13.equals(option)&&b14.equals(option))
         {
             jButton16.setText(Computer_option);
         jButton16.setBackground(Color.GREEN);
         button_pressed[15]=1 ;
         Previous_button_pressed=16;
         flag=false ;
         }
         else if(b14.equals(option)&&b15.equals(option))
         {
             jButton13.setText(Computer_option);
         jButton13.setBackground(Color.GREEN);
         button_pressed[12]=1 ;
         Previous_button_pressed=13;
         flag=false ;
         }
         else if(b13.equals(option)&&b15.equals(option))
         {
             jButton14.setText(Computer_option);
         jButton14.setBackground(Color.GREEN);
         button_pressed[13]=1 ;
         Previous_button_pressed=14;
         flag=false ;
         }
         else if(b13.equals(option)&&b16.equals(option))
         {
             jButton15.setText(Computer_option);
         jButton15.setBackground(Color.GREEN);
         button_pressed[14]=1 ;
         Previous_button_pressed=15;
         flag=false ;
         }
          else if(b15.equals(option)&&b16.equals(option))
         {
             jButton13.setText(Computer_option);
         jButton13.setBackground(Color.GREEN);
         button_pressed[12]=1 ;
         Previous_button_pressed=13;
         flag=false ;
         }
         
         
         
         
         
         
         ////// --------------------------------Vertical Condition now-------------------
         if(b1.equals(option) && (b5 == null ? option == null : b5.equals(option)))
         {
         jButton13.setText(Computer_option);
         jButton13.setBackground(Color.GREEN);
         button_pressed[12]=1 ;
         Previous_button_pressed=13;
         flag=false ;
        }
          else if(b5.equals(option)&&b9.equals(option))
         {
             jButton1.setText(Computer_option);
         jButton1.setBackground(Color.GREEN);
         button_pressed[0]=1 ;
         Previous_button_pressed=1;
         flag=false ;
         }
          else if(b1.equals(option)&&b9.equals(option))
         {
             jButton5.setText(Computer_option);
         jButton5.setBackground(Color.GREEN);
         button_pressed[4]=1 ;
         Previous_button_pressed=5;
         flag=false ;
         }
            else if(b1.equals(option)&&b13.equals(option))
         {
             jButton9.setText(Computer_option);
         jButton9.setBackground(Color.GREEN);
         button_pressed[8]=1 ;
         Previous_button_pressed=9;
         flag=false ;
         }
            
            else if(b9.equals(option)&&b13.equals(option))
         {
             jButton1.setText(Computer_option);
         jButton1.setBackground(Color.GREEN);
         button_pressed[0]=1 ;
         Previous_button_pressed=1;
         flag=false ;
         }
         
         
         
         
         
         
         
         
         
         
         
          else if(b2.equals(option)&&b6.equals(option))
         {
             jButton14.setText(Computer_option);
         jButton14.setBackground(Color.GREEN);
         button_pressed[13]=1 ;
         Previous_button_pressed=14;
         flag=false ;
         }
          else if(b6.equals(option)&&b10.equals(option))
         {
             jButton2.setText(Computer_option);
         jButton2.setBackground(Color.GREEN);
         button_pressed[0]=1 ;
         Previous_button_pressed=2;
         flag=false ;
         }
          else if(b2.equals(option)&&b10.equals(option))
         {
             jButton6.setText(Computer_option);
         jButton6.setBackground(Color.GREEN);
         button_pressed[5]=1 ;
         Previous_button_pressed=6;
         flag=false ;
         }
          else if(b2.equals(option)&&b14.equals(option))
         {
             jButton10.setText(Computer_option);
         jButton10.setBackground(Color.GREEN);
         button_pressed[9]=1 ;
         Previous_button_pressed=10;
         flag=false ;
         }
           else if(b10.equals(option)&&b14.equals(option))
         {
             jButton6.setText(Computer_option);
         jButton6.setBackground(Color.GREEN);
         button_pressed[5]=1 ;
         Previous_button_pressed=6;
         flag=false ;
         
         }
          
          
          
          
          
          
          
          
          
          
          else if(b3.equals(option)&&b7.equals(option))
          {
                jButton15.setText(Computer_option);
         jButton15.setBackground(Color.GREEN);
         button_pressed[14]=1 ;
         Previous_button_pressed=15;
         flag=false ;
          }
          else if(b7.equals(option)&&b11.equals(option))
          {
                jButton3.setText(Computer_option);
         jButton3.setBackground(Color.GREEN);
         button_pressed[2]=1 ;
         Previous_button_pressed=3;
         flag=false ;
          }
          else if(b3.equals(option)&&b11.equals(option))
          {
                jButton7.setText(Computer_option);
         jButton7.setBackground(Color.GREEN);
         button_pressed[6]=1 ;
         Previous_button_pressed=7;
         flag=false ;
          }
          else if(b3.equals(option)&&b15.equals(option))
          {
                jButton11.setText(Computer_option);
         jButton11.setBackground(Color.GREEN);
         button_pressed[10]=1 ;
         Previous_button_pressed=11;
         flag=false ;
          }
           else if(b11.equals(option)&&b15.equals(option))
          {
                jButton3.setText(Computer_option);
         jButton3.setBackground(Color.GREEN);
         button_pressed[2]=1 ;
         Previous_button_pressed=3;
         flag=false ;
          }
          
          
          
          
          
          
          
          
          else if(b4.equals(option)&&b8.equals(option))
          {
                jButton16.setText(Computer_option);
         jButton16.setBackground(Color.GREEN);
         button_pressed[15]=1 ;
         Previous_button_pressed=16;
         flag=false ;
          }
           else if(b8.equals(option)&&b12.equals(option))
          {
                jButton4.setText(Computer_option);
         jButton4.setBackground(Color.GREEN);
         button_pressed[3]=1 ;
         Previous_button_pressed=4;
         flag=false ;
          }
           else if(b4.equals(option)&&b12.equals(option))
          {
                jButton8.setText(Computer_option);
         jButton8.setBackground(Color.GREEN);
         button_pressed[7]=1 ;
         Previous_button_pressed=8;
         flag=false ;
          }
           else if(b4.equals(option)&&b16.equals(option))
          {
                jButton12.setText(Computer_option);
         jButton12.setBackground(Color.GREEN);
         button_pressed[11]=1 ;
         Previous_button_pressed=12;
         flag=false ;
          }
            else if(b12.equals(option)&&b16.equals(option))
          {
                jButton4.setText(Computer_option);
         jButton4.setBackground(Color.GREEN);
         button_pressed[3]=1 ;
         Previous_button_pressed=4;
         flag=false ;
          }
           
         
         /////// Diagonal Condition ----------
          else if(b4.equals(option)&&b7.equals(option))
          {
                jButton13.setText(Computer_option);
         jButton13.setBackground(Color.GREEN);
         button_pressed[12]=1 ;
         Previous_button_pressed=13;
         flag=false ;
          }
          else if(b7.equals(option)&&b10.equals(option))
          {
                jButton4.setText(Computer_option);
         jButton4.setBackground(Color.GREEN);
         button_pressed[3]=1 ;
         Previous_button_pressed=4;
         flag=false ;
          }
          else if(b4.equals(option)&&b10.equals(option))
          {
                jButton7.setText(Computer_option);
         jButton7.setBackground(Color.GREEN);
         button_pressed[6]=1 ;
         Previous_button_pressed=7;
         flag=false ;
          }
          else if(b4.equals(option)&&b13.equals(option))
          {
                jButton10.setText(Computer_option);
         jButton10.setBackground(Color.GREEN);
         button_pressed[9]=1 ;
         Previous_button_pressed=10;
         flag=false ;
          }
          else if(b10.equals(option)&&b13.equals(option))
          {
                jButton4.setText(Computer_option);
         jButton4.setBackground(Color.GREEN);
         button_pressed[3]=1 ;
         Previous_button_pressed=4;
         flag=false ;
          }
         
         
         
          else if(b1.equals(option)&&b6.equals(option))
          {
                jButton16.setText(Computer_option);
         jButton16.setBackground(Color.GREEN);
         button_pressed[15]=1 ;
         Previous_button_pressed=16;
         flag=false ;
          }
          else if(b6.equals(option)&&b11.equals(option))
          {
                jButton1.setText(Computer_option);
         jButton1.setBackground(Color.GREEN);
         button_pressed[0]=1 ;
         Previous_button_pressed=1;
         flag=false ;
          }
          else if(b1.equals(option)&&b11.equals(option))
          {
                jButton6.setText(Computer_option);
         jButton6.setBackground(Color.GREEN);
         button_pressed[5]=1 ;
         Previous_button_pressed=6;
         flag=false ;
          }
          else if(b1.equals(option)&&b16.equals(option))
          {
                jButton11.setText(Computer_option);
         jButton11.setBackground(Color.GREEN);
         button_pressed[10]=1 ;
         Previous_button_pressed=11;
         flag=false ;
          }
          else if(b11.equals(option)&&b16.equals(option))
          {
                jButton6.setText(Computer_option);
         jButton6.setBackground(Color.GREEN);
         button_pressed[5]=1 ;
         Previous_button_pressed=5;
         flag=false ;
          }
         boolean flag2=true;
         if(flag==true)
         {
             flag2=false;
             if(button_pressed[Previous_button_pressed-1]==0)
             {
                 if(Previous_button_pressed-1==1)
                 {
                     
                 }
                
                 
             }
             else if(button_pressed[Previous_button_pressed+1]==0)
             {
                 if(Previous_button_pressed+1==1)
                 {
                     
                 }
             }
         }
             
             
             
             
    }
             
             
 
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("-");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("-");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("-");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("-");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText("-");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setText("-");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setText("-");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.setText("-");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.setText("-");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.setText("-");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jPanel1.add(jButton10);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton11.setText("-");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel1.add(jButton11);

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton12.setText("-");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jPanel1.add(jButton12);

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13.setText("-");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel1.add(jButton13);

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14.setText("-");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jPanel1.add(jButton14);

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton15.setText("-");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jPanel1.add(jButton15);

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton16.setText("-");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jPanel1.add(jButton16);

        jLabel1.setText("Player Name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(754, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
       if(button_pressed[0]!=1)
        {
            jButton1.setText(option);
         jButton1.setBackground(Color.RED); 
         button_pressed[0]=1 ;
         Player_winner_checker[0]=1 ;
         main_logic_checker();
       
        }   
        else if(button_pressed[0]==1)
        {
            JOptionPane.showMessageDialog(jButton1,"Wrong Move !! Please Enter the Valid move ");
        } 
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if(button_pressed[1]!=1)
        {
            jButton2.setText(option);
         jButton2.setBackground(Color.RED); 
         button_pressed[1]=1 ;
         Player_winner_checker[1]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[1]==1)
        {
            JOptionPane.showMessageDialog(jButton2,"Wrong Move !! Please Enter the Valid move ");
        }
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        if(button_pressed[2]!=1)
        {
            jButton3.setText(option);
         jButton3.setBackground(Color.RED); 
         button_pressed[2]=1 ;
         Player_winner_checker[2]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[2]==1)
        {
            JOptionPane.showMessageDialog(jButton3,"Wrong Move !! Please Enter the Valid move ");
        }
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        if(button_pressed[3]!=1)
        {
            jButton4.setText(option);
         jButton4.setBackground(Color.RED); 
         button_pressed[3]=1 ;
         Player_winner_checker[3]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[3]==1)
        {
            JOptionPane.showMessageDialog(jButton4,"Wrong Move !! Please Enter the Valid move ");
        }
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        if(button_pressed[4]!=1)
        {
            jButton5.setText(option);
         jButton5.setBackground(Color.RED); 
         button_pressed[4]=1 ;
         Player_winner_checker[4]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[4]==1)
        {
            JOptionPane.showMessageDialog(jButton5,"Wrong Move !! Please Enter the Valid move ");
        }
        
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
         if(button_pressed[5]!=1)
        {
            jButton6.setText(option);
         jButton6.setBackground(Color.RED); 
         button_pressed[5]=1 ;
         Player_winner_checker[5]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[5]==1)
        {
            JOptionPane.showMessageDialog(jButton6,"Wrong Move !! Please Enter the Valid move ");
        }
        
        
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
         if(button_pressed[6]!=1)
        {
            jButton7.setText(option);
         jButton7.setBackground(Color.RED); 
         button_pressed[6]=1 ;
         Player_winner_checker[6]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[6]==1)
        {
            JOptionPane.showMessageDialog(jButton7,"Wrong Move !! Please Enter the Valid move ");
        }
        
        
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
         if(button_pressed[7]!=1)
        {
            jButton8.setText(option);
         jButton8.setBackground(Color.RED); 
         button_pressed[7]=1 ;
         Player_winner_checker[7]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[7]==1)
        {
            JOptionPane.showMessageDialog(jButton8,"Wrong Move !! Please Enter the Valid move ");
        }
        
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
         if(button_pressed[8]!=1)
        {
            jButton9.setText(option);
         jButton9.setBackground(Color.RED); 
         button_pressed[8]=1 ;
         Player_winner_checker[8]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[8]==1)
        {
            JOptionPane.showMessageDialog(jButton9,"Wrong Move !! Please Enter the Valid move ");
        }
        
        
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
         if(button_pressed[9]!=1)
        {
            jButton10.setText(option);
         jButton10.setBackground(Color.RED); 
         button_pressed[9]=1 ;
         Player_winner_checker[9]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[9]==1)
        {
            JOptionPane.showMessageDialog(jButton10,"Wrong Move !! Please Enter the Valid move ");
        }
        
        
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
         if(button_pressed[10]!=1)
        {
            jButton11.setText(option);
         jButton11.setBackground(Color.RED); 
         button_pressed[10]=1 ;
         Player_winner_checker[10]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[10]==1)
        {
            JOptionPane.showMessageDialog(jButton11,"Wrong Move !! Please Enter the Valid move ");
        }
        
        
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
         if(button_pressed[11]!=1)
        {
            jButton12.setText(option);
         jButton12.setBackground(Color.RED); 
         button_pressed[11]=1 ;
         Player_winner_checker[11]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[11]==1)
        {
            JOptionPane.showMessageDialog(jButton12,"Wrong Move !! Please Enter the Valid move ");
        }
        
        
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:
         if(button_pressed[12]!=1)
        {
            jButton13.setText(option);
         jButton13.setBackground(Color.RED); 
         button_pressed[12]=1 ;
         Player_winner_checker[12]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[12]==1)
        {
            JOptionPane.showMessageDialog(jButton13,"Wrong Move !! Please Enter the Valid move ");
        }
        
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        // TODO add your handling code here:
         if(button_pressed[13]!=1)
        {
            jButton14.setText(option);
         jButton14.setBackground(Color.RED); 
         button_pressed[13]=1 ;
         Player_winner_checker[13]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[13]==1)
        {
            JOptionPane.showMessageDialog(jButton14,"Wrong Move !! Please Enter the Valid move ");
        }
        
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        // TODO add your handling code here:
         if(button_pressed[14]!=1)
        {
            jButton15.setText(option);
         jButton15.setBackground(Color.RED); 
         button_pressed[14]=1 ;
         Player_winner_checker[14]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[14]==1)
        {
            JOptionPane.showMessageDialog(jButton15,"Wrong Move !! Please Enter the Valid move ");
        }
        
        
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
         if(button_pressed[15]!=1)
        {
            jButton16.setText(option);
         jButton16.setBackground(Color.RED); 
         button_pressed[15]=1 ;
         Player_winner_checker[15]=1 ;
            main_logic_checker();
        }
        else if(button_pressed[15]==1)
        {
            JOptionPane.showMessageDialog(jButton16,"Wrong Move !! Please Enter the Valid move ");
        }
        
        
    }//GEN-LAST:event_jButton16MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new GameForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
