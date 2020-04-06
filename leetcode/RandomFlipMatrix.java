class Solution {
    // 2D binary matrix where all values are initially 0.
    int MAX;
    int cols;
    Random r;
    HashSet<Integer> hs;
    int randomNum;
    // int[] position;
    public Solution(int n_rows, int n_cols) {
        MAX=n_rows*n_cols-1;
        cols=n_cols;
        r=new Random();
        hs= new HashSet<Integer>();
        randomNum=r.nextInt(MAX);
        // position= new int[2];
    }
    
    public int[] flip() {
        randomNum=r.nextInt(MAX);
        while(true){
            if(!hs.contains(randomNum)) break;
            randomNum=r.nextInt(MAX);
        }
        hs.add(randomNum);
    
        return new int[]{randomNum/cols,randomNum%cols};
    }
    
    public void reset() {
        // sets all values back to 0.
        randomNum=r.nextInt(MAX);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n_rows, n_cols);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */
