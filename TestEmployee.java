import java.util.Scanner;

class employee
{
	char typ;
	int eid;
	String ename;
	double basicSal,da,ta,hra,medical,grossSal;
	employee(char h,int i,String j,double k)
	{
		typ=h;
		eid=i;
		ename=j;
		basicSal=k;
	}
}
class manager extends employee
{
	manager(char h,int i,String j,double basic)
	{
		super(h,i,j,basic);
		ta=0.15*basic;
		da=0.7*basic;
		hra=0.24*basic;
		medical=0.2*basic;
		grossSal=basic+ta+da+hra+medical;
	}
	
}
class technicalStaff extends employee
{
	technicalStaff(char h,int i,String j,double basic)
	{
		super(h,i,j,basic);
		ta=0.1*basic;
		da=0.5*basic;
		hra=0.2*basic;
		medical=0.2*basic;
		grossSal=basic+ta+da+hra+medical;

	}
}
class labour extends employee
{
	labour(char h,int i,String j,double basic)
	{
		super(h,i,j,basic);
		ta=0.1*basic;
		da=0.3*basic;
		hra=0.1*basic;
		medical=0.1*basic;
		grossSal=basic+ta+da+hra+medical;

	}
}
class TestEmployee
{
	static char type;
	static String ename; 
	static Scanner y=new Scanner(System.in);
	static Scanner z=new Scanner(System.in);
	static int f=-1,r=-1,size=3,eid,s;
	static double basicSal;
	static employee e[]=new employee[size];
	static int unique_check()
	{
		int v=0;
		s=f;
		while(s!=r)
		{
			
			if(e[s].typ==type)
			{
				if(e[s].eid==eid)
				{
					v=1;
					System.out.print("\nEid should be unique!!This number is already entered!!\n");
					System.out.print("\nEnter new eid : "+type);
					eid=y.nextInt();
				}
			}
			s=(s+1)%size;
		}
		return v;
	}
	static void input()
	{
		int ch,q;
		System.out.print("\n1.Manager\n2.TechnicalStaff\n3.Labour\nSelect the employee category : ");
		ch=y.nextInt();
		while(ch>3 || ch<1)
		{
			System.out.print("\nPlease select a valid input : ");
			ch=y.nextInt();
		}
		if(ch==1)
			type='M';
		else if(ch==2)
			type='T';
		else if(ch==3)
			type='L';
		System.out.print("\nEnter the employee ID : "+type);
		eid=y.nextInt();
		q=unique_check();
		while(q!=0)
			q=unique_check();
		System.out.print("\nEnter the employee name : ");
		ename=z.nextLine();
		System.out.print("\nEnter the basic salary : ");
		basicSal=y.nextDouble();
	}
	static void insert()
	{
		int k=0;
		if(f==(r+1)%size)
		{
			System.out.print("\nMemory is not avilable!!\n");
		}
		else
		{
			if(f==-1 && r==-1)
				f=r=0;
			else
				r=(r+1)%size;
			input();
			if(type=='M')
				e[r]=new manager(type,eid,ename,basicSal);
			else if(type=='T')
				e[r]=new technicalStaff(type,eid,ename,basicSal);
			else
				e[r]=new labour(type,eid,ename,basicSal);
			System.out.print("\nInserted Successfully!!\n");
		}
			
	}
	static void extdisplay(int i)
	{
		System.out.print("\nEmployee ID : "+e[i].typ+e[i].eid);
		System.out.print("\nEmployee name : "+e[i].ename);
		System.out.print("\nBasic salary : "+e[i].basicSal);
		System.out.print("\nGross salary : "+e[i].grossSal+"\n");
	}
	static void display()
	{
		int i;
		if(f==-1 && r==-1)
			System.out.print("\nNo data found!!\n");
		else
		{
			i=f;
			while(i!=r)
			{
				extdisplay(i);
				i=(i+1)%size;
			}
			extdisplay(i);
		}				
	}
	static void delete()
	{
		if(f==-1 && r==-1)
			System.out.print("\nNo data found!!\n");
		else
		{
			if(f==r)
				f=r=-1;
			else
				f=(f+1)%size;
			System.out.print("\nDeleted Successfully!!\n");
		}
	}
	static void avgsal()
	{
		double avg=0;
		int i,j=0;
		i=f;
		if(f==-1 && r==-1)
		{
			System.out.print("\nNo data found!!List is empty....\n");
			return;
		}
		if(f==r)
		{
			System.out.print("\nAverage salary of all employee : "+e[r].basicSal+"\n");
			return;
		}
		while(i!=r)
		{
			avg=avg+e[i].basicSal;
			i=(i+1)%size;
			j++;
		}
		avg=avg+e[r].basicSal;
		j++;
		System.out.print("\nAverage salary of all employee : "+(avg/j)+"\n");
	}
	static void maxmin()
	{
		double max,min;
		int i=f,j;
		max=e[r].basicSal;
		min=e[r].basicSal;
		while(i!=r)
		{
			if(e[i].basicSal>max)
				max=e[i].basicSal;
			if(e[i].basicSal<min)
				min=e[i].basicSal;
			i=(i+1)%size;
		}
		System.out.print("\nThe maximum salary : "+max);
		System.out.print("\nThe minimum salary : "+min+"\n");
		
	}
	static void sort()
	{
		int i;
		double sal[]=new double[size];
		for(i=0;i<size;i++)
			sal[i]=e[i].basicSal;
		for(i=0;i<size;i++)
			System.out.print("\n"+sal[i]);
		return;	
	}
	static void only_one()
	{
		int ch,s,id;
		char ty='x';
		if(f==-1 && r==-1)
		{
			System.out.print("\nNo data inserted!!!\n");
			return;
		
		}
		System.out.print("\n1.Manager\n2.Technicalstaff\n3.Labour\nSelect the category of employee : ");
		ch=y.nextInt();
		while(ch>3 || ch<1)
		{
			System.out.print("\n1.Manager\n2.TechnicalStaff\n3.Labour\nPlease select a valid employee's category : ");
			ch=y.nextInt();
		}
		if(ch==1)
			ty='M';
		else if(ch==2)
			ty='T';
		else if(ch==3)
			ty='L';
		System.out.print("\nEnter eid of the employee : "+ty);
		id=y.nextInt();
		s=f;
		while(s!=r)
		{
			if(e[s].typ==ty)
			{
				if(e[s].eid==id)
				{
					System.out.print("\nEmployee ID : "+e[s].typ+e[s].eid);
					System.out.print("\nEmployee name : "+e[s].ename);
					System.out.print("\nBasic salary : "+e[s].basicSal);
					System.out.print("\nGross salary : "+e[s].grossSal+"\n");
					return;	
				}
			}
			s=(s+1)%size;
		}
		if(e[r].typ==ty)
		{
			if(e[r].eid==id)
			{
					System.out.print("\nEmployee ID : "+e[r].typ+e[r].eid);
					System.out.print("\nEmployee name : "+e[r].ename);
					System.out.print("\nBasic salary : "+e[r].basicSal);
					System.out.print("\nGross salary : "+e[r].grossSal+"\n");
					return;	
			}
		}
		System.out.print("\nNo data found !!This id have no data!!\n");
			
	}
	public static void main(String args[])
	{
		int ch;
		while(true)
		{
			System.out.print("\n1.Insert employee details\n2.Delete first employee details\n3.Display employee details");
			System.out.print("\n4.Average salary of all employees\n5.Maximum salary and Minimum salary");
			System.out.print("\n6.show A particular employee details\n7.Sort about salary");
			System.out.print("\n8.Exit\nEnter your choice : ");
			ch=y.nextInt();
			switch(ch)
			{
				case 1: insert();
					break;
				case 2: delete();
					break;
				case 3: display();
					break;
				case 4: avgsal();
					break;
				case 5: maxmin();
					break;
				case 6: only_one();
					break;
				case 7: sort();
					break;
				case 8: System.exit(0);
				default:System.out.print("\nPlease enter a valid input!!\n");
					break;
					
			}
		
		}
	}
}



