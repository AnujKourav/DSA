package physicsWallah.Strings;

public class string_Builder {
    public static void main(String[] args) {
        //Declaration and Initialization
        StringBuilder sb = new StringBuilder("Anuj");
        StringBuilder sb1 = new StringBuilder(14); //initial 16 size is allocated
        System.out.println(sb1); //empty string
        sb1.append("Anuj");
        System.out.println(sb1);
        System.out.println(sb == sb1); //false

        //String builder are mutable string

        //-> Methods (Some methods are same as string)
        //for example
        //length()
        //charAt()
        //indexOf()
        //lastIndexOf()
        //equals()
        //compareTo() and etc...

        //1. append() used to concat or add something in string
        sb1 = sb1.append(" Kourav");
        System.out.println(sb1);

        //2. setCharAt(idx,ch) used to set character st index, used to replace
        sb1.setCharAt(5, 'k');
        System.out.println(sb1);

        //3.insert(idx,ch) used to insert, different from replace
        System.out.println(sb1.insert(4," "));

        //4. deleteCharAt(idx) //delete char at particular index
        System.out.println(sb1.deleteCharAt(5));

        //5. delete(i,j) beginning and ending index
        System.out.println(sb.delete(2,5));

        //6. reverse() used to reverse the string
        System.out.println(sb.reverse());
    }
}
