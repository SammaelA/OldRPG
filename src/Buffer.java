import java.util.ArrayList;

public class Buffer {
public static boolean first_armors[]=new boolean[8];
public static boolean fight=false;//����������, ���� �� ������ ��� ������ � �������
public static boolean turn=true;//���������, ��� ���, true - ������
public static boolean inv_open=false;//����������, ������ �� ������� �����-���� ���������
public static Inventory curr_inv = new Inventory(1000,0,0,0,0);
public static ArrayList<Integer> x_distances = new ArrayList<Integer>();//���������� �� � �� ������ �� ������� ������� � ��� ���� ������
public static ArrayList<Integer> y_distances = new ArrayList<Integer>();//���������� �� y �� ������ �� ������� ������� � ��� ���� ������
public static ArrayList<Integer> m_ids= new ArrayList<Integer>();//id ������� ������� �  ���� ������ ������
public static ArrayList<String> battle_string_logs = new ArrayList<String>();//������ ��������� �������� ������� �����
public static int CM_number,inventory_open_n=-1;
public static double CM_damage,CM_health,CM_attack_speed,CM_dodge,CM_armor_up,CM_armor_down,CM_pierce,CM_floor;
public static Monster CM = new Monster();
public static double [] CM_idms= new double[6];//��������� �������, ������� � ������ ������ ������ � �������
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
