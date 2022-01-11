package day20_Arrays;

public class HighestFreq {
    public static void main(String[] args) {
        String str = "AAAAssBdBBCCHHHHHyyysMMMweMMqwwqEaasEAmmEEEtrTddTTTaT";
        //new Scanner(System.in).next(); //AABBBCCEEEHHHHH --- A2B3C2E3H5

        String result = ""; //stores the char with highest freq.
        int max = 0; //store highest freq.

        for (int j = 0; j < str.length(); j++) {
            if (!str.substring(0, j).contains(str.charAt(j) + "")){

                //calculate the freq. of str.charAt(j)
                int frequency = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == str.charAt(j))
                        frequency++;
                }


                //if the freq. of str.charAt(j) is higher than max,
                // add str.charAt(j) to result
                if (max < frequency) {
                    max = frequency;
                    result = str.charAt(j) + "";
                }
                if (max == frequency) {
                    if (result.contains(str.charAt(j) + ""))
                        continue;
                    else result += str.charAt(j) + "";
                }
            }

           /* if (max == frequency) {
                if (!result.contains(str.charAt(j) + ""))
                    result += str.charAt(j) + "";
            }*/
        }
        System.out.println(result);
    }
}

