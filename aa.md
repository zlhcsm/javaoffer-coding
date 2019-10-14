class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        for(int i = 0; i<obstacleGrid.length;i++){
            for(int j = 0 ; j<obstacleGrid[i].length;j++){
                if(obstacleGrid[i][j] == 1){
                    obstacleGrid[i][j] = 0;
                    continue;
                }
                if(i==0&&j==0){
                    obstacleGrid[i][j] = 1;
                    continue;
                }
                if(i==0 || j==0){
                    obstacleGrid[i][j] = i==0?obstacleGrid[i][j-1]:obstacleGrid[i-1][j];
                    continue;
                }
                obstacleGrid[i][j] = obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
            }
        }
        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
