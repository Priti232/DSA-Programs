package stringexamples;

public class Example13 {
    public static void main(String[]args){
        String str="BLACKBLACK";
        System.out.println(str.replace("ACK","UE"));
        System.out.println(str.replaceAll("ACK","UE"));
        System.out.println(str);
    }
}
