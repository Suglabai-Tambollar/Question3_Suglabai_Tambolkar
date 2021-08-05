public class solution
{
    
    static int countingvalleys(int n,String s)
    {
        char arr[]=s.toCharArray();
        int count=0,level=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='U')
            {
                ++level;
            }
            if(arr[i]=='D')
            {
                level--;
            }
            if(level==0 && arr[i]=='U')
                count++;
            
        }
        return count;
    }
}
class main{
    public static void main(String[] args)
    {
        int n=8;
        String="UDDDUDUU";
        countingvalleys(int n,String s);
    }
}

    
