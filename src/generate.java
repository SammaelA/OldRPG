
public class generate {
public  int 
curn,//�� ����� ����� ����� �� ������?
prev;//���������� ����� (0 - ����, 1 - ��)
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
static int weapon_generation_type= 0;//��� ��������� ������. 0 - �����. �� ���� ��������� ������� ���� ������.
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
		letters2[curn] = '�';
	}
	if ((rnd100>=6) & (rnd100<=11))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=12) & (rnd100<=15))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=16) & (rnd100<=21))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=22) & (rnd100<=25))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=25) & (rnd100<=28))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=29) & (rnd100<=31))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=32) & (rnd100<=40))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=41) & (rnd100<=49))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=50) & (rnd100<=58))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=59) & (rnd100<=65))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=66) & (rnd100<=71))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=72) & (rnd100<=87))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=88) & (rnd100<=93))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=94) & (rnd100<=99))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=100) & (rnd100<=102))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=103) & (rnd100<=105))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=106) & (rnd100<=108))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=109) & (rnd100<=115))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=115) & (rnd100<=116))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=116) & (rnd100<=117))
	{
		letters2[curn] = '�';
	}
	prev = 0;
}
public void generate1()

{
	int rnd100 = (int)(Math.random()*112);
	
	if ((rnd100>=0) & (rnd100<=32))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=33) & (rnd100<=45))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=46) & (rnd100<=47))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=47) & (rnd100<=63))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=64) & (rnd100<=84))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=85) & (rnd100<=95))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=96) & (rnd100<=101))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=102) & (rnd100<=107))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=108) & (rnd100<=110))
	{
		letters2[curn] = '�';
	}
	if ((rnd100>=111) & (rnd100<=112))
	{
		letters2[curn] = '�';
	}
	prev = 1;
}
public void test_your_faith()

 {

	for (int i=2;i<n+1;i++)
	{
		if (letters2[i]=='�')
		{
			if ((letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�'))
			{
				ready = false;
			}
		}
		if (letters2[i]=='�')
		{
			if ((letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�'))
			{
				ready = false;
			}
		}
		if (letters2[i]=='�')
		{
			if (letters2[i-1]=='�')
			{
				ready = false;
			}
		}
		if (letters2[i]=='�')
		{
			if ((letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�'))
			{
				ready = false;
			}
		}
		if (letters2[i]=='�')
		{
			if (letters2[i-1]=='�')
			{
				ready = false;
			}
		}
		if (letters2[i]=='�')
		{
			if (letters2[i-1]=='�')
			{
				ready = false;
			}
		}
		if (letters2[i]=='�')
		{
			if (letters2[i-1]=='�')
			{
				ready = false;
			}
		}
		if (letters2[i]=='�')
		{
			if (letters2[i-1]=='�')
			{
				ready = false;
			}
		}
		if (letters2[i]=='�')
		{
			if (letters2[i-1]=='�')
			{
				ready = false;
			}
		}
		if (letters2[i]=='�')
		{
			if (letters2[i-1]=='�')
			{
				ready = false;
			}
		}
	if (letters2[i]=='�') 
	   {
		if (f[i]==1) 
		  {
			if ((letters2[i-1]=='�') |(letters2[i-1]=='�')) {}
			else 
			{
				ready = false;
			}
		
		  }
	   }

	if (letters2[i]=='�') 
	   {
		if (f[i]==1) 
		  {
			if ((letters2[i-1]=='�') |(letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�')) {}
			else 
			{
				ready = false;
			}
		
		  }
	   }
	if (letters2[i]=='�') 
	   {
		if (f[i]==1) 
		  {
			if ((letters2[i-1]=='�') |(letters2[i-1]=='�')) {}
			else 
			{
				ready = false;
			}
		
		  }
	   }
	if (letters2[i]=='�') 
	   {
		if (f[i]==1) 
		  {
			if ((letters2[i-1]=='�') |(letters2[i-1]=='�')|(letters2[i-1]=='�')) {}
			else 
			{
				ready = false;
			}
		
		  }
	   }
	if (letters2[i]=='�') 
	   {
		if (f[i]==1) 
		  {
			if ((letters2[i-1]=='�') |(letters2[i-1]=='�') |(letters2[i-1]=='�') |(letters2[i-1]=='�') |(letters2[i-1]=='�')) {}
			else 
			{
				ready = false;
			}
		
		  }
	   }
	if (letters2[i]=='�') 
	   {
		if (f[i]==1) 
		  {
				ready = false;
		  }
	   }
	if (letters2[i]=='�')
	   {
	 	if ((letters2[i-1]=='�')|(letters2[i-1]=='�'))
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='�')
	   {
	 	if ((letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�'))
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='�')
	   {
	 	if ((letters2[i-1]=='�')|(letters2[i-1]=='�'))
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='�')
	   {
	 	if (letters2[i-1]=='�')
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='�')
	   {
	 	if (letters2[i-1]=='�')
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='�')
	   {
	 	if ((letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�'))
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='�')
	   {
	 	if (letters2[i-1]=='�')
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='�')
	   {
	 	if ((letters2[i-1]=='�')|(letters2[i-1]=='�')|(letters2[i-1]=='�'))
	 	{
	 		ready = false;
	 	}
	   }
	if (letters2[i]=='�')
	   {
	 	if ((letters2[i-1]=='�')|(letters2[i-1]=='�'))
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
		if (letters2[i]=='�')
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
