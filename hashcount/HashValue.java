/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashcount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author terer
 */
public class HashValue {
    HashMap<String, Counter> hash_v;
    int unique;
    public HashValue(){
        this.hash_v = new HashMap<>();
        this.unique = 0;
    }
    
    public int get_count(){
        return this.unique;
    }
    
    public void addValue(String value){
        String v = value.toLowerCase();
        if (!hash_v.containsKey(v)){
            hash_v.put(v, new Counter());
            this.unique += 1;
        }else{
            hash_v.get(v).increment();
        }
    }

    public void addMany(ArrayList<String> a_list){
        for (String element : a_list) {
            addValue(element);
        }
    }

    @Override
    public String toString() {
        String output = "";
        for(Map.Entry<String, Counter> elements : hash_v.entrySet()){
            output += "key: " + elements.getKey() + " " + elements.getValue()+"\n";
        }
        return output.strip();
    }
    
    
    
}
