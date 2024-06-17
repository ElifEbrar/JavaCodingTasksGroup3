package ensar.week4;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        
        String givenString = "AAABBCDD";

        System.out.println(frequencyOfChars(givenString));

    }

    private static String frequencyOfChars(String str) {
        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            
            result.append(str.charAt(i));
            int frequency = 1;

            for (int j = i +1; j < str.length(); j++) {
                
                if (str.charAt(i) != str.charAt(j)) {
                    break;
                }
                
                frequency++;
                i = j;
                
            }

            result.append(frequency);
            
        }
        
        return result.toString();
        
    }

}
