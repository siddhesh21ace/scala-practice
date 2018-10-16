val greetings: Array[String] = new Array[String](3)

greetings(0) = "Hello"
greetings(1) = "Siddhesh"
greetings(2) = "Salgaonkar"

// for (arg <- greetings)
// 	println(arg)

for (i <- 0 to 2)
	println(greetings(i))

Console println "Hello Again"

println(1 + 2)
println((1).+(2))

val inline = Array("You", "are", "amad")

for (i <- 0 to 2)
	println(inline(i))