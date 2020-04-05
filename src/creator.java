import java.awt.Image;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class creator {
	public static String armor_names[] = new String[7];
	public static String armor_armor_strs[] = new String[7];
	public static String armor_durability_strs[] = new String[7];
	public static String armor_weight_strs[] = new String[7];
	public static double armor_power[] = new double[7]; 
	public static int armor_form[] = new int[7];  
	public static int armor_type[] = new int[7]; 
	public static int armor_material[] = new int[7];  
	public static int age,
	intellegence,
	str,
	agi,
	shield_size,
	MySword_material,
	MySword_type,
	number_of_dungeons;
	public static String final_string, weapon_name="",shield_name="",h_history, FileName,weapon_attack_str,weapon_durability_str,weapon_weight_str,weapon_attack_speed_str;
	public static Image img,img_shield,img_shield2,img_shield_type,i1,i2,
	play_img,pause_img,stop_img,info_img,panel_img,monster_info_img,inventory_icon_img,health_img,time_img,fatigue_img,map_icon_img,
	paper_img,start_img,exit_img,options_img,save_img,load_img,start_screen_img,inventory_tile_img,close_map_img,dark_tile_img;
	
	public static Image img_armor_type[] = new Image[8];
	public static Image img_armor_form[] = new Image[8];
	public static Image blocks_img[] = new Image[128];
	public static double shield_power,weapon_power;
	public static Dungeon dungeon_arr[] = new Dungeon[1000]; 
	
	 public void create()
	{
		 armor_names[0]="";
	     armor_names[1]="";
	     armor_names[2]="";
	     armor_names[3]="";
	     armor_names[4]="";
	     armor_names[5]="";
	     armor_names[6]="";
	     



         
        
     	Buffer bf = new Buffer();
     	bf.first_armors_nullify();
     	
      

    
    
    
	}
	 public static void full_update()
	 {
	 	dungeon_arr[10].update();
	 	player.update();
	 }
public static void find_inventory(int x,int y,int floor)
{
	int i=0;
	while (i<dungeon_arr[10].inventories.length)
	{
		if ((dungeon_arr[10].inventories[i].x ==x)&(dungeon_arr[10].inventories[i].y ==y)&(dungeon_arr[10].inventories[i].floor ==floor))
		{
			Buffer.inventory_open_n=i;
			Buffer.curr_inv=dungeon_arr[10].inventories[i];
			break;
		}
		i++;
		
	}
	if (Buffer.inventory_open_n==-1)
	{
		System.out.println("RKFGGGGGOPERUJTGJHPOEGHOEHRO");
	}
}
public static void close_inventory()
{
	Inventory i =new Inventory(0,0,0,0,0);
	dungeon_arr[10].inventories[Buffer.inventory_open_n]=Buffer.curr_inv;
	Buffer.curr_inv = i;
	Buffer.inventory_open_n=-1;
}
public static void make_dungeons(int number_of_dungeons)
{ 

	dungeon_arr[number_of_dungeons] = new Dungeon();
	dungeon_arr[number_of_dungeons].generate();
	FileName=descriptions.directory+"\\Saves\\Dungeon_"+creator.number_of_dungeons+".txt";
	
	dungeon_structure.make_structure(dungeon_arr[number_of_dungeons].width, dungeon_arr[number_of_dungeons].length, dungeon_arr[number_of_dungeons].floors, dungeon_arr[number_of_dungeons].number, dungeon_arr[number_of_dungeons].type,FileName);
	dungeon_arr[number_of_dungeons].spawn_monsters();
	number_of_dungeons=number_of_dungeons+1;
	

}
public  void delete_saves()
{ for (int i=0;i<number_of_dungeons+100;i++)
{
	String fileName=descriptions.directory+"\\Saves\\Dungeon_"+i+".txt";
	
	File file = new File(fileName);
	if (file.exists())
	{
	file.delete();
	}
	
}

}

public static void load_pictures()
{
	try
    {
   	play_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Play 1.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 stop_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Pause 2.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 pause_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Pause 1.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 info_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Информация.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 panel_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Панель 3.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 monster_info_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Описание врага.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 inventory_icon_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Инвентарь1.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 health_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Здоровье.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 time_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Дата.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 fatigue_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Усталость.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 map_icon_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Карта Иконка.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 paper_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Бумага.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 start_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\НоваяИгра.png")) ;
   	
    }
    catch(Exception exp1) {System.out.println("eeeee"); }
    try
    {
   	 load_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Загрузить.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 save_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Сохранить.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 close_map_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\close_map.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 options_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Настройки.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 exit_img = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Выход.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
   	 blocks_img[1] = ImageIO.read(new File (descriptions.directory+"\\Textures\\General\\Пол.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
     blocks_img[0]  = ImageIO.read(new File (descriptions.directory+"\\Textures\\General\\Стена.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
     blocks_img[2]  = ImageIO.read(new File (descriptions.directory+"\\Textures\\General\\Ladder_up.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
     blocks_img[3]  = ImageIO.read(new File (descriptions.directory+"\\Textures\\General\\Ladder_down.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
     blocks_img[4]  = ImageIO.read(new File(descriptions.directory+"\\Textures\\General\\Chest.png"));
    }
    catch(Exception exp1) { }
    try
    {
     start_screen_img  = ImageIO.read(new File (descriptions.directory+"\\Textures\\Start_screens\\1.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
     inventory_tile_img  = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\Панель 2.png")) ;
    }
    catch(Exception exp1) { }
    try
    {
     dark_tile_img  = ImageIO.read(new File (descriptions.directory+"\\Textures\\Interface\\dark_tile.png")) ;
    }
    catch(Exception exp1) { }
}
}
