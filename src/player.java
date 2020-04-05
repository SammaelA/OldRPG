import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Delayed;

import javax.imageio.ImageIO;



public class player {
	public static boolean forward,backward,left,right,dead=false;
	public static int x,y,add_x=0,add_y=0,floor,dungeon,health=10,max_health=10,fatigue,max_fatigue,move_speed=150,Str=10,Agi,Int,fq,step=0,w_add_x,w_add_y;//fq - ����������� ���������
	public static String health_str=" ",fatigue_str=" ";
	public static double[] armors = new double[7];
	public static Image[] move_images = new Image[8];
	public static Image[] attack_images = new Image[6];
	public static Image player_img,current_img;
	public static double attack_speed,sword_damage,damage,dodge,base_dodge,attack=0;
	public static Sword My_Sword;
	public static Armor[] My_Armors = new Armor[7];
	public static Inventory My_Inventory;
	public player()
	{
		My_Inventory = new Inventory(27,1,0,0,0);
		My_Inventory.fill(10000);
		history.generate();
		My_Sword = new Sword();
		My_Sword.generate();
		for (int i=0;i<My_Armors.length;i++)
		{
			My_Armors[i] = new Armor(1);
			System.out.println(i+My_Armors[i].name+My_Armors[i].form);
		}
		String s = "\\Textures\\Player\\";
		try
	    {
	   	 player_img= ImageIO.read(new File (descriptions.directory+s+"�����.png")) ;
	    }
	    catch(Exception exp1) { }
		for (int i=0;i<8;i++)
		{
			try
		    {
		   	 move_images[i]= ImageIO.read(new File (descriptions.directory+s+"��� "+i+".png")) ;
		    }
		    catch(Exception exp1) {System.out.println(descriptions.directory+s+"��� "+i+".png"); }
		}
		
		for (int i=0;i<6;i++)
		{
			try
		    {
		   	 attack_images[i]= ImageIO.read(new File (descriptions.directory+s+"����� "+i+".png")) ;
		    }
		    catch(Exception exp1) {System.out.println(descriptions.directory+s+"����� "+i+".png"); }
		}
       	 current_img=player_img;
         
	}
			
	

	public static void place()
	
