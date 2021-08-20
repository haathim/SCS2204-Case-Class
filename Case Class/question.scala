import scala.math.sqrt

object question extends App{

    val p1 = Point(1,2)
    val p2 = Point(2,3)
    val p3 = p1 + p2
    println(p3)

    p3.move(10,10)
    println(p3)

    println(p3.distance(p2))

    p3.invert
    println(p3)

}

case class Point(var x:Int, var y:Int){
    def +(p:Point) = Point(this.x + p.x, this.y + p.y)
    def move(dx:Int, dy:Int) = {this.x += dx; this.y += dy}
    def distance(p:Point) = sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y))
    def invert = {val tmp = this.x; this.x = this.y; this.y = tmp}
}