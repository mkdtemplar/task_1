import java.security.SecureRandom;

public class BingoNumbers
{
    public static void main( String[] args )
    {
        int[] bingo = new int[3];
        int[]closest = new int[3];
        int min = 0;
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
    
        SecureRandom random = new SecureRandom();
        int randomNumber = random.nextInt(100) + 1;
        
        bingo[0] = num1;
        bingo[1] = num2;
        bingo[2] = num3;
        
        System.out.print("Your bingo numbers: ");
        for (int b : bingo)
        {
            System.out.print(b + " ");
        }
        System.out.println();
        
        System.out.println("PC number: " + randomNumber);
        
        for (int w: bingo)
        {
            if(randomNumber == w)
            {
                System.out.println("BINGO!!!");
            }
            else
            {
                for (w = 0; w < bingo.length; w++)
                    closest[ w ] = Math.abs( bingo[ w ] - randomNumber );
                min = closest[ 0 ];
                for(int j : closest)
                    if(min > j)
                        min = j;
            }
        }
    
        for ( int i = 0; i < closest.length; i++ )
        {
            if (closest[i] == min)
            {
                if(bingo[i] != randomNumber)
                {
                    System.out.println("FAILURE!!: The closest number is: " + bingo[i]);
                }
            }
        }
    }
}
