import java.util.*;
class pattern16	
{
     public static void main(String arg[])
    {
        try{
            int n,i,j,k;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
           for(i = n; i >= 1; i--)
           {
             for(j = i; j < n; j++)
             {
                System.out.print(" ");
              }
              for(j = 1; j <= (2 * i - 1); j++)
             {
               System.out.print("*");
              
	}
               System.out.println("");
              } 
            for(i=1;i<=n;++i)
             {
                   for(j=1;j<=n-i;++j)
                    {
                                System.out.print(" ");
                    }
	    for(k=0;k!=2*i-1;++k)
	      {
                          System.out.print("*");
	        }
                     System.out.println();
               }
       }
       catch(Exception e)
	{
	   System.out.println(e);
	 }
       }
}
