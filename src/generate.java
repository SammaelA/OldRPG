
public class generate {
public  int 
curn,//на какой букве слова мы сейчас?
prev;//предыдуща€ буква (0 - согл, 1 - гл)
int n = ((int)(Math.random()*9)+(int)(Math.random()*9)+(int)(Math.random()*9)+9)/3,
tries = 0,
age,
provincen,
parents_type,
homeland_type,
intellegence,
luck,
character,
str,
agi;
static int weapon_generation_type= 0;//тип генерации оружи€. 0 - игрок. ќт типа генерации зависит сила оружи€.
int[] f = new int[n];
char[] letters2 = new char[n];
boolean ready = true,
second=false;
String name,
name2,
rname,
pr1,
pr2,
province,
town,
homeland;
static String FileName="C:\\Users\\1\\Saved Games\\Desktop\\Project\\Texts\\names.txt";
String final_string;
String age_str;
String j1;
String j2;
String parents;
String education;
String char_str;
String other_str;




public void generate_()

{
	
	 curn = 0;
	 n = ((int)(Math.random()*9)+(int)(Math.random()*9)+(int)(Math.random()*9)+9)/3;
	f = new int[n+100];
	 letters2 = new char[n+100];
	 ready = true;
	name = "";

	
        int rnd100 = (int)(Math.random()*100);

        if (rnd100>50)
        {
                curn=1;
                
        f[curn]= 0;
        }
        else
        {
                curn=1;
               
                f[curn]= 1;
        }
 rnd100 = (int)(Math.random()*100);
curn=2;
        if (f[1]== 1)
        {
                if (rnd100<10)
                {

                
                f[curn]= 1;
                }
                else
                {
                        
                        f[curn]= 0;	
                }
        }
        else
        {

                if (rnd100<75)
                {

               
                f[curn]= 1;
                }
                else
                {
                        
                        f[curn]= 0;
                }
        }
       for(int i=1; i<n-1; i++)
       {
    	   curn = i+2;
    	   rnd100 = (int)(Math.random()*100);
    	   if ((f[i]==1) & (f[i+1]==1))
    	   {
    		   f[i+2] =0;
    		
    	   }
    	   if ((f[i]==1) & (f[i+1]==0))
    	   {
    		   rnd100 = (int)(Math.random()*100);
    		   if (rnd100<=55)
    		   {
    			   f[i+2] =1;
        	
    		   }
    		   else
    		   {
    			   f[i+2] =0;
        		  
    		   }
    	   }
    	   if ((f[i]==0) & (f[i+1]==1))
    	   {
    		   rnd100 = (int)(Math.random()*100);
    		   if (rnd100<=15)
    		   {
    			   f[i+2] =1;
        		    
    		   }
    		   else
    		   {
    			   f[i+2] =0;
        		  
    		   }
    	   }
    	   if ((f[i]==0) & (f[i+1]==0))
    	   {
    		   f[i+2] =1;
    		   
    	   }
       }
       for (int y=0;y<=n; y++)
       {
    	   curn=y;
    	   if (f[y]==0)
    	   {
    		  
    		   generate0();
    		  
    	   }
    	   else if (f[y]==1)
    	   {
    		   generate1();
    	   }
       }
      
       test_your_faith();
       if (ready == false)
    		   {
    	   tries=tries+1;
    	   generate_();
    		   }
       
       name = " ";
        for (int i=1; i<n+1; i++)
        {
        	
        	name = name+ letters2[i];
        	
        }
        rname = name;
        
}
public void generate0()
{
	int rnd100;
	rnd100 = (int)(Math.random()*117)+1;
	if ((rnd100>=1) & (rnd100<=5))
	{
		letters2[curn] = 'б';
	}
	if ((rnd100>=6) & (rnd100<=11))
	{
		letters2[curn] = 'в';
	}
	if ((rnd100>=12) & (rnd100<=15))
	{
		letters2[curn] = 'г';
	}
	if ((rnd100>=16) & (rnd100<=21))
	{
		letters2[curn] = 'д';
	}
	if ((rnd100>=22) & (rnd100<=25))
	{
		letters2[curn] = 'ж';
	}
	if ((rnd100>=25) & (rnd100<=28))
	{
		letters2[curn] = 'з';
	}
	if ((rnd100>=29) & (rnd100<=31))
	{
		letters2[curn] = 'й';
	}
	if ((rnd100>=32) & (rnd100<=40))
	{
		letters2[curn] = 'к';
	}
	if ((rnd100>=41) & (rnd100<=49))
	{
		letters2[curn] = 'л';
	}
	if ((rnd100>=50) & (rnd100<=58))
	{
		letters2[curn] = 'м';
	}
	if ((rnd100>=59) & (rnd100<=65))
	{
		letters2[curn] = 'н';
	}
	if ((rnd100>=66) & (rnd100<=71))
	{
		letters2[curn] = 'о';
	}
	if ((rnd100>=72) & (rnd100<=87))
	{
		letters2[curn] = 'р';
	}
	if ((rnd100>=88) & (rnd100<=93))
	{
		letters2[curn] = 'с';
	}
	if ((rnd100>=94) & (rnd100<=99))
	{
		letters2[curn] = 'т';
	}
	if ((rnd100>=100) & (rnd100<=102))
	{
		letters2[curn] = 'ц';
	}
	if ((rnd100>=103) & (rnd100<=105))
	{
		letters2[curn] = 'ф';
	}
	if ((rnd100>=106) & (rnd100<=108))
	{
		letters2[curn] = 'х';
	}
	if ((rnd100>=109) & (rnd100<=115))
	{
		letters2[curn] = 'п';
	}
	if ((rnd100>=115) & (rnd100<=116))
	{
		letters2[curn] = 'ч';
	}
	if ((rnd100>=116) & (rnd100<=117))
	{
		letters2[curn] = 'ш';
	}
	prev = 0;
}
public void generate1()

{
	int rnd100 = (int)(Math.random()*112);
	
	if ((rnd100>=0) & (rnd100<=32))
	{
		letters2[curn] = 'а';
	}
	if ((rnd100>=33) & (rnd100<=45))
	{
		letters2[curn] = 'е';
	}
	if ((rnd100>=46) & (rnd100<=47))
	{
		letters2[curn] = 'Є';
	}
	if ((rnd100>=47) & (rnd100<=63))
	{
		letters2[curn] = 'и';
	}
	if ((rnd100>=64) & (rnd100<=84))
	{
		letters2[curn] = 'о';
	}
	if ((rnd100>=85) & (rnd100<=95))
	{
		letters2[curn] = 'у';
	}
	if ((rnd100>=96) & (rnd100<=101))
	{
		letters2[curn] = 'э';
	}
	if ((rnd100>=102) & (rnd100<=107))
	{
		letters2[curn] = 'ю';
	}
	if ((rnd100>=108) & (rnd100<=110))
	{
		letters2[curn] = '€';
	}
	if ((rnd100>=111) & (rnd100<=112))
	{
		letters2[curn] = 'ы';
	}
	prev = 1;
}
public void test_your_faith()

