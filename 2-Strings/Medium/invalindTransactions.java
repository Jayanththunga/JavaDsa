// https://leetcode.com/problems/invalid-transactions/
import java.util.*;

public class invalindTransactions {
    private HashMap<String, ArrayList<String>> findMap(String[] transactions){
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str: transactions){
            int ind = str.indexOf(",");
            if(map.containsKey(str.substring(0, ind))){
                map.get(str.substring(0, ind)).add(str.substring(ind+1, str.length()));
            }else{
                ArrayList<String> arr = new ArrayList<>();
                arr.add(str.substring(ind+1, str.length()));
                map.put(str.substring(0, ind), arr);
            }
        }

        return map;
    }

    public List<String> invalidTransaction(String[] transactions) {
        HashMap<String, ArrayList<String>> map = findMap(transactions);
        List<String> ans = new LinkedList<String>();

        for(Map.Entry<String, ArrayList<String>> ele: map.entrySet()){
            String name = ele.getKey();
            ArrayList<String> lst = ele.getValue();
            for(int i=0;i<lst.size();i++){

                int time = Integer.parseInt(lst.get(i).substring(0, lst.get(i).indexOf(",")));
                String rem = lst.get(i).substring(lst.get(i).indexOf(",")+1, lst.get(i).length());
                String amt = rem.substring(0, rem.indexOf(","));
                int amount = Integer.parseInt(amt);
                String city = rem.substring(rem.indexOf(",")+1, rem.length());

                // search for more than $1000:
                if(amount>1000){
                    ans.add(name+","+lst.get(i));
                    continue;
                }
                
                // System.out.println(name+" "+time+" "+amt+" "+city);
                for(int j=0;j<lst.size();j++){
                    if(i!=j){
                        int timex = Integer.parseInt(lst.get(j).substring(0, lst.get(j).indexOf(",")));
                        if(Math.abs(time-timex)<=60){
                            String remp = lst.get(j).substring(lst.get(j).indexOf(",")+1, lst.get(j).length());
                            String cityp = remp.substring(remp.indexOf(",")+1, remp.length());
                            if(!city.equals(cityp)){
                                ans.add(name+","+lst.get(i));
                                break;
                            } 
                        }
                    }
                }
            }

            
        }

        return ans;
    }    
}
