import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class dungeon_structure {
public static byte[][][] structure_arr;
public static String FileName,Structure="";
public static int l,w,f,d_type,enter_x,enter_y;
public static int[] key_dot_x,key_dot_y;

public static void make_structure(int width,int length,int floors,int number,int type,String FileName)
{
	l=length;
	w=width;
	f=floors;
	d_type=type;
	System.out.println("l"+length+"w"+width);
	structure_arr = new byte[length+10][width+10][floors+10];
	for (int k=0;k<floors;k++)
	{
		for (int j=0;j<width;j++)
		{
			for (int i=0;i<length;i++)
			{
				structure_arr[i][j][k] =0;
			}
		}
	}
	for (int k=0;k<floors;k++)
	{
		define_parts(type,k);//Разделяем этаж на части
		
	}

	Structure="Начало"+"\n\r";
	for (int k=0;k<floors;k++)
	{Structure=Structure+"\n\r";
	
		for (int j=0;j<width;j++)
		{  
		
			for (int i=0;i<length;i++)
			{
				Structure=Structure+structure_arr[i][j][k];
				
			}
			Structure=Structure+"\n";
			
		}
		Structure=Structure+"\n\r";
		
	}
	
	//write(FileName,Structure);
	//System.out.println(Structure);
}
public static void write(String FileName, String Structure)
{


	File file = new File(FileName);
	try
	{
		if (!file.exists())
		{
			file.createNewFile();
		}
		
		PrintWriter out = new PrintWriter(file.getAbsoluteFile());
		try
		{
			out.print(Structure);
		}
		finally
		{
			out.close();
		}
	}
	catch(IOException e)
	{
		
	}
}

public static void define_parts(int type,int k)
{
	int l_n,w_n,n,rect_l,rect_w; //cлева направо:кол-во прямоугольников в строке, в столбце,номер созданного прямоугольника, длина каждого прямоуг., его ширина


	rect_l= (int)(Math.random()*12)+15;
	rect_w= (int)(Math.random()*12)+15;
	l_n = l/rect_l;
	w_n = w/rect_w;
	n=0;
	key_dot_x = new int[l_n*w_n+1];
	key_dot_y = new int[l_n*w_n+1];
	if (type==0)
{
	make_maze(0,0,l,w,1,k);
}
	
	else 
	{
	for (int i=0;i<w_n;i++)
	{
		for (int j=0;j<l_n;j++)
		{
			n++;
	        int rnd= (int)(Math.random()*2)+1;
			//int rnd=0;
			if (rnd==0)
			{
				make_room(j*rect_l,i*rect_w,rect_l,rect_w,n,k);
			}
			else if (rnd==1)
			{
				make_maze(j*rect_l,i*rect_w+(int)(Math.random()*10),rect_l+(int)(Math.random()*10),rect_w,n,k);
			}
			else if (rnd== 2)
			{
				make_cave(j*rect_l,i*rect_w,rect_l,rect_w,n,k);
			}
			else
			{
				make_mine(j*rect_l,i*rect_w,rect_l,rect_w,n,k);
			}
		}
	}
	}
	connect_parts(l_n,w_n,k);//Соединяем их коридорами
	make_ladder_room(k);

}
public static void make_room(int x,int y,int l,int w,int i,int floor)
{
	if ((l>6)&(w>6))
	{
	key_dot_x[i]=x+l/2;
	key_dot_y[i]=y+w/2;
	int rnd1=(int)(Math.random()*2)+1;
	int rnd2=(int)(Math.random()*2)+1;
	for (int j=0;j<w-2*rnd1;j++)
	{
		for (int k=0;k<l-2*rnd2;k++)
		{
			structure_arr[x+rnd2+k][y+rnd1+j][floor]=1;
		}
	}
	}
}
public static void make_cave(int x,int y,int l,int w,int i,int floor)
{
	//a*x^2+y^2=r^2
		int rnd1=(int)(Math.random()*2)+1;
		int rnd2=(int)(Math.random()*2)+1;
		x=x+rnd2;
		y=y+rnd1;
		l=l-2*rnd1;
		w=w-2*rnd2;
		double[] a = new double[5];
	
		int[] r = new int[5];
		int[] x_s = new int[5];
		int[] y_s = new int[5];
		x=x+rnd2;
		y=y+rnd1;
		l=l-2*rnd1;
		w=w-2*rnd2;
		
		key_dot_x[i]=x+l/2;
		key_dot_y[i]=y+w/2;
		for (int j=0;j<a.length;j++)
		{
			int rnd=(int)(Math.random()*2);
			if (rnd==0)
			{
				a[j]=Math.random()+0.1;
			}
			else
			{
				a[j]=Math.random()*5+1;
			}
			r[j]=(int)(Math.random()*(l/2))+1;
			x_s[j]=(int)(Math.random()*l);
			y_s[j]=(int)(Math.random()*w);
		}
		for (int j=0;j<w;j++)
		{
			for (int k=0;k<l;k++)
			{
				for (int m=0;m<a.length;m++)
				{
					if (a[m]*(k-x_s[m])*(k-x_s[m])+(j-y_s[m])*(j-y_s[m])<=r[m]*r[m])
					{
						structure_arr[k+x][j+y][floor]=1;
					}
				}
			}
		}
	
		
		
		
	
}
public static void make_maze(int x,int y,int l,int w,int i,int floor)
{
	if ((l>6)&(w>6))
	{
		
		
		int rnd1=(int)(Math.random()*2)+1;
		int rnd2=(int)(Math.random()*2)+1;
		x=x+rnd2;
		y=y+rnd1;
		l=l-2*rnd1;
		w=w-2*rnd2;
		
		
	    	key_dot_x[i]=x+l/2;
	         key_dot_y[i]=y +l/2;
			
		int x_s[]=new int[l*w*10];
		int y_s[]=new int[l*w*10];
		int tries=0;
		int turns=0;
		
		
		int cur_x=key_dot_x[i];
		int cur_y=y+w;
		
		//System.out.println("X"+cur_x);
		//System.out.println("Y"+cur_y);
		//System.out.println(floor);
		
		while (tries<=turns)
		{
			int rnd =(int)(Math.random()*2);
			if (rnd==0)
			{
			
			if ((structure_arr[cur_x][cur_y-1][floor]==0)
					&(structure_arr[cur_x-1][cur_y-1][floor]==0)
					&(structure_arr[cur_x+1][cur_y-1][floor]==0)
					&(cur_x>=x)
					&(cur_x<=x+l)
					&(cur_y>=y)
					&(cur_y<=y+w)
					&(cur_x>1)
					&(cur_y>1))
			{
				
				structure_arr[cur_x][cur_y-1][floor]=1;
				cur_y=cur_y-1;
				turns++;
				x_s[turns]=cur_x;
				y_s[turns]=cur_y;
			
			}
			else   if ((structure_arr[cur_x-1][cur_y][floor]==0)
						&(structure_arr[cur_x-1][cur_y-1][floor]==0)
						&(structure_arr[cur_x-1][cur_y+1][floor]==0)
						&(cur_x>=x)
						&(cur_x<=x+l)
						&(cur_y>=y)
						&(cur_y<=y+w)
						&(cur_x>1)
						&(cur_y>1))
				{
					
					structure_arr[cur_x-1][cur_y][floor]=1;
					cur_x=cur_x-1;
					turns++;
					x_s[turns]=cur_x;
					y_s[turns]=cur_y;
					
				}
				
			
				
			else if ((structure_arr[cur_x+1][cur_y][floor]==0)
					&(structure_arr[cur_x+1][cur_y-1][floor]==0)
					&(structure_arr[cur_x+1][cur_y+1][floor]==0)
					&(cur_x>=x)
					&(cur_x<=x+l)
					&(cur_y>=y)
					&(cur_y<=y+w)
					&(cur_x>1)
					&(cur_y>1))
			{
				
				structure_arr[cur_x+1][cur_y][floor]=1;
				cur_x=cur_x+1;
				turns++;
				x_s[turns]=cur_x;
				y_s[turns]=cur_y;
				
			}
			else if ((structure_arr[cur_x][cur_y+1][floor]==0)
					&(structure_arr[cur_x+1][cur_y-1][floor]==0)
					&(structure_arr[cur_x-1][cur_y+1][floor]==0)
					&(cur_x>=x)
					&(cur_x<=x+l)
					&(cur_y>=y)
					&(cur_y<=y+w)
					&(cur_x>1)
					&(cur_y>1))
			{
				
				structure_arr[cur_x][cur_y-1][floor]=1;
				cur_y=cur_y-1;
				turns++;
				x_s[turns]=cur_x;
				y_s[turns]=cur_y;
			
			}
			
			else
			{
				
				tries=tries+1;
				cur_x=x_s[tries];
				cur_y=y_s[tries];
			
				
				
				
			}
	     }
			
			else
				
			{
				 if ((structure_arr[cur_x-1][cur_y][floor]==0)
							&(structure_arr[cur_x-1][cur_y-1][floor]==0)
							&(structure_arr[cur_x-1][cur_y+1][floor]==0)
							&(cur_x>=x)
							&(cur_x<=x+l)
							&(cur_y>=y)
							&(cur_y<=y+w)
							&(cur_x>1)
							&(cur_y>1))
					{
						
						structure_arr[cur_x-1][cur_y][floor]=1;
						cur_x=cur_x-1;
						turns++;
						x_s[turns]=cur_x;
						y_s[turns]=cur_y;
						
					}
				 
				 else if ((structure_arr[cur_x+1][cur_y][floor]==0)
							&(structure_arr[cur_x+1][cur_y-1][floor]==0)
							&(structure_arr[cur_x+1][cur_y+1][floor]==0)
							&(cur_x>=x)
							&(cur_x<=x+l)
							&(cur_y>=y)
							&(cur_y<=y+w)
							&(cur_x>1)
							&(cur_y>1))
					{
						
						structure_arr[cur_x+1][cur_y][floor]=1;
						cur_x=cur_x+1;
						turns++;
						x_s[turns]=cur_x;
						y_s[turns]=cur_y;
						
					}
					else if ((structure_arr[cur_x][cur_y+1][floor]==0)
							&(structure_arr[cur_x+1][cur_y-1][floor]==0)
							&(structure_arr[cur_x-1][cur_y+1][floor]==0)
							&(cur_x>=x)
							&(cur_x<=x+l)
							&(cur_y>=y)
							&(cur_y<=y+w)
							&(cur_x>1)
							&(cur_y>1))
					{
						
						structure_arr[cur_x][cur_y-1][floor]=1;
						cur_y=cur_y-1;
						turns++;
						x_s[turns]=cur_x;
						y_s[turns]=cur_y;
					
					}
					else if ((structure_arr[cur_x][cur_y-1][floor]==0)
							&(structure_arr[cur_x-1][cur_y-1][floor]==0)
							&(structure_arr[cur_x+1][cur_y-1][floor]==0)
							&(cur_x>=x)
							&(cur_x<=x+l)
							&(cur_y>=y)
							&(cur_y<=y+w)
							&(cur_x>1)
							&(cur_y>1))
					{
						
						structure_arr[cur_x][cur_y-1][floor]=1;
						cur_y=cur_y-1;
						turns++;
						x_s[turns]=cur_x;
						y_s[turns]=cur_y;
					
					}
					else
					{
						
						tries=tries+1;
						cur_x=x_s[tries];
						cur_y=y_s[tries];
					
						
						
						
					}
			}
				
			
			
		}
		
	}
	
}
public static void make_mine(int x,int y,int l,int w,int i,int floor)
{
	
}
public static void connect_parts(int l_n,int w_n,int floor)
{
	for (int i=0;i<key_dot_x.length;i++)
	{
		System.out.println("Key dot N"+i+" "+key_dot_x[i]+" "+key_dot_y[i]);
		int rnd = (int)(Math.random()*10);
		if ((i/l_n!=0)& rnd>5)
		{
			for (int a=0;a<key_dot_y[i]-key_dot_y[i-l_n];a++)
			{
				structure_arr[key_dot_x[i]][key_dot_y[i]-a][floor]=1;
			}
		}
		if ((((l_n*w_n)-i)/l_n!=0) & rnd<=5)
		{
			for (int a=0;a<key_dot_y[i+l_n]-key_dot_y[i];a++)
			{
				structure_arr[key_dot_x[i]][key_dot_y[i]+a][floor]=1;
			}
		}
		if ((i%l_n!=1)&(i!=0)& (rnd<=4))
		{
			for (int a=0;a<key_dot_x[i]-key_dot_x[i-1];a++)
			{
				structure_arr[key_dot_x[i]-a][key_dot_y[i]][floor]=1;
			}
		}
		if ((i%l_n!=0) & (rnd<6))
		{
			for (int a=0;a<key_dot_x[i+1]-key_dot_x[i];a++)
			{
				structure_arr[key_dot_x[i]+a][key_dot_y[i]][floor]=1;
			}
		}
		if ((i%l_n!=1)&(i!=0)&(i-l_n>1)& rnd>=6)
		{
			for (int a=0;a<key_dot_x[i]-key_dot_x[i-1-l_n];a++)
			{
				structure_arr[key_dot_x[i]-a][key_dot_y[i]-a][floor]=1;
				structure_arr[key_dot_x[i]+1-a][key_dot_y[i]-a][floor]=1;
			}
		}
               if  ((i%l_n!=0)&(i!=0)&(i-l_n>1)&(rnd==0| rnd>6))
		{
			for (int a=0;a<key_dot_y[i]-key_dot_y[i-l_n+1];a++)
			{
				structure_arr[key_dot_x[i]+a][key_dot_y[i]-a][floor]=1;
				structure_arr[key_dot_x[i]+1+a][key_dot_y[i]-a][floor]=1;
			}
		}
	}
	
	for (int i=0;i<l;i++)
	{
		structure_arr[i][0][floor]=0;
		structure_arr[i][w][floor]=0;
	}

	for (int i=0;i<w;i++)
	{
		structure_arr[0][i][floor]=0;
		structure_arr[l][i][floor]=0;
	}
}
public static void make_ladder_room(int floor)
//создаем две точки для спуска и две для подъема.
{ int a,b,n;
  for (int i=0;i<4;i++)
   {
      a= (int)(Math.random()*(l-18))+4;
      b= (int)(Math.random()*(w-18))+4;
      n=0;
	    while ((structure_arr[a][b][floor]!=1)&(n<1000))
	      {
		    a= (int)(Math.random()*(l-8))+4;
		    b= (int)(Math.random()*(l-8))+4;
		    n++;
	      }
	    if (i%2 ==0)
	    {
	    	structure_arr[a+1][b][floor]=2;
	    }
	    else
	    {
	    	structure_arr[a][b+1][floor]=3;
	    }
	    if ((i==0)&(floor==0))
	    {
	    	enter_x=a;
	    	enter_y=b;
	    }
   }	
}
}
