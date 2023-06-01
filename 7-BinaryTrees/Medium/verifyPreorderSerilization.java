import java.util.Stack;

public class verifyPreorderSerilization {
    public boolean isValid(String s) {
        String[] sc = s.split(",");
        Stack<String> st = new Stack<>();
        int popcnt = 0;
        if(!sc[0].equals("#")) st.add(sc[0]); 
        for(int i=1;i<sc.length;i++){
            if(st.isEmpty()) return false;
            if(!sc[i].equals("#")) st.push(sc[i]);
            else{
                popcnt++;
            }
    
            if(popcnt==2){
                st.pop();
                popcnt--;
            }
        }
        return st.isEmpty();
    }
}
