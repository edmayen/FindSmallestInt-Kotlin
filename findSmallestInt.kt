fun main() {
    var list: List<Int> = listOf(15, 20, 10, 17, 22, 9001)
 	var smallest = findSmallestInt(list)
    print(smallest)
    
}

fun findSmallestInt(nums: List<Int>): Int {
    var smallestInteger: Int = nums.get(0)
    for(item in nums)
    {
        if(item < smallestInteger)
        {
            smallestInteger = item
        }
    }
    return smallestInteger // Implement me!
  }
