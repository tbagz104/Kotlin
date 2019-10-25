import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    var flag: Int = 0

    var n: Int = reader.nextInt()

    for (i in 0..n) {

        val input2 = Scanner(System.`in`)
        val t: Int = input2.nextInt()
        if(t==1) {
            flag=1
            break
        }
    }

    if(flag==1){
        println("HARD")


    }else{
        println("EASY")
    }
}
