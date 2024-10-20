class Solution {
    fun dayOfYear(date: String): Int {
        val monthDayCounts = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30)
        var str = date.split("-")
        var days = str[2].toInt()
    	var month = str[1].toInt()   
        for(i in 0  until month-1){
            days = days + monthDayCounts[i] 
        } 
        // Check for leap year and add an extra day if necessary
        val year = str[0].toInt()
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) && month > 2) {
    days += 1
}
        return days
    }
}