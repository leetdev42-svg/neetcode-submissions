class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int row[]:matrix){
            for(int elem:row){
                if(elem==target){
                    return true;
                }
            }
        }
        return false;
    }
}
