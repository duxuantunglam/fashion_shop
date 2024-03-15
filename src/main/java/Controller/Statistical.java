package Controller;
import Model.Fashion;
import java.util.List;

public class Statistical {
    public static void statiscals(String input1, List<Fashion> fashionList, List<Fashion> statisticalList){
        try{
            statiscalByMonth(input1.trim(), fashionList, statisticalList);
        }catch (Exception e) {
                e.printStackTrace();
        }
    }
    
    public static void statiscalByMonth(String month, List<Fashion> fashionList, List<Fashion> statisticalList){
        for (Fashion fashion : fashionList) {
            String []s = fashion.getDate().split("/");
            if (s[0].equalsIgnoreCase(month)){
                statisticalList.add(fashion);
            }
        }
    }
}
