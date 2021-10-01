fun main() {

    val options = arrayOf("Камень", "Ножницы", "Бумага")
    val gameChoice = getGameChoice(options)
    val userChoise = getUserChoise(options)
    printResult(userChoise, gameChoice)


}


fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoise(optionsParam: Array<String>): String {

    var isValidChoice = false
    var userChoice = " "
    // Выполнять цикл, пока пользователь не введет допустимый вариант
    while (!isValidChoice) {

        print("Пожалуйста, введите одно из следующих:")
        for (item in optionsParam) print(" $item")
        println(".")
            // прочитать что ввел пользователь
        val userInput = readLine()

        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println("Введите правильное значение")
    }
    return userChoice
}

fun printResult(userChoise: String, gameChoice: String) {
    val result: String
// определяем результат
    if (userChoise == gameChoice) result = "Ничья"
    else if ((userChoise == "Камень" && gameChoice == "Ножницы") ||
        (userChoise == "Бумага" && gameChoice == "Камень") ||
        (userChoise == "Ножницы" && gameChoice == "Бумага")
    ) result = " Вы выиграли"
    else result = " Вы проиграли"
    // выводим результат
    println("Ваш выбор $userChoise. Выбор компа $gameChoice. $result")
}