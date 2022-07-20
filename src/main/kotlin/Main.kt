import kotlin.system.exitProcess

fun main() {
    println("Enter the names, separated by \",\" or a space")

    val names = readLine().orEmpty()
    val namesArray = names.split( ",")

    println("Enter the salary")

    val salary = readLine().orEmpty()
    val salaryArray = salary.split(",")

    if (namesArray.size != salaryArray.size){
        println("The list of names must match the salary")
        exitProcess(0)
    }

    CheckingForLength( namesArray, 20, "Name")
    CheckingForLength( salaryArray, 8, "Salary")

    DataTable(namesArray, salaryArray)
}


fun CheckingForLength(namesArray: List<String>, maxName: Int, s: String) {

    for (name in namesArray) {

        if (name.length > maxName) {

            println("The $s exceeds the allowed value ( max $maxName)")
            break
        }
    }
}

fun DataTable(namesArray: List<String>, salaryArray: List<String>) {
    println("-".repeat(23))

    for (name in namesArray){
        val index = namesArray.indexOf(name)
        val salary = salaryArray[index]

        val a1 = (12 - name.length) / 2
        val a2 = 12 - name.length - a1

        val b1 = (8 - salary.length) / 2
        val b2 = 8 - salary.length - b1

        println("|"+" ".repeat(a1)+ name+ " ".repeat(a2)+"|"+" ".repeat(b1)+ salary + " ".repeat(b2) + "|")

       /* print("|")
        print(" ".repeat(a1))
        print(name)
        print(" ".repeat(a2))
        print("|")
        print(" ".repeat(b1))
        print(salary)
        print(" ".repeat(b2))
        println("|")*/
    }

    println("-".repeat(23))
}
