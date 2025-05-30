package darshita.project.grokking_dsa;

import java.util.ArrayList;
import java.util.List;

public class StringPermsCaseChange {
    public static List<String> StringPerms(String str) {
        List<String> perms = new ArrayList<String>();
        if(str == null){
            return perms;
        }
        perms.add(str);
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                int size = perms.size();
                for(int j = 0; j < size; j++){
                    char[] ch = perms.get(j).toCharArray();
                    if(Character.isUpperCase(ch[i])){
                        ch[i] = Character.toLowerCase(ch[i]);
                    }
                    else{
                        ch[i] = Character.toUpperCase(ch[i]);
                    }
                    perms.add(String.valueOf(ch));
                }
            }
        }
        return perms;
    }
    public static void main(String[] args) {
        List<String> perms = StringPerms("ab7c");
        System.out.println(perms);
    }
}
