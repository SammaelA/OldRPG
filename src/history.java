import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class history {

	public static int estate,str,agi,intellegence,age,provincen,homeland_type,n,motivation;
	
	public static String estate_str,name,name2,pr1,pr2,age_str,town,province,homeland,char_str,other_str,j1,j2,education,h,motivation_str,end_str;
	static  String FileName=descriptions.directory+"\\Texts\\names.txt";
	
    public static void generate()
    {
    	intellegence= ((int)(Math.random()*100)+(int)(Math.random()*100)+(int)(Math.random()*100))/3;
        str =((int)(Math.random()*100)+(int)(Math.random()*100)+(int)(Math.random()*100))/3;
        agi =((int)(Math.random()*100)+(int)(Math.random()*100)+(int)(Math.random()*100))/3;
    	try {
			name=read(FileName);
			
		} catch (FileNotFoundException e) {}
    	try {
			name2=read2(FileName);
			
		} catch (FileNotFoundException e) {}
		generate_estate();
	    choose_prefics();
	    choose_age();
	    choose_homeland();
	    choose_character();
	    generate_other();
	    choose_parents_job();
	    choose_parents_job();
	    choose_edu();
	    choose_motivation();
	    
	    h="��� ����� - "+name+" "+pr1+" "+pr2+", "+estate_str+j2+"."+age_str+homeland+"."+j1+". "+education+char_str+other_str+motivation_str+end_str;
	    System.out.println(h);
    }
	public static void generate_estate()
	{
		int rnd100 = (int)(Math.random()*100);
		if ((rnd100>=0)&(rnd100<70))
		{
			estate=1;
			estate_str="����������";
			
		}
		if ((rnd100>=70)&(rnd100<90))
		{
			estate=2;
			estate_str="���������";
			
		}
		if ((rnd100>=90)&(rnd100<95))
		{
			estate=3;
			estate_str="������";
			agi = agi +15;
			str=str+15;
			
		}
		if ((rnd100>=95)&(rnd100<100))
		{
			estate=4;
			estate_str="���";
			intellegence = intellegence+50;
			
		}
		
	}
	public static void choose_prefics()
	{
		if (estate<=2)
		{
			pr1="���";
			pr2=name2+"�";
		    
		}
		
		if (estate==3)
		{
			int rnd100=(int)(Math.random()*3);
		if (rnd100==0)
		{
			generate_prefics();
		}
		
		if (rnd100==1)
		{
			generate_prefics1();
		}
		if (rnd100==2)
		{
			generate_prefics2();
		}
		}
		if (estate==4)
		{
			generate_prefics2();
		}
		
	}
	public static void generate_prefics()
	{
		int rnd100 =(int)(Math.random()*15)+1 ;
		 pr1 = "";
		if (rnd100==1)
		{pr1="������ ";}
		if (rnd100==2)
		{pr1="����� ";}
		if (rnd100==3)
		{pr1="���������� ";}
		if (rnd100==4)
		{pr1="������� ";}
		if (rnd100==5)
		{pr1="������������ ";}
		if (rnd100==6)
		{pr1="���������� ";}
		if (rnd100==7)
		{pr1="������������ ";}
		if (rnd100==8)
		{pr1="���� ";}
		if (rnd100==9)
		{pr1="���� ";}
		if (rnd100==10)
		{pr1="������ ";}
		if (rnd100==11)
		{pr1="��������� ";}
		if (rnd100==12)
		{pr1="����������� ";}
		if (rnd100==13)
		{pr1="����������� ";}
		if (rnd100==14)
		{pr1="�������� ";}
		if (rnd100==15)
		{pr1="��������� ";}
		int rnd2 =(int)(Math.random()*15)+1;
		 pr2 = "";
		if (rnd2 ==1)
		{ pr2="��������";}
		if (rnd2 ==2)
		{ pr2="�����";}
		if (rnd2 ==3)
		{ pr2="��������";}
		if (rnd2 ==4)
		{ pr2="��������";}
		if (rnd2 ==5)
		{ pr2="������";}
		if (rnd2 ==6)
		{ pr2="������";}
		if (rnd2 ==7)
		{ pr2="�����";}
		if (rnd2 ==8)
		{ pr2="������";}
		if (rnd2 ==9)
		{ pr2="������";}
		if (rnd2 ==10)
		{ pr2="������";}
		if (rnd2 ==11)
		{ pr2="���";}
		
		
	}
	public static void generate_prefics1()
	{
		int rnd100 = (int)(Math.random()*5)+1;
		if (rnd100==1)
		{
			pr1="�������";
		}
		if (rnd100==2)
		{
			pr1="������";
		}
		if (rnd100==3)
		{
			pr1="����";
		}
		if (rnd100==4)
		{
			pr1="�����";
		}
		if (rnd100==5)
		{
			pr1="�����";
		}
		rnd100 = (int)(Math.random()*5)+1;
		if (rnd100==1)
		{
			pr2="���������";
		}
		if (rnd100==2)
		{
			pr2="�������";
		}
		if (rnd100==3)
		{
			pr2="�������";
		}
		if (rnd100==4)
		{
			pr2="���������";
		}
		if (rnd100==5)
		{
			pr2="�����";
		}
	}
    public static void generate_prefics2()
	{
		int rnd100 = (int)(Math.random()*(28*2))-28;
		if (rnd100==0) {pr1="����� ";}
		if (rnd100==-1) {pr1="�������� ";}
		if (rnd100==-2) {pr1="�������� ";}	
		if (rnd100==-3) {pr1="��������";}	
		if (rnd100==-4) {pr1="������� ";}	
		if (rnd100==-5) {pr1="�������� ";}	
		if (rnd100==-6) {pr1="������ ";}	
		if (rnd100==-7) {pr1="������� ";}	
		if (rnd100==-8) {pr1="��������� ";}	
		if (rnd100==-9) {pr1="����������� ";}	
		if (rnd100==-10) {pr1="����������� ";}	
		if (rnd100==-11) {pr1="������� ";}	
		if (rnd100==-12) {pr1="��������������� ";}	
		if (rnd100==-13) {pr1="������� ";}	
		if (rnd100==-14) {pr1="������� ";}	
		if (rnd100==-15) {pr1="������� ";}	
		if (rnd100==-16) {pr1="�������� ";}	
		if (rnd100==-17) {pr1="��������� ";}	
		if (rnd100==-18) {pr1="��������� ";}	
		if (rnd100==-19) {pr1="���� ";}	
		if (rnd100==-20) {pr1="������������ ";}	
		if (rnd100==-21) {pr1="������ ";}	
		if (rnd100==-22) {pr1="�������� ";}	
		if (rnd100==-23) {pr1="������������ ";}	
		if (rnd100==-24) {pr1="�����";}	
		if (rnd100==-25) {pr1="����������� ";}	
		if (rnd100==-26) {pr1="��������� ";}	
		if (rnd100==-27) {pr1="��������� ";}	
		if (rnd100==-28) {pr1="��������� ";}	
		
		if (rnd100==1) {pr1="�������� ";}
		if (rnd100==2) {pr1="�������� ";}	
		if (rnd100==3) {pr1="��������";}	
		if (rnd100==4) {pr1="������� ";}	
		if (rnd100==5) {pr1="�������� ";}	
		if (rnd100==6) {pr1="������ ";}	
		if (rnd100==7) {pr1="������� ";}	
		if (rnd100==8) {pr1="��������� ";}	
		if (rnd100==9) {pr1="����������� ";}	
		if (rnd100==10) {pr1="����������� ";}	
		if (rnd100==11) {pr1="������� ";}	
		if (rnd100==12) {pr1="��������������� ";}	
		if (rnd100==13) {pr1="������� ";}	
		if (rnd100==14) {pr1="������� ";}	
		if (rnd100==15) {pr1="������� ";}	
		if (rnd100==16) {pr1="�������� ";}	
		if (rnd100==17) {pr1="��������� ";}	
		if (rnd100==18) {pr1="��������� ";}	
		if (rnd100==19) {pr1="���� ";}	
		if (rnd100==20) {pr1="������������ ";}	
		if (rnd100==21) {pr1="������ ";}	
		if (rnd100==22) {pr1="�������� ";}	
		if (rnd100==23) {pr1="������������ ";}	
		if (rnd100==24) {pr1="����� ";}	
		if (rnd100==25) {pr1="����������� ";}	
		if (rnd100==26) {pr1="��������� ";}	
		if (rnd100==27) {pr1="��������� ";}	
		if (rnd100==28) {pr1="��������� ";}	
		if (rnd100>0)
		{
		rnd100 = (int)(Math.random()*16);
		}
		else
		{
			rnd100 = (int)(Math.random()*5)-5;
		}
		if (rnd100==-5) {pr2="������ ";}
		if (rnd100==-4) {pr2="���� ";}
		if (rnd100==-3) {pr2="���� ";}
		if (rnd100==-2) {pr2="���� ";}
		if (rnd100==-1) {pr2="���� ";}
		if (rnd100==1) {pr2="��� ";}
		if (rnd100==2) {pr2="������ ";}
		if (rnd100==3) {pr2="���������� ";}
		if (rnd100==4) {pr2="������������ ";}
		if (rnd100==5) {pr2="���� ";}
		if (rnd100==6) {pr2="���� ";}
		if (rnd100==7) {pr2="����������� ";}
		if (rnd100==8) {pr2="����������� ";}
		if (rnd100==9) {pr2="������� ";}
		if (rnd100==10) {pr2="��������� ";}
		if (rnd100==11) {pr2="�������� ";}
		if (rnd100==12) {pr2="������� ";}
		if (rnd100==13) {pr2="������� ";}
		if (rnd100==14) {pr2="������� ";}
		if (rnd100==15) {pr2="����� ";}
		if (rnd100==16) {pr2="������ ";}
		
	}
    public  static void choose_age()
    {
    	if (pr1=="���")
    	{
    		age = ((int)(Math.random()*30)+(int)(Math.random()*30)+(int)(Math.random()*30)+45)/3;
    	}
    	else
    	{
    		age = ((int)(Math.random()*50)+(int)(Math.random()*50)+(int)(Math.random()*50)+69)/3;
    	}
    	int date = -1;
    	String bad_august ="�",
    			grammar = " ���.";
    	int rnd100 = (int)(Math.random()*5);
    	int month = (int)(Math.random()*12)+1;
    	String month_str = " ";
    	if (month==1) {month_str =" �����";
    	 date = (int)(Math.random()*31)+1;}
    	if (month==2) {month_str =" ������";
    	 date = (int)(Math.random()*28)+1;}
    	if (month==3) {month_str =" ����";
    	 date = (int)(Math.random()*31)+1;}
    	if (month==4) {month_str =" �����";
    	 date = (int)(Math.random()*30)+1;}
    	if (month==5) {month_str =" ��";
    	 date = (int)(Math.random()*31)+1;}
    	if (month==6) {month_str =" ���";
    	 date = (int)(Math.random()*30)+1;}
    	if (month==7) {month_str =" ���";
    	 date = (int)(Math.random()*31)+1;}
    	if (month==8) {month_str =" ������";
    	 date = (int)(Math.random()*31)+1;}
    	if (month==9) {month_str =" �������";
    	 date = (int)(Math.random()*30)+1;}
    	if (month==10) {month_str =" ������";
    	 date = (int)(Math.random()*31)+1;}
    	if (month==11) {month_str =" �����";
    	 date = (int)(Math.random()*30)+1;}
    	if (month==12) {month_str =" ������";
    	 date = (int)(Math.random()*31)+1;}
    	if ((month==8)|(month==3))
    	{
    		bad_august ="a";
    	}
    	
    	if(age %10 ==1)
    	{
    		grammar =" ���.";
    	}
    	if((age%10==2)|(age%10==3)|(age%10==4))
    	{
    		grammar =" ����.";
    	}
    	if (rnd100==0)
    	{
    		age_str=age+grammar+"������� "+date+month_str+bad_august+" "+(245-age)+" ���� ";
    	}
    	if (rnd100==1)
    	{
    		age_str="������� "+date+month_str+bad_august+" "+(245-age)+" ����"+"("+age+grammar+") ";
    	}
    	if (rnd100==2)
    	{
    		age_str="������� � "+month_str+"e"+" "+(245-age)+" ���� ";
    	}
    	if (rnd100==3)
    	{
    		age_str="������� � "+(245-age)+" ���� ";
    	}
    	if (rnd100==4)
    	{
    		age_str="������� "+date+month_str+bad_august+" "+(245-age)+" ���� ";
    	}
    	

    }
    public static void choose_homeland()
    {
    	
    	if (estate==1)
    	{
    		homeland_type = 1;
    	}
    	else
    	{
    		int rnd100 = (int)(Math.random()*2);
    		if (rnd100==0)
    		{
    			homeland_type = 2;
    		}
    		if (rnd100==1)
    		{
    			homeland_type = 4;
    		}
    
    	}
    	 
    	int rnd100 = (int)(Math.random()*10)+1;
    	if(rnd100==1)
    	{
    		province="������";
    	}
    	if(rnd100==2)
    	{
    		province="������";
    	}
    	if(rnd100==3)
    	{
    		province="�������";
    	}
    	if(rnd100==4)
    	{
    		province="������";
    	}
    	if(rnd100==5)
    	{
    		province="���������";
    	}
    	if(rnd100==6)
    	{
    		province="������";
    	}
    	if(rnd100==7)
    	{
    		province="����������";
    	}
    	if(rnd100==8)
    	{
    		province="������";
    	}
    	if(rnd100==9)
    	{
    		province="������";
    	}
    	if(rnd100==10)
    	{
    		province="���������";
    	}
    	if(rnd100==11)
    	{
    		province="������";
    	}
    	provincen=rnd100;
    	choose_town();
    	if (homeland_type ==1)
    	{
    		homeland ="� ��������� "+province+" � ������� ���� ������ "+town;
    	}
    	if (homeland_type ==2)
    	{
    		homeland ="� ��������� "+province+" � ������ "+town;
    	}
    	if (homeland_type ==3)
    	{
    		homeland ="� ��������� "+province+" � ������� ���� ������ "+town;
    	}
    	if (homeland_type ==4)
    	{
    		rnd100 = (int)(Math.random()*5);
    				if (rnd100==1)
    				{homeland = "� ����������";}
    				if (rnd100==2)
    				{homeland = "� ��������";}
    				if (rnd100==3)
    				{homeland = "� �������";}
    				if (rnd100==4)
    				{homeland = "� ���������";}
    				if (rnd100==5)
    				{homeland = "� ���������� �����";}
    				
    	}
    	
    }
    public static void choose_town()
    {
    	int rnd100=(int)(Math.random()*20);
    	if (provincen==1)//My own names
    	{
    		if(rnd100==0){town ="�������";}
    		if(rnd100==1){town ="������� ����";}
    		if(rnd100==2){town ="�������� ����";}
    		if(rnd100==3){town ="���������";}
    		if(rnd100==4){town ="������";}
    		if(rnd100==5){town ="������";}
    		if(rnd100==6){town ="�������";}
    		if(rnd100==7){town ="������ �����";}
    		if(rnd100==8){town ="�����";}
    		if(rnd100==9){town ="�������";}
    		if(rnd100==10){town ="��������� ������������ ��������";}
    		if(rnd100==11){town ="�������";}
    		if(rnd100==12){town ="������";}
    		if(rnd100==13){town ="�����";}
    		if(rnd100==14){town ="��������";}
    		if(rnd100==15){town ="������";}
    		if(rnd100==16){town ="������";}
    		if(rnd100==17){town ="�������";}
    		if(rnd100==18){town ="������";}
    		if(rnd100==19){town ="������";}
    	}
    	if (provincen==2)//South Korea
    	{
    		if(rnd100==0){town ="����";}
    		if(rnd100==1){town ="������";}
    		if(rnd100==2){town ="�����";}
    		if(rnd100==3){town ="������";}
    		if(rnd100==4){town ="�����";}
    		if(rnd100==5){town ="����";}
    		if(rnd100==6){town ="������";}
    		if(rnd100==7){town ="�������";}
    		if(rnd100==8){town ="������";}
    		if(rnd100==9){town ="����";}
    		if(rnd100==10){town ="������";}
    		if(rnd100==11){town ="������";}
    		if(rnd100==12){town ="�����";}
    		if(rnd100==13){town ="����";}
    		if(rnd100==14){town ="�����";}
    		if(rnd100==15){town ="������";}
    		if(rnd100==16){town ="����";}
    		if(rnd100==17){town ="�����";}
    		if(rnd100==18){town ="������";}
    		if(rnd100==19){town ="����";}
    	}
    	if (provincen==3)//Spain
    	{
    		if(rnd100==0){town ="������";}
    		if(rnd100==1){town ="������";}
    		if(rnd100==2){town ="�������";}
    		if(rnd100==3){town ="����";}
    		if(rnd100==4){town ="�����";}
    		if(rnd100==5){town ="�������";}
    		if(rnd100==6){town ="�������";}
    		if(rnd100==7){town ="������";}
    		if(rnd100==8){town ="�����";}
    		if(rnd100==9){town ="��������";}
    		if(rnd100==10){town ="��������";}
    		if(rnd100==11){town ="��������";}
    		if(rnd100==12){town ="��������";}
    		if(rnd100==13){town ="���������";}
    		if(rnd100==14){town ="���������";}
    		if(rnd100==15){town ="�������";}
    		if(rnd100==16){town ="�������";}
    		if(rnd100==17){town ="�����";}
    		if(rnd100==18){town ="��-�������";}
    		if(rnd100==19){town ="	�������";}
    	}
    	if (provincen==4)//South Africa
    	{
    		if(rnd100==0){town ="������";}
    		if(rnd100==1){town ="������";}
    		if(rnd100==2){town ="�������";}
    		if(rnd100==3){town ="��������";}
    		if(rnd100==4){town ="��������";}
    		if(rnd100==5){town ="����������";}
    		if(rnd100==6){town ="�����������";}
    		if(rnd100==7){town ="���������";}
    		if(rnd100==8){town ="�������";}
    		if(rnd100==9){town ="����������";}
    		if(rnd100==10){town ="�������������";}
    		if(rnd100==11){town ="��������";}
    		if(rnd100==12){town ="����������";}
    		if(rnd100==13){town ="����";}
    		if(rnd100==14){town ="���������";}
    		if(rnd100==15){town ="��������";}
    		if(rnd100==16){town ="�����������";}
    		if(rnd100==17){town ="�������";}
    		if(rnd100==18){town ="�������";}
    		if(rnd100==19){town ="����";}
    	}
    	if (provincen==5)//Estonia
    	{
    		if(rnd100==0){town ="�����";}
    		if(rnd100==1){town ="�����";}
    		if(rnd100==2){town ="����������";}
    		if(rnd100==3){town ="����";}
    		if(rnd100==4){town ="����";}
    		if(rnd100==5){town ="�����";}
    		if(rnd100==6){town ="�����";}
    		if(rnd100==7){town ="��������";}
    		if(rnd100==8){town ="�����";}
    		if(rnd100==9){town ="������";}
    		if(rnd100==10){town ="�����";}
    		if(rnd100==11){town ="�����";}
    		if(rnd100==12){town ="������";}
    		if(rnd100==13){town ="�����";}
    		if(rnd100==14){town ="����������";}
    		if(rnd100==15){town ="�����";}
    		if(rnd100==16){town ="������";}
    		if(rnd100==17){town ="������";}
    		if(rnd100==18){town ="������";}
    		if(rnd100==19){town ="������";}
    	}
    	if (provincen==6)//Angola
    	{
    		if(rnd100==0){town ="������";}
    		if(rnd100==1){town ="�������";}
    		if(rnd100==2){town ="�����";}
    		if(rnd100==3){town ="�������";}
    		if(rnd100==4){town ="�����";}
    		if(rnd100==5){town ="�������";}
    		if(rnd100==6){town ="������";}
    		if(rnd100==7){town ="�������";}
    		if(rnd100==8){town ="����";}
    		if(rnd100==9){town ="������";}
    		if(rnd100==10){town ="�����";}
    		if(rnd100==11){town ="�������";}
    		if(rnd100==12){town ="����";}
    		if(rnd100==13){town ="�����";}
    		if(rnd100==14){town ="�����";}
    		if(rnd100==15){town ="�����";}
    		if(rnd100==16){town ="��������";}
    		if(rnd100==17){town ="������";}
    		if(rnd100==18){town ="������";}
    		if(rnd100==19){town ="���������";}
    	}
    	if (provincen==7) //Sweden
    	{
    		if(rnd100==0){town ="��������";}
    		if(rnd100==1){town ="�����";}
    		if(rnd100==2){town ="�����";}
    		if(rnd100==3){town ="����";}
    		if(rnd100==4){town ="������������";}
    		if(rnd100==5){town ="�������";}
    		if(rnd100==6){town ="�����";}
    		if(rnd100==7){town ="���������";}
    		if(rnd100==8){town ="�����";}
    		if(rnd100==9){town ="��������";}
    		if(rnd100==10){town ="�����";}
    		if(rnd100==11){town ="����������";}
    		if(rnd100==12){town ="���������";}
    		if(rnd100==13){town ="����";}
    		if(rnd100==14){town ="�����������";}
    		if(rnd100==15){town ="������";}
    		if(rnd100==16){town ="����";}
    		if(rnd100==17){town ="����";}
    		if(rnd100==18){town ="�����";}
    		if(rnd100==19){town ="�����";}
    	}
    	if (provincen==8)//Mexico
    	{
    		if(rnd100==0){town ="������";}
    		if(rnd100==1){town ="�������";}
    		if(rnd100==2){town ="���������";}
    		if(rnd100==3){town ="������";}
    		if(rnd100==4){town ="����";}
    		if(rnd100==5){town ="������";}
    		if(rnd100==6){town ="��������";}
    		if(rnd100==7){town ="�����";}
    		if(rnd100==8){town ="����";}
    		if(rnd100==9){town ="���������";}
    		if(rnd100==10){town ="������";}
    		if(rnd100==11){town ="�����";}
    		if(rnd100==12){town ="�������";}
    		if(rnd100==13){town ="��������";}
    		if(rnd100==14){town ="������";}
    		if(rnd100==15){town ="������";}
    		if(rnd100==16){town ="�����";}
    		if(rnd100==17){town ="������";}
    		if(rnd100==18){town ="�������";}
    		if(rnd100==19){town ="���������";}
    	}
    	if (provincen==9)//Israel
    	{
    		if(rnd100==0){town ="����";}
    		if(rnd100==1){town ="�����";}
    		if(rnd100==2){town ="����";}
    		if(rnd100==3){town ="���-��";}
    		if(rnd100==4){town ="����-����";}
    		if(rnd100==5){town ="��������";}
    		if(rnd100==6){town ="�������";}
    		if(rnd100==7){town ="������";}
    		if(rnd100==8){town ="�������";}
    		if(rnd100==9){town ="��������";}
    		if(rnd100==10){town ="������-���";}
    		if(rnd100==11){town ="������-���";}
    		if(rnd100==12){town ="������-��";}
    		if(rnd100==13){town ="���";}
    		if(rnd100==14){town ="�������";}
    		if(rnd100==15){town ="�������";}
    		if(rnd100==16){town ="�����";}
    		if(rnd100==17){town ="������";}
    		if(rnd100==18){town ="�������";}
    		if(rnd100==19){town ="�����-���";}
    	}
    	if (provincen==10)//Indonesia
    	{
    		if(rnd100==0){town ="�������";}
    		if(rnd100==1){town ="����";}
    		if(rnd100==2){town ="�����";}
    		if(rnd100==3){town ="�������";}
    		if(rnd100==4){town ="������";}
    		if(rnd100==5){town ="������";}
    		if(rnd100==6){town ="���������";}
    		if(rnd100==7){town ="�������";}
    		if(rnd100==8){town ="���������";}
    		if(rnd100==9){town ="�����";}
    		if(rnd100==10){town ="������";}
    		if(rnd100==11){town ="������";}
    		if(rnd100==12){town ="������";}
    		if(rnd100==13){town ="������";}
    		if(rnd100==14){town ="������-�������";}
    		if(rnd100==15){town ="���������";}
    		if(rnd100==16){town ="�����";}
    		if(rnd100==17){town ="���������";}
    		if(rnd100==18){town ="�������";}
    		if(rnd100==19){town ="�������";}
    	}
    	if (provincen==11)//India
    	{
    		if(rnd100==0){town ="��������";}
    		if(rnd100==1){town ="��������";}
    		if(rnd100==2){town ="������";}
    		if(rnd100==3){town ="�����";}
    		if(rnd100==4){town ="�������";}
    		if(rnd100==5){town ="�����";}
    		if(rnd100==6){town ="������";}
    		if(rnd100==7){town ="�����";}
    		if(rnd100==8){town ="���������";}
    		if(rnd100==9){town ="������";}
    		if(rnd100==10){town ="�������";}
    		if(rnd100==11){town ="���";}
    		if(rnd100==12){town ="�������";}
    		if(rnd100==13){town ="�������";}
    		if(rnd100==14){town ="��������";}
    		if(rnd100==15){town ="�����";}
    		if(rnd100==16){town ="������";}
    		if(rnd100==17){town ="�������";}
    		if(rnd100==18){town ="���������";}
    		if(rnd100==19){town ="������";}
    	}
    }
    public static void choose_character()
    {
    	int lawful = (int)(Math.random()*3)-1;
    	int good = (int)(Math.random()*3)-1;
    	int talk = (int)(Math.random()*3)-1;
    	char_str="";
    	if (lawful==1)
    	  {
    		int rnd = (int)(Math.random()*10);
    		if (rnd==0)
    		{
    			char_str="�� ������ ������ � �������� ��� ���������� ���������.";
    		}
    		else if (rnd==1)
    		{
    			char_str="�������� ��� ���������� � ��������������� �������.";
    		}
    		else if (rnd==2)
    		{
    			char_str="������� �������� ������� �� ����.";
    		}
    		else if (rnd==3)
    		{
    			char_str="�������� ���������������, ��������� �����������.";
    		}
    		else  if (rnd==4)
    		{
    			char_str="��������� � �������������� �������. ������������ ��������� ����������, ���������� �������";
    		}
    	  }
    	if (lawful==-1)
    	  {
    		int rnd = (int)(Math.random()*10);
    		if (rnd==0)
    		{
    			char_str="�� ������ ������, ����� �����������, ������������ ��������.";
    		}
    		else if (rnd==1)
    		{
    			char_str="� ������� ��� ��������� � ���� ����������.";
    		}
    		else if (rnd==2)
    		{
    			char_str="�������� - ��������.";
    		}
    		else if (rnd==3)
    		{
    			char_str="�� ��������� �������� � ������������ ��������.";
    		}
    		else if (rnd==4)
    		{
    			char_str="����� ����� ������������ � ��������������� ��������.";
    		}
    	  }
    	if (talk==1)
    	{
    		int rnd = (int)(Math.random()*10);
    		if (rnd==0)
    		{
    			char_str=char_str+"����� �����������, ����������.";
    		}
    		else if (rnd==1)
    		{
    			char_str=char_str+"������ ��� ������� ���������� ������.";
    		}
    		else if (rnd==2)
    		{
    			char_str=char_str+"����� ����������� � �������.";
    		}
    		else if (rnd==3)
    		{
    			char_str=char_str+"����� ����� ����������.";
    		}
    		else if (rnd==4)
    		{
    			char_str=char_str+"����� ����� ������ ��-�� ���������, �������� ���������.";
    		}
    	  }
    	if (talk==-1)
    	{
    		int rnd = (int)(Math.random()*10);
    		if (rnd==0)
    		{
    			char_str=char_str+"� ������� ��� ��������������� � ���������������.";
    		}
    		else if (rnd==1)
    		{
    			char_str=char_str+"������ ���������������, ���� ���������.";
    		}
    		else if (rnd==2)
    		{
    			char_str=char_str+"����� �� ���� ������  ��-�� �������� ���������.";
    		}
    		else if (rnd==3)
    		{
    			char_str=char_str+"����� �������� ������ �����������, ����������� �����������.";
    		}
    		else if (rnd==4)
    		{
    			char_str=char_str+"�����, ���������, ��������������� �������.";
    		}
    	  }
    	if (good==1)
    	{
    		int rnd = (int)(Math.random()*10);
    		if (rnd==0)
    		{
    			char_str=char_str+"������ ���� � ����� � ��������� ������ �� ������.";
    		}
    		else if (rnd==1)
    		{
    			char_str=char_str+"������� ����� ������ � ����������� ����������.";
    		}
    		else if (rnd==2)
    		{
    			char_str=char_str+"����� ����������� ���������.";
    		}
    		else if (rnd==3)
    		{
    			char_str=char_str+"�������� ��� ����������� � ����������� �������.";
    		}
    		else if (rnd==4)
    		{
    			char_str=char_str+"��������� �������� ������, �� ����� �� ���, �� �������.";
    		}
    	  }
    	if (good==-1)
    	{
    		int rnd = (int)(Math.random()*10);
    		if (rnd==0)
    		{int rnd1 =(int)(Math.random()*(age-14))+14;
    			char_str=char_str+"� "+rnd1+" ��� ����� ��� ������ �� �����.";
    		}
    		else if (rnd==1)
    		{
    			char_str=char_str+"�������� � �������� �������.";
    		}
    		else if (rnd==2)
    		{
    			char_str=char_str+"� ������� ��� ������ ���������� �����������.";
    		}
    		else if (rnd==3)
    		{ int rnd1 =(int)(Math.random()*2)+2;
    			char_str=char_str+"����� � ������ �� "+rnd1+" ����.";
    		}
    		else if (rnd==4)
    		{
    			char_str=char_str+"��������� ��� ������������ � �����.";
    		}
    	  }
    }
    public static void generate_other()
    {
    	other_str="";
    	if (str>75)
    	{
    		int rnd= (int)(Math.random()*3);
    		if (rnd==0)
    		{
    			other_str="� ������� ��������� �������������� �����.";
    		}
    		if (rnd==1)
    		{
    			other_str="����� ��� ������ ��������� � ���� ����� ������� � ����������.";
    		}
    		if (rnd==2)
    		{ if (age>30)
    		  {
    			other_str="����� ��� ������� ��������� �� ����� � ������ �������� ����� ������� �������.";
    		  }
    		else
    		{
    			other_str="��� ����� ������� � ����� ������. ��� ������������ ���������� ��������� � �����.";
    		}
    		}
    	}
    	if (str<20)
    	{
    		int rnd= (int)(Math.random()*3);
    		if (rnd==0)
    		{
    			other_str="� ������� ��� ����������� � ������.";
    		}
    		if (rnd==1)
    		{
    			other_str="� ������� ������� ������� �������.";
    		}
    		if (rnd==2)
    		{
    			other_str="����� ���������� ������ �������� ������ � �������.";
    		}
    	}
    }
    public static void choose_parents_job()
    {
    	
    	int rnd10=(int)(Math.random()*10)+1;
    	if ((homeland_type==1)|(homeland_type==3))
    	{

    		if (rnd10==1){j2="������";}
    		if (rnd10==2){j2="�������";}
    		else {j2="����������";}
    	}
    	if (estate!=1)
    	{
    		
    	
    	if (homeland_type==4)
    	{

    		if (rnd10==1){j2="��������";}
    		if (rnd10==2){j2="������";}
    		if (rnd10==3){j2="�������";}
    		if (rnd10==4){j2="��������";}
    		if (rnd10==5){j2="������";}
    		if (rnd10==6){j2="������� ��� ������";}
    		if (rnd10==7){j2="�������";}
    		if (rnd10==8){j2="�����";}
    		if (rnd10==9){j2="��������";}
    		if (rnd10==10){j2="������ ��������";}
    		
    	}
    	else
    	{
    		if (rnd10==1){j2="������������� �����";}
    		if (rnd10==2){j2="������";}
    		if (rnd10==3){j2="������";}
    		if (rnd10==4){j2="������";}
    		if (rnd10==5){j2="������";}
    		if (rnd10==6){j2="�������";}
    		if (rnd10==7){j2="������";}
    		if (rnd10==8){j2="������ ��������";}
    		if (rnd10==9){j2="��������";}
    		if (rnd10==10){j2="������";}
    	}
    	}
    	if (n==0)
    	{
    	j1=" ���� - " +j2;
    	n++;
    	}
    	
    	j2=","+j2;
    	
    	if (estate!=2)
    	{
    		j2="";
    	}
    	
    	
    				
    }		
    public static void choose_edu()
    {
    	int luck= ((int)(Math.random()*100)+(int)(Math.random()*100)+(int)(Math.random()*100))/3;
    	education="";
     if (estate!=1)
     {
    	if (intellegence<10)
    	{
    		education=name+" � ������� ��������� ���������� � �� ���� ���� ��������� ��������� �����.";
    	}
    	if ((intellegence>=10)&(intellegence<=70))
    	{
    		education=name+" ������� ����� �����.";
    	}
    	if ((intellegence>=70)&(intellegence<=85))
    	{
    		education=name+" ������� ����� ����� � ��������.";
    	}
    	if (intellegence>=85)
    	{
    		int rnd = (int)(Math.random()*4);
    		education=name+" � ������� ��������� ����������� ����������� �������������. ������� ����� ����� �� "+rnd+" ���� ������.";
    	}
    	int rnd = (int)(Math.random()*101);
    	if ((rnd+luck+intellegence)<50)
    	{
    	 education=education+" ����� ����� �� ���� ��������� ���� � �������.";	
    	}
    	if (((rnd+luck+intellegence)>=50)&((rnd+luck+intellegence)<100))
    	{
    	 education=education+" �� ���������� �������� ������������� �� �������� � �������.";	
    	}
    	if (((rnd+luck+intellegence)>=100)&((rnd+luck+intellegence)<150))
    	{
    	 education=education+" ����� ����� ������� ���������������� �������.";	
    	}
    	if (((rnd+luck+intellegence)>=150)&((rnd+luck+intellegence)<200))
    	{
    		 education=education+" ����� ����� ����� ��� ��������� ���������� � ������ �����.";	
    	}
    	if (((rnd+luck+intellegence)>=200)&((rnd+luck+intellegence)<240))
    	{
    	 education=education+" ����� �������� � ������ �����, ��� ������� ���� ��� ����� � ��������������� �������.";	
    	}
    	if (((rnd+luck+intellegence)>=240)&((rnd+luck+intellegence)<300))
    	{
    	 education=education+" ����� �������� � ������ �����. �� ������ ������ � ����� ��� ��������� � ����� �����.";	
    	}
     }
     if (estate==1)
     {
    	 if (intellegence<20)
    	 {
    		education=name+" � ������� ������� ����������";
    	 }
    	 if (intellegence>70)
    	 {
    		 education=name+", �������� �� ������ �������������, ���� ��������� ������� � ������� ����.";
    	 }
     }
    }
    

    public static void  choose_motivation()
    {
    	int rnd = (int)(Math.random()*4);
    	if (rnd==1)
    	{
    		motivation=1;
    	}
    	if (rnd==2)
    	{
    		motivation=2;
    	}
    	if (rnd==3)
    	{
    		motivation=3;
    	}
    	if (rnd==4)
    	{
    		motivation=5;
    	}
    	if (rnd==0)
    	{
    		if (estate>2)
    		{
    			motivation=4;
    		}
    		else
    		{
    			motivation=1;
    		}
    	}
    	if (motivation==1)
    	{
    		 rnd = (int)(Math.random()*4)+5;
    		 motivation_str=" "+rnd+" ������� ����� ��";
    		 if (homeland_type==1)
    		 {
    			 motivation_str=motivation_str+" �������";
    		 }
    		 else
    		 {
    			 motivation_str=motivation_str+" �����";
    		 }
    	
    	 motivation_str=motivation_str+", ��� ��� "+name+" �����";
    	 rnd = (int)(Math.random()*4);
    	if (rnd==0)
    	{
    		motivation_str=motivation_str+"� �����";
    	}
    	else
    	{
    		motivation_str=motivation_str+" �����";
    	}
    	motivation_str=motivation_str+" ������. ����� ������ ���, ��� ��� ����� � �����" ;
    	rnd = (int)(Math.random()*4);
    	if (rnd==0)
    	{
    		motivation_str=motivation_str+" ����" ;	
    	}
    	if (rnd==1)
    	{
    		motivation_str=motivation_str+" ����" ;	
    	}
    	if (rnd==2)
    	{
    		motivation_str=motivation_str+" ������ � �������������" ;	
    	}
    	if (rnd==3)
    	{
    		motivation_str=motivation_str+" �����" ;	
    	}
    	motivation_str=motivation_str+" "+name+"�, ����� ���� �� �������� ����� ������� ������ � ��������� ���." ;
    	}
    	if (motivation==2)
    	{
    		if (estate!=3)
    		{
    			motivation_str=" �� ��������" ;
    		}
    		else
    		{
    			motivation_str=" �� �������� � �������" ;
    		}
    		motivation_str=motivation_str+" ��� �� ������� ���������� � "+name+ "� ��������� ������� � � ����� ������. � ������� �� ������, ����� ��������� �������� ������ ������, � ��� ������ ��� ������������� ����� ����������� "+ name+" ����� �������� �������." ;
    	}
    	if (motivation==3)
    	{
    		motivation_str="� ������� "+name+" ��� ����� ���������� � ������ ������� ��� ���� �����-������ �����������. �� ����� �������������, ����� � ������ � ���� � ����, ����� �����";
    	   if (estate>2)
    	   {
    		   motivation_str=motivation_str+" ��������������� ������";
    	   }
    	   else
    	   {
    		   motivation_str=motivation_str+" �������� �������� �����������";
    	   }
    	   motivation_str=motivation_str+", � ������� ��������������� � ������� ������, � �������� �������������� ����� ������ ���. ����� � ������� ����� ��������� ������, "+name+" �����, ��� ������� ��� �����.";
    	}
    	if (motivation==4)
    	{
    		motivation_str=name+" ������ ��� �������������� ���������. �����";
    		if (estate==4)
    		{
    			motivation_str=motivation_str+" ������� �����������";
    		}
    		else
    		{
    			motivation_str=motivation_str+" �������";
    		}
    		motivation_str=motivation_str+" �������� ��� ����������� ��������� ������ � �������� �� �� ������, "+name+" ����������.";
    	}
    	if (motivation==5)
    	{
    		motivation_str="        Motivation, such an aggravation.Accusations, don't know how to take them. Inspiration's getting hard to fake it.Concentration's never hard to break it.Situation, never what you want it to be.         ";
    	}
    	end_str=" �� ������ ��� ���� ������ �, ����� �� ��� ������ � ����������, ���������� � ��������� ������...";
    }
    
    
    private static void exists(String FileName)throws FileNotFoundException 
{
	File file = new File(FileName);
	if (!file.exists())
	{
		throw new FileNotFoundException(file.getName());
	}
}
    public static String read(String FileName) throws FileNotFoundException 
{
	File file = new File(FileName);
	StringBuilder sb = new StringBuilder();
	exists(FileName);
try
	{
      BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
      try
      {
    	 
    	  String s="";
    	  
    	  s=in.readLine();
    		  
    		
    	  int rnd = (int)(Math.random()*50);
    		 for(int i=0;i<rnd;i++)
    		 {
    			 sb.append("");
    			 
    			 s=in.readLine();
    		 }
    		 sb.append(s);
    	  
      }
      finally
      {
    	  in.close();
      }
	}
	catch(IOException e)
	{
		
	}
	return sb.toString();
	
}
    public static String read2(String FileName) throws FileNotFoundException 
    {
    	File file = new File(FileName);
    	StringBuilder sb = new StringBuilder();
    	exists(FileName);
    try
    	{
          BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
          try
          {
        	 
        	  String s="";
        	  
        	  s=in.readLine();
        		  
        		
        	  int rnd = (int)(Math.random()*229)+1;
        		 for(int i=0;i<rnd;i++)
        		 {
        			 sb.append("");
        			 
        			 s=in.readLine();
        		 }
        		 sb.append(s);
        	  
          }
          finally
          {
        	  in.close();
          }
    	}
    	catch(IOException e)
    	{
    		
    	}
    	return sb.toString();
    	
    }
}
