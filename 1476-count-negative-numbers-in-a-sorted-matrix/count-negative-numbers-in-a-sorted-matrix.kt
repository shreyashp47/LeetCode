class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var result = 0
        for(i in 0..grid.size-1){
            for(j in 0..grid[i].size-1){
                if(grid[i][j]<0)
                result++
        }
    }
    return result
        
    }
}