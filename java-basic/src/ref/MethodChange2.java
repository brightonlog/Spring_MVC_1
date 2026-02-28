package ref;

public class MethodChange2 {
    static Data dataA = new Data();
    public static void main(String[] args){

       dataA.value = 10;

    }

    public static void changeData(Data dataX){
        dataX.value = 20;
    }

}
