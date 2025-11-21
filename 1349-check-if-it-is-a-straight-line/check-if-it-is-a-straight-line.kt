class Solution {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        val x0 = coordinates[0][0]
        val y0 = coordinates[0][1]
        val x1 = coordinates[1][0]
        val y1 = coordinates[1][1]

        val difX = x1 - x0
        val difY = y1 - y0 

        for(i in 2..coordinates.size-1){
            val x = coordinates[i][0]
            val y = coordinates[i][1]
            if(difX * (y - y0) != difY * (x - x0)) return false
        }
        return true

    }
}