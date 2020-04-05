import java.util.ArrayList;

public class Dungeon {
public int size,type,length,width,floors,number;
public  Monster[]cave_monsters;
public Inventory[]inventories;
public void generate()
{
	size=(int)(Math.random()*7)+1;
	type=(int)(Math.random()*2);
	
	/*
	 1-естественная пещера, больше монстров-животных, элементов-пещер 
	 2-шахта, больше элементов-шахт
	 3-утилитарное подземелье, больше элементов-комнат
	 4-смешанный тип
	*/
	length=(int)(Math.random()*40)+80;
	width=(int)(Math.random()*40)+80;
	System.out.println("l"+length+" "+width);
	//floors=size+(int)(Math.random()*3);
	floors =(int)(Math.random()*15);
	number = creator.number_of_dungeons+1;

}
public void spawn_monsters()
{
	inventories = new Inventory[100];
	for (int i=0;i<inventories.length;i++)
	{
		int x,y,floor;
		 x = (int)(Math.random()*(length-5))+3;
		    y = (int)(Math.random()*(width-5))+3;
			 floor = (int)(Math.random()*floors);
		floor=0;
		while ((dungeon_structure.structure_arr[x][y][floor]!=0)|((dungeon_structure.structure_arr[x-1][y][floor]!=1)&(dungeon_structure.structure_arr[x][y-1][floor]!=1)&(dungeon_structure.structure_arr[x+1][y][floor]!=1)&(dungeon_structure.structure_arr[x][y-1][floor]!=1)))
		{
			 x = (int)(Math.random()*(length-5))+3;
			    y = (int)(Math.random()*(width-5))+3;
				 floor = (int)(Math.random()*floors);
		}
		inventories[i] = new Inventory(27,1,x,y,floor);
		inventories[i].fill(1000);
		dungeon_structure.structure_arr[x][y][floor]=4;
		
	}
	cave_monsters  = new Monster[floors*length*width/100];

	for (int i=0;i<cave_monsters.length;i++)
	{
		int x,y,floor;
		x=length;
		y=width;
		floor=0;
		while (dungeon_structure.structure_arr[x][y][floor]!=1)
		{
	    x = (int)(Math.random()*length-1)+1;
	    y = (int)(Math.random()*width-1)+1;
		 floor = (int)(Math.random()*floors);
		}
		int level = (int)(Math.random()*2);
		//level=0;
		cave_monsters[i] = new Monster();
		cave_monsters[i].generate(level,x,y,floor,i);
		
	}
}
public void update()
{
	if (Buffer.fight==false)
	{
		Buffer.battle_string_logs.clear();
	}
	 Buffer.x_distances.clear();
	 Buffer.y_distances.clear();
	 Buffer.m_ids.clear();
	if (Buffer.turn==false)
	{
		cave_monsters[Buffer.CM.number].current_health=Buffer.CM.current_health;
		if (Buffer.CM_health<=0)
		{
			cave_monsters[Buffer.CM.number].x=99;
			cave_monsters[Buffer.CM.number].y=99;
		}
	}
	for (int i=0;i<cave_monsters.length;i++)
	{ int n;
	    n=0;
	    
		n = cave_monsters[i].update();
	    
	 if (n!=0)
	 {int a,b;
	 if (((n-n%100)/100)%10==0)
	 {
		 a=(n - n%1000)/1000;
	 }
	 else
	 {
		a=-( n - n%1000)/1000;
	 }
	 if (n%10==0)
	 {
		 b=(n/10)%10;
	 }
	 else
	 {
		 b=-(n/10)%10;
	 }
		 Buffer.x_distances.add(a);
		 Buffer.y_distances.add(b);
		 Buffer.m_ids.add(cave_monsters[i].id);
		
		 
	 }
	}
}

}
