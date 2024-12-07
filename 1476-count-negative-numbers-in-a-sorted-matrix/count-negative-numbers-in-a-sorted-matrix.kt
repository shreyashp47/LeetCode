class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var result = 0
        for(i in 0..grid.size-1){
            for(j in grid[i].size-1 downTo 0){
                if(grid[i][j]<0)
                result++
        }
    }
    return result
    }
}