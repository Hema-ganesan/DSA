class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> bryan=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            int min=matrix[i][0];
            int col=0;
            for(int j=1;j<matrix[i].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    col=j;
                }
            }
            boolean isb=true;
                for(int k=0;k<matrix.length;k++)
                {
                    if(matrix[k][col]>min)
                    {
                        isb=false;
                        break;
                    }
                }
                if(isb)
                {
                    bryan.add(min);
                }
        }
        return bryan;

        
    }
}