	{  
		player.dead=false;
		base_dodge=0.25;
		dodge=base_dodge+Agi/200;
		if (creator.str!=0)
		{
		Str=creator.str;
		}
		else
		{
			Str=10;
		}
		Agi =creator.agi;
		Int = creator.intellegence;
	 	 current_img=player_img;
         max_health = 150+3*Str;
         health= max_health;
         max_fatigue=5000+15*(Agi+Str+Int);
         fatigue=max_fatigue;
         fq=10;
		x=dungeon_structure.enter_x;
		y=dungeon_structure.enter_y;
		floor=0;
		/*while ((exists==false))
		{
			x=0;
			y=0;
			floor=0;
			dungeon=0;
		int tx=(int)(Math.random()*(dungeon_structure.structure_arr.length-16))+5,
		ty=(int)(Math.random()*(dungeon_structure.structure_arr[0].length-16))+5,
		tf=0;
			if(dungeon_structure.structure_arr[tx][ty][tf]==1)
			{
				exists=true;
				x=tx;
				y=ty;
				floor=tf;
				n=0;
			}
			else
			{
				n++;
			}
			
			
		}*/
	}
	public static void update()
	{
		
			w_add_x=0;
			w_add_y=0;
		
		attack_speed=My_Sword.attack_speed;
		if (Buffer.fight==true)
		{
			System.out.println("!!!"+attack);
			int n =(int)(attack%6);
			current_img=attack_images[n];
			if (n==1)
			{
				w_add_x=(int)(descriptions.x*0.3);
				w_add_y=-(int)(descriptions.x*0.9);
			}
			if (n==2)
			{
				w_add_x=(int)(descriptions.x*0.3);
				w_add_y=-(int)(descriptions.x*1.6);
			}
			if (n==3)
			{
				w_add_x=(int)(descriptions.x*0.1);
				w_add_y=-(int)(descriptions.x*1.7);
			}
			if (n==4)
			{
				w_add_x=(int)(descriptions.x*0.1);
				w_add_y=-(int)(descriptions.x*0.7);
			}
			
			if (attack>0)
			{
				double f=attack_speed/1.5;
				System.out.println("&&&"+f);
				attack=attack-f;
				if (attack<0)
				{
					attack=0;
				}
			}
		}
		
		int n = (int)((health*10)/max_health);
		switch (n) {
		case 0:
			health_str="�������  ";
			break;
		case 1:
			health_str="���������� �����";
			break;
		case 2:
			health_str="������ �����";
			break;
		case 3:
			health_str="�������� �����";
			break;
		case 4:
			health_str="�����";
			break;
		case 5:
			health_str="����� �����";
			break;
		case 6:
			health_str="����� ������";
			break;
		case 7:
			health_str="������ ������";
			break;
		case 8:
			health_str="������ ";
			break;
		case 9:
			health_str="��������� ������";
			break;
		case 10:
			health_str="��������� ������";
			break;

		default:
			health_str="������!!!";
			break;
		}
		n= (int)((fatigue*10)/max_fatigue);
		switch (n) {
		case 0:
			fatigue_str="�������";
			break;
		case 1:
			fatigue_str="�������";
			break;
		case 2:
			fatigue_str="����� �����";
			break;
		case 3:
			fatigue_str="��� ���";
			break;
		case 4:
			fatigue_str="�����";
			break;
		case 5:
			fatigue_str="������ �����";
			break;
		case 6:
			fatigue_str="���� ��� ����";
			break;
		case 7:
			fatigue_str="������";
			break;
		case 8:
			fatigue_str="����� � ���������";
			break;
		case 9:
			fatigue_str="����� ���";
			break;
		case 10:
			fatigue_str="����� ���";
			break;


		default:
			fatigue_str="������!!!";
			break;
		}
		
		damage=(sword_damage+(Str/3+Agi/2+Int/4))*(2*max_fatigue/(max_fatigue+fatigue+1))+100;
		
	    
		
		if(fatigue<max_fatigue)
		{
		fatigue++;
		}
		if (forward==true)
		{
			if (step<(2000/move_speed))
			{
			step++;
			add_y=-8*step/(2000/move_speed);
			current_img=move_images[(step*8)/((2000/move_speed)+1)];
			}
			else
			{
				add_y=0;
				step=0;
				y--;
				forward=false;
			}
			if (fatigue>fq)
			{
			fatigue=fatigue-fq;
			}
		}
		else if (backward==true)
		{
			if (step<(2000/move_speed))
			{
			step++;
			add_y=8*step/(2000/move_speed);
			current_img=move_images[(step*8)/((2000/move_speed)+1)];
			}
			else
			{
				add_y=0;
				step=0;
				y++;
				backward=false;
			}
			if (fatigue>fq)
			{
		      fatigue=fatigue-fq;
			}
		}
		else if (left==true)
		{
			if (step<(2000/move_speed))
			{
			step++;
			add_x=-8*step/(2000/move_speed);
			current_img=move_images[(step*8)/((2000/move_speed)+1)];
			}
			else
			{
				add_x=0;
				step=0;
				x--;
				left=false;
				
			}
			if (fatigue>fq)
			{
				fatigue=fatigue-fq;
			}
		}
		else if (right==true)
		{
			if (step<(2000/move_speed))
			{
			step++;
			add_x=8*step/(2000/move_speed);
			current_img=move_images[(step*8)/((2000/move_speed)+1)];
			}
			else
			{
				add_x=0;
				step=0;
				x++;
				right=false;
			}
			if (fatigue>fq)
			{
				fatigue=fatigue-fq;
			}
		}
	}
	
	public static String be_attacked()
	
