public class sample {
    public int getData(){return 0;}
    public long getData(){return 1;}
    public static void main(String[] args){
        sample obj = new sample();
        System.out.println(obj.getData());
    }
}