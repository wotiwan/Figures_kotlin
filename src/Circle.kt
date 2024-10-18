import kotlin.math.PI
import kotlin.math.sqrt

class Circle(private var radius: Float, x: Float, y: Float): Figure(), Transforming {

    var X: Float = x
    var Y: Float = y

    override fun area(): Float {
        return radius * radius * PI.toFloat()
    }

    override fun resize(zoom: Int) {
        radius *= sqrt(zoom.toFloat())
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        when(direction) {
            RotateDirection.Clockwise -> {
                val deltaX = X - centerX
                val deltaY = Y - centerY
                X = centerX + deltaY
                Y = centerY - deltaX
            }
            RotateDirection.CounterClockwise -> {
                val deltaX = X - centerX
                val deltaY = Y - centerY
                X = centerX - deltaY
                Y = centerY + deltaX
            }
        }
    }
}
