package midterm2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;
public class hash {
    public static Map<String, Integer> word = new HashMap<>();
    int max = 0;
    int smax = 0;
    int f = 0;
    String word1 = "";
    String word2 = "";
    public hash(String s) {
        //String s = "To opt out, you’ll need to enter the Settings menu by clicking the three vertical dots, all the way in the upper right corner of the browser. From there, you’ll need to enter the Advanced settings at the very bottom and find the “Allow Chrome sign in” toggle, then turn it to off. Doing so lets you sign into Google services like Gmail and Maps without signing into the Chrome browser itself.";
        //String s = "apple orange banana apple peach apple apple orange";
        String Split[];
        //String d = "apple,";
        //System.out.println(d.substring(0,d.length()-1));

        Split = s.split(" ");
        for (int i = 0; i < Split.length; i++) {
            if(Split[i].contains(",") || Split[i].contains("."))
            {
                Split[i] = Split[i].substring(0,Split[i].length()-1);
            }
            if (word.get(Split[i]) == null) {
                word.put(Split[i], 1);
                f++;
            } else {
                word.replace(Split[i], word.get(Split[i]) + 1);
                if(max < word.get(Split[i]))
                {
                    if(!word2.equals(Split[i])) {
                        smax = max;
                        max = word.get(Split[i]);
                        word2 = word1;
                    }
                    word1 = Split[i];
                    max = word.get(Split[i]);

                }
            }
        }
        /*int count = 0;
        for (int a : word.values())
        {
            if (word.get(a).equals(1))
            {
               count += 1;
            }
        }*/

        //for(int i = 0; i < )
        //    System.out.println(word.values());
        //System.out.println(count);

    }
}
