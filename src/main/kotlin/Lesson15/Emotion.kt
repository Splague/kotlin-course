class Emotion(
    var type: String,
    var intensity: Int
) {

    fun express() {
        if (type == "type" && intensity == 5) {
            println("Description Emotion Name")
            println("-----")
        }
    }
}