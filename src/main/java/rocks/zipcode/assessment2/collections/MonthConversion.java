package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

   private HashMap<Integer,String> calMap;

    public MonthConversion(){
        calMap = new HashMap<>();
    }

    public void add(Integer monthNumber, String monthName) {
        calMap.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

       String result =  calMap.get(monthNumber);
       return result;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        for(Map.Entry<Integer,String> entry : calMap.entrySet()){
            if(entry.getValue().equals(monthName)) {
                return entry.getKey();
            }
        } return -1;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {

        return calMap.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        for(Map.Entry<Integer,String> entry : calMap.entrySet()){
            if(entry.getValue().equals(monthName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return calMap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

    }
}
