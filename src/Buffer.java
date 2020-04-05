import java.util.ArrayList;

public class Buffer {
public static boolean first_armors[]=new boolean[8];
public static boolean fight=false;//показывает, идет ли сейчас бой игрока и монстра
public static boolean turn=true;//показывет, чей ход, true - игрока
public static boolean inv_open=false;//показывает, открыт ли игроком какой-либо инвентарь
public static Inventory curr_inv = new Inventory(1000,0,0,0,0);
public static ArrayList<Integer> x_distances = new ArrayList<Integer>();//расстояние по х от игрока до каждого монстра в его поле зрения
public static ArrayList<Integer> y_distances = new ArrayList<Integer>();//расстояние по y от игрока до каждого монстра в его поле зрения
public static ArrayList<Integer> m_ids= new ArrayList<Integer>();//id каждого монстра в  поле зрения игрока
public static ArrayList<String> battle_string_logs = new ArrayList<String>();//Полное текстовое описание текущей битвы
public static int CM_number,inventory_open_n=-1;
public static double CM_damage,CM_health,CM_attack_speed,CM_dodge,CM_armor_up,CM_armor_down,CM_pierce,CM_floor;
public static Monster CM = new Monster();
public static double [] CM_idms= new double[6];//параметры монстра, который в данный момент бьется с игроком
public Buffer()
{
	Buffer.curr_inv.fill(1000);
}
public void first_armors_nullify()
{
	for (int i=0; i<8;i++)
	{
		first_armors[i]=false;
	}

}
}
