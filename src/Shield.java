
public class Shield {
	public int durability,current_durability,material,material2=0, rnd1000,type, form;
	public double weight, power;
	public boolean enchanted, corrupted, rusty, cursed, pre=true;
	public String material_str="", name="", type_str="", rusty_str="",material_str2="",image_str=descriptions.directory+"\\Textures",image_str2=descriptions.directory+"\\Textures",type_image_str=descriptions.directory+"\\Textures";
public void generate()
	{
		rnd1000=(int)(Math.random()*1000);
	
if ((rnd1000>=0)&(rnd1000<500))
{
	material = 1;	
}
if ((rnd1000>=500)&(rnd1000<700))
{
	material = 2;		
}
if ((rnd1000>=700)&(rnd1000<800))
{
	material = 3;	
}
if ((rnd1000>=800)&(rnd1000<900))
{
	material = 4;	
}
if ((rnd1000>=900)&(rnd1000<930))
{
	material = 5;	
}
if ((rnd1000>=930)&(rnd1000<980))
{
	material = 6;	
}
if ((rnd1000>=980)&(rnd1000<990))
{
	material = 8;	
}
if ((rnd1000>=990)&(rnd1000<995))
{
	material = 9;	
}
if ((rnd1000>=995)&(rnd1000<999))
{
	material =11 ;	
}
if ((rnd1000>=999)&(rnd1000<1000))
{
	material = 14;	
}

     if ((material==1)|(material==2)|(material==3)|(material==4))
       {
    	 rnd1000=(int)(Math.random()*10000);
    	 if ((rnd1000>=0)&(rnd1000<1500))
    	 {
    	 	material2 = 15;	
    	 }
    	 if ((rnd1000>=1500)&(rnd1000<1800))
    	 {
    	 	material2 = 16;		
    	 }
    	 if ((rnd1000>=1800)&(rnd1000<1900))
    	 {
    	 	material2 = 4;	
    	 }
    	 if ((rnd1000>=1900)&(rnd1000<1950))
    	 {
    	 	material2 = 5;	
    	 }
    	 if ((rnd1000>=1950)&(rnd1000<2000))
    	 {
    	 	material2 = 8;	
    	 }
    	 
       }
     rnd1000=(int)(Math.random()*10);
     if ((rnd1000>=0)&(rnd1000<1))
	 {
	 	type = 1;	
	 }
     if ((rnd1000>=1)&(rnd1000<3))
	 {
	 	type = 2 ;	
	 }
     if ((rnd1000>=3)&(rnd1000<7))
	 {
	 	type = 4 ;	
	 }
     if ((rnd1000>=7)&(rnd1000<9))
	 {
	 	type = 6 ;	
	 }
     if ((rnd1000>=9)&(rnd1000<10))
	 {
	 	type = 8;	
	 }
     calculate();
  }

public void calculate()
    {
    	if (material==1)
        {
    	material_str="���������� ";
    	durability=1000;
    	weight=0.5;
    	image_str=image_str+"\\Materials\\������.png";
    	}
    	if (material==2)
	    {
		material_str="�������� ";
		durability=1500;
		weight=0.65;
		image_str=image_str+"\\Materials\\�����.png";
		}
    	if (material==3)
	    {
		material_str="�� ������������� ������ ";
		durability=4000;
		weight=1.5;
		pre = false;
		image_str=image_str+"\\Materials\\���������.png";
		}
    	if (material==4)
	    {
		material_str="��������� ";
		durability=10000;
		weight=1.8;
		image_str=image_str+"\\Materials\\������.png";
		}
    	if (material==5)
	    {
		material_str="�������� ";
		durability=35000;
		weight=0.65;
		image_str=image_str+"\\Materials\\�����.png";
		}
    	if (material==6)
	    {
		material_str="�� ������������ ����� ";
		durability=6000;
		weight=1.8;
		pre = false;
		image_str=image_str+"\\Materials\\�����.png";
		}
    	if (material==8)
	    {
		material_str="�������� ";
		durability=50000;
		weight=1.8;
		image_str=image_str+".png";
		}
    	if (material==9)
	    {
		material_str="�� ���������� ����� ";
		durability=75000;
		weight=1.8;
		pre = false;
		image_str=image_str+"\\Materials\\�����.png";
		}
    	if (material==11)
	    {
		material_str="�� �������� ����� ";
		durability=120000;
		weight=1.8;
		pre = false;
		image_str=image_str+"\\Materials\\�����.png";
		}
    	if (material==14)
	    {
		material_str="�� ���������� ����� ";
		durability=1000000;
		weight=1.8;
		pre = false;
		image_str=image_str+"\\Materials\\�����.png";
		}
    	
    	
    	
        if (material2==15)
        {
        	material_str2="�����";
        	durability=durability+1000;
        	weight=weight+0.2;
        	image_str2=image_str2+"\\Materials\\����.png";
        }
        if (material2==16)
        {
        	material_str2="����� ������";
        	durability=durability+2000;
        	weight=weight+0.25;
        	image_str2=image_str2+"\\Materials\\����������.png";
        }
        if (material2==4)
        {
        	material_str2="�������";
        	durability=durability+5000;
        	weight=weight+0.75;
        	image_str2=image_str2+"\\Materials\\������.png";
        }
        if (material2==5)
        {
        	material_str2="�������";
        	durability=durability+17500;
        	weight=weight+0.9;
        	image_str2=image_str2+"\\Materials\\�����.png";
        }
        if (material2==8)
        {
        	material_str2="������";
        	durability=durability+25000;
        	weight=weight+0.9;
        	image_str2=image_str2+"\\Materials\\�����.png";
        }
        if (material2==9)
        {
        	material_str2="���������� ������";
        	durability=durability+37500;
        	weight=weight+0.9;
        	image_str2=image_str2+"\\Materials\\�����.png";
        }
        if (material2==11)
        {
        	material_str2="�������� ������";
        	durability=durability+60000;
        	weight=weight+0.9;
        	image_str2=image_str2+"\\Materials\\�����.png";
        }
        if (material2==14)
        {
        	material_str2="���������� ������";
        	durability=durability+1000000;
        	weight=weight+0.9;
        	image_str2=image_str2+"\\Materials\\�����.png";
        }
       
    		weight= weight*1;
    		if (type==1)
    		{
    			name="��������� ";	
    		}
    		if (type==2)
    		{
    			name="��������� ";	
    		}
    		if (type==4)
    		{
    			name=" ";	
    		}
    		if (type==6)
    		{
    			name="������� ";	
    		}
    		if (type==8)
    		{
    			name="�������� ";	
    		}
    		
    		rnd1000 = (int)(Math.random()*4)+1;
    		if (rnd1000==1)
    		{
    			type_image_str=type_image_str+"\\Shields\\����������.png";
    		}
    		if (rnd1000==2)
    		{
    			type_image_str=type_image_str+"\\Shields\\����������.png";
    		}
    		if (rnd1000==3)
    		{
    			type_image_str=type_image_str+"\\Shields\\�������.png";
    		}
    		if (rnd1000==4)
    		{
    			type_image_str=type_image_str+"\\Shields\\����������������.png";
    		}
    	
    	
    	current_durability=durability*(((int)(Math.random()*700)+300)+((int)(Math.random()*700)+300)+((int)(Math.random()*700)+300))/1000;
    	if (pre==true)
    	{
    		name = name + material_str + "��� ";
    	}
    	else
    	{
    		name = name + "��� " + material_str ;
    	}
    	if (material2!=0)
    	{
    		name=name+"������� "+ material_str2+".";
    	}
    	power=(int)((Math.sqrt(current_durability)*type)/(weight));
    }
}
