class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int [] count = new int [10];   //it contains 0-9 digits
        for(int d : digits){
            count[d]++;
        }
        List<Integer> resultList = new ArrayList<>();
        for(int i = 100; i<=998; i+=2){
            int hundreds = i/100;
            int tens = (i/10)%10;
            int ones = i%10;
            count[hundreds]--;
            count[tens]--;
            count[ones]--;
            if(count[hundreds] >= 0 && count[tens]>=0 && count[ones]>=0){
                resultList.add(i);
            }
            count[hundreds]++;
            count[tens]++;
            count[ones]++;
         }
        int[] result = new int[resultList.size()];
        for(int k =0; k < resultList.size(); k++){
            result[k] = resultList.get(k);
        }
        return result;
    }
}
