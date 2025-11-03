public class PrimitiveBoolean {
    public static void main(String[] args) {

        System.out.println("**************************");

        boolean onOff;

        onOff = true;
        System.out.println("onOff is currently " + onOff);

        onOff = false;
        System.out.println("onOff is currently " + onOff);


        System.out.println("***************************");

        if (onOff == false) {
            System.out.println("Because 'onOff' is " + onOff);
            System.out.println("this message displayed.");
        }

        onOff = true;
        if (onOff == true) {
            System.out.println("Because 'onOff' is now " + onOff);
            System.out.println("this message displayed.");
        }
    }
}