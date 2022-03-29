public class ImmutableObject {
    private final String s_Name;
    private final int i_Age;

    public ImmutableObject(String s_Name, int i_Age) {
        this.s_Name = s_Name;
        this.i_Age = i_Age;
    }

    public String get_s_Name() {
        return s_Name;
    }

    public int get_i_Age() {
        return i_Age;
    }
}

class ImmutableObject_Exercise {
    public static void Exercise() {
        System.out.println("\n---ImmutableObject---\n");

        ImmutableObject immutobj_1 = new ImmutableObject("Abc",20);
        ImmutableObject immutobj_2 = new ImmutableObject("Bcd",25);

        System.out.println(
                "immutobj_1's elements is: \n" +
                        "s_Name=" + immutobj_1.get_s_Name() + "\n" +
                        "i_Age=" + immutobj_1.get_i_Age() + "\n"
        );
        System.out.println(
                "immutobj_2's elements is: \n" +
                        "s_Name=" + immutobj_2.get_s_Name() + "\n" +
                        "i_Age=" + immutobj_2.get_i_Age() + "\n"
        );
    }
}