external fun require(module:String):dynamic

fun main(args: Array<String>) {
    println("Hello JavaScript!")

    val express = require("express")
    val app = express()

    app.post("/", { req, res ->
        res.type("text/plain")
        res.send(req.body.text)
    })

    app.get("/nelson", { req, res ->
        res.type("text/plain")
        res.send(req.query.text)
    })

    app.listen(3000, {
        println("Listening on port 3000")
    })
}

