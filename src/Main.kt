fun main(args: Array<String>) {

    val circle = Circle(5f, 0f, 0f)
    println("circle area: ${circle.area()}")
    circle.resize(2)
    println("circle area after zooming it by 2x: ${circle.area()}")

    println("coordinates before rotating \nX: ${circle.X}, Y: ${circle.Y}")

    circle.rotate(RotateDirection.CounterClockwise, -1, 1)

    println("coordinates after rotating \nX: ${circle.X}, Y: ${circle.Y}")


    val rect = Rect(0f, 0f, 4f, 2f)
    rect.move(2, 4)
    println("""
        coordinates before rotating
        x1: ${rect.x1}, y1: ${rect.y1}
        x2: ${rect.x2}, y2: ${rect.y2}
        x3: ${rect.x3}, y3: ${rect.y3}
        x4: ${rect.x4}, y4: ${rect.y4}
    """.trimIndent())
    rect.rotate(RotateDirection.CounterClockwise, 3, -3)
    println("""
        coordinates after rotating
        x1: ${rect.x1}, y1: ${rect.y1}
        x2: ${rect.x2}, y2: ${rect.y2}
        x3: ${rect.x3}, y3: ${rect.y3}
        x4: ${rect.x4}, y4: ${rect.y4}
    """.trimIndent())

    println("area: ${rect.area()}")
    val rect2 = Rect(rect)
    println("area of copied rectangle: ${rect2.area()}")


    val square = Square(2f, 0f, 0f)
    println("area before zooming: ${square.area()}")
    square.resize(3)
    println("area after zooming it 3 times: ${square.area()}")
    println("""
        coordinates before moving
        x1: ${square.x1}, y1: ${square.y1}
        x2: ${square.x2}, y2: ${square.y2}
        x3: ${square.x3}, y3: ${square.y3}
        x4: ${square.x4}, y4: ${square.y4}
    """.trimIndent())
    square.move(2, 4)
    println("""
        coordinates after moving
        x1: ${square.x1}, y1: ${square.y1}
        x2: ${square.x2}, y2: ${square.y2}
        x3: ${square.x3}, y3: ${square.y3}
        x4: ${square.x4}, y4: ${square.y4}
    """.trimIndent())

}