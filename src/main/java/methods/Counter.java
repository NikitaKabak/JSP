package methods;

public class Counter {
    private static int count = 0;
    private static int foot;
    public Counter(){

    }

    public int getCount() {
      foot=count++;
        return foot ;
    }

}
