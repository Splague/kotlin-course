class MoonPhase(
    val isVisible: Boolean,
    val phase: String
) {
    companion object {
        val phaseList = listOf(
            "Full Moon",
            "New Moon"
        )
    }

    fun showPhase() {
        if (isVisible == true) {
            println(phase)
            println("-----")
        }
    }
}