class Party(
    val location: String,
    var attendees: Int
) {

    fun details() {
        println("location: $location, attendees: $attendees")
        println("-----")
    }
}