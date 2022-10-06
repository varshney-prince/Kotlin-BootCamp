import java.util.*
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var a = sc.nextInt()

        /*when (a) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> {
                print("x is neither 1 nor 2")
            }
        }*/
        val array = IntArray(5)

        for (i in 1..3) {
            array[i]=i
        }
        println(Arrays.toString(array))
        /*for (i in 6 downTo 0 step 2) {
            println(i)
        }*/

        pri(a)

    }



fun pri(a:Int) {
        if (a == 0) {
            return
        }
        print(a)
        return pri(a - 1)

    }
