class Climb{
    public int climb(int n){
        
        if(n<=3) return n;

        int p1= 3;
        int p2 = 2;
        int c= 0;

        for(int i =3; i<n; i++){
            c=p1+p2;
            p2=p1;
            p1=c;
        }
        
        return c;

    }
}
public class climbStairs {
    public static void main(String[] args) {
        int n=5;
        Climb s = new Climb();
        System.out.println(s.climb(n));
    }
}


