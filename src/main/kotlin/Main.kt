import java.util.*
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var a = sc.nextInt()
        pri(a)

    }

    fun pri(a:Int) {
        if (a == 0) {
            return
        }
        print(a)
        return pri(a - 1)

    }
