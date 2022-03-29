public class MutableObject {
    public String s_Name;
    public int i_Age;

    public MutableObject(String s_Name, int i_Age) {
        this.s_Name = s_Name;
        this.i_Age = i_Age;
    }
}

class MutableObject_Exercise{
    public static void Exercise() {
        System.out.println("\n---MutableObject---\n");

        MutableObject mutobj_1 = new MutableObject("Abc",20);
        System.out.println(
                "mutobj_1's elements is: \n" +
                        "s_Name="+ mutobj_1.s_Name + "\n" +
                        "i_Age="+mutobj_1.i_Age + "\n"
        );

        MutableObject mutobj_2 = mutobj_1;
        mutobj_2.s_Name = "Bcd";
        mutobj_2.i_Age = 25;

        System.out.println(
                "mutobj_1's elements is: \n" +
                        "s_Name="+ mutobj_1.s_Name + "\n" +
                        "i_Age="+mutobj_1.i_Age + "\n"
        );
        System.out.println(
                "mutobj_2's elements is: \n" +
                        "s_Name="+ mutobj_2.s_Name + "\n" +
                        "i_Age="+mutobj_2.i_Age + "\n"
        );

    }
}