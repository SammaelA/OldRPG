import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Armor extends Item {
	public int material, rnd1000,type, form;
	public double weight,armor,durability,current_durability, power;
	public boolean enchanted, corrupted, rusty, cursed, pre=true;
	public String material_str="", type_str="", rusty_str="",form_str,armor_str,durability_str,current_durability_str,weight_str,power_str,
     form_image_str=descriptions.directory+"\\Textures\\Armor",
     type_image_str=descriptions.directory+"\\Textures\\Armor";
	public Image type_img;
	public  Armor(int gen_type)
	{
		if (gen_type==0)
		{
			rnd1000=(int)(Math.random()*100);
			
			if ((rnd1000>=0)&(rnd1000<50))
	   	    {
	   	 	material = 15;	
	   	    }
			if ((rnd1000>=50)&(rnd1000<70))
	   	    {
	   	 	material = 16;	
	   	    }
			if ((rnd1000>=70)&(rnd1000<75))
	   	    {
	   	 	material = 4;	
	   	    }
	   	    if ((rnd1000>=75)&(rnd1000<95))
		    {
		 	material = 5;	
		    }
	   	    if ((rnd1000>=95)&(rnd1000<99))
		    {
		 	material = 7;	
		    }
	     	if ((rnd1000>=99)&(rnd1000<100))
		    {
		 	material = 8;	
		    }
	     	
	     	
	     	if ((material==15)|(material==16))
	     	{
	     		type=4;
	     	}
	     	else
	     	{
	     		rnd1000=(int)(Math.random()*10);
	     		if ((rnd1000>=0)&(rnd1000<5))
	    	    {
	    	 	type = 1 ;	
	    	    }
	     		if ((rnd1000>=5)&(rnd1000<7))
	    	    {
	    	 	type = 2 ;	
	    	    }
	     		if ((rnd1000>=7)&(rnd1000<9))
	    	    {
	    	 	type = 3;	
	    	    }
	     		if ((rnd1000>=9)&(rnd1000<10))
	    	    {
	    	 	type = 4;	
	    	    }
	     	}
	     form = (int)(Math.random()*7);
		}
		else if (gen_type==1)
		{

			rnd1000=(int)(Math.random()*10);
			
				rnd1000=(int)(Math.random()*100);
				
				if ((rnd1000>=0)&(rnd1000<50))
		   	    {
		   	 	material = 15;	
		   	    }
				if ((rnd1000>=50)&(rnd1000<70))
		   	    {
		   	 	material = 16;	
		   	    }
				if ((rnd1000>=70)&(rnd1000<75))
		   	    {
		   	 	material = 4;	
		   	    }
		   	    if ((rnd1000>=75)&(rnd1000<95))
			    {
			 	material = 5;	
			    }
		   	    if ((rnd1000>=95)&(rnd1000<99))
			    {
			 	material = 7;	
			    }
		     	if ((rnd1000>=99)&(rnd1000<100))
			    {
			 	material = 8;	
			    }
		     	
		     	
		     	if ((material==15)|(material==16))
		     	{
		     		type=4;
		     	}
		     	else
		     	{
		     		rnd1000=(int)(Math.random()*10);
		     		if ((rnd1000>=0)&(rnd1000<5))
		    	    {
		    	 	type = 1 ;	
		    	    }
		     		if ((rnd1000>=5)&(rnd1000<7))
		    	    {
		    	 	type = 2 ;	
		    	    }
		     		if ((rnd1000>=7)&(rnd1000<9))
		    	    {
		    	 	type = 3;	
		    	    }
		     		if ((rnd1000>=9)&(rnd1000<10))
		    	    {
		    	 	type = 4;	
		    	    }
		     	}
		     
		     	
		     	make_form();
		     	
		     	
		    	
		}
	    	calculate();
	}
 
 public void calculate()
 {
	 subclass=20+form;
	 if (material==15)
	 {
		 armor=7;
		 durability=300;
		 weight=2;
		 if ((form==0)|(form==3))
		 {
		 material_str="������� ";
		 }
		 else
		 {
		 material_str="������� ";
		 }
		
	 }
	 if (material==16)
	 {
		 armor=10;
		 durability=500;
		 weight=2.5;
		 material_str=" �� ���� ������";
		 pre=false;
	
	 }
	 if (material==4)
	 {
		 armor=25;
		 durability=1250;
		 weight=5;
		 if ((form==0)|(form==3))
		 {
		 material_str="��������� ";
		 }
		 else
		 {
		 material_str="��������� ";
		 }
		
	 }
	 if (material==5)
	 {
		 armor=35;
		 durability=3500;
		 weight=6;
		 if ((form==0)|(form==3))
		 {
		 material_str="�������� ";
		 }
		 else
		 {
		 material_str="�������� ";
		 }
		
	 }
	 if (material==7)
	 {
		 armor=40;
		 durability=6000;
		 weight=6;
		 if ((form==0)|(form==3))
		 {
		 material_str="�������� ";
		 }
		 else
		 {
		 material_str="�������� ";
		 }
		
	 }
	 if (material==8)
	 {
		 armor=45;
		 durability=13500;
		 weight=6;
		 material_str=" �� ���������� �����";
		 pre=false;
		 
	 }
	 if (material==11)
	 {
		 armor=50;
		 durability=25000;
		 weight=6;
		 material_str=" �� �������� �����";
		 pre=false;
		
	 }
	 if (material==14)
	 {
		 armor=65;
		 durability=130000;
		 weight=6;
		 material_str=" �� ���������� �����";
		 pre=false;
	
	 }
	 
	 if (type==1)
	 {
		 armor=armor*1;
		 durability=durability*0.75;
		 weight=weight*0.75;
		 if ((form==0)|(form==3))
		 {
		 type_str="���������� ";
		 }
		 else
		 {
		 type_str="���������� ";
		 }
		 if (form==0)
		 {
			 type_image_str=type_image_str+"\\����\\������������.png";
		 }
		 if (form==1)
		 {
			 type_image_str=type_image_str+"\\����������\\������������������.png";
		 }
		 if (form==2)
		 {
			 type_image_str=type_image_str+"\\������\\��������������.png";
		 }
		 if (form==3)
		 {
			 type_image_str=type_image_str+"\\���������\\�����������������.png";
		 }
		 if (form==4)
		 {
			 type_image_str=type_image_str+"\\������\\��������������.png";
		 }
		 if (form==5)
		 {
			 type_image_str=type_image_str+"\\�������\\���������������.png";
		 }
		 if (form==6)
		 {
			 type_image_str=type_image_str+"\\��������\\����������������.png";
		 }
	 }
	 if (type==2)
	 {
		 armor=armor*0.67;
		 durability=durability*0.5;
		 weight=weight*0.75;
		 if ((form==0)|(form==3))
		 {
		 type_str="���������� ";
		 }
		 else
		 {
		 type_str="���������� ";
		 }
		 if (form==0)
		 {
			 type_image_str=type_image_str+"\\����\\�����������.png";
		 }
		 if (form==1)
		 {
			 type_image_str=type_image_str+"\\����������\\�����������������.png";
		 }
		 if (form==2)
		 {
			 type_image_str=type_image_str+"\\������\\�������������.png";
		 }
		 if (form==3)
		 {
			 type_image_str=type_image_str+"\\���������\\����������������.png";
		 }
		 if (form==4)
		 {
			 type_image_str=type_image_str+"\\������\\�������������.png";
		 }
		 if (form==5)
		 {
			 type_image_str=type_image_str+"\\�������\\��������������.png";
		 }
		 if (form==6)
		 {
			 type_image_str=type_image_str+"\\��������\\���������������.png";
		 }
		
	 }
	 if (type==3)
	 {
		 armor=armor*1.25;
		 durability=durability*1;
		 weight=weight*1;
		 if ((form==0)|(form==3))
		 {
		 type_str="������������ ";
		 }
		 else
		 {
		 type_str="������������ ";
		 }
		 if (form==0)
		 {
			 type_image_str=type_image_str+"\\����\\�����������.png";
		 }
		 if (form==1)
		 {
			 type_image_str=type_image_str+"\\����������\\���������������.png";
		 }
		 if (form==2)
		 {
			 type_image_str=type_image_str+"\\������\\�����������.png";
		 }
		 if (form==3)
		 {
			 type_image_str=type_image_str+"\\���������\\��������������.png";
		 }
		 if (form==4)
		 {
			 type_image_str=type_image_str+"\\������\\�����������.png";
		 }
		 if (form==5)
		 {
			 type_image_str=type_image_str+"\\�������\\������������.png";
		 }
		 if (form==6)
		 {
			 type_image_str=type_image_str+"\\��������\\�������������.png";
		 }
	 }
	 if (type==4)
	 {
		 armor=armor*1.5;
		 durability=durability*1.5;
		 weight=weight*1;
		 type_image_str=type_image_str+".png";
		 
	 }
	 if (form==0)
	 {
		 armor=armor*1.5;
		 durability=durability*1.25;
		 weight=weight*1;
		 form_str="����";
		 
		 form_image_str=form_image_str+"\\����\\����";
		 
		 if(material==4)
		 {
			 form_image_str=form_image_str+"������.png";
		 }
		 if(material==15)
		 {
			 form_image_str=form_image_str+"����.png";
		 }
		 if(material==16)
		 {
			 form_image_str=form_image_str+"����������.png"; 
		 }
		  if ((material>4)&(material<15))
		 {
			 form_image_str=form_image_str+"�����.png";
		 }
		
		 
	 }
	 if (form==1)
	 {
		 armor=armor*1;
		 durability=durability*1;
		 weight=weight*1;
		 form_str="����������";
form_image_str=form_image_str+"\\����������\\����������";
		 
		 if(material==4)
		 {
			 form_image_str=form_image_str+"������.png";
		 }
		 if(material==15)
		 {
			 form_image_str=form_image_str+"����.png";
		 }
		 if(material==16)
		 {
			 form_image_str=form_image_str+"����������.png"; 
		 }
		 if ((material>4)&(material<15))
		 {
			 form_image_str=form_image_str+"�����.png";
		 }
	 }
	 if (form==2)
	 {
		 armor=armor*0.75;
		 durability=durability*1;
		 weight=weight*0.5;
		 form_str="������";
form_image_str=form_image_str+"\\������\\������";
		 
		 if(material==4)
		 {
			 form_image_str=form_image_str+"������.png";
		 }
		 if(material==15)
		 {
			 form_image_str=form_image_str+"����.png";
		 }
		 if(material==16)
		 {
			 form_image_str=form_image_str+"����������.png"; 
		 }
		if ((material>4)&(material<15))
		 {
			 form_image_str=form_image_str+"�����.png";
		 }
	 }
	 if (form==3)
	 {
		 armor=armor*2;
		 durability=durability*1.5;
		 weight=weight*1.5;
		 form_str="���������";
form_image_str=form_image_str+"\\���������\\������";
		 
		 if(material==4)
		 {
			 form_image_str=form_image_str+"������.png";
		 }
		 if(material==15)
		 {
			 form_image_str=form_image_str+"����.png";
		 }
		 if(material==16)
		 {
			 form_image_str=form_image_str+"����������.png"; 
		 } 
		if ((material>4)&(material<15))
		 {
			 form_image_str=form_image_str+"�����.png";
		 }
	 }
	 if (form==4)
	 {
		 armor=armor*1;
		 durability=durability*1;
		 weight=weight*1;
		 form_str="������";
form_image_str=form_image_str+"\\������\\������";
		 
		 if(material==4)
		 {
			 form_image_str=form_image_str+"������.png";
		 }
		 if(material==15)
		 {
			 form_image_str=form_image_str+"����.png";
		 }
		 if(material==16)
		 {
			 form_image_str=form_image_str+"����������.png"; 
		 }
		if ((material>4)&(material<15))
		 {
			 form_image_str=form_image_str+"�����.png";
		 }
	 }
	 if (form==5)
	 {
		 armor=armor*0.67;
		 durability=durability*0.75;
		 weight=weight*0.67;
		 form_str="�������";
form_image_str=form_image_str+"\\�������\\�������";
		 
		 if(material==4)
		 {
			 form_image_str=form_image_str+"������.png";
		 }
		 if(material==15)
		 {
			 form_image_str=form_image_str+"����.png";
		 }
		 if(material==16)
		 {
			 form_image_str=form_image_str+"����������.png"; 
		 }
		 if ((material>4)&(material<15))
		 {
			 form_image_str=form_image_str+"�����.png";
		 }
	 }
	 if (form==6)
	 {
		 armor=armor*0.5;
		 durability=durability*0.75;
		 weight=weight*0.5;
		 form_str="��������";
form_image_str=form_image_str+"\\��������\\��������";
		 
		 if(material==4)
		 {
			 form_image_str=form_image_str+"������.png";
		 }
		 if(material==15)
		 {
			 form_image_str=form_image_str+"����.png";
		 }
		 if(material==16)
		 {
			 form_image_str=form_image_str+"����������.png"; 
		 }
		if ((material>4)&(material<15))
		 { 
			 form_image_str=form_image_str+"�����.png";
		 }
	 }
	 current_durability=durability*(((int)(Math.random()*700)+300)+((int)(Math.random()*700)+300)+((int)(Math.random()*700)+300))/1000;
	 if (pre==true)
	 {
		 name= material_str+type_str+form_str+"  ";
	 }
	 else 
	 {
		 name= type_str+form_str+material_str+"  ";
	 }
	
	 
	if (armor==0)
	{
		armor_str="�����������";
	}
	else if ((armor>0)&(armor<=5))
	{
		armor_str="����� �����������";
	}
	else if ((armor>5)&(armor<=15))
	{
		armor_str="��������������";
	}
	else if ((armor>15)&(armor<=25))
	{
		armor_str="������";
	}
	else if ((armor>25)&(armor<=35))
	{
		armor_str="�������";
	}
	else if ((armor>35)&(armor<=50))
	{
		armor_str="���� ��������";
	}
	else if ((armor>50)&(armor<=70))
	{
		armor_str="�������";
	}
	else if ((armor>70)&(armor<=100))
	{
		armor_str="�����������";
	}
	else
	{
		armor_str="���������������";
	}
	armor_str="������: "+armor_str;
	
	if (durability==0)
	{
		durability_str="�����������";
	}
	else if ((durability>0)&(durability<=300))
	{
		durability_str="������ ������";
	}
	else if ((durability>300)&(durability<=1000))
	{
		durability_str="������";
	}
	else if ((durability>1000)&(durability<=2000))
	{
		durability_str="���� ��������";
	}
	else if ((durability>2000)&(durability<=5000))
	{
		durability_str="�������";
	}
	else if ((durability>5000)&(durability<=7000))
	{
		durability_str="���� ��������";
	}
	else if ((durability>7000)&(durability<=12000))
	{
		durability_str="�������";
	}
	else if ((durability>12000)&(durability<=20000))
	{
		durability_str="��������";
	}
	else if ((durability>20000)&(durability<=150000))
	{
		durability_str="�����������";
	}
	else
	{
		durability_str="���������������";
	}
	
	durability_str ="������c��: " +durability_str;
	
	if ((weight>0.1)&(weight<1))
	{
		weight_str="����� ���������";
	}
	else if ((weight>=1)&(weight<=2))
	{
		weight_str="������";
	}
	else if ((weight>2)&(weight<=3.3))
	{
		weight_str="�������� ������";
	}
	else if ((weight>3.3)&(weight<=5))
	{
		weight_str="�������";
	}
	else if ((weight>5)&(weight<=8))
	{
		weight_str="�������";
	}
	else if ((weight>8)&(weight<=12))
	{
		weight_str="����� �������";
	}
	else
	{
		weight_str="���������������";
	}
	weight_str = "���: "+weight_str;
	
	try {
		
		type_img = ImageIO.read(new File(type_image_str));
	} catch (IOException e) {
		System.out.println("failed to load "+type_image_str);
	}
	try {
		img = ImageIO.read(new File(form_image_str));
		
	} catch (IOException e) {
		System.out.println("failed to load "+form_image_str);
	}
	
	 power=(int)(1000*(Math.pow(armor/35, 1.5))*(Math.pow(durability/3500, 0.5))*(1/(Math.pow(weight/6,1.5))));
	 power_str="�������� �� ����� ��������: "+(int)(Math.log(power)/Math.log(2))+" �� 24";
	 player.armors[form]=armor;
	 additional_description=descriptions.materials_descriptions[material]+"\n"+descriptions.armor_types_descriptions[type]+"\n"+descriptions.armor_forms_descriptions[form];
		description =armor_str+"\n"+durability_str+"\n"+weight_str+"\n"+power_str+"\n";

 }
 public void make_form()
 {
	 form=(int)(Math.random()*7);
	 int n=0;
	while((Buffer.first_armors[form]==true)&(n<100))
	{
		form=(int)(Math.random()*7);
		n++;
	}
	Buffer.first_armors[form] =true;
 }
}
