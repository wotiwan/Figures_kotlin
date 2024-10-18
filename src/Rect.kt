import kotlin.math.sqrt

class Rect(x: Float, y: Float, private var width: Float, private var height: Float): Figure(), Transforming, Movable {
    var x1: Float = x; var y1: Float = y // Левый верхний угол
    var x2: Float = x1 + width; var y2: Float = y1 // Правый верхний
    var x3: Float = x1 + width; var y3: Float = y1 - height // Правый нижний
    var x4: Float = x1; var y4: Float = y1 - height // Левый нижний

    constructor(rect: Rect) : this(rect.x1, rect.y1, rect.width, rect.height)

    override fun area(): Float {
        return width * height
    }

    override fun resize(zoom: Int) {
        val area = area() * 2
        val parts = width * height
        width *= sqrt(area / parts)
        height *= sqrt(area / parts)
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {

        val deltaX1 = x1 - centerX; val deltaY1 = y1 - centerY
        val deltaX2 = x2 - centerX; val deltaY2 = y2 - centerY
        val deltaX3 = x3 - centerX; val deltaY3 = y3 - centerY
        val deltaX4 = x4 - centerX; val deltaY4 = y4 - centerY

        when(direction) {
            RotateDirection.Clockwise -> {
                x1 = centerX + deltaY1; y1 = centerY - deltaX1
                x2 = centerX + deltaY2; y2 = centerY - deltaX2
                x3 = centerX + deltaY3; y3 = centerY - deltaX3
                x4 = centerX + deltaY4; y4 = centerY - deltaX4
            }
            RotateDirection.CounterClockwise -> {
                x1 = centerX - deltaY1; y1 = centerY + deltaX1
                x2 = centerX - deltaY2; y2 = centerY + deltaX2
                x3 = centerX - deltaY3; y3 = centerY + deltaX3
                x4 = centerX - deltaY4; y4 = centerY + deltaX4
            }
        }

    }

    override fun move(dx: Int, dy: Int) {
        x1+=dx; y1+=dy
        x2+=dx; y2+=dy
        x3+=dx; y3+=dy
        x4+=dx; y4+=dy
    }
}