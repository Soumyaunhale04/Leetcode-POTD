class Solution {
    public int totalMoney(int n) {
      int week = n/7;
      int remDays = n%7;
      int totalMoney = 0;
      int i=1;
      for(; i<= week; i++){
        totalMoney += (7*(2*(i)+6))/2;
      }  
      totalMoney += remDays*(2*(i)+(remDays-1))/2;
      return totalMoney;
    }
}