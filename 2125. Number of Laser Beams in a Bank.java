class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int[] devices = new int[n];  
        for(int i=0; i<n; i++){
            for(char ch: bank[i].toCharArray())
            devices[i] += ch -'0';
        }
        int laser = 0;
        int i=0;
        while(i<n){
            int j = i+1;
            while(j<n && devices[j]==0)j++;

            if(j>=n) return laser;
            laser += devices[i]*devices[j];
            i = j;
        }
        return laser;
    }
}