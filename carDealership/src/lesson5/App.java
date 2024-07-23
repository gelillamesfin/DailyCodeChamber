package lesson5;

import java.util.HashMap;
import java.util.Map;

public class App {
public static void main(String [] args){
    HashMap<String,String> dictionary= new HashMap<String,String>();
dictionary.put("Brave","Someone who dares to learn Java");
dictionary.put("Brilliant", "exceptionally clever or  talented ");
dictionary.put("Joy", "A feeling of great pleasure and happiness ");
dictionary.put("Confidence", "the state of feelin certain about the truth of something");

for (String word: dictionary.keySet()){
System.out.println(word);
}
for(Map.Entry<String,String> entry:dictionary.entrySet()){
System.out.println(entry.getKey());
System.out.println(entry.getValue());
}
}
}
