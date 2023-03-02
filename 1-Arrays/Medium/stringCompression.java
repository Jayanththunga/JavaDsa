// https://leetcode.com/problems/string-compression/description/

import java.util.ArrayList;

public class stringCompression {
    public int using2Pointers(char[] chars) {
        int count=1, i=0,j=0;
        for(j=0;j<chars.length-1;j++){
            if(chars[j]!=chars[j+1]){
                chars[i] = chars[j];
                i++;
                if(count!=1){
                    ArrayList<Character> arr = new ArrayList<>();
                    while(count>0){
                        arr.add((char)((count%10)+48));
                        count/=10;
                    }
                    for(int n=arr.size()-1;n>=0;n--){
                        chars[i] = arr.get(n);
                        i++;
                    }
                    count = 1;
                }
            }else count++;
        }

        chars[i] = chars[j];
        i++;
        if(count!=1){
            ArrayList<Character> arr = new ArrayList<>();
            while(count>0){
                arr.add((char)((count%10)+48));
                count/=10;
            }
            for(int n=arr.size()-1;n>=0;n--){
                chars[i] = arr.get(n);
                i++;
            }
            count = 1;
        }

        return i;
    }

    class without2Pointers {
        public int compress(char[] chars) {
            ArrayList<Character> ans = new ArrayList<>();
            int i=0;
            while(i<chars.length){
                int j=i;
                int count = 0;
                while(j<chars.length){
                    if(chars[i]==chars[j]){
                        j++;
                        count++;
                    }else{
                        break;
                    }
                }
    
                if(count==1){
                    ans.add(chars[i]);
                }else{
                    if(count<10){
                        ans.add(chars[i]);
                        char c = (char)(count+48);
                        ans.add(c);
                    }else{
                        ans.add(chars[i]);
                        ArrayList<Character> bb = new ArrayList<>();
                        while(count>0){
                            int b = count % 10;
                            char c = (char)(b+48);
                            bb.add(c);
                            count/=10;
                        }
    
                        for(int k=bb.size()-1;k>=0;k--){
                            ans.add(bb.get(k));
                        }
                    }
                }
    
                i=j;
            }
    
            for(i=0;i<ans.size();i++){
                chars[i] = ans.get(i);
            }
    
            return ans.size();
        }
    }
}