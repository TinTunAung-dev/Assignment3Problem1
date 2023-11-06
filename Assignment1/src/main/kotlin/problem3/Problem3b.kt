fun sumOddNumbers(arr: IntArray): Int{
    var sum = 0
    for (i in arr){
        if (i%2 != 0){
            sum += i*i
        }
    }
    return sum
}

fun main(){
    val inputArr = intArrayOf(1,2,3,4,5)
    val result = sumOddNumbers(inputArr)
    println("Result : $result")
}