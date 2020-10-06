package arrays.primtal;

public class Primtal {
    public static void main(String[] args) {
        boolean prime[] = new boolean[1000000+1];
        int largestPrime = 0;

        for(int i=0;i<1000000;i++)
            prime[i] = true;

        for(int p = 2; p*p <=1000000; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*2; i <= 1000000; i += p)
                    prime[i] = false;
            }
        }

        for(int i = 2; i <= 1000000; i++)
        {
            if(prime[i] == true) {
                largestPrime = i;
            }
        }

        System.out.println(largestPrime);
    }
}
