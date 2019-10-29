//https://codeforces.com/problemset/problem/486/A

import java.util.Scanner



fun main(args: Array<String>)  {

    var input1 = Scanner(System. `in`)
    var n = input1.nextLong() 
    var sum = 0
    var i=1

    while (i<=n) {
        if(i%2==0) {
            sum+=i
        }
        else {
            sum-=i
        }
        i=i+1
    }

print(sum)
}