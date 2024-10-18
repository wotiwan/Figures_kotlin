interface Transforming {
    fun resize(zoom: Int)
    // величивает фигуру, не перемещая, с сохранением пропорций

    fun rotate(direction: RotateDirection, centerX: Int, centerY: Int)
    // поворот фигуры вокруг точки (centerX, centerY) на 90 градусов
}
