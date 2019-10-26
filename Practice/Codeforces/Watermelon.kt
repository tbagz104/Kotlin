
//https://codeforces.com/problemset/problem/4/A

import java.util.Scanner

fun main(args: Array<String>) {

    val input1 = Scanner(System.`in`)
    val n: Int = input1.nextInt()

if (n%2!==0 || n<=2) {
    print("NO")
} else {
    print("YES")
}

}