public class Main {

    public static void main(String[] args) {
        EnumTable enumTable = new EnumTable();
        System.out.println(enumTable.value(TestEnum.A));
        System.out.println(enumTable.value(TestEnum.B));
        System.out.println(enumTable.value(TestEnum.C));
        System.out.println(enumTable.value(TestEnum.D));

        EnumTableNotUsed enumTableNotUsed = new EnumTableNotUsed();

    }
}
