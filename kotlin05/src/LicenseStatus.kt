enum class LicenseStatus{
    UNQUALIFIED,
    LEARNING,
    QUALIFIED;


}

class Driver(var status: LicenseStatus){
    fun checkLicense():String {
        return when(status){
            LicenseStatus.UNQUALIFIED -> "没资格"
            LicenseStatus.LEARNING -> "在学"
            LicenseStatus.QUALIFIED -> "有资格"
        }
    }
}

fun main() {
    val checkLicense = Driver(LicenseStatus.QUALIFIED).checkLicense()
    println(checkLicense)
}