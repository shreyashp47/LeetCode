class Solution {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
   
        val x1 = coordinates[0][0]
        val y1 = coordinates[0][1]
        val x2 = coordinates[1][0]
        val y2 = coordinates[1][1]
        
        val dx = x2 - x1
        val sp = y2 - y1
        
       
        for(i in 2 until coordinates.size){
              
            val x = coordinates[i][0]
            val y = coordinates[i][1]
            
          
             if ((y - y1) * dx != (x - x1) * sp) {
                return false
            }
             
        }
        return true
        
    }
}