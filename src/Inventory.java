import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Inventory {
public int size,x,y,floor;
public ArrayList<Item> items = new ArrayList<Item>();
public int type;
public Image img;

 public Inventory(int sz,int tp,int xx,int yy,int floorf)
  {
	size=sz;
	type=tp;
	x=xx;
	y=yy;
	floor=floorf;
	if(type==1)
	{
		try {
			img = ImageIO.read(new File(descriptions.directory+"\\Textures\\General\\Chest.png"));
		} catch (IOException e) {
			System.out.println("failed to load chest image");
		}
	}
  }
 public void fill(int cost)
 {
	 int n=(int)(Math.random()*10)+1;
	 for(int i=0;i<n;i++)
	 {
		 items.add(new Sword());
		 items.get(i).generate();
		 items.add(new Armor(0));
	 }
 }
}
