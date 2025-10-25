class Solution {
    public boolean hasSameDigits(String s) {
       while(s.length() != 2){
        s = transform(s);
       } 
       return s.charAt(0) == s.charAt(1);
    }
    String transform(String s){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<s.length()-1; i++){
            int num1 = s.charAt(i)-'0';
            int num2 = s.charAt(i+1)-'0';

            int sum =(num1+num2)%10;
            sb.append(sum);
        }
        return sb.toString();
    }
}
