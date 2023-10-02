fun main() {
    val mapper = HashMap<String, String>()

    mapper["K1"] = "V1"
    mapper["K2"] = "V2"
    mapper["K3"] = "V3"

    println(getKey(mapper, "V3"))
}

fun <K, V> getKey(mapper: HashMap<K, V>, target: V) = mapper.filter { target == it.value }.keys.first()