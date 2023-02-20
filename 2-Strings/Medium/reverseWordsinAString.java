import java.util.Stack;

public class reverseWordsinAString {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String word = "";
        int i = 0;
        while(i<s.length()){
            while(i<s.length() && s.charAt(i)==' '){
                i++;
            }
            while(i<s.length() && s.charAt(i)!=' '){
                word+=s.charAt(i);
                i++;
            }
            st.push(word);
            word="";
        }

        String ans = "";
        while(!st.isEmpty()){
            ans = ans+st.pop()+" ";
        }

        return ans.trim();
    }
}
