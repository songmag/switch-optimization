public class EnumTableNotUsed {

    public int value(TestEnum test){
        switch(test){
            case A:
                return 1;
            case B:
                return 2;
            case C:
                return 3;
            case D:
                return 4;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int valueIf(TestEnum test){
        if(test == TestEnum.A){
            return 1;
        }
        if(test == TestEnum.B){
            return 2;
        }
        if(test == TestEnum.C){
            return 3;
        }
        if(test == TestEnum.D){
            return 4;
        }
        throw new IllegalArgumentException();
    }
}
