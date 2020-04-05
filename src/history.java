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
	    
	    h="Ваш герой - "+name+" "+pr1+" "+pr2+", "+estate_str+j2+"."+age_str+homeland+"."+j1+". "+education+char_str+other_str+motivation_str+end_str;
	    System.out.println(h);
    }
	public static void generate_estate()
	{
		int rnd100 = (int)(Math.random()*100);
		if ((rnd100>=0)&(rnd100<70))
		{
			estate=1;
			estate_str="крестьянин";
			
		}
		if ((rnd100>=70)&(rnd100<90))
		{
			estate=2;
			estate_str="горожанин";
			
		}
		if ((rnd100>=90)&(rnd100<95))
		{
			estate=3;
			estate_str="рыцарь";
			agi = agi +15;
			str=str+15;
			
		}
		if ((rnd100>=95)&(rnd100<100))
		{
			estate=4;
			estate_str="маг";
			intellegence = intellegence+50;
			
		}
		
	}
	public static void choose_prefics()
	{
		if (estate<=2)
		{
			pr1="сын";
			pr2=name2+"а";
		    
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
		{pr1="Убийца ";}
		if (rnd100==2)
		{pr1="Гроза ";}
		if (rnd100==3)
		{pr1="Повелитель ";}
		if (rnd100==4)
		{pr1="Владыка ";}
		if (rnd100==5)
		{pr1="Уничтожитель ";}
		if (rnd100==6)
		{pr1="Укротитель ";}
		if (rnd100==7)
		{pr1="Поработитель ";}
		if (rnd100==8)
		{pr1="Царь ";}
		if (rnd100==9)
		{pr1="Отец ";}
		if (rnd100==10)
		{pr1="Король ";}
		if (rnd100==11)
		{pr1="Создатель ";}
		if (rnd100==12)
		{pr1="Призыватель ";}
		if (rnd100==13)
		{pr1="Покровитель ";}
		if (rnd100==14)
		{pr1="Защитник ";}
		if (rnd100==15)
		{pr1="Спаситель ";}
		int rnd2 =(int)(Math.random()*15)+1;
		 pr2 = "";
		if (rnd2 ==1)
		{ pr2="Драконов";}
		if (rnd2 ==2)
		{ pr2="Орков";}
		if (rnd2 ==3)
		{ pr2="Варваров";}
		if (rnd2 ==4)
		{ pr2="Медведей";}
		if (rnd2 ==5)
		{ pr2="Волков";}
		if (rnd2 ==6)
		{ pr2="Зверей";}
		if (rnd2 ==7)
		{ pr2="Царей";}
		if (rnd2 ==8)
		{ pr2="Лордов";}
		if (rnd2 ==9)
		{ pr2="Графов";}
		if (rnd2 ==10)
		{ pr2="Нежити";}
		if (rnd2 ==11)
		{ pr2="Рыб";}
		
		
	}
	public static void generate_prefics1()
	{
		int rnd100 = (int)(Math.random()*5)+1;
		if (rnd100==1)
		{
			pr1="железно";
		}
		if (rnd100==2)
		{
			pr1="золото";
		}
		if (rnd100==3)
		{
			pr1="буре";
		}
		if (rnd100==4)
		{
			pr1="камне";
		}
		if (rnd100==5)
		{
			pr1="свето";
		}
		rnd100 = (int)(Math.random()*5)+1;
		if (rnd100==1)
		{
			pr2="рожденный";
		}
		if (rnd100==2)
		{
			pr2="бородый";
		}
		if (rnd100==3)
		{
			pr2="головый";
		}
		if (rnd100==4)
		{
			pr2="избранный";
		}
		if (rnd100==5)
		{
			pr2="рукий";
		}
	}
    public static void generate_prefics2()
	{
		int rnd100 = (int)(Math.random()*(28*2))-28;
		if (rnd100==0) {pr1="синяя ";}
		if (rnd100==-1) {pr1="железная ";}
		if (rnd100==-2) {pr1="стальная ";}	
		if (rnd100==-3) {pr1="карающая";}	
		if (rnd100==-4) {pr1="золотая ";}	
		if (rnd100==-5) {pr1="каменная ";}	
		if (rnd100==-6) {pr1="черная ";}	
		if (rnd100==-7) {pr1="красная ";}	
		if (rnd100==-8) {pr1="ужасающая ";}	
		if (rnd100==-9) {pr1="сокрушающая ";}	
		if (rnd100==-10) {pr1="сотрясающая ";}	
		if (rnd100==-11) {pr1="великая ";}	
		if (rnd100==-12) {pr1="непревзойденная ";}	
		if (rnd100==-13) {pr1="ужасная ";}	
		if (rnd100==-14) {pr1="могучая ";}	
		if (rnd100==-15) {pr1="храбрая ";}	
		if (rnd100==-16) {pr1="отважная ";}	
		if (rnd100==-17) {pr1="гранитная ";}	
		if (rnd100==-18) {pr1="мраморная ";}	
		if (rnd100==-19) {pr1="злая ";}	
		if (rnd100==-20) {pr1="адамантиевая ";}	
		if (rnd100==-21) {pr1="хромая ";}	
		if (rnd100==-22) {pr1="пылающая ";}	
		if (rnd100==-23) {pr1="несокрушимая ";}	
		if (rnd100==-24) {pr1="тупая";}	
		if (rnd100==-25) {pr1="неудачливая ";}	
		if (rnd100==-26) {pr1="бездарная ";}	
		if (rnd100==-27) {pr1="сломанная ";}	
		if (rnd100==-28) {pr1="ничтожная ";}	
		
		if (rnd100==1) {pr1="железный ";}
		if (rnd100==2) {pr1="стальной ";}	
		if (rnd100==3) {pr1="карающий";}	
		if (rnd100==4) {pr1="золотой ";}	
		if (rnd100==5) {pr1="каменный ";}	
		if (rnd100==6) {pr1="черный ";}	
		if (rnd100==7) {pr1="красный ";}	
		if (rnd100==8) {pr1="ужасающий ";}	
		if (rnd100==9) {pr1="сокрушающий ";}	
		if (rnd100==10) {pr1="сотрясающий ";}	
		if (rnd100==11) {pr1="великий ";}	
		if (rnd100==12) {pr1="непревзойденный ";}	
		if (rnd100==13) {pr1="ужасный ";}	
		if (rnd100==14) {pr1="могучий ";}	
		if (rnd100==15) {pr1="храбрый ";}	
		if (rnd100==16) {pr1="отважный ";}	
		if (rnd100==17) {pr1="гранитный ";}	
		if (rnd100==18) {pr1="мраморный ";}	
		if (rnd100==19) {pr1="злой ";}	
		if (rnd100==20) {pr1="адамантиевый ";}	
		if (rnd100==21) {pr1="хромой ";}	
		if (rnd100==22) {pr1="пылающий ";}	
		if (rnd100==23) {pr1="несокрушимый ";}	
		if (rnd100==24) {pr1="тупой ";}	
		if (rnd100==25) {pr1="неудачливый ";}	
		if (rnd100==26) {pr1="бездарный ";}	
		if (rnd100==27) {pr1="сломанный ";}	
		if (rnd100==28) {pr1="ничтожный ";}	
		if (rnd100>0)
		{
		rnd100 = (int)(Math.random()*16);
		}
		else
		{
			rnd100 = (int)(Math.random()*5)-5;
		}
		if (rnd100==-5) {pr2="борода ";}
		if (rnd100==-4) {pr2="душа ";}
		if (rnd100==-3) {pr2="воля ";}
		if (rnd100==-2) {pr2="рука ";}
		if (rnd100==-1) {pr2="сила ";}
		if (rnd100==1) {pr2="меч ";}
		if (rnd100==2) {pr2="клинок ";}
		if (rnd100==3) {pr2="повелитель ";}
		if (rnd100==4) {pr2="уничтожитель ";}
		if (rnd100==5) {pr2="глас ";}
		if (rnd100==6) {pr2="клык ";}
		if (rnd100==7) {pr2="разрушитель ";}
		if (rnd100==8) {pr2="сокрушитель ";}
		if (rnd100==9) {pr2="воитель ";}
		if (rnd100==10) {pr2="троглодит ";}
		if (rnd100==11) {pr2="придаток ";}
		if (rnd100==12) {pr2="ублюдок ";}
		if (rnd100==13) {pr2="выродок ";}
		if (rnd100==14) {pr2="капитан ";}
		if (rnd100==15) {pr2="нищий ";}
		if (rnd100==16) {pr2="бандит ";}
		
	}
    public  static void choose_age()
    {
    	if (pr1=="сын")
    	{
    		age = ((int)(Math.random()*30)+(int)(Math.random()*30)+(int)(Math.random()*30)+45)/3;
    	}
    	else
    	{
    		age = ((int)(Math.random()*50)+(int)(Math.random()*50)+(int)(Math.random()*50)+69)/3;
    	}
    	int date = -1;
    	String bad_august ="я",
    			grammar = " лет.";
    	int rnd100 = (int)(Math.random()*5);
    	int month = (int)(Math.random()*12)+1;
    	String month_str = " ";
    	if (month==1) {month_str =" январ";
    	 date = (int)(Math.random()*31)+1;}
    	if (month==2) {month_str =" феврал";
    	 date = (int)(Math.random()*28)+1;}
    	if (month==3) {month_str =" март";
    	 date = (int)(Math.random()*31)+1;}
    	if (month==4) {month_str =" апрел";
    	 date = (int)(Math.random()*30)+1;}
    	if (month==5) {month_str =" ма";
    	 date = (int)(Math.random()*31)+1;}
    	if (month==6) {month_str =" июн";
    	 date = (int)(Math.random()*30)+1;}
    	if (month==7) {month_str =" июл";
    	 date = (int)(Math.random()*31)+1;}
    	if (month==8) {month_str =" август";
    	 date = (int)(Math.random()*31)+1;}
    	if (month==9) {month_str =" сентябр";
    	 date = (int)(Math.random()*30)+1;}
    	if (month==10) {month_str =" октябр";
    	 date = (int)(Math.random()*31)+1;}
    	if (month==11) {month_str =" ноябр";
    	 date = (int)(Math.random()*30)+1;}
    	if (month==12) {month_str =" декабр";
    	 date = (int)(Math.random()*31)+1;}
    	if ((month==8)|(month==3))
    	{
    		bad_august ="a";
    	}
    	
    	if(age %10 ==1)
    	{
    		grammar =" год.";
    	}
    	if((age%10==2)|(age%10==3)|(age%10==4))
    	{
    		grammar =" года.";
    	}
    	if (rnd100==0)
    	{
    		age_str=age+grammar+"Родился "+date+month_str+bad_august+" "+(245-age)+" года ";
    	}
    	if (rnd100==1)
    	{
    		age_str="Родился "+date+month_str+bad_august+" "+(245-age)+" года"+"("+age+grammar+") ";
    	}
    	if (rnd100==2)
    	{
    		age_str="Родился в "+month_str+"e"+" "+(245-age)+" года ";
    	}
    	if (rnd100==3)
    	{
    		age_str="Родился в "+(245-age)+" году ";
    	}
    	if (rnd100==4)
    	{
    		age_str="Родился "+date+month_str+bad_august+" "+(245-age)+" года ";
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
    		province="Венкши";
    	}
    	if(rnd100==2)
    	{
    		province="Полнок";
    	}
    	if(rnd100==3)
    	{
    		province="Роджаци";
    	}
    	if(rnd100==4)
    	{
    		province="Удания";
    	}
    	if(rnd100==5)
    	{
    		province="Поджиента";
    	}
    	if(rnd100==6)
    	{
    		province="Човеши";
    	}
    	if(rnd100==7)
    	{
    		province="Приморская";
    	}
    	if(rnd100==8)
    	{
    		province="Торгор";
    	}
    	if(rnd100==9)
    	{
    		province="Порида";
    	}
    	if(rnd100==10)
    	{
    		province="Кромхольм";
    	}
    	if(rnd100==11)
    	{
    		province="Корунд";
    	}
    	provincen=rnd100;
    	choose_town();
    	if (homeland_type ==1)
    	{
    		homeland ="в провинции "+province+" в деревне близ города "+town;
    	}
    	if (homeland_type ==2)
    	{
    		homeland ="в провинции "+province+" в городе "+town;
    	}
    	if (homeland_type ==3)
    	{
    		homeland ="в провинции "+province+" в деревне близ города "+town;
    	}
    	if (homeland_type ==4)
    	{
    		rnd100 = (int)(Math.random()*5);
    				if (rnd100==1)
    				{homeland = "в Кромхольме";}
    				if (rnd100==2)
    				{homeland = "в Распутье";}
    				if (rnd100==3)
    				{homeland = "в Корунде";}
    				if (rnd100==4)
    				{homeland = "в Трорграде";}
    				if (rnd100==5)
    				{homeland = "в Приморском граде";}
    				
    	}
    	
    }
    public static void choose_town()
    {
    	int rnd100=(int)(Math.random()*20);
    	if (provincen==1)//My own names
    	{
    		if(rnd100==0){town ="Адаманд";}
    		if(rnd100==1){town ="Золотые копи";}
    		if(rnd100==2){town ="Железные копи";}
    		if(rnd100==3){town ="Солнечный";}
    		if(rnd100==4){town ="Нуриен";}
    		if(rnd100==5){town ="Карбай";}
    		if(rnd100==6){town ="Апатиты";}
    		if(rnd100==7){town ="Горные Шории";}
    		if(rnd100==8){town ="Аллой";}
    		if(rnd100==9){town ="Каменск";}
    		if(rnd100==10){town ="Торгоркий промышленный комплекс";}
    		if(rnd100==11){town ="Андулаз";}
    		if(rnd100==12){town ="Кирдаз";}
    		if(rnd100==13){town ="Корби";}
    		if(rnd100==14){town ="Сомерсед";}
    		if(rnd100==15){town ="Андуин";}
    		if(rnd100==16){town ="Мердез";}
    		if(rnd100==17){town ="Антарез";}
    		if(rnd100==18){town ="Колман";}
    		if(rnd100==19){town ="Хоршед";}
    	}
    	if (provincen==2)//South Korea
    	{
    		if(rnd100==0){town ="Асан";}
    		if(rnd100==1){town ="Вонджу";}
    		if(rnd100==2){town ="Иксан";}
    		if(rnd100==3){town ="Инчхон";}
    		if(rnd100==4){town ="Ичхон";}
    		if(rnd100==5){town ="Йосу";}
    		if(rnd100==6){town ="Каннын";}
    		if(rnd100==7){town ="Кванджу";}
    		if(rnd100==8){town ="Кванмён";}
    		if(rnd100==9){town ="Керён";}
    		if(rnd100==10){town ="Кимдже";}
    		if(rnd100==11){town ="Кимпхо";}
    		if(rnd100==12){town ="Кимхэ";}
    		if(rnd100==13){town ="Коян";}
    		if(rnd100==14){town ="Мирян";}
    		if(rnd100==15){town ="Намвон";}
    		if(rnd100==16){town ="Осан";}
    		if(rnd100==17){town ="Сихын";}
    		if(rnd100==18){town ="Сокчхо";}
    		if(rnd100==19){town ="Иннён";}
    	}
    	if (provincen==3)//Spain
    	{
    		if(rnd100==0){town ="Малага";}
    		if(rnd100==1){town ="Мурсия";}
    		if(rnd100==2){town ="Бильбао";}
    		if(rnd100==3){town ="Виго";}
    		if(rnd100==4){town ="Хихон";}
    		if(rnd100==5){town ="Гранада";}
    		if(rnd100==6){town ="Витория";}
    		if(rnd100==7){town ="Овьедо";}
    		if(rnd100==8){town ="Эльче";}
    		if(rnd100==9){town ="Бадалона";}
    		if(rnd100==10){town ="Сабадель";}
    		if(rnd100==11){town ="Мостолес";}
    		if(rnd100==12){town ="Таррасса";}
    		if(rnd100==13){town ="Картахена";}
    		if(rnd100==14){town ="Андалусия";}
    		if(rnd100==15){town ="Галисия";}
    		if(rnd100==16){town ="Астурия";}
    		if(rnd100==17){town ="Нихон";}
    		if(rnd100==18){town ="Ла-Корунья";}
    		if(rnd100==19){town ="	Алькала";}
    	}
    	if (provincen==4)//South Africa
    	{
    		if(rnd100==0){town ="Бенони";}
    		if(rnd100==1){town ="Велком";}
    		if(rnd100==2){town ="Тембиза";}
    		if(rnd100==3){town ="Сихлангу";}
    		if(rnd100==4){town ="Боксбург";}
    		if(rnd100==5){town ="Феринихинг";}
    		if(rnd100==6){town ="Крюгерсдорп";}
    		if(rnd100==7){town ="Ботшабело";}
    		if(rnd100==8){town ="Бракпан";}
    		if(rnd100==9){town ="Эмалахлени";}
    		if(rnd100==10){town ="Фандербейлпак";}
    		if(rnd100==11){town ="Врайхайд";}
    		if(rnd100==12){town ="Мидделбург";}
    		if(rnd100==13){town ="Парл";}
    		if(rnd100==14){town ="Вирджиния";}
    		if(rnd100==15){town ="Кимберли";}
    		if(rnd100==16){town ="Карлтонвилл";}
    		if(rnd100==17){town ="Мидранд";}
    		if(rnd100==18){town ="Спрингс";}
    		if(rnd100==19){town ="Бишо";}
    	}
    	if (provincen==5)//Estonia
    	{
    		if(rnd100==0){town ="Тарту";}
    		if(rnd100==1){town ="Пярну";}
    		if(rnd100==2){town ="Курессааре";}
    		if(rnd100==3){town ="Элва";}
    		if(rnd100==4){town ="Тюри";}
    		if(rnd100==5){town ="Рапла";}
    		if(rnd100==6){town ="Синди";}
    		if(rnd100==7){town ="Палдиски";}
    		if(rnd100==8){town ="Кунда";}
    		if(rnd100==9){town ="Кярдла";}
    		if(rnd100==10){town ="Локса";}
    		if(rnd100==11){town ="Отепя";}
    		if(rnd100==12){town ="Мыйзак";}
    		if(rnd100==13){town ="Дагда";}
    		if(rnd100==14){town ="Даугавпилс";}
    		if(rnd100==15){town ="Дурбе";}
    		if(rnd100==16){town ="Зилупе";}
    		if(rnd100==17){town ="Дагден";}
    		if(rnd100==18){town ="Доблен";}
    		if(rnd100==19){town ="Дурбен";}
    	}
    	if (provincen==6)//Angola
    	{
    		if(rnd100==0){town ="Луанда";}
    		if(rnd100==1){town ="Кабинда";}
    		if(rnd100==2){town ="Уамбо";}
    		if(rnd100==3){town ="Лубанго";}
    		if(rnd100==4){town ="Куито";}
    		if(rnd100==5){town ="Маланже";}
    		if(rnd100==6){town ="Лобиту";}
    		if(rnd100==7){town ="Бенгела";}
    		if(rnd100==8){town ="Уиже";}
    		if(rnd100==9){town ="Намибе";}
    		if(rnd100==10){town ="Луена";}
    		if(rnd100==11){town ="Сауримо";}
    		if(rnd100==12){town ="Сойо";}
    		if(rnd100==13){town ="Сумбе";}
    		if(rnd100==14){town ="Кубал";}
    		if(rnd100==15){town ="Дундо";}
    		if(rnd100==16){town ="Баилундо";}
    		if(rnd100==17){town ="Лукапа";}
    		if(rnd100==18){town ="Андуло";}
    		if(rnd100==19){town ="Катумбела";}
    	}
    	if (provincen==7) //Sweden
    	{
    		if(rnd100==0){town ="Алингсос";}
    		if(rnd100==1){town ="Векшё";}
    		if(rnd100==2){town ="Истад";}
    		if(rnd100==3){town ="Евле";}
    		if(rnd100==4){town ="Кристианстад";}
    		if(rnd100==5){town ="Лахольм";}
    		if(rnd100==6){town ="Лулео";}
    		if(rnd100==7){town ="Марстранд";}
    		if(rnd100==8){town ="Несшё";}
    		if(rnd100==9){town ="Нючёпинг";}
    		if(rnd100==10){town ="Скара";}
    		if(rnd100==11){town ="Сундсвалль";}
    		if(rnd100==12){town ="Соллефтео";}
    		if(rnd100==13){town ="Умео";}
    		if(rnd100==14){town ="Худиксвалль";}
    		if(rnd100==15){town ="Эребру";}
    		if(rnd100==16){town ="Эслёв";}
    		if(rnd100==17){town ="Лунд";}
    		if(rnd100==18){town ="Буден";}
    		if(rnd100==19){town ="Бурос";}
    	}
    	if (provincen==8)//Mexico
    	{
    		if(rnd100==0){town ="Акончи";}
    		if(rnd100==1){town ="Актопан";}
    		if(rnd100==2){town ="Ауакатлан";}
    		if(rnd100==3){town ="Бекаль";}
    		if(rnd100==4){town ="Бака";}
    		if(rnd100==5){town ="Венадо";}
    		if(rnd100==6){town ="Гонсалес";}
    		if(rnd100==7){town ="Донгу";}
    		if(rnd100==8){town ="Исла";}
    		if(rnd100==9){town ="Кальвильо";}
    		if(rnd100==10){town ="Коютла";}
    		if(rnd100==11){town ="Лердо";}
    		if(rnd100==12){town ="Мануэль";}
    		if(rnd100==13){town ="Наволато";}
    		if(rnd100==14){town ="Оахака";}
    		if(rnd100==15){town ="Пануко";}
    		if(rnd100==16){town ="Родео";}
    		if(rnd100==17){town ="Сакапу";}
    		if(rnd100==18){town ="Тампико";}
    		if(rnd100==19){town ="Фронтерас";}
    	}
    	if (provincen==9)//Israel
    	{
    		if(rnd100==0){town ="Акко";}
    		if(rnd100==1){town ="Афула";}
    		if(rnd100==2){town ="Арад";}
    		if(rnd100==3){town ="Бат-Ям";}
    		if(rnd100==4){town ="Беэр-Шева";}
    		if(rnd100==5){town ="Гиватаим";}
    		if(rnd100==6){town ="Герцлия";}
    		if(rnd100==7){town ="Димона";}
    		if(rnd100==8){town ="Йокнеам";}
    		if(rnd100==9){town ="Кармиэль";}
    		if(rnd100==10){town ="Кирьят-Гат";}
    		if(rnd100==11){town ="Кирьят-Оно";}
    		if(rnd100==12){town ="Кирьят-Ям";}
    		if(rnd100==13){town ="Лод";}
    		if(rnd100==14){town ="Нагария";}
    		if(rnd100==15){town ="Нетания";}
    		if(rnd100==16){town ="Нешер";}
    		if(rnd100==17){town ="Офаким";}
    		if(rnd100==18){town ="Раанана";}
    		if(rnd100==19){town ="Рамат-Ган";}
    	}
    	if (provincen==10)//Indonesia
    	{
    		if(rnd100==0){town ="Чиребон";}
    		if(rnd100==1){town ="Палу";}
    		if(rnd100==2){town ="Амбон";}
    		if(rnd100==3){town ="Таракан";}
    		if(rnd100==4){town ="Купанг";}
    		if(rnd100==5){town ="Манадо";}
    		if(rnd100==6){town ="Суракарта";}
    		if(rnd100==7){town ="Матарам";}
    		if(rnd100==8){town ="Тангеранг";}
    		if(rnd100==9){town ="Депок";}
    		if(rnd100==10){town ="Чимахи";}
    		if(rnd100==11){town ="Джамби";}
    		if(rnd100==12){town ="Бантен";}
    		if(rnd100==13){town ="Серанг";}
    		if(rnd100==14){town ="Бандар-Лампунг";}
    		if(rnd100==15){town ="Пеканбару";}
    		if(rnd100==16){town ="Батам";}
    		if(rnd100==17){town ="Палембанг";}
    		if(rnd100==18){town ="Бандунг";}
    		if(rnd100==19){town ="Сурабая";}
    	}
    	if (provincen==11)//India
    	{
    		if(rnd100==0){town ="Аллеппей";}
    		if(rnd100==1){town ="Калангут";}
    		if(rnd100==2){town ="Канкон";}
    		if(rnd100==3){town ="Орчха";}
    		if(rnd100==4){town ="Харьяна";}
    		if(rnd100==5){town ="Ширди";}
    		if(rnd100==6){town ="Индаур";}
    		if(rnd100==7){town ="Нойда";}
    		if(rnd100==8){town ="Чандигарх";}
    		if(rnd100==9){town ="Ченнаи";}
    		if(rnd100==10){town ="Удайпур";}
    		if(rnd100==11){town ="Ути";}
    		if(rnd100==12){town ="Мандрем";}
    		if(rnd100==13){town ="Лакхнау";}
    		if(rnd100==14){town ="Рамнагар";}
    		if(rnd100==15){town ="Патна";}
    		if(rnd100==16){town ="Канкон";}
    		if(rnd100==17){town ="Вагатор";}
    		if(rnd100==18){town ="Пондичери";}
    		if(rnd100==19){town ="Пушкар";}
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
    			char_str="По словам друзей и знакомых был порядочным человеком.";
    		}
    		else if (rnd==1)
    		{
    			char_str="Известен как порядочный и законопослушный человек.";
    		}
    		else if (rnd==2)
    		{
    			char_str="Большой любитель порядка во всем.";
    		}
    		else if (rnd==3)
    		{
    			char_str="Является законопослушным, примерным гражданином.";
    		}
    		else  if (rnd==4)
    		{
    			char_str="Спокойный и рассудительный человек. Предпочитает принимать взвешенные, обдуманные решения";
    		}
    	  }
    	if (lawful==-1)
    	  {
    		int rnd = (int)(Math.random()*10);
    		if (rnd==0)
    		{
    			char_str="По словам друзей, имеет вспыльчивый, нестабильный характер.";
    		}
    		else if (rnd==1)
    		{
    			char_str="С детства был вспыльчив и даже агрессивен.";
    		}
    		else if (rnd==2)
    		{
    			char_str="Характер - ветреный.";
    		}
    		else if (rnd==3)
    		{
    			char_str="По характеру ветреный и нестабильный донельзя.";
    		}
    		else if (rnd==4)
    		{
    			char_str="Имеет очень нестабильный и непредсказуемый характер.";
    		}
    	  }
    	if (talk==1)
    	{
    		int rnd = (int)(Math.random()*10);
    		if (rnd==0)
    		{
    			char_str=char_str+"Очень общительный, позитивный.";
    		}
    		else if (rnd==1)
    		{
    			char_str=char_str+"Всегда был окружен множеством друзей.";
    		}
    		else if (rnd==2)
    		{
    			char_str=char_str+"Также общительный и веселый.";
    		}
    		else if (rnd==3)
    		{
    			char_str=char_str+"Очень любит поговорить.";
    		}
    		else if (rnd==4)
    		{
    			char_str=char_str+"Имеет много друзей из-за приятного, веселого характера.";
    		}
    	  }
    	if (talk==-1)
    	{
    		int rnd = (int)(Math.random()*10);
    		if (rnd==0)
    		{
    			char_str=char_str+"С детства был неразговорчивый и малообщительный.";
    		}
    		else if (rnd==1)
    		{
    			char_str=char_str+"Обычно неразговорчивый, даже замкнутый.";
    		}
    		else if (rnd==2)
    		{
    			char_str=char_str+"Почти не имел друзей  из-за сложного характера.";
    		}
    		else if (rnd==3)
    		{
    			char_str=char_str+"Редко посещает людные мероприятия, предпочитая одиночество.";
    		}
    		else if (rnd==4)
    		{
    			char_str=char_str+"Тихий, спокойный, неразговорчивый человек.";
    		}
    	  }
    	if (good==1)
    	{
    		int rnd = (int)(Math.random()*10);
    		if (rnd==0)
    		{
    			char_str=char_str+"Всегда добр к людям и старается прийти на помощь.";
    		}
    		else if (rnd==1)
    		{
    			char_str=char_str+"Дорощит своей честью и безупречной репутацией.";
    		}
    		else if (rnd==2)
    		{
    			char_str=char_str+"Имеет безупречную репутацию.";
    		}
    		else if (rnd==3)
    		{
    			char_str=char_str+"Известен как благородный и милосердный человек.";
    		}
    		else if (rnd==4)
    		{
    			char_str=char_str+"Постоянно помогает другим, не жалея ни сил, ни времени.";
    		}
    	  }
    	if (good==-1)
    	{
    		int rnd = (int)(Math.random()*10);
    		if (rnd==0)
    		{int rnd1 =(int)(Math.random()*(age-14))+14;
    			char_str=char_str+"В "+rnd1+" лет попал под стражу за драку.";
    		}
    		else if (rnd==1)
    		{
    			char_str=char_str+"Жестокий и циничный человек.";
    		}
    		else if (rnd==2)
    		{
    			char_str=char_str+"В прошлом был членом бандитской группировки.";
    		}
    		else if (rnd==3)
    		{ int rnd1 =(int)(Math.random()*2)+2;
    			char_str=char_str+"Попал в тюрьму на "+rnd1+" года.";
    		}
    		else if (rnd==4)
    		{
    			char_str=char_str+"Несколько раз подозревался в краже.";
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
    			other_str="С детства отличался необыкновенной силой.";
    		}
    		if (rnd==1)
    		{
    			other_str="Много лет упорно занимался и стал очень сильным и выносливым.";
    		}
    		if (rnd==2)
    		{ if (age>30)
    		  {
    			other_str="Много лет работал грузчиком на рынке и оттого научился легко таскать тяжести.";
    		  }
    		else
    		{
    			other_str="Был самым сильным в своем городе. Его неоднократно приглашали выступать в цирке.";
    		}
    		}
    	}
    	if (str<20)
    	{
    		int rnd= (int)(Math.random()*3);
    		if (rnd==0)
    		{
    			other_str="С детства был болезненным и слабым.";
    		}
    		if (rnd==1)
    		{
    			other_str="В детстве перенес тяжелую болезнь.";
    		}
    		if (rnd==2)
    		{
    			other_str="После несчасного случая вынужден ходить с тростью.";
    		}
    	}
    }
    public static void choose_parents_job()
    {
    	
    	int rnd10=(int)(Math.random()*10)+1;
    	if ((homeland_type==1)|(homeland_type==3))
    	{

    		if (rnd10==1){j2="кузнец";}
    		if (rnd10==2){j2="плотник";}
    		else {j2="крестьянин";}
    	}
    	if (estate!=1)
    	{
    		
    	
    	if (homeland_type==4)
    	{

    		if (rnd10==1){j2="торговец";}
    		if (rnd10==2){j2="столяр";}
    		if (rnd10==3){j2="плотник";}
    		if (rnd10==4){j2="сапожник";}
    		if (rnd10==5){j2="кузнец";}
    		if (rnd10==6){j2="золотых дел мастер";}
    		if (rnd10==7){j2="алхимик";}
    		if (rnd10==8){j2="купец";}
    		if (rnd10==9){j2="лавочник";}
    		if (rnd10==10){j2="мелкий лавочник";}
    		
    	}
    	else
    	{
    		if (rnd10==1){j2="странствующий купец";}
    		if (rnd10==2){j2="шахтер";}
    		if (rnd10==3){j2="шахтер";}
    		if (rnd10==4){j2="кузнец";}
    		if (rnd10==5){j2="гончар";}
    		if (rnd10==6){j2="плотник";}
    		if (rnd10==7){j2="фермер";}
    		if (rnd10==8){j2="мелкий лавочник";}
    		if (rnd10==9){j2="сапожник";}
    		if (rnd10==10){j2="столяр";}
    	}
    	}
    	if (n==0)
    	{
    	j1=" Отец - " +j2;
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
    		education=name+" с детства отличался слабоумием и не смог даже закончить начальную школу.";
    	}
    	if ((intellegence>=10)&(intellegence<=70))
    	{
    		education=name+" окончил общую школу.";
    	}
    	if ((intellegence>=70)&(intellegence<=85))
    	{
    		education=name+" окончил общую школу с отличием.";
    	}
    	if (intellegence>=85)
    	{
    		int rnd = (int)(Math.random()*4);
    		education=name+" с детства отличался выдающимися умственными способностями. Окончил общую школу на "+rnd+" года раньше.";
    	}
    	int rnd = (int)(Math.random()*101);
    	if ((rnd+luck+intellegence)<50)
    	{
    	 education=education+" После школы не смог поступить даже в училище.";	
    	}
    	if (((rnd+luck+intellegence)>=50)&((rnd+luck+intellegence)<100))
    	{
    	 education=education+" По неудачному стечению обстоятельств не поступил в училище.";	
    	}
    	if (((rnd+luck+intellegence)>=100)&((rnd+luck+intellegence)<150))
    	{
    	 education=education+" После школы окончил профессиональное училище.";	
    	}
    	if (((rnd+luck+intellegence)>=150)&((rnd+luck+intellegence)<200))
    	{
    		 education=education+" После общей школы был отправлен родителями в высшую школу.";	
    	}
    	if (((rnd+luck+intellegence)>=200)&((rnd+luck+intellegence)<240))
    	{
    	 education=education+" Потом поступил в высшую школу, где проявил себя как умный и сообразительный студент.";	
    	}
    	if (((rnd+luck+intellegence)>=240)&((rnd+luck+intellegence)<300))
    	{
    	 education=education+" Потом поступил в высшую школу. За особые успехи в учебе был переведен в Школу Магов.";	
    	}
     }
     if (estate==1)
     {
    	 if (intellegence<20)
    	 {
    		education=name+" с детства страдал слабоумием";
    	 }
    	 if (intellegence>70)
    	 {
    		 education=name+", несмотря на низкое происхождение, смог научиться грамоте и основам наук.";
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
    		 motivation_str=" "+rnd+" месяцев назад на";
    		 if (homeland_type==1)
    		 {
    			 motivation_str=motivation_str+" деревню";
    		 }
    		 else
    		 {
    			 motivation_str=motivation_str+" город";
    		 }
    	
    	 motivation_str=motivation_str+", где жил "+name+" напал";
    	 rnd = (int)(Math.random()*4);
    	if (rnd==0)
    	{
    		motivation_str=motivation_str+"а армия";
    	}
    	else
    	{
    		motivation_str=motivation_str+" отряд";
    	}
    	motivation_str=motivation_str+" нежити. Враги сожгли дом, где жил герой и убили" ;
    	rnd = (int)(Math.random()*4);
    	if (rnd==0)
    	{
    		motivation_str=motivation_str+" отца" ;	
    	}
    	if (rnd==1)
    	{
    		motivation_str=motivation_str+" мать" ;	
    	}
    	if (rnd==2)
    	{
    		motivation_str=motivation_str+" друзей и родственников" ;	
    	}
    	if (rnd==3)
    	{
    		motivation_str=motivation_str+" брата" ;	
    	}
    	motivation_str=motivation_str+" "+name+"а, после чего он поклялся найти главаря нежити и отомстить ему." ;
    	}
    	if (motivation==2)
    	{
    		if (estate!=3)
    		{
    			motivation_str=" От бедности" ;
    		}
    		else
    		{
    			motivation_str=" От привычки к роскоши" ;
    		}
    		motivation_str=motivation_str+" или от плохого воспитания в "+name+ "е развилась корысть и и жажда золота. С детства от слышал, какие богатства скрывают пещеры гномов, и как только ему представилась такая возможность "+ name+" решил попытать счастья." ;
    	}
    	if (motivation==3)
    	{
    		motivation_str="С детства "+name+" был очень любопытным и всегда находил для себя какие-нибудь приключения. От часто путешествовал, ходил в походы в леса и горы, очень любил";
    	   if (estate>2)
    	   {
    		   motivation_str=motivation_str+" приключенческие романы";
    	   }
    	   else
    	   {
    		   motivation_str=motivation_str+" рассказы бродячих сказочников";
    	   }
    	   motivation_str=motivation_str+", в которых расссказывалось о храбрых героях, в одиночку противостоящих целым армиям зла. Когда в пещерах орков появилась нежить, "+name+" понял, что настало его время.";
    	}
    	if (motivation==4)
    	{
    		motivation_str=name+" всегда был исполнительным человеком. Когда";
    		if (estate==4)
    		{
    			motivation_str=motivation_str+" магистр волшебников";
    		}
    		else
    		{
    			motivation_str=motivation_str+" сюзерен";
    		}
    		motivation_str=motivation_str+" приказал ему исследовать ближайшую пещеру и очистить ее от нежити, "+name+" подчинился.";
    	}
    	if (motivation==5)
    	{
    		motivation_str="        Motivation, such an aggravation.Accusations, don't know how to take them. Inspiration's getting hard to fake it.Concentration's never hard to break it.Situation, never what you want it to be.         ";
    	}
    	end_str=" Он собрал все свои деньги и, купив на них оружие и снаряжение, отправился к ближайшей пещере...";
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
