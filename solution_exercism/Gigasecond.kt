import java.time.LocalDateTime
import java.time.LocalDate

class Gigasecond(startDate: LocalDateTime) {

    constructor(startDate: LocalDate):this(startDate.atStartOfDay())
    val date: LocalDateTime = startDate.plusSeconds(1E9.toLong())
}
