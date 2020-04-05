import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Monster {
public int type,id,level,x,y,floor,number;//параметры, получаемые методом на вход
public double max_health,damage,current_health,attack_speed,dodge,move_speed,armor_up,armor_down,pierce;//параметры, рассчитываемые по формулам
public double[] idms = {1,1,1,1,1,1};
public Image img;//этот и ниже, параметры, завис€щие от id (вида монстра)
public String name;
public int t;

public void generate(int levellevel,int xx,int yy,int floorfloor,int numbernumber)
{
	type=1;
	id=(int)(Math.random()*2)+1;
	x=xx;
	y=yy;
	floor=floorfloor;
	level = levellevel;
	number = numbernumber;

try
{
	img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Monsters\\"+id+"\\ѕокой.png"));
}
catch(Exception exp ) {System.out.println(descriptions.directory+"\\Textures\\Monsters\\"+id+"\\ѕокой.png");}
name = descriptions.names[id];
damage = descriptions.damage[id]*Math.pow(1.33, level)*(Math.random()*(2*descriptions.FVQ[id])+(1-descriptions.FVQ[id]));
max_health = descriptions.health[id]*Math.pow(1.33, level)*(Math.random()*(2*descriptions.FVQ[id])+(1-descriptions.FVQ[id]));
armor_up = descriptions.armor_up[id]*Math.pow(1.33, level)*(Math.random()*(2*descriptions.FVQ[id])+(1-descriptions.FVQ[id]));
armor_down = descriptions.armor_down[id]*Math.pow(1.33, level)*(Math.random()*(2*descriptions.FVQ[id])+(1-descriptions.FVQ[id]));
dodge = descriptions.dodge[id]*Math.pow(1.33, level)*(Math.random()*(2*descriptions.FVQ[id])+(1-descriptions.FVQ[id]));
pierce = descriptions.pierce[id]*Math.pow(1.33, level)*(Math.random()*(2*descriptions.FVQ[id])+(1-descriptions.FVQ[id]));
attack_speed = descriptions.base_attack_speed[id]*Math.pow(1.33, level)*(Math.random()*(2*descriptions.FVQ[id])+(1-descriptions.FVQ[id]));
move_speed = descriptions.move_speed[id]*Math.pow(1.33, level)*(Math.random()*(2*descriptions.FVQ[id])+(1-descriptions.FVQ[id]));
current_health=max_health;
}
public int update()
{
	
	if ((floor==player.floor)&(((Math.abs(x-player.x)==1)&(y-player.y==0))|((Math.abs(y-player.y)==1)&(x-player.x==0))))
	{
		Buffer.fight=true;
		Buffer.CM_attack_speed=attack_speed;
		Buffer.CM_damage= damage;
		Buffer.CM_dodge=dodge;
		Buffer.CM_health=current_health;
		Buffer.CM_number=number;
		Buffer.CM_idms = idms;
		Buffer.CM_armor_up=armor_up;
		Buffer.CM_armor_down=armor_down;
		Buffer.CM_pierce=pierce;
		Buffer.CM_floor=floor;
		Buffer.CM=this;
	}
	int rnd=(int)(Math.random()*20);
	if ((rnd==0)&(Buffer.fight==false))
	{
		 rnd=(int)(Math.random()*4);
		 if ((x<dungeon_structure.structure_arr.length-2)&(x>1)&(y>1)&(y<dungeon_structure.structure_arr[floor].length-2))
		if ((rnd==0)&(dungeon_structure.structure_arr[x+1][y][floor]==1))
		{
			x++;
			
		}
		else if ((rnd==1)&(dungeon_structure.structure_arr[x-1][y][floor]==1))
		{
			x--;
		
		}
		else if ((rnd==2)&(dungeon_structure.structure_arr[x][y+1][floor]==1))
		{
		    y++;
		    
		}
		else if ((rnd==3)&(dungeon_structure.structure_arr[x][y-1][floor]==1))
		{
		    y--;
		    
		}
		
	}
	int n =0;
	
	int a = x-player.x;
	int b = y-player.y;
	
	if ((floor==player.floor)&(((Math.abs(a)<=2)|a==-2)&(Math.abs(b)<=2)))
	{
		n=Math.abs(b)*10+Math.abs(a)*1000;	
		if (a<0)
		{
			n+=100;
		}
		if (b<0)
		{
			n++;
		}
	}
	
	return(n);
	
}
}
