class Solution {
    public int smallestNumber(int n) {
        int i=1;
        int num =1;
        while(num<n){
            num += (int) Math.pow(2,i);
            i++;
        }
        return num;
    }
}

// second approach

int x = n;
while(x&(x+1)!=0) x++;
return x;