import java.util.Scanner;
class Password_Hacker
{
    static long count= 0;
    String in(int l)
    {
        String k="";
        for(int i=0;i<=l;i++)
        {
            k+=(char)32;
        }
        return k;
    }
    String in2(String pw)
    {
        boolean j=true;
        StringBuffer x=new StringBuffer(pw);
        pw="";
        int l=x.length();
        char h = x.charAt(l-1);
        if((int)h!=127)
        { 
            x.setLength(l-1);
            pw=(new String(x))+(++h);
            return pw;
        }
        else
        {
            char ch;
            int r=127;
            int a=(l-1);
         for(;a>=0;a--)
         {
             ch=x.charAt(a);
             if((int)ch==127&&r==127&&j)
             {
                 ch=(char)32;
             }
             else if((int)ch!=127&&r==127&&j)
             {
                 ch++;
                 j=false;
             }
             pw=ch+pw;
             r=(int)(x.charAt(a!=(-1)?a:0));
         }
         return pw;
        }
    }
    public static void main()
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter password");
        String g = ss.nextLine();
        Password_Hacker pp=new Password_Hacker();
        String pw ="";
        String mw;
        boolean p=true;
        boolean t=true;
        for(int r=0;t;r++)
        {
            for(int i=32;(i<=127&&t);i++)
            {
                mw=pw;
                pw+=(char)i;
                count++;
                if(pw.equals(g))
                t=false;
                else
                pw=mw;
            }
            if(t)
            {
                int l =pw.length();
                int b=0;
                if(l!=0)
                    p = pw.charAt(b)==(char)127;
                else
                    p=true;           
               if(p)
                {
                  pw=pp.in(l);
                }
                else
                    {
                     pw=pp.in2(pw);
                    }
            }  
        }
         System.out.println(pw);
         System.out.println(count);
         count= 0;
    }
}