 {

	for (int i=2;i<n+1;i++)
	{
		if (letters2[i]=='а')
		{
			if ((letters2[i-1]=='а')|(letters2[i-1]=='ю')|(letters2[i-1]=='э')|(letters2[i-1]=='€')|(letters2[i-1]=='ы'))
			{
				ready = false;
			}
		}
		if (letters2[i]=='о')
		{
			if ((letters2[i-1]=='о')|(letters2[i-1]=='ю')|(letters2[i-1]=='Є')|(letters2[i-1]=='€')|(letters2[i-1]=='ы'))
			{
				ready = false;
			}
		}
		if (letters2[i]=='е')
		{
			if (letters2[i-1]=='е')
			{
				ready = false;
			}
		}
		if (letters2[i]=='и')
		{
			if ((letters2[i-1]=='Є')|(letters2[i-1]=='ю')|(letters2[i-1]=='€')|(letters2[i-1]=='€')|(letters2[i-1]=='ы'))
			{
				ready = false;
			}
		}
		if (letters2[i]=='Є')
		{
			if (letters2[i-1]=='Є')
			{
				ready = false;
			}
		}
		if (letters2[i]=='э')
		{
			if (letters2[i-1]=='э')
			{
				ready = false;
			}
		}
		if (letters2[i]=='ю')
		{
			if (letters2[i-1]=='ю')
			{
				ready = false;
			}
		}
		if (letters2[i]=='€')
		{
			if (letters2[i-1]=='€')
			{
				ready = false;
			}
		}
		if (letters2[i]=='у')
		{
			if (letters2[i-1]=='у')
			{
				ready = false;
			}
		}
		if (letters2[i]=='ы')
		{
			if (letters2[i-1]=='ы')
			{
				ready = false;
			}
		}
	if (letters2[i]=='б') 
	   {
		if (f[i]==1) 
		  {
			if ((letters2[i-1]=='л') |(letters2[i-1]=='р')) {}
			else 
			{
				ready = false;
			}
		
		  }
	   }

	if (letters2[i]=='г') 
	   {
		if (f[i]==1) 
		  {
			if ((letters2[i-1]=='л') |(letters2[i-1]=='р')|(letters2[i-1]=='н')|(letters2[i-1]=='д')|(letters2[i-1]=='в')) {}
			else 
			{
				ready = false;
			}
		
		  }
	   }
	if (letters2[i]=='д') 
	   {
		if (f[i]==1) 
		  {
			if ((letters2[i-1]=='л') |(letters2[i-1]=='р')) {}
			else 
			{
				ready = false;
			}
		
		  }
	   }
	if (letters2[i]=='ж') 
	   {
		if (f[i]==1) 
		  {
			if ((letters2[i-1]=='б') |(letters2[i-1]=='н')|(letters2[i-1]=='р')) {}
			else 
			{
				ready = false;
			}
		
		  }
	   }
	if (letters2[i]=='з') 
	   {
		if (f[i]==1) 
		  {
			if ((letters2[i-1]=='б') |(letters2[i-1]=='в') |(letters2[i-1]=='г') |(letters2[i-1]=='д') |(letters2[i-1]=='р')) {}
			else 
			{
				ready = false;
			}
		
		  }
	   }
	if (letters2[i]=='й') 
	   {
		if (f[i]==1) 
		  {
				ready = false;
		  }
	   }
	if (letters2[i]=='в')
	   {
	 	if ((letters2[i-1]=='й')|(letters2[i-1]=='ф'))
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='к')
	   {
	 	if ((letters2[i-1]=='й')|(letters2[i-1]=='г')|(letters2[i-1]=='б'))
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='л')
	   {
	 	if ((letters2[i-1]=='й')|(letters2[i-1]=='р'))
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='м')
	   {
	 	if (letters2[i-1]=='й')
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='н')
	   {
	 	if (letters2[i-1]=='й')
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='п')
	   {
	 	if ((letters2[i-1]=='й')|(letters2[i-1]=='в')|(letters2[i-1]=='б')|(letters2[i-1]=='г'))
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='р')
	   {
	 	if (letters2[i-1]=='й')
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='с')
	   {
	 	if ((letters2[i-1]=='й')|(letters2[i-1]=='ф')|(letters2[i-1]=='ж'))
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='т')
	   {
	 	if ((letters2[i-1]=='й')|(letters2[i-1]=='п'))
	 	{
	 		ready = false;
	 	}
	   }
	
		
	}
	if (f[n-2]==0)
	{
		ready = false;
	}
	 boolean rexist = false;
	for (int i=1; i<n+1; i++)
	{
		if (letters2[i]=='р')
		{
			rexist = true;
		}
	}
	if (rexist == false)
   {
	ready = false;
   }
	for (int i=0; i<n; i++)
	{
		//if ((f[i]==0)&(f[i+1]==0)&(f[i+2]==0))
		//{
			//ready = false;
		//}
		if ((f[i]==1)&(f[i+1]==1))
		{
			ready = false;
		}
	}
	if (prev==1)
	{
		ready=false;
	}
	
 }

}
