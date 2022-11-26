import java.util.List;

public class EnumTable {

    public int value(TestEnum testEnum){
        int[] arr = new int[]{1,2,3,4};
        return arr[testEnum.ordinal()];
    }
}
