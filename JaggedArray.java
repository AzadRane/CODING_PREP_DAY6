import java.io.*;
public class JaggedArray {

    public static void main(String args[])throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int jarr[][] = new int [5][];
        jarr[0] = new int[5];
        jarr[1] = new int [4];
        jarr[2] = new int[3];
        jarr[3] = new int[2];
        jarr[4] = new int [1];

        System.out.println("[0] -> "+jarr[0].length);
        System.out.println("[1] -> "+jarr[1].length);
        System.out.println("[2] -> "+jarr[2].length);
        System.out.println("[3] -> "+jarr[3].length);
        System.out.println("[4] -> "+jarr[4].length);


        for(int i=0;i<jarr.length;i++)
        {
            for(int j=0;j<jarr[i].length;j++)
            {
                jarr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("******Your Desired Array is *************");

        for(int i=0;i<jarr.length;i++)
        {
            for(int j=0;j<jarr[i].length;j++)
            {
                System.out.print(jarr[i][j]+" ");
            }

            System.out.println("");
        }
    }


}
