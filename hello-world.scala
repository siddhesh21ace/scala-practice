println("Hello World! " + args(0))

args.foreach(arg => println(arg))
args.foreach(println)
for (arg <- args)
	println(arg)
