fun transcribeToRna(dna: String): String {
    var ret: String = ""

    for (str in dna.toList()) {
        when (str) {
            'C' -> {
                ret += "G"
            }
            'G' -> {
                ret += "C"
            }
            'T' -> {
                ret += "A"
            }
            'A' -> {
                ret += "U"
            }
        }
    }
    return ret
}
