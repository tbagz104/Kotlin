//To find the Average of given numbers

import java.util.Scanner

fun main(args: Array<String>) {

var sum = 0.0    
var input1 = Scanner(System.`in`)
var numberCount = input1.nextInt()

for (i in 1..numberCount) {
    var input2  = Scanner(System.`in`)
    var numbers = input2.nextDouble()

    sum+=numbers
}

var average = sum/numberCount
print(average)

}