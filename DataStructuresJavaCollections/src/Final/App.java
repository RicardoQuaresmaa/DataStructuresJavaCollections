package Final;

public class App {

    public static final String[] LIST = {"1","2","3"};

    public static void main(String[] args)
    {
        String[] list = App.LIST;
        list[0] = "2";
        System.out.println(App.LIST[0]);




    }

}
