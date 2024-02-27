class demoConv{
    public float convCM(float value){
        return value * 100;
    }
    public float convMM(float value){
        return value *1000;
    }
    public void dispConv(float value){
        System.out.printf(value + " meter = " + convCM(value) + " cm, " + convMM(value) + "mm");
    }
}
public class codelab1 {
    public static void main(String[] args) {
    demoConv obj = new demoConv();
    obj.dispConv(1);
    }
}
