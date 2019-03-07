package generator;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        String text = "This    is example!";
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(arr[i]);
            if(stringBuilder.length() != 0){
                res.append(stringBuilder.reverse());
            }
            res.append(" ");

        }
        System.out.println(res);
    }


//    public static String reverseWord(final String string) throws InterruptedException {
//
//
//    }
}
