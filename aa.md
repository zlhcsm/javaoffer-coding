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


 public static boolean filt(String network, String maskIp){
        //首先将网段转换为10进制数
        String[] networks = network.split("\\.");
        long networkIp = Long.parseLong(networks[0])  << 24 |
                Long.parseLong(networks[1])  << 16|
                Long.parseLong(networks[2])  << 8|
                Long.parseLong(networks[3]);

        //取出网络位数
        int netCount = Integer.parseInt(maskIp.replaceAll(".*/", ""));
        //这里实际上通过CIDR的网络号转换为子网掩码
        int mask = 0xFFFFFFFF << (32 - netCount);

        //再将验证的ip转换为10进制数
        String testIp = maskIp.replaceAll("/.*", "");
        String[] ips = testIp.split("\\.");
        long ip = Long.parseLong(ips[0]) << 24|
                Long.parseLong(ips[1]) << 16|
                Long.parseLong(ips[2]) << 8|
                Long.parseLong(ips[3]);

        //将网段ip和验证ip分别和子网号进行&运算之后，得到的是网络号，如果相同，说明是同一个网段的
        return (networkIp & mask) == (ip & mask);
————————————————
版权声明：本文为CSDN博主「JeffCoding」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/jeffleo/article/details/72824240
