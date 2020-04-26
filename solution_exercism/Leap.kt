class Year constructor(year: Int) {
    var isLeap: Boolean = false

    init {
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeap = true
            }
        }
    }
}