	{ 
		
		int type=(int)(Math.random()*2);
		boolean crit=false;
		double end_damage=0;
		String result_str ="error";
		int n_of_attacks =(int)(Buffer.CM.attack_speed/50);
		int rnd = (int)(Math.random()*50);
		if (rnd<(int)(Buffer.CM.attack_speed%50))
		{
			n_of_attacks++;
		}
		
	if (Buffer.CM.current_health==0)
	{
			Buffer.fight=false;
			
	}
    else
	{	
		
		for (int i=0;i<n_of_attacks;i++)
			{
		
			 rnd = (int)(Math.random()*100);
			  if (rnd>(int)(Buffer.CM.dodge*100))
			     {
				  double multiplier = 0.75+ Math.random()*0.5;
				  
				 
				   end_damage = (Buffer.CM.damage-armors[type*3+(int)(Math.random()*4)])*(1-Buffer.CM.pierce)+Buffer.CM.damage*Buffer.CM.pierce;
				   if (end_damage*4>=health*3)
				   {
					   end_damage=health;
				   }
				   else if (end_damage*4>=health)
				   {
					   end_damage=end_damage*1.25;
					   fatigue=(int) (fatigue*0.67);
					   crit=true;
				   }
				   else if (end_damage<0)
				   {
					   end_damage=0;
				   }
				   health-=end_damage;
				   
			     }
			   else
				 {
				 
				 
				 }
			  //����, ���������� �� ������� ����� ��������� �� ����� !���� �������������!
			  if (result_str=="error")
			  {
				  int r1 = (int)(Math.random()*5);
				  if (r1==0) {result_str="��� ���� ������ ���!";}
					 else if (r1==1) {result_str="��� ������� ����!";}
					 else if (r1==2) {result_str="�� ��� ������� ����!";}
					 else if (r1==3) {result_str="���� ����� ����!";}
					 else if (r1==4) {result_str="�� �������� ���� �� ����� ����� �������!";}	
				  
				  if (end_damage<1)
				  {
					  int  r = (int)(Math.random()*5);
					  if (r==0) {result_str="��� ���� �� ����� ��� �����!";}
						 else if (r==1) {result_str="� �������, ���� ����� ��� �� ��������.";}
						 else if (r==2) {result_str="���� ����� ���� ������ ��������� ���.";}
						 else if (r==3) {result_str="���� ������� ��������� �������� ���.";}
						 else if (r==4) {result_str="�� �� �������� ����� �� �����.";}	
				  }
				  else if (end_damage<20)
				  {
					  int r = (int)(Math.random()*5);
					  if (r==0) {result_str="���� ����� ��� ������ ����!";}
						 else if (r==1) {result_str="��� ������� �������������� ����.";}
						 else if (r==2) {result_str="�� ����� ������.";}
						 else if (r==3) {result_str="���� ����� ��� �������������� ����.";}
						 else if (r==4) {result_str="�� �������� �������������� ����.";}	
				  }
				  	if (crit==true)
				  {
					  int r = (int)(Math.random()*5);
					  if (r==0) {result_str="��� ������� ����������� ����!!!";}
						 else if (r==1) {result_str="�� �������� ������!!!";}
						 else if (r==2) {result_str="���� �������� ����������� �����������!!!";}
						 else if (r==3) {result_str="�� �������� ��������� ����!!!";}
						 else if (r==4) {result_str="��������� ������ ������� �� ����� ���� �������� ����!!!";}
				  }
				  
			  }
			   Buffer.battle_string_logs.add(result_str);
			   result_str="error";
			  //����� �����
			
			}
		if (health==0)
		{
			//result_str="�� ���������!";
			Buffer.fight=false;
		}
	}	Buffer.turn=true;
		return result_str;
					
	}
	public static String attack(int type)
	{   double end_damage=0;
		String result_str="error";
		boolean crit=false;
		int n_of_attacks =(int) (2/(attack_speed)-(2/(attack_speed)% 1))+1;
		int rnd = (int)(Math.random()*100);
		if (rnd<(int)((2/(attack_speed)% 1)*100))
		{
			n_of_attacks++;
		}
		attack=n_of_attacks*6;
		for (int i=0;i<n_of_attacks;i++)
			{
			
			 rnd = (int)(Math.random()*100);
			  if (rnd>(int)(dodge*100))
			     {
				  if (type==0)
				  {			  
				    end_damage = (damage-Buffer.CM.armor_up)*(1-My_Sword.piercing)+damage*My_Sword.piercing;
				  }
				  else
				  {
					  end_damage = (damage-Buffer.CM.armor_down)*(1-My_Sword.piercing)+damage*My_Sword.piercing;
				  }
				   if (end_damage*4>=Buffer.CM.current_health*3)
				   {
					   end_damage=Buffer.CM.current_health;
				   }
				   else if (end_damage*5>=Buffer.CM.current_health*2)
				   {
					   end_damage=end_damage*1.25;
					   crit=true;
				   }
				   else if (end_damage<0)
				   {
					   end_damage=0;
				   }
				   if (fatigue>end_damage)
				   {
				   fatigue-=end_damage;
				   }
				   Buffer.CM.current_health-=end_damage;
				  
			     }
			   else
				 {
				   int r = (int)(Math.random()*5);
				   
				 if (r==0) {result_str="������!";}
				 else if (r==1) {result_str="�� ������������!";}
				 else if (r==2) {result_str="��������� ��������� �� ������ �����!";}
				 else if (r==3) {result_str="�� �� ������ �� ����������!";}
				 else if (r==4) {result_str="���� ���������!";}
				 
				 }
			  //����, ���������� �� ������� ����� ��������� �� ����� !���� �������������!
			  if (result_str=="error")
			  {
				  int r1 = (int)(Math.random()*5);
				  if (r1==0) {result_str="�� ������� �����!";}
					 else if (r1==1) {result_str="�� ������� ����� ����!";}
					 else if (r1==2) {result_str="��� ���� ������ ����.";}
					 else if (r1==3) {result_str="��� ���� ������ ����� �����";}
					 else if (r1==4) {result_str="��� ���� �������� ����!";}	
				  
				  if (end_damage<1)
				  {
					  int  r = (int)(Math.random()*5);
					  if (r==0) {result_str="�� ���� �� ���������� �����!";}
						 else if (r==1) {result_str="�� �� ������� ����� ������� �����������!";}
						 else if (r==2) {result_str="�� �� ������� ����� �����!";}
						 else if (r==3) {result_str="��� ���� ������� ������ �������! �� �� ������� ��� �����!";}
						 else if (r==4) {result_str="� ����� ������� ����� �����! �� �� ��������� ��� �����!";}	
				  }
				  else if (end_damage<20)
				  {
					  int r = (int)(Math.random()*5);
					  if (r==0) {result_str="�� ������� ����� ������ ����!";}
						 else if (r==1) {result_str="�� ������� �������������� ���� �����!";}
						 else if (r==2) {result_str="�� ������ ������� �����.";}
						 else if (r==3) {result_str="����� ������� �������������� ����!";}
						 else if (r==4) {result_str="���� ������� �������������� ����!";}	
				  }
				  	if (crit==true)
				  {
					  int r = (int)(Math.random()*5);
					  if (r==0) {result_str="�� ������� ����� ����������� ����!";}
						 else if (r==1) {result_str="�� �������� ������ �����!";}
						 else if (r==2) {result_str="�� ������� ����� ����������� �����������.";}
						 else if (r==3) {result_str="���� �������� �����!";}
						 else if (r==4) {result_str="�� �������� �� ���� ����� �������� ����!";}
				  }
				  if (Buffer.CM.current_health==0)
				  {
					  int r = (int)(Math.random()*5);
					  if (r==0) {result_str="�� ����� �����!";}
						 else if (r==1) {result_str="�� ������� ����� ����������� ����!";}
						 else if (r==2) {result_str="�� ��������� �����!";}
						 else if (r==3) {result_str="��� ���� ��������!";}
						 else if (r==4) {result_str="��� ���� ��������!";}
					  if (10*health<max_health)
						  {
						   r = (int)(Math.random()*3);
						  if (r==0) {result_str="�� ����� ����� � ������� ���!";}
							 else if (r==1) {result_str="�� ��������� �����, �� � ���� ���� �������� ������!";}
							 else if (r==2) {result_str="�� ��������� ��� �� ��������� �����!";}
						  }
							  
				  }
			  }
			   Buffer.battle_string_logs.add(result_str);
			   result_str="error";
			  //����� �����
			  if (Buffer.CM.current_health==0)
			  {
				  break;	 
			  }
			
			}
		 
		  
		Buffer.turn=false;
		return result_str;
		
	}
	public static void forward()
	{
		if(player.y>0) {
       		if (dungeon_structure.structure_arr[player.x][player.y-1][player.floor]==1)
       		{
		      if ((backward==false)&(left==false)&(right==false)&(Buffer.fight==false))
		       {
			      forward=true;
		       }
       		}
		}
	}
	public static void backward()
	{

    	if(player.y<dungeon_structure.structure_arr.length) {
       		if (dungeon_structure.structure_arr[player.x][player.y+1][player.floor]==1)
       		{
       	
		if ((forward==false)&(left==false)&(right==false)&(Buffer.fight==false))
		{
			backward=true;
		}
       		}
    	}
	}
	public static void left()
	{
		if(player.x>0) {
       		if (dungeon_structure.structure_arr[player.x-1][player.y][player.floor]==1)
       		{
		if ((backward==false)&(forward==false)&(right==false)&(Buffer.fight==false))
		{
			left=true;
		}
       		}
		}
	}
	public static void right()
	{
		if(player.x<dungeon_structure.structure_arr.length) {
       		if (dungeon_structure.structure_arr[player.x+1][player.y][player.floor]==1)
       		{
		if ((backward==false)&(left==false)&(forward==false)&(Buffer.fight==false))
		{
			right=true;
		}
       		}
		}
	}
}

