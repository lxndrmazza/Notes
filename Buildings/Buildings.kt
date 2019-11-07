package Buildings

open class BaseBuildingMaterial(open val numberNeeded : Int = 1) {
 fun <T : BaseBuildingMaterial> isSmallBuilding (building : Building<T>){

 }
 }


class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brik : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<T: BaseBuildingMaterial>(val material: T){
    var baseBuildingMaterial : Int = 100
    var actualMaterialNeeded = {baseBuildingMaterial * material.numberNeeded}
    fun build() {
        println(material::class.simpleName)
    }

}

fun main (args : Array<String>){
    val brik = Brik()
    val house = Building(brik)
    house.build()
}