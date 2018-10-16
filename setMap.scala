import scala.collection.mutable
import scala.collection.immutable.HashSet

var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

val movieSet = mutable.Set("Hitch", "Poltergeist")
// movieSet += "Shrek"
movieSet.+=("Shrek")
println(movieSet)

val hashSet = HashSet("Tomatoes", "Chilies")
println(hashSet + "Coriander")

val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))

var treasureImmMap = Map[Int, String]()
treasureImmMap += (1 -> "Go to island.")
treasureImmMap += (2 -> "Find big X on ground.")
treasureImmMap += (3 -> "Dig.")
println(treasureImmMap(2))

val romanNumeral = Map(
	1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
)

println(romanNumeral(4))