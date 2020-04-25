object Pangram {
    fun isPangram(input: String): Boolean {
        var alphabets:String = "abcdefghijklmnopqrstuvwxyz";
        for (c in input.toLowerCase().toCharArray()){
            if(alphabets.contains(c)){
                alphabets = alphabets.replace("$c","")
            }
        }
        return alphabets.isEmpty()
    }
}
