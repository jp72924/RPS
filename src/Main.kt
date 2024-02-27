//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val options = listOf("rock", "paper", "scissors")

    var user: Int
    var cpu: Int

    while (true) {
        print("Rock, paper or scissors (1 - 3): ")

        user = readln().toInt()
        cpu = (1..3).random()

        println("CPU choose ${options[cpu - 1]}. Player choose ${options[user - 1]}")

        if (cpu == user) {
            println("It's a tie.")
        } else if (cpu == (user + 1) % 3) {
            println("CPU won! Player lost.")
        } else {
            println("CPU lost. Player won!")
        }
        println()
    }
}