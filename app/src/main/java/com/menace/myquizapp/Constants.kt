package com.menace.myquizapp

object Constants {

    const val USER_NAME : String ="user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"
    fun getQuestions() : ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "What country does this flag belongs to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Brazil", "Columbia", 1
        )
        questionsList.add(que1)
        val que2 = Question(
            2, "What country does this flag belongs to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "South Africa", "India", "Sri Lanka", 3
        )
        questionsList.add(que2)
        val que3 = Question(
            3, "What country does this flag belongs to?",
            R.drawable.ic_flag_of_germany,
            "France", "Italy", "Russia", "Germany", 4
        )
        questionsList.add(que3)
        val que4 = Question(
            4, "What country does this flag belongs to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "Ecuador", "Mexico", "Panama", 1
        )
        questionsList.add(que4)
        val que5 = Question(
            5, "What country does this flag belongs to?",
            R.drawable.ic_flag_of_belgium,
            "Germany", "Belgium", "Brazil", "Switzerland", 2
        )
        questionsList.add(que5)
        val que6 = Question(
            6, "What country does this flag belongs to?",
            R.drawable.ic_flag_of_fiji,
            "Australia", "New Zealand", "Fiji", "Papua New Guinea", 3
        )
        questionsList.add(que6)
        val que7 = Question(
            7, "What country does this flag belongs to?",
            R.drawable.ic_flag_of_australia,
            "New Zealand", "United States of America", "Fiji", "Australia", 4
        )
        questionsList.add(que7)
        val que8 = Question(
            8, "What country does this flag belongs to?",
            R.drawable.ic_flag_of_kuwait,
            "Saudi Arabia", "Kuwait", "Iran", "Iraq", 2
        )
        questionsList.add(que8)
        val que9 = Question(
            9, "What country does this flag belongs to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark", "England", "France", "Columbia", 1
        )
        questionsList.add(que9)
        val que10 = Question(
            10, "What country does this flag belongs to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand", "Fiji", "Papua New Guinea", 2
        )
        questionsList.add(que10)
        return questionsList
    }
}