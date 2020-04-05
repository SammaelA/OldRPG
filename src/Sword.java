import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sword extends Item{

public int durability,current_durability,material, rnd1000,type, form,position_x,position_y,damage;
//position_x, position_y - показывают разницу между коорд. картинки оружия и игрока по х и у соответственно

public double damage_modificator,attack_speed,piercing,weight,power;
public boolean enchanted, corrupted, rusty, cursed;
public String material_str="",type_str="", rusty_str="",damage_str,weight_str,durability_str,attack_speed_str,power_str,
image_str=descriptions.directory+"\\Textures\\Weapons";

public void generate()
{
	rnd1000=(int)(Math.random()*1000);
	
if ((rnd1000>=0)&(rnd1000<100))
{
	material =1;
}
if ((rnd1000>=100)&(rnd1000<150))
{
	material =2;
}
if ((rnd1000>=150)&(rnd1000<225))
{
	material =3;
	
}
if ((rnd1000>=225)&(rnd1000<375))
{
	material =4;
	
}
if ((rnd1000>=375)&(rnd1000<575))
{
	material =5;
	
}
if ((rnd1000>=575)&(rnd1000<625))
{
	material =6;
	
}
if ((rnd1000>=625)&(rnd1000<695))
{
	material =7;

}
if ((rnd1000>=695)&(rnd1000<845))
{
	material =8;
	
}
if ((rnd1000>=845)&(rnd1000<895))
{
	material =9;
	
}
if ((rnd1000>=895)&(rnd1000<945))
{
	material =10;
	
}
if ((rnd1000>=945)&(rnd1000<970))
{
	material =11;
	
}
if ((rnd1000>=970)&(rnd1000<995))
{
	material =12;
	
}
if ((rnd1000>=995)&(rnd1000<996))
{
	material =13;
	
}
if ((rnd1000>=996)&(rnd1000<1000))
{
	material =14;
	
}

	rnd1000=(int)(Math.random()*100);
	

if ((rnd1000>=0)&(rnd1000<10))
{
	type=1;
	
}
if ((rnd1000>=10)&(rnd1000<15))
{
	type=2;
	
}
if ((rnd1000>=15)&(rnd1000<20))
{
	type=1;//!!!!1
	
}
if ((rnd1000>=20)&(rnd1000<40))
{
	type=4;
	
}
if ((rnd1000>=40)&(rnd1000<60))
{
	type=5;
	
}
if ((rnd1000>=60)&(rnd1000<65))
{
	type=6;
	
}
if ((rnd1000>=65)&(rnd1000<70))
{
	type=7;
	
}
if ((rnd1000>=70)&(rnd1000<90))
{
	type=8;
	
}
if ((rnd1000>=90)&(rnd1000<100))
{
	type=9;
	
}
calculate();
}
public void calculate()
{
	subclass=1;
	if (material==1)
	{
		
		material_str=" из дерева";
		damage=10;
		durability=200;	
		weight=1;
		
	}
	if (material==2)
	{
		weight=1.2;
		material_str="из кости";
		damage=10;
		durability=400;
		
		
	}
	if (material==3)
	{
		weight=1;
		material_str="из зачарованного дерева";
		damage=20;
		durability=200;

		
	}
	if (material==4)
	{
		weight=2;
		material_str="из бронзы";
		damage=20;
		durability=400;
	
	}
	if (material==5)
	{
		weight=2.2;
		material_str="из железа";
		damage=30;
		durability=600;

	
	}
	if (material==6)
	{
		weight=1.2;
		material_str="из зачарованной кости";
		damage=40;
		durability=200;
	
	}
	if (material==7)
	{
		weight=1.8;
		material_str="из пустого кристалла";
		damage=10;
		durability=2000;
		
	}
	if (material==8)
	{
		weight=2.2;
		material_str="из стали";
		damage=40;
		durability=800;
	
	}
	if (material==9)
	{
		weight=2.2;
		material_str="из закаленной стали";
		damage=55;
		durability=1200;
		
		
	}
	if (material==10)
	{
		weight=1.8;
		material_str="из кристалла земли ";
		damage=40;
		durability=2000;

			
	}
	if (material==11)
	{
		weight=2.2;
		material_str="из булатной стали";
		damage=65;
		durability=1500;

	
	}
	if (material==12)
	{
		weight=1.8;
		material_str="из кристалла огня";
		damage=55;
		durability=2000;
		
		
	}
	if (material==13)
	{
		weight=1.8;
		material_str="из магического кристалла";
		damage=70;
		durability=2000;

	
	}
	if (material==14)
	{
		weight=2.2;
		material_str="из магической стали";
		damage=75;
		durability=1700;
		
		
	}
	
	if (type==1)
	{
		
		damage_modificator=1;
		attack_speed=1;
		piercing=0.2;
		type_str = "меч";
		form = 1;
		weight=weight*1;
		
		image_str=image_str+"\\Swords\\";
		
		if (material==1)
		{
			image_str=image_str+"Дерево.png";
		}
		if (material==2)
		{
			image_str=image_str+"Кость.png";
		}
		if (material==3)
		{
			image_str=image_str+"ДеревоМаг.png";
		}
		if (material==4)
		{
			image_str=image_str+"Бронза.png";
		}
		if ((material==5)|(material==8)|(material==9)|(material==11)|(material==14))
		{
			image_str=image_str+"Сталь.png";
		}
		if (material==6)
		{
			image_str=image_str+"КостьМаг.png";
		}
		if (material==7)
		{
			image_str=image_str+"Кость.png";
		}
		if (material==10)
		{
			image_str=image_str+"Изумруд.png";
		}
		if (material==12)
		{
			image_str=image_str+"Янтарь.png";
		}
		if (material==13)
		{
			image_str=image_str+"Магический.png";
		}
	}
	if (type==2)
	{
		damage_modificator=1.5;
		attack_speed=0.667;
		piercing=0.4;
		type_str = "длинный меч";
		form = 1;
		weight=weight*1.25;
		
image_str=image_str+"\\Longswords\\";
		
if (material==1)
{
	image_str=image_str+"Дерево.png";
}
if (material==2)
{
	image_str=image_str+"Кость.png";
}
if (material==3)
{
	image_str=image_str+"ДеревоМаг.png";
}
if (material==4)
{
	image_str=image_str+"Бронза.png";
}
if ((material==5)|(material==8)|(material==9)|(material==11)|(material==14))
{
	image_str=image_str+"Сталь.png";
}
if (material==6)
{
	image_str=image_str+"КостьМаг.png";
}
if (material==7)
{
	image_str=image_str+"Кость.png";
}
if (material==10)
{
	image_str=image_str+"Изумруд.png";
}
if (material==12)
{
	image_str=image_str+"Янтарь.png";
}
if (material==13)
{
	image_str=image_str+"Магический.png";
}
	}
	if (type==3)
	{
		damage_modificator=0.9;
		attack_speed=1;
		piercing=0.15;
		type_str = "сабля";
		form = 2;
		weight=weight*0.9;
		
image_str=image_str+"\\Sabres\\";
		
if (material==1)
{
	image_str=image_str+"Дерево.png";
}
if (material==2)
{
	image_str=image_str+"Кость.png";
}
if (material==3)
{
	image_str=image_str+"ДеревоМаг.png";
}
if (material==4)
{
	image_str=image_str+"Бронза.png";
}
if ((material==5)|(material==8)|(material==9)|(material==11)|(material==14))
{
	image_str=image_str+"Сталь.png";
}
if (material==6)
{
	image_str=image_str+"КостьМаг.png";
}
if (material==7)
{
	image_str=image_str+"Кость.png";
}
if (material==10)
{
	image_str=image_str+"Изумруд.png";
}
if (material==12)
{
	image_str=image_str+"Янтарь.png";
}
if (material==13)
{
	image_str=image_str+"Магический.png";
}
	}
	if (type==4)
	{
		damage_modificator=0.3;
		attack_speed=2;
		piercing=0.05;
		type_str = "кинжал";
		form = 1;
		weight=weight*0.33;
		
image_str=image_str+"\\Knives\\";
		
		if (material==1)
		{
			image_str=image_str+"Дерево.png";
		}
		if (material==2)
		{
			image_str=image_str+"Кость.png";
		}
		if (material==3)
		{
			image_str=image_str+"ДеревоМаг.png";
		}
		if (material==4)
		{
			image_str=image_str+"Бронза.png";
		}
		if ((material==5)|(material==8)|(material==9)|(material==11)|(material==14))
		{
			image_str=image_str+"Сталь.png";
		}
		if (material==6)
		{
			image_str=image_str+"КостьМаг.png";
		}
		if (material==7)
		{
			image_str=image_str+"Кость.png";
		}
		if (material==10)
		{
			image_str=image_str+"Изумруд.png";
		}
		if (material==12)
		{
			image_str=image_str+"Янтарь.png";
		}
		if (material==13)
		{
			image_str=image_str+"Магический.png";
		}
	}
	if (type==5)
	{
		position_x=0;
		position_y=-40;
		damage_modificator=1.5;
		attack_speed=0.5;
		piercing=0.4;
		type_str = "топор";
		form = 1;
		weight=weight*1.75;
		
image_str=image_str+"\\Axes\\";
		
		if (material==1)
		{
			image_str=image_str+"ТопорДерево.png";
		}
		if (material==2)
		{
			image_str=image_str+"ТопорКость.png";
		}
		if (material==3)
		{
			image_str=image_str+"ТопорМагДерево.png";
		}
		if (material==4)
		{
			image_str=image_str+"ТопорБронза.png";
		}
		if ((material==5)|(material==8)|(material==9)|(material==11)|(material==14))
		{
			image_str=image_str+"ТопорСталь.png";
		}
		if (material==6)
		{
			image_str=image_str+"ТопорКостьМаг.png";
		}
		if (material==7)
		{
			image_str=image_str+"ТопорКость.png";
		}
		if (material==10)
		{
			image_str=image_str+"ТопорЭмеральд.png";
		}
		if (material==12)
		{
			image_str=image_str+"ТопорЯнтарь.png";
		}
		if (material==13)
		{
			image_str=image_str+"ТопорМагический.png";
		}
	}
	if (type==6)
	{
		damage_modificator=2.5;
		attack_speed=0.5;
		piercing=0.5;
		type_str = "секира";
		form = 2;
		weight=weight*2;
		position_y=-40;
		
image_str=image_str+"\\Battleaxes\\";
		
		if (material==1)
		{
			image_str=image_str+"ТопорДерево2руки.png";
		}
		if (material==2)
		{
			image_str=image_str+"ТопорКость2руки.png";
		}
		if (material==3)
		{
			image_str=image_str+"ТопорДеревоМаг2руки.png";
		}
		if (material==4)
		{
			image_str=image_str+"ТопорБронза2руки.png";
		}
		if ((material==5)|(material==8)|(material==9)|(material==11)|(material==14))
		{
			image_str=image_str+"ТопорСталь2руки.png";
		}
		if (material==6)
		{
			image_str=image_str+"ТопорКостьМаг2руки.png";
		}
		if (material==7)
		{
			image_str=image_str+"ТопорКость2руки.png";
		}
		if (material==10)
		{
			image_str=image_str+"ТопорИзумруд2руки.png";
		}
		if (material==12)
		{
			image_str=image_str+"ТопорЯнтарь2руки.png";
		}
		if (material==13)
		{
			image_str=image_str+"ТопорМагический2руки.png";
		}
	}
	if (type==7)
	{
		damage_modificator=3;
		attack_speed=0.4;
		piercing=0.75;
		type_str = "молот";
		form = 1;
		weight=weight*3;
		
image_str=image_str+"\\Battlehammers\\";
		
		if (material==1)
		{
			image_str=image_str+"МолотДерево.png";
		}
		if (material==2)
		{
			image_str=image_str+"МолотКость.png";
		}
		if (material==3)
		{
			image_str=image_str+"МолотЗачарДерево.png";
		}
		if (material==4)
		{
			image_str=image_str+"МолотБронза.png";
		}
		if ((material==5)|(material==8)|(material==9)|(material==11)|(material==14))
		{
			image_str=image_str+"МолотСталь.png";
		}
		if (material==6)
		{
			image_str=image_str+"МолотКостьМаг.png";
		}
		if (material==7)
		{
			image_str=image_str+"МолотКость.png";
		}
		if (material==10)
		{
			image_str=image_str+"МолотЭмеральд.png";
		}
		if (material==12)
		{
			image_str=image_str+"МолотЯнтарь.png";
		}
		if (material==13)
		{
			image_str=image_str+"МолотМагический.png";
		}
	}
	if (type==8)
	{
		damage_modificator=2;
		attack_speed=0.5;
		piercing=0.3;
		type_str = "копье";
		form = 3;
		weight=weight*1.25;
		
image_str=image_str+"\\Spears\\";
		
		if (material==1)
		{
			image_str=image_str+"Дерево.png";
		}
		if (material==2)
		{
			image_str=image_str+"Кость.png";
		}
		if (material==3)
		{
			image_str=image_str+"ДеревоМаг.png";
		}
		if (material==4)
		{
			image_str=image_str+"Бронза.png";
		}
		if ((material==5)|(material==8)|(material==9)|(material==11)|(material==14))
		{
			image_str=image_str+"Сталь.png";
		}
		if (material==6)
		{
			image_str=image_str+"КостьМаг.png";
		}
		if (material==7)
		{
			image_str=image_str+"Кость.png";
		}
		if (material==10)
		{
			image_str=image_str+"Изумруд.png";
		}
		if (material==12)
		{
			image_str=image_str+"Янтарь.png";
		}
		if (material==13)
		{
			image_str=image_str+"Кристалл.png";
		}
	}
	if (type==9)
	{
		damage_modificator=1;
		attack_speed=0.5;
		piercing=0.2;
		type_str = "посох";
		form = 1;
		weight=weight*1.75;
		
image_str=image_str+"\\Staffs\\";
		
		if (material==1)
		{
			image_str=image_str+"Дерево.png";
		}
		if (material==2)
		{
			image_str=image_str+"Кость.png";
		}
		if (material==3)
		{
			image_str=image_str+"ДеревоМаг.png";
		}
		if (material==4)
		{
			image_str=image_str+"Бронза.png";
		}
		if ((material==5)|(material==8)|(material==9)|(material==11)|(material==14))
		{
			image_str=image_str+"Сталь.png";
		}
		if (material==6)
		{
			image_str=image_str+"КостьМаг.png";
		}
		if (material==7)
		{
			image_str=image_str+"Кость.png";
		}
		if (material==10)
		{
			image_str=image_str+"Изумруд.png";
		}
		if (material==12)
		{
			image_str=image_str+"Янтарь.png";
		}
		if (material==13)
		{
			image_str=image_str+"Кристалл.png";
		}
	}
	
rnd1000=(int)(Math.random()*100);

	
	if (rnd1000>=70)
    {
	  if ((material==1)|(material==2)|(material==3)|(material==6))
	  {
		  if (form==1)
		  {
			  rusty_str = "потрескавшийся";  
		  }
		  if (form==2)
		  {
			  rusty_str = "потрескавшаяся"; 
		  }
		  if (form==3)
		  {
			  rusty_str = "потрескавшееся";
		  }
		
	  }
	  if ((material==4)|(material==5)|(material==8)|(material==9)|(material==11)|(material==14))
	  {
		  if (form==1)
		  {
			  rusty_str = "ржавый";  
		  }
		  if (form==2)
		  {
			  rusty_str = "ржавая"; 
		  }
		  if (form==3)
		  {
			  rusty_str = "ржавое";
		  }
	  }
	  if ((material==7)|(material==10)|(material==12)|(material==13))
	  {
		  if (form==1)
		  {
			  rusty_str = "потускневший";  
		  }
		  if (form==2)
		  {
			  rusty_str = "потускневшая"; 
		  }
		  if (form==3)
		  {
			  rusty_str = "потускневшее";
		  }
	  }
	  durability = durability*2/3;
	  rusty = true;
    }
rnd1000=(int)(Math.random()*100);
name ="";
	
	/*if (rnd1000<=10)
	{
		 if (form==1)
		  {
			  name = "зачарованный";  
		  }
		  if (form==2)
		  {
			  name = "зачарованная"; 
		  }
		  if (form==3)
		  {
			  name = "зачарованное";
		  }
	}*/
	
	damage=(int) (damage*damage_modificator);
attack_speed = 1/(attack_speed+0.0001);
current_durability=durability*(((int)(Math.random()*700)+300)+((int)(Math.random()*700)+300)+((int)(Math.random()*700)+300))/3000;

power=(int)((damage*attack_speed*piercing*Math.sqrt(current_durability))/Math.sqrt((weight)));

if (damage==0)
{
	damage_str="отсутствует";
}
else if ((damage>0)&(damage<=5))
{
	damage_str="почти отсутствует";
}
else if ((damage>5)&(damage<=15))
{
	damage_str="незначительный";
}
else if ((damage>15)&(damage<=25))
{
	damage_str="слабый";
}
else if ((damage>25)&(damage<=35))
{
	damage_str="средний";
}
else if ((damage>35)&(damage<=50))
{
	damage_str="выше среднего";
}
else if ((damage>50)&(damage<=70))
{
	damage_str="высокий";
}
else if ((damage>70)&(damage<=100))
{
	damage_str="героический";
}
else
{
	damage_str="трансцендентный";
}
damage_str="Урон: "+damage_str;


if (durability==0)
{
	durability_str="отсутствует";
}
else if ((durability>0)&(durability<=300))
{
	durability_str="крайне низкая";
}
else if ((durability>300)&(durability<=1000))
{
	durability_str="низкая";
}
else if ((durability>1000)&(durability<=2000))
{
	durability_str="ниже среднего";
}
else if ((durability>2000)&(durability<=5000))
{
	durability_str="средняя";
}
else if ((durability>5000)&(durability<=7000))
{
	durability_str="выше среднего";
}
else if ((durability>7000)&(durability<=12000))
{
	durability_str="высокая";
}
else if ((durability>12000)&(durability<=20000))
{
	durability_str="огромная";
}
else if ((durability>20000)&(durability<=150000))
{
	durability_str="героическая";
}
else
{
	durability_str="трансцендентная";
}

durability_str ="Прочноcть: " +durability_str;

if ((weight>0.1)&(weight<1))
{
	weight_str="почти невесомый";
}
else if ((weight>=1)&(weight<=2))
{
	weight_str="легкий";
}
else if ((weight>2)&(weight<=3.3))
{
	weight_str="довольно легкий";
}
else if ((weight>3.3)&(weight<=5))
{
	weight_str="средний";
}
else if ((weight>5)&(weight<=8))
{
	weight_str="большой";
}
else if ((weight>8)&(weight<=12))
{
	weight_str="очень большой";
}
else
{
	weight_str="трансцендентный";
}
weight_str = "Вес: "+weight_str;


if ((attack_speed<0.5)&(attack_speed>0.33))
{
	attack_speed_str="крайне высокая";
}
else if ((attack_speed<0.75)&(attack_speed>0.5))
{
	attack_speed_str="высокая";
}
else if ((attack_speed<1.25)&(attack_speed>0.75))
{
	attack_speed_str="средняя";
}
else if ((attack_speed<5)&(attack_speed>1.5))
{
	attack_speed_str="низкая";
}
else
{
	attack_speed_str="трансцендентная";
}
attack_speed_str="Скорость атаки: "+attack_speed_str;

try {
	img = ImageIO.read(new File(image_str));
} catch (IOException e) {
	System.out.println("failed to load "+image_str);
}
name = name + " "+ rusty_str + " "+ type_str+" "+ material_str;
power_str="Ценность по шкале Хордвига: "+(int)(Math.log(power)/Math.log(2))+" из 24";
description =damage_str+"\n"+durability_str+"\n"+weight_str+"\n"+attack_speed_str+"\n"+power_str+"\n";
additional_description = descriptions.materials_descriptions[material]+"\n"+descriptions.types_descriptions[type];


}

}
