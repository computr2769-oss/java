public class stringcaps {
    public static void main(String[] args) 
    {
        String name="hello world";
        char[] name1 = name.toCharArray();

        for(int i=0;i<name1.length;i++)
        {
        System.out.print(Character.toUpperCase(name1[i]));
    }
}
}