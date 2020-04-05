


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.awt.*;
import javax.swing.*;

import org.w3c.dom.css.RGBColor;



import javax.imageio.*;






public class first extends JFrame {

        private JPanel contentPane;

      //Версия от 14.01.17 Добавлен бой с монстрами
      //21.01.17 изменен механизм создания оружия и брони
      //24.01.17 Добавлен инвентарь, предметы в нем, отображение характеристик этих предметов
      //29.01.17 Движение мышью, перекладывание предметов, открытие сундуков, надевание оружия
      //05.02.17 Мелкие дополнения, надевание брони
      //11.02.17 Монстры - сгусток и голем
public static String FileName="D:\\ALBERT\\Java\\character.txt",battle_str="";
public static int screen=0,vert,hor,x,y,cur_info=0,item_focused=1,a;
//screen -какой экран показывается на данный момент. Подробнее ниже, cur_info - какая инфопанель сейчас открыта, item_focused - какой предмет в инвентаре в фокусе
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        first frame = new first();
                                        frame.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }

      
       /*
        screen:
        -1  -  режим просмотра карты
         0  -  начальный экран
         1  -  основной режим
         2  -  экран паузы
         3  -  история персонажа
         4  -  смерть персонажа
         5  -  инвентарь
         
        */
        public first()
 {
        	Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize ();
            vert = sSize.height;
           hor  = sSize.width;
            x= hor/48;
            y=vert/36;
            descriptions.x=x;
            descriptions.y=y;
           System.out.println(x+" "+	y);
           descriptions.directory=new File("Project").getAbsolutePath();
           System.out.println(descriptions.names[2]);
               player p =new player();
 
            	
               creator MyCreator = new creator(); 
 
           creator.load_pictures();
           
               
               
               
               
        	 myPanel contentPane = new myPanel();
             Container cont = getContentPane();
             cont.add(contentPane);
           
           
           
             
             
             
             setBounds(0, 0, hor,vert);
             setTitle("Cave Game : The Best Game Ever");
             setResizable(true);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setVisible(true);
            screen=0;
                JButton start = new JButton("new game");
                start.setFont(new Font("arial",1,x));
                start.setBounds(19*x, 6*y, 12*x, 4*y);
                start.setForeground(new Color(0, 0, 0));
                start.setBackground(new Color(0, 0, 255));
                getContentPane().add(start);
                start.setVisible(false);
               
                
                JButton load = new JButton("load");
                load.setFont(new Font("arial",1,x));
                load.setBounds(19*x, 11*y, 12*x, 4*y);
                load.setForeground(new Color(0, 0, 0));
                load.setBackground(new Color(0, 255, 0));
                getContentPane().add(load);
                load.setVisible(false);
                
                JButton save = new JButton("save");
                save.setFont(new Font("arial",1,x));
                save.setBounds(19*x, 16*y, 12*x, 4*y);
                save.setForeground(new Color(0, 0, 0));
                save.setBackground(new Color(255, 0, 0));
                getContentPane().add(save);
                save.setVisible(false);
                
                JButton options = new JButton("options");
                options.setFont(new Font("arial",1,x));
                options.setBounds(19*x, 21*y, 12*x, 4*y);
                options.setForeground(new Color(0, 0, 0));
                options.setBackground(new Color(255, 255, 255));
                getContentPane().add(options);
                options.setVisible(false);
                
                JButton exit = new JButton("exit");
                exit.setFont(new Font("arial",1,x));
                exit.setBounds(19*x, 26*y, 12*x, 4*y);
                exit.setForeground(new Color(0, 0, 0));
                exit.setBackground(new Color(255, 0, 255));
                getContentPane().add(exit);
                exit.setVisible(false);
                
                JButton stop  = new JButton("");
                stop.setFont(new Font("arial",1,x));
                stop.setBounds(4*x, 0, 2*x, 2*x);
                stop.setForeground(new Color(0, 0, 0));
                stop.setBackground(new Color(255, 255, 255));
                getContentPane().add(stop);
                stop.setVisible(false);
                
                JButton play = new JButton("");
                play.setFont(new Font("arial",1,x));
                play.setBounds(0, 0, 2*x, 2*x);
                play.setForeground(new Color(0, 0, 0));
                play.setBackground(new Color(255, 255, 255));
                getContentPane().add(play);
                play.setVisible(false);
                
                JButton pause  = new JButton("");
                pause .setFont(new Font("arial",1,x));
                pause .setBounds(2*x,0, 2*x, 2*x);
                pause .setForeground(new Color(0, 0, 0));
                pause .setBackground(new Color(255, 255, 255));
                getContentPane().add(pause );
                pause .setVisible(false);
                
                JButton next  = new JButton("Далее");
                next.setFont(new Font("arial",1,x));
                next.setBounds(hor/2-10*x, 17*x, 20*x, 3*x);
                next.setForeground(new Color(0, 0, 0));
                next.setBackground(new Color(100, 255, 100));
                getContentPane().add(next);
                next.setVisible(false);
                
                
                
                JButton info = new JButton("");
                info.setFont(new Font("arial",1,x));
                info.setBounds(6*x, 0, 2*x, 2*x);
                info.setForeground(new Color(0, 0, 0));
                info.setBackground(new Color(255, 255, 255));
                getContentPane().add(info);
                info.setVisible(false);
                
                JButton map = new JButton("");
                map.setFont(new Font("arial",1,x));
                map.setBounds(8*x, 0, 2*x, 2*x);
                map.setForeground(new Color(0, 0, 0));
                map.setBackground(new Color(255, 255, 255));
                getContentPane().add(map);
                map.setVisible(false);
                
                JButton inventory = new JButton("");
                inventory.setFont(new Font("arial",1,x));
                inventory.setBounds(10*x, 0, 2*x, 2*x);
                inventory.setForeground(new Color(0, 0, 0));
                inventory.setBackground(new Color(255, 255, 255));
                getContentPane().add(inventory);
                inventory.setVisible(false);
                
                JButton info8 = new JButton("");
                info8.setFont(new Font("arial",1,x));
                info8.setBounds(0, 36*descriptions.y-7*descriptions.x, 6*descriptions.x, 6*descriptions.x);
                info8.setForeground(new Color(0, 0, 0));
                info8.setBackground(new Color(255, 255, 255));
                getContentPane().add(info8);
                info8.setVisible(false);
                
                JButton[] infos = new JButton[7];
                for (int i=0;i<infos.length;i++)
                {
                	infos[i] = new JButton();
                	infos[i].setFont(new Font("arial",1,x));
                    infos[i].setBounds(x,2*x+((36*y-9*x)/7)*(player.My_Armors[i].form),((36*y-9*x)/7),((36*y-9*x)/7));
                    infos[i].setForeground(new Color(0, 0, 0));
                    infos[i].setBackground(new Color(255, 255, 255));
                    getContentPane().add(infos[i]);
                    infos[i].setVisible(false);
                }
              
                
                JButton forward = new JButton("W");
                forward.setFont(new Font("arial",50,x));
                forward.setBounds(hor-7*x,vert-8*x,3*x,3*x);
                getContentPane().add(forward);
                forward.setVisible(false);
                
                JButton left = new JButton("A");
                left.setFont(new Font("arial",50,x));
                left.setBounds(hor-10*x,vert-5*x,3*x,3*x);
                getContentPane().add(left);
                left.setVisible(false);
                
                JButton right = new JButton("D");
                right.setFont(new Font("arial",50,x));
                right.setBounds(hor-4*x,vert-5*x,3*x,3*x);
                getContentPane().add(right);
                right.setVisible(false);
                
                JButton backward = new JButton("S");
                backward.setFont(new Font("arial",50,x));
                backward.setBounds(hor-7*x,vert-5*x,3*x,3*x);
                getContentPane().add(backward);
                backward.setVisible(false);
                
                JButton attack_up = new JButton("Удар вверх");
                attack_up.setFont(new Font("Monotype Corsiva",1,x*2));
                attack_up.setBounds(hor-12*x,vert-9*x,12*x,4*x);
                attack_up.setForeground(new Color(0, 0, 0));
                attack_up.setBackground(new Color(255, 0, 0));
                getContentPane().add(attack_up);
                attack_up.setVisible(false);
                
                JButton attack_down = new JButton("Удар вниз");
                attack_down.setFont(new Font("Monotype Corsiva",1,x*2));
                attack_down.setBounds(hor-12*x,vert-5*x,12*x,4*x);
                attack_down.setForeground(new Color(0, 0, 0));
                attack_down.setBackground(new Color(255, 0, 0));
                getContentPane().add(attack_down);
               attack_down.setVisible(false);
               
               JButton ok= new JButton("Ok");
               ok.setFont(new Font("arial",50,x));
               ok.setBounds(hor-12*x,vert-9*x,12*x,8*x);
               ok.setForeground(new Color(0, 0, 0));
               ok.setBackground(new Color(0, 255, 0));
               getContentPane().add(ok);
               ok.setVisible(false);
               
               
               JButton dead= new JButton("Ok");
               dead.setFont(new Font("arial",50,x));
               dead.setBounds(hor/2-3*x,vert/2-x,16*x,12*x);
               dead.setForeground(new Color(0, 0, 0));
               dead.setBackground(new Color(0, 255, 0));
               getContentPane().add(dead);
               dead.setVisible(false);
               
               JButton put_on = new JButton("Надеть");
               put_on.setFont (new Font("Monotype Corsiva",1,x/2*3));
               put_on.setBounds(6*x+24*a,vert-5*x,6*a,2*x);
               getContentPane().add(put_on);
               put_on.setForeground(new Color(0, 0, 0));
               put_on.setBackground(new Color(0, 255, 0));
               put_on.setVisible(false);
               
               JButton move_item = new JButton("Из рюкзака");
               move_item.setFont (new Font("Monotype Corsiva",1,x/5*6));
               move_item.setBounds(6*x+24*a,vert-3*x,6*a,2*x);
               getContentPane().add(move_item);
               move_item.setForeground(new Color(0, 0, 0));
               move_item.setBackground(new Color(0, 255, 0));
               move_item.setVisible(false);
               
               JButton close_map = new JButton("Закрыть карту");
               close_map.setFont(new Font("Monotype Corsiva",1,x/5*6));
               close_map.setBounds(hor-8*x-10, 0, 8*x, 2*x);
               getContentPane().add(close_map);
               close_map.setVisible(false);
                
                JTextField directory = new JTextField();
                directory.setEditable(true);
                directory.setBounds(hor/2-10*x, 15*x, 20*x, x);
                try {
					directory.setText(read(descriptions.directory+"\\Saves\\directory.txt"));
				} catch (FileNotFoundException e1) {
					System.out.println("Не удалось загрузить путь до папки с игрой по адресу "+descriptions.directory+"\\Saves\\directory.txt");
				}
                getContentPane().add(directory);
               
                JTextArea textArea = new JTextArea();
                textArea.setBounds(hor/2-10*x, 5*x, 20*x, 10*x);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                textArea.setEditable(false);
                textArea.setRows(10);
                textArea.setText(history.h);
                textArea.setVisible(false);
                textArea.setFont(new Font("Monotype Corsiva",1,x/3*2));
                textArea.setOpaque(false);
                getContentPane().add(textArea);
                
                
                
                JTextArea textArea2 = new JTextArea();
                textArea2.setBounds(38*descriptions.x, 13*x, 7*descriptions.x+10,5*x);
                textArea2.setLineWrap(true);
                textArea2.setWrapStyleWord(true);
                textArea2.setEditable(false);
                textArea2.setRows(10);
                textArea2.setText("");
                textArea2.setOpaque(false);
                getContentPane().add(textArea2);
                
              
                
                
                
                JTextArea textArea4 = new JTextArea();
                textArea4.setBounds(38*descriptions.x, 3*x, 7*descriptions.x+10,3*x);
                textArea4.setLineWrap(true);
                textArea4.setWrapStyleWord(true);
                textArea4.setEditable(false);
                textArea4.setRows(10);
                textArea4.setFont(new Font("Monotype Corsiva",1,x/3*2));
                textArea4.setOpaque(false);
                getContentPane().add(textArea4);
                
                JTextArea AD = new JTextArea();//показывает защиту брони или щита или урон меча
                AD.setBounds(38*descriptions.x, 5*x, 7*descriptions.x+10,5*x);
                AD.setLineWrap(true);
                AD.setWrapStyleWord(true);
                AD.setEditable(false);
                AD.setRows(10);
                AD.setFont(new Font("Monotype Corsiva",1,x/2));
                AD.setOpaque(false);
                getContentPane().add(AD);
                
               
                
                
                JPanel panel = new JPanel();
                panel.setBounds(1000, 146, 1589, 289);
                getContentPane().add(panel);
                panel.setFocusable(true);
                
                
                
                Timer nt2 = new Timer(50, new ActionListener()
                { public void actionPerformed(ActionEvent e)
                        {;
                        
                        
                     descriptions.x =x;
                     textArea.setText(history.h);
                     
                        if (player.health<=0)
                        {
                        	screen=4;
                        }
                        if (screen==4)
                        {
                        	dead.setVisible(true);
                        }
                        else
                        {
                        	dead.setVisible(false);
                        }
                        if (screen==-1)
                        {
                        	close_map.setVisible(true);
                        }
                        else
                        {
                        	close_map.setVisible(false);
                        }
                        if ((screen==0)|(screen==2))
                        {
                        	start.setVisible(true);
                        	load.setVisible(true);
                        	save.setVisible(true);
                        	options.setVisible(true);
                        	exit.setVisible(true);
                        }
                        else
                        {
                        	start.setVisible(false);
                        	load.setVisible(false);
                        	save.setVisible(false);
                        	options.setVisible(false);
                        	exit.setVisible(false);
                        }
                        if ((screen==1)|(screen==2)|(screen==5))
                        {
                        	if (screen==1)
                        	{
                        	creator.full_update();
                        	}
                        	play.setVisible(true);
                        	stop.setVisible(true);
                        	pause.setVisible(true);
                        	info.setVisible(true);
                        	map.setVisible(true);
                        	inventory.setVisible(true);
                        	
                        	for(int i=0;i<infos.length;i++)
                        	{
                        		infos[i].setVisible(true);
                        	}
                        	info8.setVisible(true);
                        	
                        }else
                        {
                        	play.setVisible(false);
                        	stop.setVisible(false);
                        	pause.setVisible(false);
                        	info.setVisible(false);
                        	map.setVisible(false);
                        	inventory.setVisible(false);
                        	
                        	for(int i=0;i<infos.length;i++)
                        	{
                        		infos[i].setVisible(false);
                        	}
                        	info8.setVisible(false);
                        	
                        }
                        if (((screen==1)|(screen==2))&(Buffer.fight==false))
                        {
                        	
                            	//forward.setVisible(true);
                            	//backward.setVisible(true);
                            	//right.setVisible(true);
                            	//left.setVisible(true);
                            	
                        }
                        else
                        {
                        	forward.setVisible(false);
                        	backward.setVisible(false);
                        	right.setVisible(false);
                        	left.setVisible(false);
                        }
                        if ((Buffer.fight==true)&(Buffer.turn==true))
                        {
                        	attack_down.setVisible(true);
                        	attack_up.setVisible(true);
                        	
                        }
                        else
                        {
                        	attack_up.setVisible(false);
                        	attack_down.setVisible(false);
                        }
                        if (Buffer.fight==true)
                        {


                        	
                        	
                        }
                        else
                        {


                        }
                        if (Buffer.turn==false)
                        {
                        	ok.setVisible(true);
                        }
                        else
                        {
                        	ok.setVisible(false);
                        }
                        if (screen==5)
                        {
                        	put_on.setVisible(true);
                        	move_item.setVisible(true);
                        	put_on.setBounds(6*x+24*a,vert-5*x,6*a,2*x);
                        	move_item.setBounds(6*x+24*a,vert-3*x,6*a,2*x);
                        	if (item_focused<=0)
                        	{
                        		put_on.setBackground(new Color( 150,150,150));
                        		move_item.setText("В рюкзак");
                        	}
                        	else
                        	{
                        		put_on.setBackground(new Color( 0,255,0));
                        		move_item.setText("Из рюкзака");
                        	}
                        }
                        else
                        {
                        	put_on.setVisible(false);
                        	move_item.setVisible(false);
                        	
                        }
                        if ((cur_info!=0)|(screen==5))
                        {
                        	
                        	textArea2.setVisible(true);
                        	textArea4.setVisible(true);
                        	
                        	AD.setVisible(true);
                        	if ((screen==5)&(cur_info==0))
                        	{
                        		textArea2.setBounds(6*x+24*a,2*x+10*a,6*a-10,10*a);
                        		AD.setBounds(6*x+24*a,2*x+6*a,6*a-10,10*a);
                        		if ((item_focused>0)&(item_focused<=player.My_Inventory.items.size()))
                        		{
                        			textArea2.setText(player.My_Inventory.items.get(item_focused-1).additional_description);
                        			AD.setText(player.My_Inventory.items.get(item_focused-1).description);
                        		}
                        		
                        		if ((item_focused<0)&(Math.abs(item_focused)<=Math.abs(Buffer.curr_inv.items.size())))
                        		{
                        			textArea2.setText(Buffer.curr_inv.items.get(Math.abs(item_focused)-1).additional_description);
                        			AD.setText(Buffer.curr_inv.items.get(Math.abs(item_focused)-1).description);
                        		}
                        		
                        	}
                        	else
                        	{
                        		 textArea2.setBounds(38*descriptions.x, 13*x, 7*descriptions.x+10,5*x);
                        		 AD.setBounds(38*descriptions.x, 5*x, 7*descriptions.x+10,5*x);
                        	}
                        	
                        }
                        else
                        {
                        	
                        	
                        	textArea4.setVisible(false);
                        	textArea2.setVisible(false);
                        	AD.setVisible(false);
                        	
                        	
                        }
                       
                        if (screen==3)
                        {
                        	textArea.setVisible(true);
                        	next.setVisible(true);
                        	directory.setVisible(true);
                        }
                        else
                        {
                        	next.setVisible(false);
                        	textArea.setVisible(false);
                        	directory.setVisible(false);
                        }
                        repaint();
                        
                        }
                });
                nt2.start();
                
               
               
               
                
               
              
              
                
                
                start.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) 
                        {
                        	
                        	cur_info=0;
                        	screen=3;
                        MyCreator.create(); 
                     
                        MyCreator.delete_saves();
                        for (int i=0;i<1;i++)
                        {creator.number_of_dungeons=creator.number_of_dungeons+1;
                        creator.make_dungeons(10);
                        player.place();
                        System.out.println(i);
                        }
                        textArea.setText(creator.h_history);
                        //textArea2.setText(descriptions.materials_descriptions[creator.MySword_material]);
                        //textArea3.setText(descriptions.types_descriptions[creator.MySword_type]);
                        for (int i=0;i<infos.length;i++)
                        {
                     	   infos[i].setBounds(x,2*x+((36*y-9*x)/7)*(player.My_Armors[i].form),((36*y-9*x)/7),((36*y-9*x)/7));
                        }
                        
                        
repaint();
                        }
                        
                });
                
                
                
                
                
                
               options.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                          
                         
               
                            
                    }
                    
            });
                
               
                
                exit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                          
                         
                     System.exit(0);
                            
                    }
                    
            });
                
                attack_up.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                    	  ok.setVisible(true);
                         
                    battle_str= player.attack(0);
                   
                     //attack_up.s
                            
                    }
                    
            });
                
                attack_down.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                          
                    	  ok.setVisible(true);
                     battle_str= player.attack(1);
                     ok.setVisible(true);
                            
                    }
                    
            });
                ok.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                          
                         
                    
                    	
                     battle_str=player.be_attacked();
                    	
                    // ok.setVisible(false);
                            
                    }
                    
            });
                
                next.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                         /* String fn = "t";
                        try {
						fn = read(directory.getText()+"\\Saves\\example.txt");
						} catch (FileNotFoundException e) {
						
							e.printStackTrace();
						}
                        if (fn!="t")
                        {
                        	  
                        	 descriptions.directory =directory.getText(); 
                        	 write(directory.getText()+"\\Saves\\directory.txt",directory.getText());
                        	 screen=1;
                        }
                        else
                        {
                        	JOptionPane.showMessageDialog(null, "Вы ввели неправильный путь до файла!");
                        }
                        */
                    	screen=1;
                         
                        	
                     
                            
                    }
                    
            });
                
                play.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                          
                         
                        	
                         
                    	     
                            	 screen=1;
                            	 
                     
                            
                    }
                    
            });
                
                stop.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                          
                         
                        	 screen=2; 
                         
                        	
                     
                            
                    }
                    
            });
                
                pause.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                          
                         
                        	 screen=2; 
                         
                        	
                     
                            
                    }
                    
            });
                
                
                save.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                          
                         write(FileName,creator.final_string);
                     
                            
                    }
                    
            });
                load.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg2) {
                          
                      try {
                    	  String ey = first.read(FileName);
                    	  textArea.setText(ey);
					} catch (FileNotFoundException e) {}
                     
                     
                            
                    }
                       
            });
                
                info.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg2) {
                    	if(screen==-1)
                    	{
                    		screen=1;
                    	}
                    	else
                    	{
                    screen=-1;
                    	}
                     
                            
                    }
                       
            });
                
                map.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg2) {
                    	if(screen==-1)
                    	{
                    		screen=1;
                    	}
                    	else
                    	{
                    screen=-1;
                    	}
                     
                            
                    }
                       
            });
                
                inventory.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg2) {
                    	if(screen==5)
                    	{
                    		screen=1;
                    		creator.close_inventory();
                    		
                    	}
                    	else
                    	{
                    screen=5;
                    	}
                     
                            
                    }
                       
            });
                
                close_map.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg2) {
                    	 screen=1; 
                    }
                       
            });
                
                for (int i=0;i<infos.length;i++)
                {
                	final int n=i;
                infos[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                    	
                    	if (cur_info!=n+1)
                    	{
                    	cur_info=n+1;
                    	}
                    	else 
                    	{
                    		cur_info=0;
                    	}
                    	AD.setText(player.My_Armors[n].description);
                    	
                    	textArea4.setText(player.My_Armors[n].name);
                    	textArea2.setText(player.My_Armors[n].additional_description);
                    	//textArea5.setText(descriptions.armor_forms_descriptions[creator.armor_form[0]]);
                    	//textArea3.setText(descriptions.armor_types_descriptions[creator.armor_type[0]]);
                    	
                    }});
                }
                
                info8.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                    	
                    	if (cur_info!=9)
                    	{
                    	cur_info=9;
                    	}
                    	else 
                    	{
                    		cur_info=0;
                    	}
                    	AD.setText(player.My_Sword.description);
                    	
                    	textArea4.setText(player.My_Sword.name);
                    	textArea2.setText(player.My_Sword.additional_description);
                    	
                    	
                    }});
                
                move_item.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                     
                    	if (item_focused<0)
                    	{
                    		player.My_Inventory.items.add(Buffer.curr_inv.items.get(Math.abs(item_focused)-1));
                    		Buffer.curr_inv.items.remove(Math.abs(item_focused)-1);
                    	}
                    	if (item_focused>0)
                    	{
                    		Buffer.curr_inv.items.add(player.My_Inventory.items.get(Math.abs(item_focused)-1));
                    		player.My_Inventory.items.remove(Math.abs(item_focused)-1);
                    	}
                            
                    }
                    
            });
                put_on.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                   
                    	if (item_focused>0)
                    	{
                    		
                    		if (player.My_Inventory.items.get(item_focused-1).subclass==1)//если предмет является оружием
                    		{
                    			Sword i = new Sword();
                    			i=player.My_Sword;
                    			player.My_Sword=(Sword) player.My_Inventory.items.get(item_focused-1);
                    			player.My_Inventory.items.remove(item_focused-1);
                    			 player.My_Inventory.items.add(i);
                    		}
                    		if ((player.My_Inventory.items.get(item_focused-1).subclass>=20)&(player.My_Inventory.items.get(item_focused-1).subclass<=26))//если предмет является оружием
                    		{  	int o=-1;
                    			int n =player.My_Inventory.items.get(item_focused-1).subclass-20;
                    			for (int h=0;h<player.My_Armors.length;h++)
                    			{
                    				if (player.My_Armors[h].form==n)
                    				{
                    					 o=h;
                    					break;
                    				}
                    			}
                    			
                    			System.out.println("FDDDD"+n+" "+o);
                    			Armor i = new Armor(0);
                    			Armor a = new Armor(0);
                    			i=player.My_Armors[o];
                    			a=(Armor)( player.My_Inventory.items.get(item_focused-1));
                    			player.My_Armors[o]=a;
                    			player.My_Inventory.items.remove(item_focused-1);
                    			 player.My_Inventory.items.add(i);
                    			 
                    		}
                    	}
                    }
                    
            });
                forward.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                    
       	            	  player.forward();
                    }});
                
               dead.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                    	
                    screen=0;
                    player.health=10;
                    	
                    }});
                
                left.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                    	

       	            	
       	            		player.left();
       	            		
       	            	
                    	
                    }});
                
                right.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                    	
                    	
       	            		player.right();
       	            
                    	
                    	
                    }});
                
               backward.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg1) {
                    	
       	            		player.backward();
       	            	
                    }});
               addKeyListener(new MyListener());
               addMouseListener(new CustomListener());
             setFocusable(true);   
               
                
        }

        public class MyListener implements KeyListener {
       	 
            public void keyPressed(KeyEvent e) {
	                int key0 = e.getKeyCode();
	                if(key0==100) 
	                {
	                	if (screen==-1)
	                	{
	                		screen=1;
	                		
	                	}
	                	else
	                	{
	                		screen=-1;
	                	}
	                }
	                if (key0==101)
	                {
	                	if (screen==-1)
	                	{
	                		player.x=0;
	                		player.y=0;
	                	}
	                }
	                if((key0==13)& screen==3) 
	                {
	                	screen=1;
	                } 
	                
                    
	          
	            if (key0==27) {System.exit(0);}
	            if (key0==37)
	            {
	            	if(player.x>0) {
	            		if (dungeon_structure.structure_arr[player.x-1][player.y][player.floor]==1)
	            		{
	            		player.x=player.x-1;
	            		repaint();
	            		}
	            	}
	            }
	            if (key0==39)
	            {
	            	if(player.x<dungeon_structure.structure_arr.length) {
	            		if (dungeon_structure.structure_arr[player.x+1][player.y][player.floor]==1)
	            		{
	            		player.x=player.x+1;
	            		repaint();
	            		}
	            	}
	            }
	            if (key0==38)
	            {
	            	if(player.y>0) {
           		if (dungeon_structure.structure_arr[player.x][player.y-1][player.floor]==1)
           		{
           	
           		player.y=player.y-1;
           		repaint();
           	}
           	}
	            
	            }
	            if (key0==40)
	            {
	            	if(player.y<dungeon_structure.structure_arr.length) {
	            		if (dungeon_structure.structure_arr[player.x][player.y+1][player.floor]==1)
	            		{
	            	
	            		player.y=player.y+1;
	            		repaint();
	            		System.out.println(player.x+" "+player.y);
	            	}
	            	}
	            
	            }
	        }
  	   
         
            public void keyReleased(KeyEvent e) {
                         
            }
         
            public void keyTyped(KeyEvent e) {
                         
            }
             
        }
        public class CustomListener implements MouseListener {
       	 
            public void mouseClicked(MouseEvent e) {
               
            }
   
            public void mouseEntered(MouseEvent e) {
                
            }
   
            public void mouseExited(MouseEvent e) {
                 
            }
   
            public void mousePressed(MouseEvent e) {
            	int mx=e.getX();
            	int my=e.getY();
            	int n=0;
            	
            	if ((screen==1)&(mx>6*x)&(mx<37.5*x)&(mx>2*y))//если мы щелкнули по игровому полю
            	{
            		int x_clicked = player.x+(int) ((mx-6*x)/(6.3*x))-2;
            		int y_clicked = player.y+(int)((my-2*x)/(6.3*x))-1;
            		
            		if ((x_clicked>=0)&(x_clicked<dungeon_structure.structure_arr.length)&(y_clicked>=0)&(y_clicked<dungeon_structure.structure_arr[0].length))
            		{
            			if ((dungeon_structure.structure_arr[x_clicked][y_clicked][player.floor]==4)&(Math.abs(y_clicked-player.y)<2)&(Math.abs(x_clicked-player.x)<2))
            			{
            				
            				creator.find_inventory(x_clicked, y_clicked, player.floor);
            				screen=5;
            			}
            			else if ((dungeon_structure.structure_arr[x_clicked][y_clicked][player.floor]==2)&(Math.abs(y_clicked-player.y)<2)&(Math.abs(x_clicked-player.x)<2))
            			{
            				
            				if (player.floor>0)
            				{
            					player.floor--;
            				}
            			}
            			else if ((dungeon_structure.structure_arr[x_clicked][y_clicked][player.floor]==3)&(Math.abs(y_clicked-player.y)<2)&(Math.abs(x_clicked-player.x)<2))
            			{
            				
            				if (player.floor<dungeon_structure.structure_arr[0][0].length)
            				{
            					player.floor++;
            				}
            			}
            			else
            			{
            				if (x_clicked<player.x)
            				{
            					player.left();
            				}
            				else if (x_clicked>player.x)
            				{
            					player.right();
            				}
            				else if (y_clicked<player.y)
            				{
            					player.forward();
            				}
            				else 
            				{
            					player.backward();
            				}
            					
            			}
            		}
            	}
            	if ((screen==5)&(mx>6*x)&(my>2*y)&(mx<6*x+25*a)&(my<2*x+39/2*a))
            	{
            		
            		if(my<2*y+10*a)
            		{
            		int column=(mx-6*x)/(3*a)+1;
            		int row = (my-2*y)/(3*a);
            		item_focused=column+8*row;
            		}
            		else
            		{
            			int column=(mx-6*x)/(3*a)+1;
            			int row = (my-19*a/2-2*y)/(3*a);
            			item_focused=-(column+8*row);
            		}
            		
            	}
            }
   
            public void mouseReleased(MouseEvent e) {
                 
            }
       }
        
        class myPanel extends JPanel
        {
        	

         
        	
        	public void paintComponent(Graphics gr)
        	{ 
        		if (screen==0)
        		{
        			gr.drawImage(creator.start_screen_img, 0, 0, hor, vert, null);
        		}
        		if (screen==-1)//техническая информация
        	{
        			
        		gr.drawString("age: "+creator.age,50,10);
        		gr.drawString("strength: "+creator.str,50,50);
        		gr.drawString("agility: "+creator.agi,50,100);
        		gr.drawString("intellegence: "+creator.intellegence,50,150);
        		
        		gr.drawString(creator.weapon_name+creator.weapon_power,50,170);
        		gr.drawString(creator.shield_name+creator.shield_power,50,185);
        		
        		gr.drawString(creator.armor_names[0]+creator.armor_power[0], 500, 500);
        		gr.drawString(creator.armor_names[1]+creator.armor_power[1], 500, 515);
        		gr.drawString(creator.armor_names[2]+creator.armor_power[2], 500, 530);
        		gr.drawString(creator.armor_names[3]+creator.armor_power[3], 500, 545);
        		gr.drawString(creator.armor_names[4]+creator.armor_power[4], 500, 560);
        		gr.drawString(creator.armor_names[5]+creator.armor_power[5], 500, 575);
        		gr.drawString(creator.armor_names[6]+creator.armor_power[6], 500, 590);
        		gr.drawString("x: "+player.x+" y: "+player.y+" floor: "+player.floor,500,605);
        		for (int i=0;i<vert/x;i++)
        		{
        			for(int j=0;j<hor/x;j++)
        			{
        				gr.drawImage(creator.dark_tile_img,j*x,i*x,x,x,null);
        			}
        		}
        		for (int i=0;i<dungeon_structure.structure_arr[0].length;i++)
        		{
        			for (int j=0;j<dungeon_structure.structure_arr.length;j++)
        			{
        				
        			        
        				        gr.drawImage(creator.blocks_img[dungeon_structure.structure_arr[j][i][player.floor]], 10+10*j, 10+10*i,  10, 10, null);
        			         
        				
        			}
        		}
        		gr.setColor(new Color(255,0,0));
        		gr.fillOval(player.x*10+10, player.y*10+10, 10, 10);
        		gr.drawOval(player.x*10-10, player.y*10-10, 50, 50);
        		gr.drawImage(creator.close_map_img, hor-8*x-10, 0, 8*x, 2*x, null);
        	}
        		if (screen==3)
        		{
        			gr.drawString("Введите путь до папки с игрой, заменяя \\ на \\\\, если записанный ниже путь неправильный.",hor/2-10*x, 14*x);
        			gr.drawString("Пример: C:\\Program files\\Project",hor/2-10*x, 14*x+15);
        		}
        		if (screen==4)
        		{
        			gr.drawString("Вы проиграли!!!", hor/2-3*x, vert/2+x);
        		}
        	if ((screen==0)|(screen==2))//кнопки на начальном экране
        	{
        		gr.drawImage(creator.start_img,19*descriptions.x, 6*descriptions.y, 12*descriptions.x, 4*descriptions.y, null);
         	    gr.drawImage(creator.load_img,19*descriptions.x, 11*descriptions.y, 12*descriptions.x, 4*descriptions.y, null);
         	    gr.drawImage(creator.save_img,19*descriptions.x, 16*descriptions.y, 12*descriptions.x, 4*descriptions.y, null);
         	    gr.drawImage(creator.options_img,19*descriptions.x, 21*descriptions.y, 12*descriptions.x, 4*descriptions.y, null);
         	    gr.drawImage(creator.exit_img,19*descriptions.x, 26*descriptions.y, 12*descriptions.x, 4*descriptions.y, null);
        	}
        		if ((screen==1)|(screen==2)|(screen==5))
        	{
        			
        			if (screen==1)
        					{
        				//отрисовка подземелья
        				
        		for (int i=0;i<4;i++)
        		{
        			for (int j=0;j<5;j++)
        			{
        				if ((player.x-2+j>=0)&(player.y-1+i>=0)&(player.floor>=0))
        				{
        					gr.drawImage(creator.blocks_img[dungeon_structure.structure_arr[player.x-2+j][player.y-1+i][player.floor]], 6*descriptions.x+((vert-2*descriptions.x)/4)*j, 2*descriptions.x+((vert-2*descriptions.x)/4)*i,  (vert-2*descriptions.x)/4, (vert-2*descriptions.x)/4, null);
        				}
        			}
        		}
        		gr.drawImage(player.current_img, 6*descriptions.x+((vert-2*descriptions.x)/4)*2+32*player.add_x, 2*descriptions.x+((vert-2*descriptions.x)/4)+32*player.add_y, 64*x/10,64*x/10, null);
        		gr.drawImage(player.My_Sword.img, 6*descriptions.x+((vert-2*descriptions.x)/4)*2+32*player.add_x+2*x+player.My_Sword.position_x+player.w_add_x, 2*descriptions.x+((vert-2*descriptions.x)/4)+32*player.add_y+x+player.My_Sword.position_y+player.w_add_y, 5*x,5*x, null);
             
        		
        					}
        			for (int r=0;r<Buffer.x_distances.size();r++)
        			{
        				Image img = null;
        				try {
							img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Monsters\\"+Buffer.m_ids.get(r)+"\\Покой.png")) ;
						} catch (IOException e) {
						
							e.printStackTrace();
						}
        				
        				gr.drawImage(img, 6*descriptions.x+((vert-2*descriptions.x)/4)*(Buffer.x_distances.get(r)+2), 2*descriptions.x+((vert-2*descriptions.x)/4)*(Buffer.y_distances.get(r)+1),  (vert-2*descriptions.x)/4, (vert-2*descriptions.x)/4, null);

        			}
        			int o =0;
        			if (screen==5)
        			{
        				o=1;
        			}
        		for (int j=0;j<3;j++)
        		{
        			for (int k=0;k<16;k++)
        			{//фон слева 
        				gr.drawImage(creator.panel_img, 2*j*descriptions.x, (2*k+2)*descriptions.x, 2*descriptions.x, 2*descriptions.x, null);
        				//фон справа
        				if ((cur_info==0)&(Buffer.fight==false))
        				{
        					
        				gr.drawImage(creator.panel_img,  6*descriptions.x+((vert-2*descriptions.x)/4)*(((hor-6*x)/((vert-2*descriptions.x)/4))-1)+4*x*j+6*x*o, (2*k+2)*descriptions.x, 2*descriptions.x, 2*descriptions.x, null);
        				gr.drawImage(creator.panel_img,  6*descriptions.x+((vert-2*descriptions.x)/4)*(((hor-6*x)/((vert-2*descriptions.x)/4))-1)+4*x*j+2*x+6*x*o, (2*k+2)*descriptions.x, 2*descriptions.x, 2*descriptions.x, null);	
        	        		}
        			}
        		}
        		
        		for (int l=0;l<24;l++)//фон сверху
        		{
        			gr.drawImage(creator.panel_img, 2*l*descriptions.x, 0, 2*descriptions.x, 2*descriptions.x, null);
        		}
        		//картинки щита и оружия
        		gr.drawImage(creator.inventory_tile_img, 0, 36*descriptions.y-7*descriptions.x, 6*descriptions.x, 6*descriptions.x, null);
        		gr.drawImage(player.My_Sword.img, 0, 36*descriptions.y-7*descriptions.x, 6*descriptions.x, 6*descriptions.x, null);
        		//gr.drawImage(creator.img_shield, 6*descriptions.x, 36*descriptions.y-6*descriptions.x, creator.shield_size, creator.shield_size, null);
        		//gr.drawImage(creator.img_shield2, 6*descriptions.x, 36*descriptions.y-6*descriptions.x, creator.shield_size,creator.shield_size, null);
        		//gr.drawImage(creator.img_shield_type, 6*descriptions.x, 36*descriptions.y-6*descriptions.x, creator.shield_size, creator.shield_size, null);
        		
        		//кнопки основного интерфейса
        		gr.drawImage(creator.play_img, 0, 0, 2*descriptions.x, 2*descriptions.x, null);
        		gr.drawImage(creator.pause_img, 2*descriptions.x, 0, 2*descriptions.x, 2*descriptions.x, null);
        		gr.drawImage(creator.stop_img, 4*descriptions.x, 0, 2*descriptions.x, 2*descriptions.x, null);
        		gr.drawImage(creator.info_img, 6*descriptions.x, 0, 2*descriptions.x, 2*descriptions.x, null);
        		gr.drawImage(creator.map_icon_img, 8*descriptions.x, 0, 2*descriptions.x, 2*descriptions.x, null);
        		gr.drawImage(creator.inventory_icon_img, 10*descriptions.x, 0, 2*descriptions.x, 2*descriptions.x, null);
        		gr.drawImage(creator.time_img, 12*descriptions.x, 0, 4*descriptions.x, 2*descriptions.x, null);
        		gr.drawImage(creator.health_img, 16*descriptions.x, 0, 8*descriptions.x, 2*descriptions.x, null);
        		gr.drawImage(creator.fatigue_img, 24*descriptions.x, 0, 8*descriptions.x, 2*descriptions.x, null);
        	   
        		
        		//Показатели здоровья, усталости
        		gr.setColor(new Color(255-(255*player.health/player.max_health),(255*player.health/player.max_health),0));
        		gr.setFont(new Font("Monotype Corsiva",2,x));
        		gr.drawString(player.health_str, 16*x, 3*x/2);

        		if (Buffer.fight==true)
        		{
        			gr.setFont(new Font("Monotype Corsiva",1,x*2));
        			gr.setColor(new Color(255,0,0));
        			gr.drawString("Fight!", hor/2-4*x, 4*x);
        		}
        		gr.setColor(new Color(255-(255*player.fatigue/(player.max_fatigue+1)),(255*player.fatigue/(player.max_fatigue+1)),0));
        		gr.setFont(new Font("Monotype Corsiva",2,x));
        		gr.drawString(player.fatigue_str, 24*x, 3*x/2);
        		if (Buffer.fight==true)
        		{
        			gr.setFont(new Font("Monotype Corsiva",1,x));
        			gr.setColor(new Color(255,255,0));
        			gr.drawString("Fight!", hor/2-4*x, 4*x);
        			gr.setFont(new Font("Arial",1,x/2));
        			for (int i=0;i<Buffer.battle_string_logs.size();i++)
        			{
        				gr.drawString(Buffer.battle_string_logs.get(Buffer.battle_string_logs.size()-i-1), hor/2-10*x, 10*x-15*i);
        			}
        			//gr.drawString(battle_str,hor/2-10*x, 10*x);
        			
        			
        		}
        	
        	
        		if (false)//информация о монстре
        		{        		
        			gr.drawImage(creator.monster_info_img, 40*descriptions.x, 2*descriptions.x, 8*descriptions.x, 16*descriptions.x, null);		
        		}
        		
        		
        	
        		for(int i=0;i<7;i++)//картинки брони
        		{
        			gr.drawImage(creator.inventory_tile_img,descriptions.x,2*descriptions.x+((36*descriptions.y-9*descriptions.x)/7)*(player.My_Armors[i].form),((36*descriptions.y-9*descriptions.x)/7),((36*descriptions.y-9*descriptions.x)/7),null);	
        			gr.drawImage(player.My_Armors[i].img,descriptions.x,2*descriptions.x+((36*descriptions.y-9*descriptions.x)/7)*(player.My_Armors[i].form),((36*descriptions.y-9*descriptions.x)/7),((36*descriptions.y-9*descriptions.x)/7),null);
        			gr.drawImage(player.My_Armors[i].type_img,descriptions.x,2*descriptions.x+((36*descriptions.y-9*descriptions.x)/7)*(player.My_Armors[i].form),((36*descriptions.y-9*descriptions.x)/7),((36*descriptions.y-9*descriptions.x)/7),null);
        		    gr.setColor(new Color(0,0,0));
        		    gr.drawRect(descriptions.x,2*descriptions.x+((36*descriptions.y-9*descriptions.x)/7)*(i),((36*descriptions.y-9*descriptions.x)/7),((36*descriptions.y-9*descriptions.x)/7));
        		}
        		if (cur_info!=0)
        		{
        			//gr.drawImage(creator.paper_img, 40*descriptions.x, 0, 8*descriptions.x, 20*descriptions.x, null);
        			gr.setColor(new Color(102, 51, 0));
        			gr.drawRect(6*descriptions.x+((vert-2*descriptions.x)/4)*(((hor-6*x)/((vert-2*descriptions.x)/4))-1)+1, 2*x+1, hor -(6*descriptions.x+((vert-2*descriptions.x)/4)*(((hor-6*x)/((vert-2*descriptions.x)/4))-1))-10,vert - 2*x-1);
        		}
        		
        	} 
        		if (screen==5)
        		{
        			//Собственная система координат для удобного создания интерфейса
        			int x0= 6*x;
        			int y0= 2*x;
        			 a= (6*descriptions.x+((vert-2*descriptions.x)/4)*(((hor-6*x)/((vert-2*descriptions.x)/4))-1)+10)/30;
        			for (int j=0;j<20;j++)
        			{
        				for (int i=0;i<24;i++)
        				{
        					
        					gr.drawImage(creator.panel_img,x0+i*a,y0+j*a,a,a,null);
        				}
        			}
        			
        			for (int j=0;j<6;j++)
        			{
        				for (int i=0;i<8;i++)
        				{
        					
        					gr.drawImage(creator.inventory_tile_img,x0+3*i*a,y0+3*j*a+(a/2*(j/3)),3*a,3*a,null);
        				}
        			}
        			for (int i=0;i<player.My_Inventory.items.size();i++)
        			{
        				gr.drawImage(player.My_Inventory.items.get(i).img, x0+3*a*(i %8), y0+3*a*(i/8), 3*a, 3*a, null);
        			}
        			
        			for (int i=0;i<Buffer.curr_inv.items.size();i++)
        			{
        				gr.drawImage(Buffer.curr_inv.items.get(i).img, x0+3*a*(i %8), y0+3*a*(i/8)+(19*a/2), 3*a, 3*a, null);
        			}
        			//Отрисовка выбранного предмета
        			if (cur_info==0)
        			{
        				for (int j=0;j<5;j++)
            			{
            				for (int i=0;i<6;i++)
            				{
            					
            					gr.drawImage(creator.panel_img,x0+24*a+i*a,y0+j*a,a,a,null);
            				}
            			}
        				
        				
        			
        			gr.setFont(new Font("Monotype corsiva",1,a/2));
        			if (item_focused>0)
        			{
        				if (item_focused<=player.My_Inventory.items.size())
        				{
        					
        			gr.drawImage(player.My_Inventory.items.get(item_focused-1).img, x0+25*a, y0, 4*a, 4*a, null);
        			gr.setColor(new Color(255,255,0));
        			if (player.My_Inventory.items.get(item_focused-1).name!=null)
        			gr.drawString(player.My_Inventory.items.get(item_focused-1).name, x0+24*a, y0+9*a/2);
        				}
        			
        			gr.setColor(new Color(255,255,255));
        			gr.drawRect(x0+3*a*((item_focused-1) %8)-1, y0+3*a*((item_focused-1)/8)-1, 3*a+2, 3*a+2);
        			gr.drawRect(x0+3*a*((item_focused-1) %8), y0+3*a*((item_focused-1)/8), 3*a, 3*a);
        			gr.drawRect(x0+3*a*((item_focused-1) %8)+1, y0+3*a*((item_focused-1)/8)+1, 3*a-2, 3*a-2);
        			 
        			}
        			if (item_focused<0)
        			 {
        				if (Math.abs(item_focused)<=Buffer.curr_inv.items.size())
        				{
        				gr.drawImage(Buffer.curr_inv.items.get(Math.abs(item_focused)-1).img, x0+25*a, y0, 4*a, 4*a, null);
        				gr.setColor(new Color(255,255,255));
            			gr.drawString(Buffer.curr_inv.items.get(Math.abs(item_focused)-1).name, x0+24*a, y0+9*a/2);
            				
        				}
        				gr.setColor(new Color(255,255,255));
        				gr.drawRect(x0+3*a*((Math.abs(item_focused)-1) %8)-1, y0+19*a/2+3*a*((Math.abs(item_focused)-1)/8)-1, 3*a+2, 3*a+2);
            			gr.drawRect(x0+3*a*((Math.abs(item_focused)-1) %8), y0+19*a/2+3*a*((Math.abs(item_focused)-1)/8), 3*a, 3*a);
            			gr.drawRect(x0+3*a*((Math.abs(item_focused)-1) %8)+1, y0+19*a/2+3*a*((Math.abs(item_focused)-1)/8)+1, 3*a-2, 3*a-2);
        			 }
        			}
        			if (Buffer.inventory_open_n==-1)
        			{
        				gr.fillRect(x0, y0+9*a, 24*a, 15*a);
        			}
        		}
                 
        	 }	
        	
        	
        }
        
        
        public int  monster_x(Monster m)
    	{
    		 return(m.x);
    		
    	}     
        public int  monster_y(Monster m)
    	{
    		 return(m.y);
    		
    	}
        public int  monster_floor(Monster m)
    	{
    		 return(m.floor);
    		
    	}


public static void write(String FileName, String final_string)
{


	File file = new File(FileName);
	try
	{
		file.createNewFile();
		PrintWriter out = new PrintWriter(file.getAbsoluteFile());
		try
		{
			out.print(final_string);
		}
		finally
		{
			out.close();
		}
	}
	catch(IOException e)
	{
		
	}
}

private static void exists(String FileName)throws FileNotFoundException 
{
	File file = new File(FileName);
	if (!file.exists())
	{
		throw new FileNotFoundException(file.getName());
	}
}
public static String read(String FileName) throws FileNotFoundException 
{
	File file = new File(FileName);
	StringBuilder sb = new StringBuilder();
	exists(FileName);
try
	{
      BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
      try
      {
    	  String s;
    	  while ((s = in.readLine())!= null)
    	  {
    		 sb.append(s);
    		 //sb.append("\n");
    	  }
      }
      finally
      {
    	  in.close();
      }
	}
	catch(IOException e)
	{
		
	}
	return sb.toString();
}

	 


}	