public class reversetrianglepattern {
    public static void main(String[] args) {
        for (int m=5; m>=1; m--)
{
for (int n=1; n<=(m * 2) -1; n++)
{
System.out.print("*");
}
System.out.println();
for (int p=5; p>=m; p--)
{
System.out.print(" ");
}
}
    }
}
