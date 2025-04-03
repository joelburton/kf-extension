import kf.interfaces.*
import kf.dict.Word

object NewWordMod: IWordModule {
    override val name = "joel.NewWordMod"
    override val description = ""
    override val words = arrayOf<Word>(
        Word("foofoo", fn=::w_foofoo),
        Word("barbar", fn=::w_barbar),
    )
    fun w_foofoo(vm: IForthVM) {
        println("foo foo!")
    }
    fun w_barbar(vm: IForthVM) {
        println("bar bar!")
    }
}